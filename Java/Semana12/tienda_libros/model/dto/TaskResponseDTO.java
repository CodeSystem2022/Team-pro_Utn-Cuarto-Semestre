package ar.com.utnfrsr.todoapp.model.dto.response;

@Data
public class TaskResponseDTO {
    
    private Long id;

    private Date date;

    private LocalTime time;

    private boolean finished;
}