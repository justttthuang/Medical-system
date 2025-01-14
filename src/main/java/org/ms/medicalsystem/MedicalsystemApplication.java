package org.ms.medicalsystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("org.ms.medicalsystem.dao")
@ComponentScan("org.ms.medicalsystem.*")
public class MedicalsystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(MedicalsystemApplication.class, args);
    }

}
