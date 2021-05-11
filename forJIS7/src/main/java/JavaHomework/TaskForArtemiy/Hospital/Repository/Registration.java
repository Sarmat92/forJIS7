package JavaHomework.TaskForArtemiy.Hospital.Repository;

import JavaHomework.TaskForArtemiy.Hospital.Models.Doctors;
import JavaHomework.TaskForArtemiy.Hospital.Models.Patients;

import java.util.HashMap;
import java.util.Map;

public class Registration {

    Map<Doctors, Map<DoctorReceptionTime, Patients>> registration = new HashMap<>();

}
