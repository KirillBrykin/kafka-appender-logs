package com.example.kafkaappenderlogs.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/test")
public class Test {

    @GetMapping("/hello")
    public void hello() {
//        System.out.println("------Test.hello------");
//        System.out.println("---log.getName()---");
//        System.out.println(log.getName());
//        System.out.println("---log.getClass()---");
//        System.out.println(log.getClass());
        log.debug("---debug Hello!---");
        log.info("---info Hello!---");
        log.warn("---warn Hello!---");
        log.error("---error Hello!---");
        throw new RuntimeException("---RuntimeException Hello!---");
    }
}