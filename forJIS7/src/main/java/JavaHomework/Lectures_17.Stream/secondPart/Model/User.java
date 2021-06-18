package JavaHomework.Lectures_17.Stream.secondPart.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class User {

    private Integer id;
    private String name;
    private String lastName;
    private String nickname;
    private Integer age;
    private String email;
    private Integer password;
    private UserStatus userStatus;
    private Boolean isActive;
}
