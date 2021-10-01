package com.company;

public class Developer extends TeamMember{

    private String role;

    public Developer(String name, String surname, String email, String phone, String role) {
        super(name, surname, email, phone);
        this.role = role;
    }

    public String getRole(){
        return role = "Developer - a specialist engaged in the development of circuits, software, sites.";
    }

}
