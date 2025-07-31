import java.util.Scanner;

public class PnzCheck {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = num.nextInt(); // num = Scanner variable //

        if(n==0){
            System.out.println( n + " is equal to Zero .");
        }
        else if(n>0){
            System.out.println(n + " is a positive integer .");
        }
        else{
            System.out.println(n + " is a negative integer .");
        }
        num.close(); // Closing the scanner variable //
    }
}
