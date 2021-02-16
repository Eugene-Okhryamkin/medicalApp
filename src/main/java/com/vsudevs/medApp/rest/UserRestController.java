package com.vsudevs.medApp.rest;

import com.vsudevs.medApp.models.User;
import com.vsudevs.medApp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users/")
public class UserRestController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable("id") Long userId) {
        if(userId == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        };

        User user = this.userService.getByID(userId);

        if(user == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(user, HttpStatus.OK);

    };

    @GetMapping("/")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = this.userService.getAll();

        if(users.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        };

        return new ResponseEntity<>(users, HttpStatus.OK);
    };

    @PostMapping("/save")
    public ResponseEntity<User> saveUser(@RequestBody @Validated User user) {
        HttpHeaders headers = new HttpHeaders();

        if(user == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        this.userService.saveUser(user);

        return new ResponseEntity<>(user, headers, HttpStatus.CREATED);
        
    };

    @PutMapping("/update")
    public ResponseEntity<User> updateUser(@RequestBody @Validated User user) {
        HttpHeaders headers = new HttpHeaders();

        if(user == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        this.userService.saveUser(user);

        return new ResponseEntity<>(user, headers, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<User> deleteUser(@PathVariable("id") Long id) {
        User user = this.userService.getByID(id);

        if(user == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        this.userService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
