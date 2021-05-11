package JavaHomework.TaskForArtemiy.Hospital.Models;

import java.util.Objects;

public class Patients {

    private String firstNameOfPatient;
    private String secondNameOfPatient;
    private boolean paymentOfADoctor;
    private DoctorTypes listOfDoctors;
    private DoctorReceptionTime doctorReceptionTime;


    public Patients() {
    }

    public Patients(String firstNameOfPatient, String secondNameOfPatient, boolean paymentOfADoctor, DoctorTypes listOfDoctors, DoctorReceptionTime doctorReceptionTime) {
        this.firstNameOfPatient = firstNameOfPatient;
        this.secondNameOfPatient = secondNameOfPatient;
        this.paymentOfADoctor = paymentOfADoctor;
        this.listOfDoctors = listOfDoctors;
        this.doctorReceptionTime = doctorReceptionTime;
    }

    public String getFirstNameOfPatient() {
        return firstNameOfPatient;
    }

    public void setFirstNameOfPatient(String firstNameOfPatient) {
        this.firstNameOfPatient = firstNameOfPatient;
    }

    public String getSecondNameOfPatient() {
        return secondNameOfPatient;
    }

    public void setSecondNameOfPatient(String secondNameOfPatient) {
        this.secondNameOfPatient = secondNameOfPatient;
    }

    public boolean isPaymentOfADoctor() {
        return paymentOfADoctor;
    }

    public void setPaymentOfADoctor(boolean paymentOfADoctor) {
        this.paymentOfADoctor = paymentOfADoctor;
    }

    public DoctorTypes getListOfDoctors() {
        return listOfDoctors;
    }

    public void setListOfDoctors(DoctorTypes listOfDoctors) {
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
        Patients patients = (Patients) o;
        return paymentOfADoctor == patients.paymentOfADoctor
                && Objects.equals(firstNameOfPatient, patients.firstNameOfPatient)
                && Objects.equals(secondNameOfPatient, patients.secondNameOfPatient)
                && listOfDoctors == patients.listOfDoctors
                && doctorReceptionTime == patients.doctorReceptionTime;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstNameOfPatient, secondNameOfPatient, paymentOfADoctor, listOfDoctors, doctorReceptionTime);
    }

    @Override
    public String toString() {
        return "Patients{" +
                "firstNameOfPatient='" + firstNameOfPatient + '\'' +
                ", secondNameOfPatient='" + secondNameOfPatient + '\'' +
                ", paymentOfADoctor=" + paymentOfADoctor +
                ", listOfDoctors=" + listOfDoctors +
                ", doctorReceptionTime=" + doctorReceptionTime +
                '}';
    }
}
