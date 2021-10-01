package com.company;
import java.util.Scanner;
public abstract class TeamMember {
    Scanner in = new Scanner(System.in);
    private String name;
    private String surname;
    private String email;
    private String phone;
    
    public TeamMember(String name, String surname, String email, String phone) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
    }

    public abstract String getRole();

    public void chooseRole(){
        System.out.println("Choose the role person: ");

    int choiceRole = -1;

    while(choiceRole != 0) {
        System.out.println("1: Team leader");
        System.out.println("2: Developer");
        System.out.println("3: Designer");
        System.out.println("4: QAEngineer");
        System.out.println("0: Exit");
        choiceRole = in.nextInt();
        String chooseRole;
        switch (choiceRole){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default: chooseRole = "You haven't chosen correctly!";
        }
    }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", surname: " + surname + ", email: " + email + ", phone number: " + phone;
    }
}
