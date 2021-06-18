package JavaHomework.TaskForArtemiy.Hospital.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Patient {

    private String firstNameOfPatient;
    private String secondNameOfPatient;
    private boolean paymentOfADoctor;
    private DoctorTypes listOfDoctors;
    private DoctorReceptionTime doctorReceptionTime;

}
