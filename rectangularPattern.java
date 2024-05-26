import java.util.Scanner;
public class rectangularPattern {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Two numbers");
        int r=obj.nextInt();
        int c=obj.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
