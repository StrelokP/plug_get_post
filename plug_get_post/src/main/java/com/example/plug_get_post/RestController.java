package com.example.plug_get_post;


import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
@Validated
public class RestController {


    @GetMapping("/static")
    public String getJsonStatic() throws InterruptedException {
        User.sleepRandom();
        return "{\"key\": \"value\"}";
    }

    @PostMapping("/login")
    public ResponseEntity<User.LoginResponse> postLogin(@Valid @RequestBody User.LoginRequest request) throws InterruptedException {
        String currentDate = LocalDate.now().format(DateTimeFormatter.ISO_LOCAL_DATE);
        User.sleepRandom();
        User.LoginResponse response = new User.LoginResponse(request.getLogin(), request.getPassword(), currentDate);
        return ResponseEntity.ok(response);
    }



}
