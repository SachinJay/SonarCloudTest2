package com.example.demo.controllers;

import com.example.demo.services.DummyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {
    @Autowired
    private DummyService ds;

    @GetMapping("/")
    String base() {
        return ds.getMsg();
    }

}
