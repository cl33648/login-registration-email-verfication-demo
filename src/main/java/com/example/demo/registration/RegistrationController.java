package com.example.demo.registration;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//With this class, want to register the person
//managing http requests/REST API between client server for registering a person
@RestController
@RequestMapping(path = "api/v1/registration1")
@AllArgsConstructor
public class RegistrationController {

    private RegistrationService registrationService;

    //@PostMapping is specialized version of @RequestMapping annotation that acts as a shortcut for @RequestMapping(method = RequestMethod. POST) .
    //@PostMapping annotated methods handle the HTTP POST requests matched with given URI expression.
    //Test can be done on postman
    @PostMapping
    public String register(@RequestBody RegistrationRequest request){
        return registrationService.register(request);
    }
}
