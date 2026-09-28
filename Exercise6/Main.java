package Exercise6;

public class Main {

    public static void main(String[] args) {

        InventoryService inventory =
            new InventoryService();

        MaterialPlanner planner =
            new MaterialPlanner();

        InvoiceService invoice =
            new InvoiceService();

        inventory.updateStock();

        planner.calculateMaterialNeeds();

        invoice.createInvoice();
    }
}