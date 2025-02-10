package com.br.wallaceartur.ToDoList;

import com.br.wallaceartur.ToDoList.entities.Task;
import com.br.wallaceartur.ToDoList.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping
    public void createTask(@RequestBody Task task) {
        taskService.createTask(task);
    }

    @GetMapping
    public List<Task> findAll() {
      return   taskService.findAll();
    }

    @PutMapping("{id}")
    public void update(@PathVariable Long id,@RequestBody Task task) {
        taskService.update(id,task);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        taskService.delete(id);
    }

}
