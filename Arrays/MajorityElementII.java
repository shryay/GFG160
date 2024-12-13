import java.util.Scanner;
import java.util.ArrayList;

public class MajorityElementII {
    public static void majorityEle(ArrayList<Integer> arr) {
        int cnt1 = 0, cnt2 = 0, ele1 = 0, ele2 = 0;
        for (int ele : arr) {
            if (ele == ele1) {
                cnt1++;
            } else if (ele == ele2) {
                cnt2++;
            } else if (cnt1 == 0) {
                ele1 = ele;
                cnt1 = 1;
            } else if (cnt2 == 0) {
                ele2 = ele;
                cnt2 = 1;
            } else {
                cnt1--;
                cnt2--;
            }
        }
        for (int ele : arr) {
            if (ele == ele1) {
                cnt1++;
            }
            if (ele == ele2) {
                cnt2++;
            }
        }
        if (cnt1 > arr.size() / 3) {
            System.out.print(ele1 + " ");
        }
        if (cnt2 > arr.size() / 3) {
            System.out.print(ele2 + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        majorityEle(arr);
        sc.close();
    }
}