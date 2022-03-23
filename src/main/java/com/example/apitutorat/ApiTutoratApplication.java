package com.example.apitutorat;

import com.example.apitutorat.admin.Administrateur;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiTutoratApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ApiTutoratApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Administrateur administrateur = new Administrateur(null, "Coulibaly", "Zan", "balamine129", "azerty");
    }
}
