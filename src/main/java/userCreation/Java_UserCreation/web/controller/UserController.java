package userCreation.Java_UserCreation.web.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import userCreation.Java_UserCreation.services.UserService;
import userCreation.Java_UserCreation.web.model.UserDto;

@RequestMapping("/api/user")
@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping({ "/{userId}" })
    public ResponseEntity<UserDto> getUser(@PathVariable("userId") int userId) {
        return new ResponseEntity<>(userService.getUserById(userId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity createUser(@RequestBody UserDto user) {

        UserDto savedDto = userService.saveNewUser(user);

        HttpHeaders headers = new HttpHeaders();
        String test = String.valueOf(savedDto.getId());
        headers.add("Location", "/api/user" + test.toString());

        return new ResponseEntity(headers, HttpStatus.CREATED);

    }

    @PutMapping({ "/{userId}" })
    public ResponseEntity updateUser(@PathVariable("userId") int userId, @RequestBody UserDto user) {

        userService.updateUser(userId, user);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
