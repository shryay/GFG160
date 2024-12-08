// Juggling Algorithm

// import java.util.Scanner;
// import java.util.ArrayList;

// public class RotateAnArray {
//     public static void rotateArray(ArrayList<Integer> arr, int d) {
//         int n = arr.size();
//         d = d % n;
//         int cycles = gcd(n, d);
//         for (int i = 0; i < cycles; i++) {
//             int startEle = arr.get(i);
//             int currIdx = i;
//             while (true) {
//                 int nextIdx = (currIdx + d) % n;
//                 if (nextIdx == i) {
//                     break;
//                 }
//                 arr.set(currIdx, arr.get(nextIdx));
//                 currIdx = nextIdx;
//             }
//             arr.set(currIdx, startEle);
//         }
//     }

//     public static int gcd(int a, int b) {
//         if (b == 0) {
//             return a;
//         }
//         return gcd(b, a % b);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of the array: ");
//         int n = sc.nextInt();
//         ArrayList<Integer> arr = new ArrayList<>();
//         System.out.println("Enter the elements of the array: ");
//         for (int i = 0; i < n; i++) {
//             arr.add(sc.nextInt());
//         }
//         System.out.println("Enter the value of d: ");
//         int d = sc.nextInt();
//         rotateArray(arr, d);
//         System.out.println("The rotated array is: ");
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr.get(i) + " ");
//         }
//         sc.close();
//     }
// }


// Reversal Algorithm

import java.util.Scanner;
import java.util.ArrayList;

public class RotateAnArray {
    public static void rotateArray(ArrayList<Integer> arr, int d) {
        int n = arr.size();
        d = d % n;
        reverseArray(arr, 0, d - 1);
        reverseArray(arr, d, n - 1);
        reverseArray(arr, 0, n - 1);
    }

    public static void reverseArray(ArrayList<Integer> arr, int start, int end) {
        while (start < end) {
            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        System.out.println("Enter the value of d: ");
        int d = sc.nextInt();
        rotateArray(arr, d);
        System.out.println("The rotated array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        sc.close();
    }
}