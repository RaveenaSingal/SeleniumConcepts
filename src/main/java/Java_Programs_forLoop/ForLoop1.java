package Java_Programs_forLoop;

public class ForLoop1 {

    public static void main(String[] args) {

        // Print duplicate elements in an array
        int[] arr = {1, 5, 2, 4, 2, 2, 5};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break; // avoid printing same duplicate multiple times
                }
            }
        }
    }
}
