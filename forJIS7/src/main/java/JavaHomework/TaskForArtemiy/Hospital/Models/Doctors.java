package JavaHomework.TaskForArtemiy.Hospital.Models;

import JavaHomework.TaskForArtemiy.Hospital.Repository.DoctorReceptionTime;
import JavaHomework.TaskForArtemiy.Hospital.Repository.ListOfDoctors;

import java.util.Objects;

public class Doctors {

    private String firstNameOfDoctor;
    private String secondNameOfDoctor;
    private ListOfDoctors listOfDoctors;
    private DoctorReceptionTime doctorReceptionTime;

    public Doctors() {
    }

    public Doctors(String firstNameOfDoctor, String secondNameOfDoctor, ListOfDoctors listOfDoctors, DoctorReceptionTime doctorReceptionTime) {
        this.firstNameOfDoctor = firstNameOfDoctor;
        this.secondNameOfDoctor = secondNameOfDoctor;
        this.listOfDoctors = listOfDoctors;
        this.doctorReceptionTime = doctorReceptionTime;
    }

    public String getFirstNameOfDoctor() {
        return firstNameOfDoctor;
    }

    public void setFirstNameOfDoctor(String firstNameOfDoctor) {
        this.firstNameOfDoctor = firstNameOfDoctor;
    }

    public String getSecondNameOfDoctor() {
        return secondNameOfDoctor;
    }

    public void setSecondNameOfDoctor(String secondNameOfDoctor) {
        this.secondNameOfDoctor = secondNameOfDoctor;
    }

    public ListOfDoctors getListOfDoctors() {
        return listOfDoctors;
    }

    public void setListOfDoctors(ListOfDoctors listOfDoctors) {
        this.listOfDoctors = listOfDoctors;
    }

    public DoctorReceptionTime getDoctorReceptionTime() {
        return doctorReceptionTime;
    }

    public void setDoctorReceptionTime(DoctorReceptionTime doctorReceptionTime) {
        this.doctorReceptionTime = doctorReceptionTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctors doctors = (Doctors) o;
        return Objects.equals(firstNameOfDoctor, doctors.firstNameOfDoctor)
                && Objects.equals(secondNameOfDoctor, doctors.secondNameOfDoctor)
                && listOfDoctors == doctors.listOfDoctors
                && doctorReceptionTime == doctors.doctorReceptionTime;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstNameOfDoctor, secondNameOfDoctor, listOfDoctors, doctorReceptionTime);
    }

    @Override
    public String toString() {
        return "Doctors{" +
                "firstNameOfDoctor='" + firstNameOfDoctor + '\'' +
                ", secondNameOfDoctor='" + secondNameOfDoctor + '\'' +
                ", listOfDoctors=" + listOfDoctors +
                ", doctorReceptionTime=" + doctorReceptionTime +
                '}';
    }
}
