package com.example.service01;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Service01Controller {

    @Autowired
    private RestTemplate restTemplate;

    private static final Logger LOGGER = LoggerFactory.getLogger(Service01Controller.class);

    @GetMapping(value = "/numbers/letters")
    public ResponseEntity<List<String>> findAllNumbersAndLetters() throws URISyntaxException {
        LOGGER.info("findAllNumbersAndLetters");

        final String baseUrl = "http://localhost:8082/app02/letters";
        URI uri = new URI(baseUrl);

        ResponseEntity<List> result = restTemplate.getForEntity(uri, List.class);

        List<String> list = new ArrayList<>(List.of("1", "2", "3", "4"));
        list.addAll(result.getBody());

        LOGGER.info("findAllNumbersAndLetters: " + list);

        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/numbers")
    public ResponseEntity<List<String>> findAllNumbers() {
        LOGGER.info("findAllNumbers");
        return ResponseEntity.ok().body(List.of("1", "2", "3", "4"));
    }

}
