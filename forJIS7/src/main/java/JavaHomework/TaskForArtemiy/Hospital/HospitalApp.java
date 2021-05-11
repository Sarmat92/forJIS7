package JavaHomework.TaskForArtemiy.Hospital;

import JavaHomework.TaskForArtemiy.Hospital.Models.DoctorReceptionTime;
import JavaHomework.TaskForArtemiy.Hospital.Models.Doctors;
import JavaHomework.TaskForArtemiy.Hospital.Models.Patients;
import JavaHomework.TaskForArtemiy.Hospital.Repository.RegistrationImpl;
import JavaHomework.TaskForArtemiy.Hospital.Service.RegistrationService;

public class HospitalApp {

    public static void main(String[] args) {

        RegistrationService registrationService = new RegistrationService(new RegistrationImpl());
        registrationService.addPatientToDoctor(new Doctors(), new Patients(), DoctorReceptionTime.FIRST_RECEPTION);


    }
}
