package Exercise2;

public class Main {

    public static void main(String[] args) {

        BomLine line = new BomLine("WOOD-A", 25, 120);

        System.out.println(
            "Created: " + line.componentCode()
        );
    }
}