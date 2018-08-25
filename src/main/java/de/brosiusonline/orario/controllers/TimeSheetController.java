package de.brosiusonline.orario.controllers;

import de.brosiusonline.orario.domain.Day;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.ArrayList;

@RestController
public class TimeSheetController {

    @GetMapping(path = "/api/v1/days")
    public Flux<Day> getDays() {
        return Flux.fromIterable(new ArrayList<>());
    }
}
