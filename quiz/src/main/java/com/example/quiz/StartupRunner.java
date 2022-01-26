package com.example.quiz;

import com.example.quiz.database.entities.PlayerEntity;
import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Log
public class StartupRunner implements CommandLineRunner {
    @Override
    public void run(String...args) throws Exception {
        log.info("Executing startup actions...");

        PlayerEntity player = new PlayerEntity("John");
        log.info("Created player: " + player);
    }
}