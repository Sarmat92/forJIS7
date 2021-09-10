package JavaHomework.Lectures_20.Optional.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Lecturer {

    private String firstName;
    private String lastName;
    private Integer age;
    private List<Student> students;

}
