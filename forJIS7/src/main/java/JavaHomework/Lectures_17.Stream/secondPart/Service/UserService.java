package JavaHomework.Lectures_17.Stream.secondPart.Service;

import JavaHomework.Lectures_17.Stream.secondPart.Model.User;
import JavaHomework.Lectures_17.Stream.secondPart.Model.UserStatus;

import java.util.List;
import java.util.stream.Collectors;

import static JavaHomework.Lectures_17.Stream.secondPart.Repository.UserRepository.*;

public class UserService implements Service {
    @Override
    public List<User> checkUserStatus() {

        List<User> userStatus = userList.stream()
                .filter(it -> it.getUserStatus().equals(UserStatus.GUEST))
                .collect(Collectors.toList());

        return userStatus;
    }
}
