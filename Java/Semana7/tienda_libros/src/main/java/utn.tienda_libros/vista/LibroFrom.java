package utn.tienda_libros.vista;

import javax.swing.*;

public class LibroFrom extends JFrame {
    LibroServicio libroServicio;
    
    @Autowired
    public LibroFrom(LibroServicio libroServicio){
       this.libroServicio = libroServicio;
       iniciarForma();
    }
    
    private void iniciarForma(){
        setContentPane(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(900, 700);
    }
  }