import java.util.Scanner;
import java.util.ArrayList;

public class NextPermutation {
    public static void nextPermutation(ArrayList<Integer> arr) {
        int n = arr.size();
        int pivot = -1;
        // Find the pivot element
        for (int i = n - 2; i >= 0; i--) {
            if (arr.get(i) < arr.get(i + 1)) { // Find the first element which is smaller than the next element
                pivot = i;
                break;
            }
        }
        if (pivot == -1) { // If pivot is not found, then the array is in decreasing order
            reverse(arr, 0, n - 1);
            return;
        }
        // Find the element which is just greater than the pivot element
        for (int i = n - 1; i > pivot; i--) {
            if (arr.get(i) > arr.get(pivot)) { // Find the first element which is greater than the pivot element
                int temp = arr.get(i);
                arr.set(i, arr.get(pivot)); // Swap the pivot element with the element found
                arr.set(pivot, temp);
                break;
            }
        }
        reverse(arr, pivot + 1, n - 1); // Reverse the elements from pivot + 1 to n - 1
    }

    public static void reverse(ArrayList<Integer> arr, int start, int end) {
        while (start < end) { // Reverse the elements from start to end
            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        nextPermutation(arr);
        System.out.println("The next permutation is:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        sc.close();
    }
}