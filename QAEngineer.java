package com.company;

public class QAEngineer extends TeamMember{

    private String role;

    public QAEngineer(String name, String surname, String email, String phone, String role) {
        super(name, surname, email, phone);
        this.role = role;
    }
    public String getRole(){
        return role = "A Quality Assurance engineer is a quality assurance specialist.";
    }
}
