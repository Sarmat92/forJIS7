package JavaHomework.ObjectInMember.TV;

import java.util.Objects;

public class Tv {

    private int currentChanel = 0;
    private int currentVolume = 0;
    private String fabricator;
    private boolean turnOn;

    public Tv() {

    }

    public int getCurrentChanel() {
        return currentChanel;
    }

    public void setCurrentChanel(int currentChanel) {
        this.currentChanel = currentChanel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public String getFabricator() {
        return fabricator;
    }

    public void setFabricator(String fabricator) {
        this.fabricator = fabricator;
    }

    public boolean isTurnOn() {
        return turnOn;
    }

    public void setTurnOn(boolean turnOn) {
        this.turnOn = turnOn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tv tv = (Tv) o;
        return currentChanel == tv.currentChanel && currentVolume == tv.currentVolume && turnOn == tv.turnOn && Objects.equals(fabricator, tv.fabricator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentChanel, currentVolume, fabricator, turnOn);
    }

    @Override
    public String toString() {
        return "Tv{" +
                "currentChanel=" + currentChanel +
                ", currentVolume=" + currentVolume +
                ", fabricator='" + fabricator + '\'' +
                ", turnOn=" + turnOn +
                '}';
    }

    public void turnOnTv() {
        setTurnOn(true);
        System.out.println("TV is turn on");
    }

    public void turnOffTv() {
        setTurnOn(false);
        System.out.println("TV is turn off");
    }

    public void switchToTheNextChanel() {

        if (turnOn) {
            int nextChanel = getCurrentChanel() + 1;
            setCurrentChanel(nextChanel);
            System.out.println("Chanel is " + getCurrentChanel());
        } else System.out.println("Turn on TV");
    }

    public void switchToThePreviousChanel() {

        if (turnOn) {
            int previousChanel = getCurrentChanel() - 1;
            setCurrentChanel(previousChanel);
            System.out.println("Chanel is " + getCurrentChanel());
        } else System.out.println("Turn on TV");
    }

    public void increaseTheVolume() {

        if (turnOn) {
            int increaseVolume = getCurrentVolume() + 1;
            setCurrentVolume(increaseVolume);
            System.out.println("Volume is " + getCurrentVolume());
        } else System.out.println("Turn on TV");
    }

    public void reduceTheVolume() {

        if (turnOn) {
            int reduceVolume = getCurrentVolume() - 1;
            setCurrentVolume(reduceVolume);
            System.out.println("Volume is " + getCurrentVolume());
        } else System.out.println("Turn on the TV");
    }
}
