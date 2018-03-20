package com.cmpeters.todosJava;

import com.sun.tools.javac.comp.Todo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toList;

@Repository
public class TodoRepository {

    private ArrayList<TodoTask> taskArrayList = new ArrayList<>();


    TodoRepository(){
       // taskArrayList = new ArrayList<>();
        TodoTask task1 = new TodoTask(0, "clean out basement", false);
        TodoTask task2 = new TodoTask(1, "buy soap", true);
        TodoTask task3 = new TodoTask(2,"feed chameleon", false);
        TodoTask task4 = new TodoTask(3, "spend more time on Java", true);

        taskArrayList.add(task1);
        taskArrayList.add(task2);
        taskArrayList.add(task3);
        taskArrayList.add(task4);
    }

    public ArrayList<TodoTask> addNewTodo(String newTaskDescription){
        TodoTask newTask = new TodoTask();
        newTask.setId(taskArrayList.size() + 1);
        newTask.setTaskName(newTaskDescription);
        newTask.setCompleted(false);
        taskArrayList.add(newTask);
        return taskArrayList;
    }


   public List<TodoTask> findTaskById(int id){
       List<TodoTask> task = getTaskArrayList().stream()
               .filter(c -> c.getId() == id)
               .collect(Collectors.toList());
       return task;
   }

   public TodoTask updateCompleted(int id){
        TodoTask task = getTaskArrayList().stream()
                .filter(c-> c.getId() == id)
                .findFirst().get();

        task.setCompleted(!task.getCompleted());

        return task;
   }


    public ArrayList<TodoTask> getTaskArrayList() {
        return taskArrayList;
    }

    public void setTaskArrayList(ArrayList<TodoTask> taskArrayList) {
        this.taskArrayList = taskArrayList;
    }
}
