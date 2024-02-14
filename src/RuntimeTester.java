import java.util.Arrays;

public class RuntimeTester {
    public static void main(String args[]) {
        int[] arrA = {-95,-92,-79,-74,-69,-64,-61,-39,-38,-36,-29,-17,-9,-8,3,18,19,21,39,51,57,66,67,70,73,84,88,90,99,100};
        Sort.selectionSort(arrA);
        System.out.println(Arrays.toString(arrA));
        System.out.println();
        int[] arrB = {-95,-92,-79,-74,-69,-64,-61,-39,-38,-36,-29,-17,-9,-8,3,18,19,21,39,51,57,66,67,70,73,84,88,90,99,100};
        Sort.insertionSort(arrB);
        System.out.println(Arrays.toString(arrB));
    }
}
