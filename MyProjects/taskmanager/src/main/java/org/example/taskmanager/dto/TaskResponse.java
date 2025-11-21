package org.example.taskmanager.dto;

import org.example.taskmanager.model.Priority;
import org.example.taskmanager.model.Status;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TaskResponse {
    private Long id;
    private String title;
    private String description;
    private LocalDate dueDate;
    private Priority priority;
    private Status status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}