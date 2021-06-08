package JavaHomework.Lectures_17.Stream.secondPart.Service;

import JavaHomework.Lectures_17.Stream.secondPart.Model.User;
import JavaHomework.Lectures_17.Stream.secondPart.Model.UserStatus;

import java.util.List;
import java.util.stream.Collectors;

import static JavaHomework.Lectures_17.Stream.secondPart.Repository.UserRepository.*;

public class UserService implements Service {

    @Override
    public void showUserList() {
        userList
                .forEach(System.out::println);
    }

    @Override
    public List<User> changeIsActive() {
        return userList.stream()
                .peek(it->it.setIsActive(true))
                .collect(Collectors.toList());
    }

    @Override
    public List<User> changeUserStatusGuestToUser() {
         return userList.stream()
                .peek(it->it.setUserStatus(UserStatus.USER))
                 .collect(Collectors.toList());
    }

    @Override
    public List<User> checkUserStatus() {
        return userList.stream()
                .filter(it -> it.getUserStatus().equals(UserStatus.GUEST))
                .collect(Collectors.toList());
    }

    @Override
    public void addUserList() {

        userList.add(new User(1, "Boris", "Burkin", "Burboria", 45,
                "bukinboris1975@gmail.com", 12345, UserStatus.GUEST, true));

        userList.add(new User(2, "Dima", "Rogov", "Rogatka", 18,
                "dimarog@yandex.ru", 123, UserStatus.USER, true));

        userList.add(new User(3, "Sasha", "Gromov", "SashaGrom", 25,
                "gromov@mail.ru", 852, UserStatus.VIP_USER, false));

        userList.add(new User(4,"Karolina","Kas","Karolinka",17,
                "Kasik@gmail.com", 1405,UserStatus.USER,false));
    }
}
