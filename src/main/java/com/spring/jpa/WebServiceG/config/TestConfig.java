package com.spring.jpa.WebServiceG.config;

import com.spring.jpa.WebServiceG.entities.User;
import com.spring.jpa.WebServiceG.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "98959595", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "941391522", "123456");
        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
