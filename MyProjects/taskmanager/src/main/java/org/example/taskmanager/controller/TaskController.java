package org.example.taskmanager.controller;

import org.example.taskmanager.dto.TaskResponse;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    @PostMapping
    public ResponseEntity<TaskResponse> create(@Valid @RequestBody TaskRequest request) { ... }

    @GetMapping
    public Page<TaskResponse> list(@RequestParam Map<String, String> params) { ... }

    @GetMapping("/{id}")
    public TaskResponse get(@PathVariable Long id) { ... }

    @PutMapping("/{id}")
    public TaskResponse update(@PathVariable Long id, @Valid @RequestBody TaskRequest request) { ... }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) { ... }

    @PatchMapping("/{id}/status")
    public TaskResponse updateStatus(@PathVariable Long id, @RequestBody Map<String, Status> body) { ... }
}