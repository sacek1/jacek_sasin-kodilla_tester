import java.util.Random;

public class RandomNumbers {
    public static int[] calculateRandomNumbers(int max) {
        Random random = new Random();
        int totalMin = max;
        int totalMax = 0;
        int sum = 0;
        while (sum < max) {
            int temp = random.nextInt(31);
            sum = sum + temp;
            if (temp < totalMin) {
                totalMin = temp;
            } else {}

            if (temp > totalMax) {
                totalMax = temp;
            } else {}

        }

        int[] getUserStatistics = new int[] {totalMin, totalMax};

        return getUserStatistics;

    }


}