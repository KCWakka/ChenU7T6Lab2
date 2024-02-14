import java.util.ArrayList;

public class Sort {

    // PART A. implementing insertion sort
    public static void insertionSort(int[] elements) {
        // TODO: Part A: implement me using an outer FOR loop and an inner WHILE loop
        int count = 0;
        for (int i = 1; i < elements.length; i++) {
            int value = elements[i];
            int index = i;
            while (index > 0 && value < elements[index - 1]) {
                count++;
                elements[index] = elements[index - 1];
                index--;
            }
            elements[index] = value;
        }
        System.out.println(count);
    }

    // PART B. sorting a word list
    public static void insertionSortWordList(ArrayList<String> words) {
        // TODO: Part B: implement me like part A except sorting an arraylist of Strings
        int count = 0;
        for (int i = 1; i < words.size(); i++) {
            String word = words.get(i);
            int index = i;
            while (index > 0 && word.compareTo(words.get(index - 1)) < 0) {
                count++;
                words.set(index, words.set(index - 1, words.get(index)));
                index--;
            }
            words.set(index, word);
        }
        System.out.println(count);
    }
    public static void selectionSort(int[] elements) {
        // TODO: Part A: implement me
        int count = 0;
        for (int i = 0; i < elements.length - 1; i++) {
            int min = i;
            for (int f = i + 1; f < elements.length; f++) {
                count++;
                int value = elements[f];
                if (value < elements[min]) {
                    min = f;
                }
            }
            int temp = elements[i];
            elements[i] = elements[min];
            elements[min] = temp;
        }
        System.out.println(count);
    }

    public static void selectionSortWordList(ArrayList<String> words) {
        // TODO: Part B: implement me
        int count = 0;
        for (int i = 0; i < words.size()- 1; i++) {
            int min = i;
            for (int f = i + 1; f < words.size(); f++) {
                count++;
                String value = words.get(f);
                if (value.compareTo(words.get(min)) < 0) {
                    min = f;
                }
            }
            words.set(i, words.set(min, words.get(i)));
        }
        System.out.println(count);
    }
}
