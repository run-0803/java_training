import java.util.Scanner;

public class SumOfTen {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("enter the number :");
        int n = num.nextInt();
        int sum = 0;
        for(int i = 0;i<=n;i++){
            sum = sum+i;
        }
        System.out.println("Sum of first " + n + " numbers = " + sum);
    }
}
