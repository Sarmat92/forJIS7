package JavaHomework.Lectures_20.Optional.Repository;

import JavaHomework.Lectures_20.Optional.Model.Lecturer;

import java.util.ArrayList;
import java.util.List;

public class LecturerRepository {

    public static  List<Lecturer> lecturerList = new ArrayList<>();

    public static void initializeStudent(){

        lecturerList.add(new Lecturer("Iosif","Sapega",45,new ArrayList<>()));
        lecturerList.add(new Lecturer("Artemiy", "Stankevich",25,new ArrayList<>()));
        lecturerList.add(new Lecturer("Kiril","Efrimov",55,new ArrayList<>()));
        lecturerList.add(new Lecturer("Victor","Konan",35,new ArrayList<>()));
    }
}
