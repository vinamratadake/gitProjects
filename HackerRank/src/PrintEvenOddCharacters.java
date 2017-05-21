import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by vinamrata on 12/25/16.
 */
public class PrintEvenOddCharacters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numTest = in.nextInt();
        in.nextLine();

        List<String> strings = new ArrayList<>();

        while(numTest > 0){
            strings.add(in.nextLine());
            numTest--;
        }

        List<Character> even = new ArrayList<>();
        List<Character> odd = new ArrayList<>();

        for (String str: strings) {
            char[] arr = str.toCharArray();

            for (int i = 0; i < arr.length; i++) {
                if (i % 2 == 0) {
                    even.add(arr[i]);
                } else {
                    odd.add(arr[i]);
                }
            }

            StringBuilder newEven = new StringBuilder(even.size());
            StringBuilder newOdd = new StringBuilder(odd.size());

            for (char ch : even) {
                newEven.append(ch);
            }
            for (char ch : odd) {
                newOdd.append(ch);
            }
            System.out.println(newEven + " " + newOdd);
            even.clear();
            odd.clear();
        }


    }
}
