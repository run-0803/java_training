import java.util.Scanner;

public class RevTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of matrix : ");
        int n = sc.nextInt();

        for(int i = 0;i<=n;i++){
            for(int j = 0;j<=n;j++){
                System.out.println("*");
            }
        }
        System.out.print(" ");
    }
}
