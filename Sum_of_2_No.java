import java.util.Scanner;

public class Sum_of_2_No {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the First Number:");
        int Sum1 = Sc.nextInt();
        System.out.println("Enter the second Number:");
        int Sum2 = Sc.nextInt() ;

        int Sum = Sum1+Sum2;
        System.out.println("Total Sum of Numbers: "+ Sum );

    }
}
