package JavaHomework.ObjectInMember.TV;

public class TvTest {

    public static void main(String[] args) {

        Tv tv = new Tv();

        tv.turnOnTv();
        tv.switchToTheNextChanel();
        tv.switchToTheNextChanel();
        tv.switchToThePreviousChanel();

        tv.increaseTheVolume();
        tv.reduceTheVolume();
        tv.reduceTheVolume();
        tv.reduceTheVolume();
        tv.turnOffTv();
        tv.switchToThePreviousChanel();
    }
}
