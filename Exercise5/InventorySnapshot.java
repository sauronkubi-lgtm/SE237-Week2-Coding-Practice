package Exercise5;

import java.util.Map;

class InventorySnapshot {

    private final Map<String, Long> quantities;

    InventorySnapshot(Map<String, Long> quantities) {
        this.quantities = Map.copyOf(quantities);
    }

    long available(String componentCode) {
        return quantities.getOrDefault(componentCode, 0L);
    }
}
