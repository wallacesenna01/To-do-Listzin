package com.br.wallaceartur.ToDoList.entities;

import jakarta.persistence.*;

@Entity
@Table
public class Task {

    public Task() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;


    public Task(Long id, String title, String description) {

    }

}
