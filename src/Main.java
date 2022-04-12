import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(5);
        number.add(16);
        number.add(-1);
        number.add(-2);
        number.add(0);
        number.add(32);
        number.add(3);
        number.add(5);
        number.add(8);
        number.add(23);
        number.add(4);

        ArrayList<Integer> result = new ArrayList<>();
        int num;

        for (int i = 0; i < number.size(); i++) {
            num = number.get(i);

            if (num > 0 && num % 2 == 0) {
                result.add(num);
            }
        }

        Collections.sort(result);

        for (int results : result) {
            System.out.print(results + " ");
        }
    }
}
