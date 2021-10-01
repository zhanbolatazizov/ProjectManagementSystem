package com.company;

public class TeamLead extends TeamMember{

    private String role;
    public TeamLead(String name, String surname, String email, String phone, String role) {
       super(name, surname, email, phone);
       this.role = role;
    }

    public String getRole(){
        return role = "Team Leader - the head of the IT team that is working on the web project.";
    }

}
