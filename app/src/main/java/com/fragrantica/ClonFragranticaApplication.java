package com.fragrantica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClonFragranticaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClonFragranticaApplication.class, args);    }
}
/*¿Por qué es importante el args?
 Porque si el día de mañana despliegas tu aplicación en un servidor
 y quieres pasarle una contraseña o decirle que arranque en el puerto 9000 desde la línea de comandos,
  Spring Boot necesita ese parámetro args para leer esas instrucciones.
**/
