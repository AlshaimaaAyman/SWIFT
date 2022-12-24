package com.mycompany.swiftproject.entities;

import java.util.Date;


public class SWIFT {

    private int ID;
    private String BODY;
    private Date DATE;

    public SWIFT() {

    }

    public SWIFT(int ID, String BODY, Date DATE) {
        this.ID = ID;
        this.BODY = BODY;
        this.DATE = DATE;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getBODY() {
        return BODY;
    }

    public void setBODY(String BODY) {
        this.BODY = BODY;
    }

    public Date getDATE() {
        return DATE;
    }

    public void setDATE(Date DATE) {
        this.DATE = DATE;
    }

}
