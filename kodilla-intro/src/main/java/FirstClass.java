public class FirstClass {
    public static void main (String[] args) {

        Notebook notebook = new Notebook(600, 1000, 2009);
        int notebookWeight = notebook.getWeight();
        System.out.println("\n" + "weight: " + notebookWeight + "g" + ", price: " + notebook.price + " zł" + ", year of prod.: " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkProfitability();

        Notebook heavyNotebook = new Notebook (2000, 1500, 2006);
        int heavyNotebookWeight = heavyNotebook.getWeight();
        System.out.println("\n" + "weight: " + heavyNotebookWeight + "g" + ", price: " + heavyNotebook.price + " zł" + ", year of prod.: " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkProfitability();

        Notebook oldNotebook = new Notebook (1200, 500, 2018);
        int oldNotebookWeight = oldNotebook.getWeight();
        System.out.println("\n" + "weight: " + oldNotebookWeight + "g" + ", price: " + oldNotebook.price + " zł" + ", year of prod.: " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkProfitability();

        LeapYear dateYear1 = new LeapYear(1997);
        System.out.println("\n" + "Year: " + dateYear1.dateYear);
        dateYear1.checkDateYear();

        LeapYear dateYear2 = new LeapYear(1352);
        System.out.println("\n" + "Year: " + dateYear2.dateYear);
        dateYear2.checkDateYear();

        LeapYear dateYear3 = new LeapYear(1500);
        System.out.println("\n" + "Year: " + dateYear3.dateYear);
        dateYear3.checkDateYear();

        LeapYear dateYear4 = new LeapYear(1428);
        System.out.println("\n" + "Year: " + dateYear4.dateYear);
        dateYear4.checkDateYear();

        LeapYear dateYear5 = new LeapYear(1102);
        System.out.println("\n" + "Year: " + dateYear5.dateYear);
        dateYear5.checkDateYear();

    }
}
