package Exercise5;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Long> quantities = new HashMap<>();

        quantities.put("WOOD-A", 120L);

        InventorySnapshot stock =
                new InventorySnapshot(quantities);

        MaterialPlanner planner =
                new MaterialPlanner();

        planner.showWoodStock(stock);
    }
}