public class RandomNumbersPanel {
    public static void main(String[] args) {
        int[] randomNumberStats = RandomNumbers.calculateRandomNumbers(50);
        System.out.println(randomNumberStats[0]);
        System.out.println(randomNumberStats[1]);
    }
}