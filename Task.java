package com.company;

import java.util.ArrayList;

public class Task {

    private int id;
    private Project project;
    private String title;
    private String deadline;
    private String status;
    private ArrayList<TeamMember> teamMember = new ArrayList<>();

    public Task(int id, Project project, String title, String deadline, String status) {
        this.id = id;
        this.project = project;
        this.title = title;
        this.deadline = deadline;
        this.status = status;
    }

    public void addMember(TeamMember member){
        teamMember.add(member);
    }

    public void teamMembers(){
        for(int i = 0; i < teamMember.size(); i++){
            System.out.println((i+1) + ", " + teamMember.get(i)) ;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", project: " + project + ", title: " + title + ", deadline: " + deadline + ", status" + status;
    }
}
