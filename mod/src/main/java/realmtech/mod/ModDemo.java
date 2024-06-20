package realmtech.mod;

import ch.realmtech.server.ecs.Context;
import ch.realmtech.server.mod.AssetsProvider;
import ch.realmtech.server.mod.ModInitializer;
import ch.realmtech.server.registry.CommandEntry;
import ch.realmtech.server.registry.Entry;
import ch.realmtech.server.registry.ItemEntry;
import ch.realmtech.server.registry.Registry;
import realmtech.mod.items.DemoItemEntry;

@AssetsProvider
public class ModDemo implements ModInitializer {

    @Override
    public String getModId() {
        return "modDemo";
    }

    @Override
    public void initializeModRegistry(Registry<?> registry, Context context) {
        System.out.println("bonjour depuis " + getModId());

        Registry<ItemEntry> itemsRegistry = Registry.createRegistry(registry, "items");
        itemsRegistry.addEntry(new DemoItemEntry());
    }
}
