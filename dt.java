import java.util.*;

public class dt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();

        int num = 1;
        while (arr.size() < 1000) {
            if (num % 3 != 0 && num % 10 != 3) {
                arr.add(num);
            }
            num++;
        }

        int t = sc.nextInt();

        while (t-- > 0) {
            int k = sc.nextInt();
            System.out.println(arr.get(k - 1));
        }

        sc.close();
    }
}