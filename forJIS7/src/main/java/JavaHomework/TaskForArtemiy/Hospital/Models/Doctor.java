package JavaHomework.TaskForArtemiy.Hospital.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Doctor {

    private String firstName;
    private String secondName;
    private DoctorTypes doctorType;
    private DoctorReceptionTime doctorReceptionTime;//TODO delete

}
