package ar.com.utnfrsr.todoapp.exceptions;


@ControllerAdvice
public class ExceptionHandler extends ResponseEntityExceptionHandler {
    //mecanismo que permite manejar todas las excepciones de nuestra aplicación
    //cuando una aplicación lanza una excepción de manera general,
    //antes de que se muestre de manera descontrolada en el controlador,
    //maneja y la renderiza de la manera que la queremos mostrar
    @org.springframework.web.bind.annotation.ExceptionHandler(value = {ToDoExceptions.class })
    protected ResponseEntity<Object> handleConflict(
        ToDoExceptions ex, WebRequest request) {
            String bodyOfResponse = ex.getMessage();
            return handleExceptionInternal(ex, bodyOfResponse,
             new HttpHeaders(), ex.getHttpStatus(), request);
        }
}