import java.util.Scanner;

public class AmazingPerformances {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Number of contests
        int[] scores = new int[n];

        // Read scores
        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
        }

        int bestScore = scores[0];
        int worstScore = scores[0];
        int amazingCount = 0;

        for (int i = 1; i < n; i++) {
            if (scores[i] > bestScore) {
                bestScore = scores[i];
                amazingCount++;
            } else if (scores[i] < worstScore) {
                worstScore = scores[i];
                amazingCount++;
            }
        }

        System.out.println(amazingCount);

        scanner.close();
    }
}