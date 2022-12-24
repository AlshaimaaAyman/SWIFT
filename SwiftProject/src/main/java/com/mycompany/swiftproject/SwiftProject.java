package com.mycompany.swiftproject;

import com.mycompany.swiftproject.services.FileService;
import com.mycompany.swiftproject.services.MessageService;
import java.util.ArrayList;

public class SwiftProject {

    public static void main(String[] args) {

        String folderPath = "E:\\Java Project\\SwiftMessages";
        String result;
        FileService fileService = new FileService();
        MessageService messageService= new MessageService();
        ArrayList<String> messages = new ArrayList<String>();
        messages = fileService.readMessages(folderPath);
        result=messageService.loadMessages(messages);
        System.out.println("service is finished \n"+result);

    }
    
}
