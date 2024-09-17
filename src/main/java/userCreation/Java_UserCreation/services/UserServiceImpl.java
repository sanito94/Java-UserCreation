package userCreation.Java_UserCreation.services;

import java.util.Random;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import userCreation.Java_UserCreation.web.model.UserDto;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Override
    public UserDto getUserById(int userId) {
        Random rand = new Random();

        int rand_int1 = rand.nextInt(100000);

        return UserDto.builder()
                .id(rand_int1)
                .firstName("Mitko")
                .lastName("Muglata")
                .dateOfBirth("17.04.1994")
                .email("hasantikradetoka@gmail.com")
                .phoneNumber("111111111")
                .build();
    }

    @Override
    public UserDto saveNewUser(UserDto user) {
        Random rand = new Random();

        int rand_int1 = rand.nextInt(100000);

        return UserDto.builder()
                .id(rand_int1)
                .firstName("Djoni")
                .lastName("Banani")
                .dateOfBirth("19.11.1999")
                .email("djingibi@gmail.com")
                .phoneNumber("+3592221199")
                .build();
    }

    @Override
    public void updateUser(int userId, UserDto user) {

    }

    @Override
    public void deleteById(int userId) {
        log.debug("Deleting a user...");
    }

}
