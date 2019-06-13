package model;

import java.util.ArrayList;
import java.util.List;

public class Sprint {

    private static int id=0;
    private String name;
    private String Description;
    private List<Task> taskList;



    public Sprint(String name, String description) {
        id++;
        this.name = name;
        Description = description;
        taskList = new ArrayList<>();
    }



    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Sprint.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }


    @Override
    public String toString() {
        return "Sprint{" +
                "name='" + name + '\'' +
                ", Description='" + Description + '\'' +
                ", taskList=" + taskList +
                '}';
    }
}
