package org.example.taskmanager.model;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Task {
    @Id @GeneratedValue
    private Long id;

    @NotBlank @Size(min = 3, max = 100)
    private String title;

    @Size(max = 1000)
    private String description;

    @FutureOrPresent
    private LocalDate dueDate;

    @Enumerated(EnumType.STRING)
    private Priority priority = Priority.MEDIUM;

    @Enumerated(EnumType.STRING)
    private Status status = Status.TODO;

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;
}