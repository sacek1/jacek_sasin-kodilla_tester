public class LeapYear {

    int dateYear;

    public LeapYear(int dateYear) {
        this.dateYear = dateYear;
    }

    public void checkDateYear() {
        if(this.dateYear %4 == 0) {
            if(this.dateYear %100 == 0) {
                if(this.dateYear %400 ==0) {
                    System.out.println("This year is leap.");
                } else {
                    System.out.println("This year isn't leap.");
                    }
            } else {
                System.out.println("This year is leap.");
                }
        } else {
            System.out.println("This year isn't leap.");
            }
    }
}
