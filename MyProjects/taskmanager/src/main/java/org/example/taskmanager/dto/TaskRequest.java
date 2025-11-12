package org.example.taskmanager.dto;

import org.example.taskmanager.model.Priority;

import java.time.LocalDate;

public class TaskRequest {
    @NotBlank
    private String title;

    private String description;

    @FutureOrPresent
    private LocalDate dueDate;

    private Priority priority;

}