package name.localizeddamage;

import name.localizeddamage.item.ModItems;
import name.localizeddamage.block.ModBlocks;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LocalizedDamageMod implements ModInitializer {
	public static final String MOD_ID = "localizeddamage";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}