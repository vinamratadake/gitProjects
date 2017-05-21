import java.util.Scanner;

/**
 * Created by vinamrata on 12/30/16.
 *  Edited by mandar
 */
public class CountInBinary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int counter=0, max =0;

        while(num > 0){
            int rem = num % 2;
            if(rem == 1) {
                counter++;
            }
            else
                counter = 0;
            max = Math.max(counter,max);
            num = num / 2;
        }
        System.out.println(max);

    }
}
