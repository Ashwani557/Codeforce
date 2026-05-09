import java.util.*;

public class NormalProblem{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            String s = sc.next();

            StringBuilder ans = new StringBuilder();

            for (int i = s.length() - 1; i >= 0; i--) {

                char ch = s.charAt(i);

                if (ch == 'p') {
                    ans.append('q');
                } 
                else if (ch == 'q') {
                    ans.append('p');
                } 
                else {
                    ans.append('w');
                }
            }

            System.out.println(ans);
        }
    }
}