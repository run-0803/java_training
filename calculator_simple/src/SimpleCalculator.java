import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in); // sign = operation scanner variable  //
        Scanner num = new Scanner(System.in); // num = number's scanner variable //
        System.out.println("Enter the operation : ");
        String s = op.nextLine();
        System.out.println("Enter the 2 numbers : ");
        int a  = num.nextInt();
        int b = num.nextInt();
        int res = 0;

        switch(s){
            case "+" : case "add": case "sum":
                res = a+b;
                System.out.println(res);
                break;

            case "-" : case "sub": case "diff":
                res = a-b;
                System.out.println(res);
                break;

            case "*" : case "mul": case "prod" :
                res = a*b;
                System.out.println(res);
                break;

            case "/" : case "div":
                res = a/b;
                System.out.println(res);
                break;

            case "%" : case "mod":
                res = a%b;
                System.out.println(res);
                break;

            default:
                System.out.println("Invalid Sign.");
        }
    }
}
