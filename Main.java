package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Run run = new Run();
        Scanner in = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("Select one of following items: ");
            System.out.println("1: Create project");
            System.out.println("2: Create team member");
            System.out.println("3: Create a task");
            System.out.println("4: Change task status");
            System.out.println("5: Change task deadline");
            System.out.println("6: Add team member to task");
            System.out.println("7: Search task");
            System.out.println("8: All tasks in which team member is assigned.");
            System.out.println("0: Exit");

            choice = in.nextInt();
            String choose;
            switch (choice){
                case 1: System.out.print("Input the ID project: ");
                    int idProject = in.nextInt();
                    System.out.print("Input the name of project: ");
                    String nameProject = in.next();
                    run.addProject(new Project(idProject, nameProject));
                    System.out.println("ID: " + idProject + ", name: " + nameProject);
                    break;
                case 2: System.out.print("Input the name: ");
                    String name = in.nextLine();
                    System.out.print("Input the surname: ");
                    String surname = in.nextLine();
                    System.out.print("Input the email: ");
                    String email = in.nextLine();
                    if(email.contains("@")){
                        email = email;
                    } else {
                        System.out.println("You must use the \"@\" symbol");
                    }
                    email = in.nextLine();
                    System.out.print("Input the phone number: ");
                    String phone = in.nextLine();
                    if(phone.length() == 11) {
                        phone = phone;
                    } else {
                        System.out.println("Phone number must be 11!");
                    }
                    run.addTeamMember(new TeamMember(name, surname, email, phone) {
                        @Override
                        public String getRole() {
                            return null;
                        }
                    });
                    System.out.println("Name: " + name + ", surname: " + surname + ", email: " + email + ", phone number: " + phone);
                    break;
                case 3: System.out.print("Input the ID of task: ");
                    int idTask = in.nextInt();
                    System.out.print("Input the project: ");
                    System.out.print("Input the ID of project: ");
                    int idTaskProject = in.nextInt();
                    System.out.print("Input the name project: ");
                    String nameTaskProject = in.nextLine();
                    run.addProject(new Project(idTaskProject, nameTaskProject));
                    System.out.print("Input the title: ");
                    String title = in.nextLine();
                    System.out.print("Input the deadline: ");
                    String deadline = in.nextLine();
                    System.out.print("Input the status: ");
                    String status = in.nextLine();
                    System.out.println("ID: " + idTask + ", project: " + nameTaskProject + ", title: " + title + ", deadline: " + deadline + ", status" + status);
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7: byte search = -1;
                    while (search != 5);
                    System.out.println("Select the method for search: ");
                    System.out.println("1: Search by ID");
                    System.out.println("2: Search by title");
                    System.out.println("3: Search by status");
                    System.out.println("4: Search by deadline");
                    System.out.println("5: Exit");
                    byte find = in.nextByte();
                    String chooseSearchTask;

                    switch (search){
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                    }
                    break;
                case 8: run.allTaskAssignedTeamMember();
                    break;
                default: choose = "You haven't chosen correctly";
            }

        }
    }
}

