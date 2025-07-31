import java.util.Scanner;

public class LargeOfThree {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = input.nextInt();
        System.out.println("Enter the second number:");
        int b = input.nextInt();
        System.out.println("Enter the third number:");
        int c = input.nextInt();

        if(a>b+c){
            System.out.print(a + " is Larger than " + b + " and " + c);
            }
        else if(b>a+c){
            System.out.print(b + " is Larger than " + a + " and " + c);
            }
        else{
            System.out.print(c + "is Larger than " + a + "and" + b);
            }
        }

    }
