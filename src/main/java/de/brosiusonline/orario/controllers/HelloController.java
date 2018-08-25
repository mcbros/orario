package de.brosiusonline.orario.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class HelloController {

    @GetMapping(path = "/api/v1/hello")
    public Mono<String> sayHello() {
        return Mono.just("Hello World!");
    }
}
