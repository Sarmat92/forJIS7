package JavaHomework.TaskForArtemiy.Hospital.Service;

import JavaHomework.TaskForArtemiy.Hospital.Models.Doctors;
import JavaHomework.TaskForArtemiy.Hospital.Models.Patients;

public interface RegistrationService {

    Patients showListAllPatients();

    Doctors showListAllDoctors();

    void addPatientToDoctor();
}
