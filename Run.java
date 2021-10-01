package com.company;
import java.util.ArrayList;


public class Run {
    ArrayList<Project> project = new ArrayList<>();
    ArrayList<TeamMember> teamMember = new ArrayList<>();
    ArrayList<Task> task = new ArrayList<>();

    public void addProject(Project newProject) {
        project.add(newProject);
    }

    public void addTeamMember(TeamMember newTeamMember) {
        teamMember.add(newTeamMember);
    }

    public void addTask(Task newTask){
        task.add(newTask);
    }

    public void projectList(){
        for(int i = 0; i < project.size(); i++){
            System.out.println(project.get(i));
        }
    }

    public void teamMemberList(){
        for(int i = 0; i < teamMember.size(); i++){
            System.out.println(teamMember.get(i));
        }
    }

    public void taskList(){
        for(int i = 0; i < task.size(); i++){
            System.out.println(task.get(i));
        }
    }

    public void allTaskAssignedTeamMember(){
        for(int i = 0; i < task.size(); i++){
            System.out.println("Team member: " + task.get(i) + ", tasks: ");
            task.get(i).teamMembers();
        }
    }

}



