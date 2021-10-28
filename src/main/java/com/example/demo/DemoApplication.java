package com.example.demo;

import com.example.demo.domain.MessageService;
import com.example.demo.infrastructure.api.MessagePortAdapter;
import com.example.demo.infrastructure.repositories.InMemoryMessageRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public InMemoryMessageRepository inMemoryMessageRepository() {
        return new InMemoryMessageRepository();
    }

    @Bean
    public MessageService messageService(InMemoryMessageRepository inMemoryMessageRepository) {
        return new MessageService(inMemoryMessageRepository);
    }

    @Bean
    public MessagePortAdapter messagePortAdapter(final MessageService messageService) {
        return new MessagePortAdapter(messageService);
    }
}
