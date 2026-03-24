import java.util.Scanner;

public class Rs_to_USD {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            double rupees = sc.nextDouble();
            double usd = rupees / 83;  // approx rate

            System.out.println("USD = " + usd);
        }
    }