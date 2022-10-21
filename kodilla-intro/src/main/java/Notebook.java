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
        if (this.price < 600) {
            System.out.println("This notebook is cheap.");
        } else if (this.price >= 600 && this.price <=1000){
            System.out.println("This notebook price is good.");
        } else{
            System.out.println("This notebook is expensive.");
        }
    }
    public void checkweight() {
        if (this.weight < 1000) {
            System.out.println("This notebook is light.");
        } else if (this.weight >= 1000 && this.weight <=1800){
            System.out.println("This notebook is not very heavy.");
        } else{
            System.out.println("This notebook is very heavy.");
        }
    }
    public void checkYear() {
        if (this.year >= 2022) {
            System.out.println("This notebook is new.");
        } else if (this.year >= 2011 && this.year < 2022){
            System.out.println("This notebook is not too old.");
        } else{
            System.out.println("This notebook is old.");
        }
    }
    public void checkProfitable() {
        if (this.year > 2017 && this.price < 2000) {
            System.out.println("This notebook is the most profitable.");
        } else if (this.year > 2017 && this.price > 2000 && this.weight < 1500) {
            System.out.println("This notebook is profitable.");
        } else {
            System.out.println("This notebook is not profitable.");
        }
    }
}