package JavaHomework.TaskForArtemiy.Hospital.Repository;

import JavaHomework.TaskForArtemiy.Hospital.Models.DoctorReceptionTime;
import JavaHomework.TaskForArtemiy.Hospital.Models.Doctor;
import JavaHomework.TaskForArtemiy.Hospital.Models.Patient;

public interface Repository {

    Patient showListAllPatients();

    Doctor showListAllDoctors();

    void addPatientToDoctor(Doctor doctor, Patient patient, DoctorReceptionTime time);
}
