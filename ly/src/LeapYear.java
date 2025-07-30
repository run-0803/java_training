import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args){
        Scanner year = new Scanner(System.in);
        System.out.println("Enter the Year :");
        int a = year.nextInt();

        if(a%400==0){
            System.out.println(a + " is a leap year .");
        }
        else if(a%100==0){
            System.out.println(a + " is not a leap year .");
        }
        else if(a%4==0){
            System.out.println(a + " is a leap year .");
        }
        else {
            System.out.println(a + " is not a leap year .");
        }
    }

}
