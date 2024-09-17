package userCreation.Java_UserCreation.webController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import userCreation.Java_UserCreation.webModel.UserDto;

@RequestMapping("/api/v1/user")
@RestController
public class UserController {

    @GetMapping({"/{userId}"})
    public ResponseEntity<UserDto> getUser(@PathVariable("userId") int userId) {

        return new ResponseEntity<>(UserDto.builder().build(), HttpStatus.OK);
    }

}
