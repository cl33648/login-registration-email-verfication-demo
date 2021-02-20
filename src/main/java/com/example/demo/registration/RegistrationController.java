package com.example.demo.registration;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

/*  With this class, want to register the person
*   managing http requests/REST API between client and server for registering a person
*/
@RestController
@RequestMapping(path = "api/v1/registration1")
@AllArgsConstructor
public class RegistrationController {

    private final RegistrationService registrationService;

    //@PostMapping is specialized version of @RequestMapping annotation that acts as a shortcut for
    //@RequestMapping(method = RequestMethod. POST).
    //@PostMapping annotated methods handle the HTTP POST requests matched with given URI expression.
    //Test can be done on postman
    @PostMapping
    public String register(@RequestBody RegistrationRequest request){
        return registrationService.register(request);
    }


    //will confirm the token from GET request http://localhost:8080/api/v1/registration1/confirm?token=...
    @GetMapping(path = "confirm")
    public String confirm(@RequestParam("token") String token){
        return registrationService.confirmToken(token);
    }
}
