import java.util.Scanner;

public class BinaryArrayGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            int a = sc.nextInt();
            int[] sol = new int[a];

            for (int j = 0; j < a; j++) {
                sol[j] = sc.nextInt();
            }

            if (sol[0] == 1 || sol[a - 1] == 1) {
                System.out.println("Alice");
            } else {
                System.out.println("Bob");
            }
        }

        sc.close();
    }
}