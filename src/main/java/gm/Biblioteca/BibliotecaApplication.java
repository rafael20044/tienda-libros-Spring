package gm.Biblioteca;


import gm.Biblioteca.ventana.Ventana;
import java.awt.EventQueue;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BibliotecaApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new SpringApplicationBuilder(BibliotecaApplication.class).headless(false).web(WebApplicationType.NONE).run(args);
        // Ejecutamos el codigo para cargar el formulario
        EventQueue.invokeLater(()->{
            //obtenemos el objeto JFrame
            Ventana v = applicationContext.getBean(Ventana.class);
            v.setVisible(true);
            v.setTitle("Biblioteca");
            v.setLocationRelativeTo(null);
            v.setResizable(false);
        });
    }

}
