import java.util.Scanner;
public class butterfly_pattern {
            public static void main(String arg[]){
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
             System.out.print("*"); 
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" "); 
            }
            for(int j=1;j<=i;j++){
                System.out.print("*"); 
            }
            System.out.println();
        }
        for(i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
             System.out.print("*"); 
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" "); 
            }
            for(int j=1;j<=i;j++){
                System.out.print("*"); 
            }
            System.out.println();
        }
     }
}
