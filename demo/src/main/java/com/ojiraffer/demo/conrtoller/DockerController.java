package com.ojiraffer.demo.conrtoller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



    @RestController
    @RequestMapping("/docker")
    public class DockerController {


        @GetMapping
        public ResponseEntity<?> getResponse() {
            return ResponseEntity.ok("fefe");
        }
    }

