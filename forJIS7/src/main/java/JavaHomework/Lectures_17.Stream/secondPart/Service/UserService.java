package JavaHomework.Lectures_17.Stream.secondPart.Service;

import JavaHomework.Lectures_17.Stream.secondPart.Model.User;

import java.util.List;

public interface UserService {

    List<User> checkUserStatus();

    void initialUserList();           //нужен ли он тут?

    List<User> changeUserStatusGuestToUser();

    List<User> changeIsActive();

    void showUserList();              //нужен ли он тут?
}
