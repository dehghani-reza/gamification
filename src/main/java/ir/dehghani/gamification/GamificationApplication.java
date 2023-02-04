package ir.dehghani.gamification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@SpringBootApplication
public class GamificationApplication {

    public static void main(String[] args) {
         new SpringApplicationBuilder(GamificationApplication.class)
                 .profiles("dev", "prod")
                .run(args);
    }


    @Component
    class MyRunner implements CommandLineRunner {

        @Autowired
        private Environment environment;

        @Override
        public void run(String... args) throws Exception {
            System.out.println("Active profiles: " +
                    Arrays.toString(environment.getActiveProfiles()));
        }
    }

    @Component
    @Profile(value = {"dev", "prod"})
    class MyRunner1 implements CommandLineRunner {

        @Value("${message}")
        private String message;

        @Override
        public void run(String... args) throws Exception {

            System.out.println("Message: " + message);
        }
    }

}
