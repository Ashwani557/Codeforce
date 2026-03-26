import java.util.Scanner;

public class ArrayColoring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); 
        
        for (int i = 0; i < n; i++) {
            
            int t = sc.nextInt(); 
            
            int Ecount = 0;  
            int Ocount = 0;

            int[] a = new int[t];
            
            for (int j = 0; j < t; j++) {   
                a[j] = sc.nextInt();
                
                if (a[j] % 2 == 0) {
                    Ecount++;
                } else {
                    Ocount++;
                }
            }

    
            if (Ocount % 2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}