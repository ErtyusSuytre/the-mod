package name.localizeddamage.item;

import name.localizeddamage.LocalizedDamageMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item PENIS = registerItem("penis", new Item(
        new FabricItemSettings()
                .food(new FoodComponent.Builder()
                        .hunger(20)
                        .saturationModifier(20f)
                        .snack()
                        .meat()
                        .alwaysEdible()
                        .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 20*10), 1f)
                        .build())
    ));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(LocalizedDamageMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        LocalizedDamageMod.LOGGER.info("Registering " + LocalizedDamageMod.MOD_ID + " Items");
    }
}
