package ru.morou;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.morou.repository.UserRepository;

@SpringBootApplication
public class SpringBootDataMongoApplication implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDataMongoApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        System.out.println(userRepository.findAll());
    }
}
