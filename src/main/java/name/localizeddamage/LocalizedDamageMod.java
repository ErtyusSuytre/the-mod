package name.localizeddamage;

import name.localizeddamage.entity.ModEntities;
import name.localizeddamage.entity.custom.TestEntity;
import name.localizeddamage.item.ModItemGroups;
import name.localizeddamage.item.ModItems;
import name.localizeddamage.block.ModBlocks;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib.GeckoLib;

public class LocalizedDamageMod implements ModInitializer {
	public static final String MOD_ID = "localizeddamage";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");

		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();

		ModBlocks.registerModBlocks();

		GeckoLib.initialize();
		FabricDefaultAttributeRegistry.register(ModEntities.TEST, TestEntity.setAttributes());
	}
}