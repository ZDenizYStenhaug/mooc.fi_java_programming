import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {3, -1, 1, 5, 99, 3, 12, 0};
        sort(numbers);
    }
    
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int smallest = indexOfSmallestFrom(arr, i);
            swap(arr, smallest, i);
            System.out.println(Arrays.toString(arr));
        }
    }
    
    public static int smallest(int[] arr) {
        int smallest = arr[0];
        for (int i : arr) {
            if(i < smallest) {
                smallest = i;
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] arr) {
        int index = 0;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < smallest) {
                smallest = arr[i];
                index = i;
            }
        }
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        return indexOfSmallest(Arrays.copyOfRange(table, startIndex, table.length)) + startIndex;
    }
    
    public static void swap(int[] arr, int i1, int i2) {
        int helper = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = helper;
    }

}
