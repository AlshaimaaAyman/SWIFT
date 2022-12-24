package com.mycompany.swiftproject.services;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class FileService {

    public ArrayList<String> readMessages(String folderPath) {
        
        ArrayList<String> messages = new  ArrayList<String>();
        File messagesFolder = new File(folderPath);
        try {
            File[] swiftFiles = messagesFolder.listFiles();
            for (File file : swiftFiles) {
               String message=  readMessage(file);
               messages.add(message);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return messages;
    }

    public String readMessage(File messagesFile) {
        String message = null;
        try {
            String path = messagesFile.getPath();
            Path fileName = Path.of(path);

            // Now calling Files.readString() method to
            // read the file
            message = Files.readString(fileName);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return message;
    }
}
