package JavaHomework.Lectures_17.Stream.secondPart;

import JavaHomework.Lectures_17.Stream.secondPart.Service.UserService;


public class App {

    public static void main(String[] args) {

        var userService = new UserService();

        userService.addUserList();
        System.out.println(userService.checkUserStatus());
    }
}
