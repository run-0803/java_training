import java.util.Scanner;
public class MaxOfAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of array elements :");
        int n = sc.nextInt();
        int a[] = new int[n]; // array name and size initialization //
        int max = 0;
        System.out.println("enter the array elements :");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
            if(a[i]>max){
                max = a[i];
            }
        }
        System.out.println("maximum element of an array is : " + max);
    }

}
