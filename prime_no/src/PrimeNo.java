import java.util.Scanner;
public class PrimeNo {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        // Enter the user defined number //
        System.out.println("Enter any number : ");
        int n = num.nextInt(); // num = Scanner variable //
        int c = 0;
        // Prime numbers - 2,3,5,7,11,13,17,19,23,27,31,37,41,43,47,51,53,57,61,67... oo(infinity) //
        for(int i =2;i<Math.sqrt(n);i++){
            if(n%i==0){
                c++;
            }
        }
        if(c==0){
            System.out.println(n + " is a prime number ");
        }
        else{
            System.out.println(n + " is not a prime number.");
        }
    }
}
