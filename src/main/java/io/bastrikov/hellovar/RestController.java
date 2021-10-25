package io.bastrikov.hellovar;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Value("${greet}")
    private String greet;

    @GetMapping
    public String hello(){
        return greet;
    }



}
