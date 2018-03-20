package com.cmpeters.todosJava;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TodoService {

    private TodoRepository todoRepo = new TodoRepository();

    public ArrayList<TodoTask> displayTodoList(){
       return todoRepo.getTaskArrayList();
    }

    public ArrayList<TodoTask> addNewTodo(String taskName){
        return todoRepo.addNewTodo(taskName);
    }

    public List<TodoTask> findToDoById(int id){
        return todoRepo.findTaskById(id);
    }

    public TodoTask updateCompleted(int id){
        return todoRepo.updateCompleted(id);
    }

//    public TodoRepository findTaskById(int taskId){
//        TodoRepository tasks = new TodoRepository();
//
//        tasks.getTaskArrayList().stream()
//                .filter(c -> c.getId() == taskId)
//                .collect(Collectors.toList());
//
//       return tasks;
//
//    }


    public TodoRepository getTodoRepo() {
        return todoRepo;
    }

    public void setTodoRepo(TodoRepository todoRepo) {
        this.todoRepo = todoRepo;
    }
}
