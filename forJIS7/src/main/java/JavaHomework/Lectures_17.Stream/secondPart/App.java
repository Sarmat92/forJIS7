package JavaHomework.Lectures_17.Stream.secondPart;

import JavaHomework.Lectures_17.Stream.secondPart.Service.UserService;


public class App {

    public static void main(String[] args) {

        var userService = new UserService();

        userService.addUserList();
        userService.showUserList();
        System.out.println();
        System.out.println(userService.checkUserStatus());
        System.out.println(userService.changeUserStatusGuestToUser());
        System.out.println(userService.changeIsActive());
        System.out.println();
        userService.showUserList();
    }
}
