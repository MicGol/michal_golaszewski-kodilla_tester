public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(1000, 3000, 2022);
        System.out.println("Notebook weight is" + " " + notebook.weight
                + " " + ", price is" + " " + notebook.price);
        notebook.checkPrice();
        notebook.checkweight();
        notebook.checkYear();
        notebook.checkProfitable();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2018 );
        System.out.println("HeavyNotebook weight is" + " " + heavyNotebook.weight
                + " " + ", price is" + " " +  heavyNotebook.price);
        heavyNotebook.checkPrice();
        heavyNotebook.checkweight();
        heavyNotebook.checkYear();
        heavyNotebook.checkProfitable();

        Notebook oldNotebook = new Notebook(1800, 500, 2013);
        System.out.println("Old Notebook weight is" + " " + oldNotebook.weight
                + " " +  ", price is" + " " +  oldNotebook.price
                + " " +  ", and was made in" + " " +  oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkweight();
        oldNotebook.checkYear();
        oldNotebook.checkProfitable();
    }
}