package userCreation.Java_UserCreation.services;

// import java.util.UUID;

import userCreation.Java_UserCreation.web.model.UserDto;

public interface UserService {
    UserDto getUserById(int userId);
}
