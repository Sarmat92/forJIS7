package JavaHomework.TaskForArtemiy.Hospital.Repository;

public enum ListOfDoctors {

    SURGEON ("Surgeon"),
    PROCTOLOGIST("Proctologist"),
    THERAPIST("Therapist"),
    ORTHOPEDIST("Orthopedist");

    String specialist;

    ListOfDoctors() {
    }
    ListOfDoctors(String specialist) {
        this.specialist = specialist;
    }

    @Override
    public String toString() {
        return "ListOfDoctors{" +
                "specialist='" + specialist + '\'' +
                '}';
    }
}

