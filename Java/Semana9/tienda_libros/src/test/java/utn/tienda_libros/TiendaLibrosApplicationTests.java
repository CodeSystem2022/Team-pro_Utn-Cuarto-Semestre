package utn.tienda_libros;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TiendaLibrosApplicationTests {

	@Test
	void contextLoads() {
	}

}
import java.awt.EventQueue;

@SpringBootApplication
public class TiendaLibrosApplication {

	public static void main(String[] args) {
            
        ConfigurableApplicationContext contextoSpring = 
                new SpringApplicationBuilder(TiendaLibrosApplication.class)
                .headless(false)
                .web(WebApplicationType.NONE)
                .run(args);
        
        //Ejecutamos el c�digo para cargar el formulario
        EventQueue.invokeLater(() -> { //M�todo Lambda
            //Obtenemos el objeto from a trav�s del spring
            LibroFrom libroFrom = contextoSpring.getBean(LibroFrom.class);
            libroFrom.setVisible(true);
            });
	}

}