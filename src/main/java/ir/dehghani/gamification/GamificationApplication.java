package ir.dehghani.gamification;

import ir.dehghani.gamification.config.ServerProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GamificationApplication implements CommandLineRunner {

    @Autowired
    private ServerProperties properties;

    public static void main(String[] args) {
        SpringApplication.run(GamificationApplication.class, args);
    }

    public void run(String... args) throws Exception {
        System.out.println("using environment: " + properties.getEnvironment());
        System.out.println("name: " + properties.getName());
        System.out.println("enabled:" + properties.isEnabled());
        System.out.println("servers: " + properties.getServers());
    }


}
