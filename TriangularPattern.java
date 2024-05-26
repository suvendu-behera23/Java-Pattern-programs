import java.util.*;
public class TriangularPattern{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter rows");
        int r=obj.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}