import java.util.*;
public class AmusingJoke {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
            String s1 = sc.next().toUpperCase(); //host
            String s2 = sc.next().toUpperCase(); //guestttt
            String s3 = sc.next().toUpperCase(); // pile
            
            String combined = s1 + s2;
        
        char[] arr1 = combined.toCharArray();
        char[] arr2 = s3.toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}