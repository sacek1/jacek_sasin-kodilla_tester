public class Notebook {
    int weight;
    int price;
    int year;
    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if(this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if(this.price >= 600 && this.price <= 1000 ) {
            System.out.println("This price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }

    public int getWeight() {
        return this.weight;
    }

    public void checkWeight() {
        if(this.weight < 1000) {
            System.out.println("This notebook is light.");
        } else if(this.weight >= 1000 && this.weight <= 1500 ) {
            System.out.println("This notebook is quite heavy.");
        } else {
            System.out.println("This notebook is heavy.");
        }
    }

    public void checkProfitability() {
        if(this.price >= 1500 && this.year < 2010) {
            System.out.println("This notebook is unprofitable.");
        } else if(this.price < 1500 && this.year < 2010) {
            System.out.println("This notebook is conditionally profitable.");
        } else if(this.price >= 1500 && this.year >= 2010) {
            System.out.println("This notebook is conditionally profitable.");
        } else {
            System.out.println("This notebook is cost effective.");
        }
    }
}
