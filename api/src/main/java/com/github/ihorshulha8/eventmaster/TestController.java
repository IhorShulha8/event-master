package com.github.ihorshulha8.eventmaster;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello/{name}")
public class TestController {

    @GetMapping
    public ResponseEntity<String> hello(@PathVariable String name){
        return ResponseEntity.ok().body("Hello " + name + "!");
    }
}
