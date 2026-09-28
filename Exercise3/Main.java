package Exercise3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<BomLine> original = new ArrayList<>();

        original.add(
            new BomLine("WOOD-A", 20, 5)
        );

        BomRevision revision =
            new BomRevision(original);

        System.out.println("Before change:");
        System.out.println("Original size: " + original.size());
        System.out.println("Revision size: " + revision.lines().size());
        
        revision.lines().clear();

        original.add(
            new BomLine("GLUE-A", 2, 0)
        );

        System.out.println("After change:");
        System.out.println("Original size: " + original.size());
        System.out.println("Revision size: " + revision.lines().size());
    }
}