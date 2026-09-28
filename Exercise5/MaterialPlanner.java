package Exercise5;

class MaterialPlanner {

    void showWoodStock(InventorySnapshot stock) {
        System.out.println(
            "Planner sees WOOD-A: "
            + stock.available("WOOD-A")
        );
    }
}