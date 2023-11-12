package ar.com.utnfrsr.todoapp.service;

public interface ITaskService {
    TaskResponseDTO createTask(TaskRequestDTO taskRequestDTO);
    List<TaskResponseDTO> findAll();
    void updateTaskAsFinished(Long id, boolean finished);
    void deleteById(Long id);
}