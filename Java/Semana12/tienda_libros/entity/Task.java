package ar.com.utnfrsr.todoapp.model.entity;


@Data /*Para obtener los getter and setter de la clase*/
@Entity 
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "task")
@SQLDelete(sql = "UPDATE task SET enable = false WHERE id  = ?")
@where(clause = "enable = true")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, lenght = 20)
    private Long id;
    @Column(name = "title", nullable = false, lenght = 256)
    private String title;
    @Column(name= "created_date", nullable = false)
    private LocalDateTime createdDate;
    @DateTimeFormat(pattern = "yyyy-MM-DD")
    @Column(name = "date", nullable = false)
    private Date date;
    @Column(name = "time", nullable = false)
    private LocalTime time;
    @Column(name = "finished", nullable = false)
    private boolean finished;
    @Column(name = "enable")
    private boolean enabled = true;
}