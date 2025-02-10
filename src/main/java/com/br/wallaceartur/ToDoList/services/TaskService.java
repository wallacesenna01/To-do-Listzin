package com.br.wallaceartur.ToDoList.services;

import com.br.wallaceartur.ToDoList.entities.Task;
import com.br.wallaceartur.ToDoList.resources.TaskResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskResource taskResource;

    public void createTask(Task task) {
        taskResource.save(task);
    }

    public List<Task> findAll() {
      return  taskResource.findAll();
    }

    public void update(Long id, Task newTaskData) {
       Task task = taskResource.findById(id).
               orElseThrow(() -> new RuntimeException("Tarefa nao encontrada"));
       newTaskData.setId(id);
       taskResource.save(newTaskData);
    }

    public void delete(Long id) {
        taskResource.deleteById(id);
    }
}
