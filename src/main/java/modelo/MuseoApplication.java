package modelo;

import controlador.Controlador;
import java.util.List;
import java.util.Optional;
import modelo.RepositorioMuseo;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import vista.Vista;

@SpringBootApplication
public class MuseoApplication {
        
    @Autowired
    RepositorioMuseo repositorio;
    
    public static void main(String[] args) {
    //SpringApplication.run(MuseoApplication.class, args);
    
                
       SpringApplicationBuilder builder = new SpringApplicationBuilder(MuseoApplication.class);
       builder.headless(false);
       ConfigurableApplicationContext context = builder.run(args);    
    }

    @Bean
    ApplicationRunner applicationRunner (){
        return args -> {
          
           final Log logger = LogFactory.getLog(getClass()); 
            
           Controlador controlador = new Controlador(repositorio, new Vista());
                     
        };
    }
}