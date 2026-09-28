package Exercise1;
import Exercise1.Product;

public class Main {

    public static void main(String[] args) {

        Product a = new Product("CHAIR-A");

        Product b = a;

        b.rename("CHAIR-B");

        System.out.println("a: " + a.name());
        System.out.println("b: " + b.name());
    }
}