package com.example.service02;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/letters")
public class Service02Controller {

    private static final Logger LOGGER = LoggerFactory.getLogger(Service02Controller.class);

    @GetMapping
    public ResponseEntity<List<String>> findAllLetters() throws InterruptedException {
        LOGGER.info("findAllLetters");
        List<String> list = List.of("a", "b", "c", "d");
        Thread.sleep(1000L);
        LOGGER.info("findAllLetters: " + list);
        return ResponseEntity.ok().body(list);
    }

}
