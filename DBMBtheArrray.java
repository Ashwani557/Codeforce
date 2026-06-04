import java.util.Scanner;

public class DBMBtheArrray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int s =sc.nextInt();
            int x = sc.nextInt();
            int sum =0;
            for(int i =0;i<n;i++){
                int a = sc.nextInt();
                sum+=a;
                
            }
            int diff = s -sum;
            if(((diff)%x==0)&&(diff>=0)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    
}
