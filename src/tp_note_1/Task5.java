package tp_note_1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float riels,usd;

        System.out.println("Program for converting money in Riels to Dollars.");
        System.out.print("Conversion rate is: 1 USD = 4000 RIELS");
        System.out.print("\nPlease input money in Riels: ");
        riels = sc.nextInt();

        System.out.println("-------------------------------------------------");

        usd = (float) (riels / 4000.0);

        System.out.printf(" %.0f RIELS = %.2f USD", riels,usd);

    }
}
