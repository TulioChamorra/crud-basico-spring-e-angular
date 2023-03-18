package io.github.tuliochamorra;

import io.github.tuliochamorra.model.entity.Cliente;
import io.github.tuliochamorra.model.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ClientesApplication {


    public static void main(String[] args) {
        SpringApplication.run(ClientesApplication.class, args);

    }
}
