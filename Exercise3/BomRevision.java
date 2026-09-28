package Exercise3;

import java.util.List;

class BomRevision {

    private final List<BomLine> lines;

    BomRevision(List<BomLine> lines) {
        this.lines = List.copyOf(lines);
    }

    List<BomLine> lines() {
        return lines;
    }
}