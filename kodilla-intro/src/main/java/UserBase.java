public class UserBase {
    public static void main(String[] args) {

        User[] users = new User[] {new User("Kuba", 10), new User("Karol", 14), new User("Jola", 18), new User("Kamil", 25), new User("Bożena", 40), new User("Jan", 56), new User("Ed", 62), new User("Paweł", 31), new User("Piotr", 60), new User ("Józef", 90)};

        int sumOfAges = 0;
        for (int i=0; i < users.length; i++) {
            sumOfAges = sumOfAges + users[i].age;
        }

        int average = sumOfAges / users.length;

        System.out.println("średnia wieku wynosi: " + average + "\n\nnastępujące osoby mają wiek poniżej średniej:");

        for(int i=0; i < users.length; i++) {
            if (users[i].age < average) {
                System.out.println(users[i].name + " - (" + users[i].age + ")");

            } else {}
        }

    }
}