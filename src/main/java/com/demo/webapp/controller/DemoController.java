package com.demo.webapp.controller;

import com.demo.webapp.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

       @GetMapping(value = "/user")
        public ResponseEntity<User> getUser() {

            User user = new User("Ruthvik", "Gaddam", "1234567893", "ruthvik@email.com", "1234 east street, Dallas, Tx, 12345");
            return ResponseEntity.ok(user);

        }
}
