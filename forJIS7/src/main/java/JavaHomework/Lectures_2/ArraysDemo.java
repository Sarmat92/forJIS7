package Lectures_2;
//**********@Checked***************//
import java.util.Arrays;

public class ArraysDemo {

    static int[]arrayCopy;
    static  int[] array = new int[5];

    public static void main(String[] args) {

        addAndShowArray();
        sortArray();
        copyAndReversArray(array);
        concatTwoArrays(array, arrayCopy);
    }

    private static void addAndShowArray() {
        for (int i = 0; i < 5; i++) {
            int randomNumbers = (int) (Math.random() * 20);
            array[i] = randomNumbers;
        }

        System.out.print("Show array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void sortArray() {
        Arrays.sort(array);
        System.out.println();
        System.out.print("Array after sort: ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static int[] copyAndReversArray(int[] array) {
        arrayCopy = Arrays.copyOf(array, 5);

        System.out.print("Array after revers: ");
        for (int i = arrayCopy.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        return arrayCopy;
    }

    private static void concatTwoArrays(int[]firstArray, int[]secondArray){
        int[]concat = Arrays.copyOf(secondArray,secondArray.length + firstArray.length);
        System.arraycopy(firstArray,0,concat,secondArray.length,firstArray.length);
        System.out.print("Concatenation arrays: ");

        for (int i = 0; i < concat.length; i++) {
            System.out.print(concat[i] + " ");
        }
    }
}
