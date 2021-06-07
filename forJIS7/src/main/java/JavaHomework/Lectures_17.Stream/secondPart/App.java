package JavaHomework.Lectures_17.Stream.secondPart;

import JavaHomework.Lectures_17.Stream.secondPart.Model.User;
import JavaHomework.Lectures_17.Stream.secondPart.Model.UserStatus;
import JavaHomework.Lectures_17.Stream.secondPart.Service.UserService;

public class App {

    public static void main(String[] args) {


        var user1 = new User(1,"Boris","Burkin","Burboria",45,
                "bukinboris1975@gmail.com",12345, UserStatus.GUEST,true);

        var user2 = new User(2,"Dima","Rogov","Rogatka", 18,
                "dimarog@yandex.ru",123,UserStatus.USER,true);

        var user3 = new User(3,"Sasha","Gromov","SashaGrom", 25,
                "gromov@mail.ru",852,UserStatus.VIP_USER,false);


    }
}
