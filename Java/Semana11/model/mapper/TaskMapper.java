package ar.com.utnfrsr.todoapp.model.mapper


@component /*de esta manera lo podremos indentar en nuestras clases*/
public class TaskMapper {
    Task task = new Task();
    task.setTitle(taskRequestDTO.getTitle());
    task.setCreatedDate(LocalDateTime.now());
    task.setDate(taskRequestDTO.getDate());
    task.setTime(taskRequestDTO.getTime());
    return task;
}

public TaskResponseDTO toDTO(Task task) {
    TaskResponseDTO taskResponseDTO = new TaskResponseDTO();
    taskResponseDTO.setId(task.getId());
    taskResponseDTO.setTitle(task.getTitle());
    taskResponseDTO.setDate(task.getDate());
    taskResponseDTO.setTime(task.getTime());
    taskResponseDTO.setFinished(task.isFinished());
    return taskResponseDTO;
}

public List<TaskResponseDTO> toDTOList(List<Task> tasks) {
    return tasks.stream().map(this::toDTO).collect(java.util.stream.Collectors.toList());
  }
}