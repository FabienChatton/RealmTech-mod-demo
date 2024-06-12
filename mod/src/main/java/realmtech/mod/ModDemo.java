package realmtech.mod;

import ch.realmtech.server.ecs.Context;
import ch.realmtech.server.mod.AssetsProvider;
import ch.realmtech.server.mod.ModInitializer;
import ch.realmtech.server.registry.Registry;

@AssetsProvider
public class ModDemo implements ModInitializer {

    @Override
    public String getModId() {
        return "modDemo";
    }

    @Override
    public void initializeModRegistry(Registry<?> registry, Context context) {
        System.out.println("bonjour depuis " + getModId());
    }
}
