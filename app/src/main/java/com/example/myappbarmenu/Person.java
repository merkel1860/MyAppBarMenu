package com.example.myappbarmenu;

import java.io.Serializable;

public class Person implements Serializable {
    private String fname;
    private String lname;
    private int yob;



    public Person() {
    }

    public Person(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public String getFullname(){return getLname()+
    " "+getFname();}
}
