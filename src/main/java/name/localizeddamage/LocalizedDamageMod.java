package name.localizeddamage;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import name.localizeddamage.items.ModItems;

public class LocalizedDamageMod implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("localizeddamage");
	public static final String MOD_ID = "localizeddamage";

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");

		ModItems.registerModItems();
	}
}