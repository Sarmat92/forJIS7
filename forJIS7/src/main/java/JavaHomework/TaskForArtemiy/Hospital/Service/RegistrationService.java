package JavaHomework.TaskForArtemiy.Hospital.Service;

import JavaHomework.TaskForArtemiy.Hospital.Models.DoctorReceptionTime;
import JavaHomework.TaskForArtemiy.Hospital.Models.Doctors;
import JavaHomework.TaskForArtemiy.Hospital.Models.Patients;
import JavaHomework.TaskForArtemiy.Hospital.Repository.RegistrationImpl;

public class RegistrationService {

    RegistrationImpl registration;

    public RegistrationService() {
    }

    public RegistrationService(RegistrationImpl registration) {
        this.registration = registration;
    }

    public Patients showListAllPatients() {
        return registration.showListAllPatients();
    }

    public Doctors showListAllDoctors() {
        return registration.showListAllDoctors();
    }

    public void addPatientToDoctor(Doctors doctor, Patients patient, DoctorReceptionTime time) {
        registration.addPatientToDoctor(doctor, patient, time);
    }
}
