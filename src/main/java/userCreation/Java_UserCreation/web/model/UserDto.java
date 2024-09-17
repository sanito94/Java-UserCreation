package userCreation.Java_UserCreation.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {
    private int id;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String phoneNumber;
    private String email;
}
