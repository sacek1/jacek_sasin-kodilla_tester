public class FirstClass {
    public static void main (String[] args) {
        Notebook notebook = new Notebook(600, 1000, 2009);
        System.out.println("\n" + "weight: " + notebook.weight + "g" + ", price: " + notebook.price + " zł" + ", year of prod.: " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkProfitability();

        Notebook heavyNotebook = new Notebook (2000, 1500, 2006);
        System.out.println("\n" + "weight: " + heavyNotebook.weight + "g" + ", price: " + heavyNotebook.price + " zł" + ", year of prod.: " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkProfitability();

        Notebook oldNotebook = new Notebook (1200, 500, 2018);
        System.out.println("\n" + "weight: " + oldNotebook.weight + "g" + ", price: " + oldNotebook.price + " zł" + ", year of prod.: " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkProfitability();
    }
}
