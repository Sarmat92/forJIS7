package JavaHomework.TaskForArtemiy.Hospital.Models;

public enum DoctorTypes {

    SURGEON ("Surgeon"),
    PROCTOLOGIST("Proctologist"),
    THERAPIST("Therapist"),
    ORTHOPEDIST("Orthopedist");

    String specialist;

    DoctorTypes() {
    }
    DoctorTypes(String specialist) {
        this.specialist = specialist;
    }
}

