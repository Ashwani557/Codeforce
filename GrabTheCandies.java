import java.util.Scanner;

public class GrabTheCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        
        for (int i = 0; i < t; i++) {
             int countM =0;
             int countB= 0;
            int n =sc.nextInt();
            int []res = new int[n];
            for(int j =0;j<n;j++){
                res[j]=sc.nextInt();

                for(int k =0;k<res.length;k++){

                    if(res[k]%2!=0){
                    countB+=res[k];

                }
                    else{
                    countM+=res[k];
                }
            }
        }
            if(countM>countB){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            
        }
    }
    
}
