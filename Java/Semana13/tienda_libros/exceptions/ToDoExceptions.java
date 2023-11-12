package ar.com.utnfrsr.todoapp.exceptions;

@Data
public class ToDoExceptions extends RuntimeException {
    private String message;
    private HttpStatus httpStatus; //para obtener el estado http

    public ToDoExceptions(String message, HttpStatus httpStatus) {//sobreescribimos el metodo runtimeexception
    super(message);
    this.message = message;
    this.httpStatus = httpStatus;
  }
}
