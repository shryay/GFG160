import java.util.Scanner;

public class SecondLargestElement {
    public static int print2Largest(int[] arr) {
        int n = arr.length;
        int second;
        int first = second = Integer.MIN_VALUE;
        if (n < 2) {
            return -1;
        }
        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        if (second == Integer.MIN_VALUE) {
            return -1;
        } 
        else {
            return second;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int secondLargest = print2Largest(arr);
        if (secondLargest == -1) {
            System.out.println("There is no second largest element in the array.");
        } 
        else {
            System.out.println("The second largest element in the array is: " + secondLargest);
        }
        sc.close();
    }
}