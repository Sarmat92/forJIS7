package JavaHomework.Lectures_17.Stream.secondPart.Service;

import JavaHomework.Lectures_17.Stream.secondPart.Model.User;

import java.util.List;

public interface Service {

    List<User> checkUserStatus();

    void addUserList();

    List<User> changeUserStatusGuestToUser();

    List<User> changeIsActive();
}
