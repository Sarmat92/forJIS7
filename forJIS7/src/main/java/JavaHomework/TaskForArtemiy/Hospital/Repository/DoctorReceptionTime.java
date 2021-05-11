package JavaHomework.TaskForArtemiy.Hospital.Repository;

public enum DoctorReceptionTime {

    FIRST_RECEPTION(9.30),
    SECOND_RECEPTION(10.30),
    THIRD_RECEPTION(11.25),
    FOURTH_RECEPTION(12.00);

    double timeOfReception;

    DoctorReceptionTime() {
    }

    DoctorReceptionTime(double timeOfReception) {
        this.timeOfReception = timeOfReception;
    }

    @Override
    public String toString() {
        return "DoctorReceptionTime{" +
                "timeOfReception=" + timeOfReception +
                '}';
    }
}
