package JavaHomework.TaskForArtemiy.Hospital;

import JavaHomework.TaskForArtemiy.Hospital.Models.DoctorReceptionTime;
import JavaHomework.TaskForArtemiy.Hospital.Models.Doctor;
import JavaHomework.TaskForArtemiy.Hospital.Models.Patient;
import JavaHomework.TaskForArtemiy.Hospital.Repository.RegistrationImpl;
import JavaHomework.TaskForArtemiy.Hospital.Service.RegistrationService;

public class HospitalApp {

    public static void main(String[] args) {

        var registrationService = new RegistrationService(new RegistrationImpl());
        registrationService.addPatientToDoctor(new Doctor(), new Patient(), DoctorReceptionTime.FIRST_RECEPTION);


    }
}
