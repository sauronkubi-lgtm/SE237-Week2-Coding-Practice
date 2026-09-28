package Exercise4;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, Long> stock = new HashMap<>();

        stock.put("WOOD-A", 3000L);
        stock.put("GLUE-A", 50L);

        InventorySnapshot snapshot =
            new InventorySnapshot(stock);

        System.out.println(
            "WOOD-A: " + snapshot.available("WOOD-A")
        );

        System.out.println(
            "GLUE-A: " + snapshot.available("GLUE-A")
        );

        System.out.println(
            "METAL-A: " + snapshot.available("METAL-A")
        );

        System.out.println(
            "WOOD-A again: " + snapshot.available("WOOD-A")
        );
    }
}