package name.localizeddamage.item;

import name.localizeddamage.LocalizedDamageMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(LocalizedDamageMod.MOD_ID, "cock"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.cock"))
                    .icon(() -> new ItemStack(ModItems.PENIS)).entries((displayContext, entries) -> {
                        entries.add(ModItems.PENIS);
                    }).build());
    public static void registerItemGroups() {
        LocalizedDamageMod.LOGGER.info("Registering Item Groups for " + LocalizedDamageMod.MOD_ID);
    }
}
