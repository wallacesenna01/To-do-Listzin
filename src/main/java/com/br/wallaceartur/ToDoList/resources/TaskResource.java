package com.br.wallaceartur.ToDoList.resources;


import com.br.wallaceartur.ToDoList.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskResource extends JpaRepository <Task, Long> {
}
