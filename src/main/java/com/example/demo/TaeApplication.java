package com.example.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

public class TaeApplication {

    public static void main(String[] args) {
		new OptionPaneInput();
		JOptionPane.showMessageDialog(null, "Complete"); 
        System.exit(0);
    }
    
    public static void cmdCommandImport(String userCommand) throws IOException {
        userCommand = "***********DataManagement***********" + userCommand + "*****MoreDATA*****";
        executeCommand(userCommand);
    }
    
    public static void cmdCommandExport(String userCommand) throws IOException {
        userCommand = "***********DataManagement***********" + userCommand;
        executeCommand(userCommand);
    }
    
    public static void executeCommand(String userCommand) throws IOException {
        String command = "*************SensitiveInformation************" + userCommand;
        Process process = Runtime.getRuntime().exec(command);
        process.getOutputStream().close();
        
        String line;
        System.out.println("Standard Output:");
        BufferedReader stdout = new BufferedReader(new InputStreamReader(process.getInputStream()));
        while ((line = stdout.readLine()) != null) {
            System.out.println(line);
        }
        stdout.close();
        System.out.println("Standard Error:");
        BufferedReader stderr = new BufferedReader(new InputStreamReader(process.getErrorStream()));
        while ((line = stderr.readLine()) != null) {
            System.out.println(line);
        }
        stderr.close();
        System.out.println("Done");
    }

}
