package JavaHomework.TaskForArtemiy.Hospital.Repository;

import JavaHomework.TaskForArtemiy.Hospital.Models.DoctorReceptionTime;
import JavaHomework.TaskForArtemiy.Hospital.Models.Doctor;
import JavaHomework.TaskForArtemiy.Hospital.Models.Patient;

import java.util.HashMap;
import java.util.Map;

public class RegistrationImpl implements Repository {

    private static final Map<Doctor, Map<DoctorReceptionTime, Patient>> registration = new HashMap<>();

    @Override
    public Patient showListAllPatients() {
        return null;
    }

    @Override
    public Doctor showListAllDoctors() {
        return null;
    }

    @Override
    public void addPatientToDoctor(Doctor doctor, Patient patient, DoctorReceptionTime time) {
        registration.put(doctor,new HashMap<>());
        registration.get(doctor).put(time,patient);

    }

}
