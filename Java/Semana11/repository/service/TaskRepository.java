package ar.com.utnfrsr.todoapp.repository;


public interface TaskRepository extends JpaRepository<Task, Long> {

    /**
     * Update task to status (true or false)
     * @param id recibe el ide para pasarlo a la query nativa
     * @param finished recibe el estado para pasarlo a la query nativa
     */

@Modifying //demuestra que la query es de actualización
@Query(value = "UPDATE TASK SET FINISHED=:finished WHERE ID=:id", nativeQuery = true)
public void markTaskAsFinished(@Param("id") Long id, @Param("finished") boolean finished);
}