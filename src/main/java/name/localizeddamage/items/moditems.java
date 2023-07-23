package name.localizeddamage.items;

import name.localizeddamage.LocalizedDamageMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class moditems {

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(LocalizedDamageMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        System.out.println("Registering items for " + LocalizedDamageMod.MOD_ID);
    }
}
