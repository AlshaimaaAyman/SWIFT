package com.mycompany.swiftproject.services;

import com.mycompany.swiftproject.DAO.SWIFTDAO;
import java.util.ArrayList;

public class MessageService {

    private SWIFTDAO swiftdao;

    public MessageService() {
        swiftdao = new SWIFTDAO();
    }

    public String loadMessages(ArrayList<String> messages) {
        
        int success = 0;
        int fail = 0;
        boolean result;

        for (String message : messages) {
            result = swiftdao.insert(message);
            if (result) {
                success++;
            } else {
                fail++;
            }

        }
        return success + " row is inserted successfully\n" + fail + " row is failed";

    }

}
