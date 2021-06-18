package JavaHomework.TaskForArtemiy.Hospital.Service;

import JavaHomework.TaskForArtemiy.Hospital.Models.DoctorReceptionTime;
import JavaHomework.TaskForArtemiy.Hospital.Models.Doctor;
import JavaHomework.TaskForArtemiy.Hospital.Models.Patient;
import JavaHomework.TaskForArtemiy.Hospital.Repository.RegistrationImpl;

public class RegistrationService {

    RegistrationImpl registration;

    public RegistrationService() {
    }

    public RegistrationService(RegistrationImpl registration) {
        this.registration = registration;
    }

    public Patient showListAllPatients() {
        return registration.showListAllPatients();
    }

    public Doctor showListAllDoctors() {
        return registration.showListAllDoctors();
    }

    public void addPatientToDoctor(Doctor doctor, Patient patient, DoctorReceptionTime time) {
        registration.addPatientToDoctor(doctor, patient, time);
    }
}
