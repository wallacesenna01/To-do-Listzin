package com.br.wallaceartur.ToDoList.enums;

public enum TaskStatus {

    PENDING("A tarefa ainda nao foi concluida"),
    IN_PROGRESS("A tarefa esta sendo realizada"),
    COMPLETED("A tarefa foi realizada");

    private String description;

    TaskStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
