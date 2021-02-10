package com.vsudevs.medApp.rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test/")
public class TestController {
    @RequestMapping(method = RequestMethod.GET,  produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String index() {
        return "<h1>Test</h1>";
    };
}
