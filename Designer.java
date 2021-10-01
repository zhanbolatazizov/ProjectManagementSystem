package com.company;

public class Designer extends TeamMember{

    private String role;

    public Designer(String name, String surname, String email, String phone, String role) {
        super(name, surname, email, phone);
        this.role = role;
    }
    public String getRole(){
        return role = "Web designers are involved in the decoration of a web project.";
    }

}
