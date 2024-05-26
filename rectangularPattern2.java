import java.util.*;
public class rectangularPattern2 {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int r=obj.nextInt();
        int c=obj.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(i==1 ||j==1 || i==r || j==c ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
