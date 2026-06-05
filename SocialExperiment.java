import java.util.Scanner;

public class SocialExperiment {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            if(x==2){
                System.out.println(2);
            }
            else if (x%2==0){
                System.out.println(0);
            }
            else if(x==3){
                System.out.println(3);
            }
            else{
                System.out.println(1);
            }
        }
    }
    
}
