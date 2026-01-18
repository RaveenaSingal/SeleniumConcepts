package Java_Programs_forLoop;

public class Demo {

    public static void main(String[] args) {

        // Reverse an array without using another array
        int[] arr = {4, 5, 6, 1, 2, 10, 3};

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        // Print reversed array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
