
import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the grade:") ;
        float grade = input.nextFloat();
        if (grade <= 100 && grade >= 85) {
            System.out.println("Distinction");
        }
        else if(grade < 85 && grade >= 70){
            System.out.println("First Class");

        }
        else if(grade < 70 && grade >= 50){
            System.out.println("Second Class");
        }
        else if(grade < 50 && grade >= 35){
            System.out.println("Third Class");
        }
        else{
            System.out.println("Failed");
        }
    }
}
