package JavaHomework.TaskForArtemiy.Hospital.Repository;

import JavaHomework.TaskForArtemiy.Hospital.Models.DoctorReceptionTime;
import JavaHomework.TaskForArtemiy.Hospital.Models.Doctors;
import JavaHomework.TaskForArtemiy.Hospital.Models.Patients;

import java.util.HashMap;
import java.util.Map;

public class RegistrationImpl implements Repository {

    private static final Map<Doctors, Map<DoctorReceptionTime, Patients>> registration = new HashMap<>();

    @Override
    public Patients showListAllPatients() {
        return null;
    }

    @Override
    public Doctors showListAllDoctors() {
        return null;
    }

    @Override
    public void addPatientToDoctor(Doctors doctor, Patients patient, DoctorReceptionTime time) {
        registration.put(doctor,new HashMap<>());
        registration.get(doctor).put(time,patient);

    }

}
