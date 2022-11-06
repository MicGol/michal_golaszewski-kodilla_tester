class Osoba
{

public String name;
public double age;
public double heigh;

public Osoba(String name,double age,double heigh)
        {
        this.name=name;
        this.age=age;
        this.heigh=heigh;
        }
}
public class Application {
    public static void main(String[] args) {

        Osoba Adam = new Osoba("Adam", 40.5, 178);

            if (Adam.age> 30 && Adam.heigh > 160) {
                System.out.println("User is older than 30 and taller than 160cm");

            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
        }
    }
}