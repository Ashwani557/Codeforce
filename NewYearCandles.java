import java.util.*;
public class NewYearCandles{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
                int total = a;
        int leftovers = a;

        while (leftovers >= b) {

            int newCandles = leftovers / b;

            total += newCandles;

            leftovers = newCandles + (leftovers % b);
        }

        System.out.println(total);

        sc.close();

    }

    
    
    
}