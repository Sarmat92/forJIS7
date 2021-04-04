package Lectures_2;

public class LookUpArrayService {

    public static void main(String[] args) {

        int[] array = new int[10];

        addArray(array);
        fiendMax(array);
        fiendMin(array);
        indexOfMaxNumber(array);
        indexOfMinNumber(array);
    }

    private static void addArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int randomNumbers = (int) (Math.random() * 20);
            array[i] = randomNumbers;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static void fiendMax(int[] maxArray) {
        int maxNumber = maxArray[0];
        for (int i = 0; i < maxArray.length; i++) {
            if (maxArray[i] > maxNumber) {
                maxNumber = maxArray[i];
            }
        }
        System.out.println("Max number: " + maxNumber);
    }

    private static void fiendMin(int[] minArray) {
        int minNumber = minArray[0];
        for (int i = 0; i < minArray.length; i++) {
            if (minArray[i] < minNumber) {
                minNumber = minArray[i];
            }
        }
        System.out.println("Min number: " + minNumber);
    }

    private static void indexOfMaxNumber(int[] maxiArray) {
        int maxNumber = maxiArray[0];
        int indexOfMaxNumber = 0;
        for (int i = 0; i < maxiArray.length; i++) {
            if (maxiArray[i] > maxNumber) {
                maxNumber = maxiArray[i];
                indexOfMaxNumber = i;
            }
        }
        System.out.println("Index of max number: " + indexOfMaxNumber);
    }

    private static void indexOfMinNumber(int[] miniArray){
        int minNumber = miniArray[0];
        int indexOfMinNumber = 0;
        for (int i = 0; i < miniArray.length; i++) {
            if (miniArray[i] < minNumber){
                minNumber = miniArray[i];
                indexOfMinNumber = i;
            }
        }
        System.out.println("Index of min number: " + indexOfMinNumber);
    }
}
