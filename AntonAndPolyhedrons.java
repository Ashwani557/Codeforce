
import java.util.Scanner;

public class AntonAndPolyhedrons {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        int sum =0;
        
        
        for (int i = 0; i < n; i++) {
            
            

            String p = sc.next();

            if(p.equals("Tetrahedron")){
                sum +=4;
            }
                else if(p.equals("Cube")){
                sum +=6;
            }
             else if(p.equals("Octahedron")){
                sum +=8;
            }
             else if(p.equals("Dodecahedron")){
                sum +=12;
            }
            else if(p.equals("Icosahedron")){
                sum +=20;
            }
            
            
            }
                    System.out.println(sum);

            
            
        }


    }

    

