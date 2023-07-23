package name.localizeddamage.item;

import name.localizeddamage.LocalizedDamageMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(LocalizedDamageMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        LocalizedDamageMod.LOGGER.info("Registering " + LocalizedDamageMod.MOD_ID + " Items");
    }
}
