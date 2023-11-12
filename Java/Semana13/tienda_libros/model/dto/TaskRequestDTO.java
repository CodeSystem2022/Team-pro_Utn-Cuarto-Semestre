package ar.com.utnfrsr.todoapp.model.dto.request;

@Data
public class TaskRequestDTO {
    @NotNull
    private String title;
    @NotNull
    private LocalDateTime createdDate;
    @NotNull
    private Date date;
    @NotNull
    private LocalTime time;
}