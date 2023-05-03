package com.demo.towerdemoclient.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;

@RestController
@RequestMapping("/client")
public class ClientController {

    @GetMapping(path = "/test", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    Flux<Integer> test(){
        return Flux.range(1,4)
                .delayElements(Duration.ofSeconds(1));
    }

}
