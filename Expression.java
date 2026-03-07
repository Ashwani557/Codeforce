import java.util.*;

public class Expression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int r1 = a + b + c;
        int r2 = a * b * c;
        int r3 = (a + b) * c;
        int r4 = a * (b + c);
        int r5 = a + (b * c);
        int r6 = (a * b) + c;

        int result = Math.max(Math.max(Math.max(r1, r2), Math.max(r3, r4)), Math.max(r5, r6));

        System.out.println(result);
    }
}


// int result = Arrays.stream(new int[]{sum, mult, m1, m2, m3, m4}).max().getAsInt();
