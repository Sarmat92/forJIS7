package JavaHomework.Lectures_20.Optional.Service;

public interface ModelService<O> {

    void addStudentToStudentList(String firstName, String secondName, Integer age);
    O fiendByName (String firstName);
}
