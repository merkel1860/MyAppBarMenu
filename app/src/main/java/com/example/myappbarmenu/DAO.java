package com.example.myappbarmenu;

public class DAO {
    private static DAO instance = new DAO();
    Person aPerson;
    private DAO(){
        aPerson = new Person();
    }

    public static DAO getInstance(){
        return instance;
    }

    public Person getaPerson() {
        return aPerson;
    }
}
