import java.util.Scanner;

public class CodeForceChecking {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s = "codeforces";
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            char a = sc.next().charAt(0);   // read character
            
            if (s.indexOf(a) != -1){        // check if present in string
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
