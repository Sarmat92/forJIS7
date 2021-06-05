package JavaHomework.TaskForArtemiy.Hospital.Models;

import java.util.Objects;

public class Doctor {

    private String firstName;
    private String secondName;
    private DoctorTypes doctorType;
    private DoctorReceptionTime doctorReceptionTime;//TODO delete

    public Doctor() {
    }

    public Doctor(String firstName, String secondName, DoctorTypes doctorType, DoctorReceptionTime doctorReceptionTime) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.doctorType = doctorType;
        this.doctorReceptionTime = doctorReceptionTime;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public DoctorTypes getDoctorType() {
        return doctorType;
    }

    public void setDoctorType(DoctorTypes doctorType) {
        this.doctorType = doctorType;
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
        Doctor doctors = (Doctor) o;
        return Objects.equals(firstName, doctors.firstName)
                && Objects.equals(secondName, doctors.secondName)
                && doctorType == doctors.doctorType
                && doctorReceptionTime == doctors.doctorReceptionTime;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName, doctorType, doctorReceptionTime);
    }

    @Override
    public String toString() {
        return "Doctors{" +
                "firstNameOfDoctor='" + firstName + '\'' +
                ", secondNameOfDoctor='" + secondName + '\'' +
                ", listOfDoctors=" + doctorType +
                ", doctorReceptionTime=" + doctorReceptionTime +
                '}';
    }
}
