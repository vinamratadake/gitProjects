import java.util.Scanner;

/**
 * Created by vinamrata on 12/22/16.
 */
public class PileGame {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enetr number of tests: ");
        int tests = scan.nextInt();

        int[] piles = new int[tests];
        int[] trials = new int[tests];

        for(int i = 0; i < piles.length; i++) {
            piles[i] = scan.nextInt();
        }

        for(int i =0; i < piles.length ; i++) {
            if (piles[i] == 1) {
                trials[i] = 1;
            }

            else {

            }
        }

    // Complete code for Pile game


    }
}
