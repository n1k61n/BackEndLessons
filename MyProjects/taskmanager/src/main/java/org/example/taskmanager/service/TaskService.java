package org.example.taskmanager.service;

import org.example.taskmanager.dto.TaskRequest;
import org.example.taskmanager.dto.TaskResponse;
import org.example.taskmanager.model.Status;

public interface TaskService {
    TaskResponse createTask(TaskRequest request);
    Page<TaskResponse> getTasks(...);
    TaskResponse getTask(Long id);
    TaskResponse updateTask(Long id, TaskRequest request);
    void deleteTask(Long id);
    TaskResponse updateStatus(Long id, Status status);
}