package realmtech.mod.items;

import ch.realmtech.server.item.ItemBehavior;
import ch.realmtech.server.registry.ItemEntry;

public class DemoItemEntry extends ItemEntry {
    public DemoItemEntry() {
        super("DemoItem", "lain", ItemBehavior.builder().build());
    }
}
