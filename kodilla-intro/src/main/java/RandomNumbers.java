import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {

        Random randomNumber = new Random();
        int max = 0;
        int min = 30;
        int i = 0;
        for (int suma = 0; suma < 5000; suma = suma + i) {
            i = randomNumber.nextInt(31);
            System.out.println(i);
            if(i > max) {
                max = i;
            }  else if (i < min) {
                    min = i;}
        }
        System.out.println("Największa liczba to:"+" "+ max);
        System.out.println("Najmniejsza liczba to:"+" "+ min);
    }
}