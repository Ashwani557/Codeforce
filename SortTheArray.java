import java.util.Scanner;

public class SortTheArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] sorted = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sorted[i] = arr[i];
        }

        // Sort copy array
        java.util.Arrays.sort(sorted);

        int l = 0;
        int r = n - 1;

    
        while (l < n && arr[l] == sorted[l]) {
            l++;
        }

        
        if (l == n) {
            System.out.println("yes");
            System.out.println("1 1");
            return;
        }

        
        while (r >= 0 && arr[r] == sorted[r]) {
            r--;
        }

    
        reverse(arr, l, r);

        
        boolean possible = true;

        for (int i = 0; i < n; i++) {
            if (arr[i] != sorted[i]) {
                possible = false;
                break;
            }
        }

        if (possible) {
            System.out.println("yes");
            System.out.println((l + 1) + " " + (r + 1));
        } else {
            System.out.println("no");
        }
    }

    static void reverse(int[] arr, int l, int r) {

        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            l++;
            r--;
        }
    }
}