package JavaHomework.TaskForArtemiy.Hospital.Repository;

import JavaHomework.TaskForArtemiy.Hospital.Models.DoctorReceptionTime;
import JavaHomework.TaskForArtemiy.Hospital.Models.Doctors;
import JavaHomework.TaskForArtemiy.Hospital.Models.Patients;

public interface Repository {

    Patients showListAllPatients();

    Doctors showListAllDoctors();

    void addPatientToDoctor(Doctors doctor, Patients patient, DoctorReceptionTime time);
}
