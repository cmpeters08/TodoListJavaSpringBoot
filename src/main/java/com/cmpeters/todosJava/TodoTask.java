package com.cmpeters.todosJava;




public class TodoTask {

    private int id;
    private  String taskName;
    private Boolean completed;

    public  TodoTask(){}

    public TodoTask(int id, String taskName, Boolean completed) {
        this.id = id;
        this.taskName = taskName;
        this.completed = completed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }
}
