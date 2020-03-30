public class SimpleArray {
    public static void main(String[] args) {
        String[] cars = new String[] {"Volvo", "Audi", "Mercedes", "Chrysler", "Toyota"};
        String car = cars[3];
        System.out.println(car);

        int numberOfElements = cars.length;
        System.out.println("My array contains " + numberOfElements + " elements");
    }
}
