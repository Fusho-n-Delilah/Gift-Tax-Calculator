import java.util.Scanner;

public class GiftTax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double gift;

        //get gift amount
        System.out.println("Value of the gift?");
        gift = Double.valueOf(scan.nextLine());

        //print tax amount
        if (gift < 5000){
            System.out.println("No tax!");
        } else {
            System.out.println("Tax: " + tax(gift));
        }
    }
    public static double tax(double gift){
        // declare tax lower limits (t), rates (r), and brackets initial amount (b)
        double t1 = 100,
                t2 = 1_700,
                t3 = 4_700,
                t4 = 22_100,
                t5 = 142_100,
                r1 = 0.08,
                r2 = 0.1,
                r3 = 0.12,
                r4 = 0.15,
                r5 = 0.17,
                b1 = 5_000,
                b2 = 25_000,
                b3 = 55_000,
                b4 = 200_000,
                b5 = 1_000_000,
                tax,
                rate,
                bracket;

        if(gift < 25_000){
            tax = t1;
            rate = r1;
            bracket = b1;
        } else if (gift < 55_000) {
            tax = t2;
            rate = r2;
            bracket = b2;
        } else if (gift < 200_000) {
            tax = t3;
            rate = r3;
            bracket = b3;
        }else if (gift < 1_000_000) {
            tax = t4;
            rate = r4;
            bracket = b4;
        } else {
            tax = t5;
            rate = r5;
            bracket = b5;
        }

        return tax+((gift-bracket)*rate);
    }
}
