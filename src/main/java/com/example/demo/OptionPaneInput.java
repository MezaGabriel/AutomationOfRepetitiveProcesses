package com.example.demo;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class OptionPaneInput {
    public static String targetName;
    public static int optionSelected;
    JFrame f;
      
	OptionPaneInput(){  
		f = new JFrame();
        String [] botones = { "Import", "Export", "Cancel" };
 
        String targetName = JOptionPane.showInputDialog(f, "Type your Target Name please", "TYPE HERE");
        int optionSelected = JOptionPane.showOptionDialog (null, " What do you want?", "Actions", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null/*icono*/, botones, botones[0]);
  
        if (optionSelected  == 0) {
            // Import button was pressd
            try {
                TaeApplication.cmdCommandImport(targetName);
            } catch (Exception ex) {
                System.out.println(ex.toString());
                JOptionPane.showMessageDialog(f, ex, targetName, optionSelected, null);
            }
        } else if (optionSelected  == 1) {
            // Export button was pressed
            try {
                TaeApplication.cmdCommandExport(targetName);
            } catch (Exception ex) {
                System.out.println(ex.toString());
                JOptionPane.showMessageDialog(f, ex, targetName, optionSelected, null);
            }
        } else if (optionSelected  == 2) {
            // Cancel button was pressed
        }
	} 
    
}
