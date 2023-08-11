import java.util.Arrays;
import java.util.stream.Collectors;

public class countPositivesSumNegatives {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
        int[] result = countPositivesSumNegatives(num);
        System.out.println(Arrays.toString(result));
    }

    public static int[] countPositivesSumNegatives(int[] input) {
        int count = 0;
        int sum = 0;

        if (input != null) {
            if (input.length != 0) {
                for (int i = 0; i < input.length; i++) {
                    if (input[i] > 0) {
                        count++;
                    } else if (input[i] < 0) {
                        sum -= input[i];
                    }
                }
                int[] result = {count, -sum};
                return result;
            } else {
                int[] result = input;
                return result;
            }
        } else {
            int[] result = {};
            return result;
        }
    }
}
