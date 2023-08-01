package name.localizeddamage;

import name.localizeddamage.entity.ModEntities;
import name.localizeddamage.entity.client.TestRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class LocalizedDamageModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
		EntityRendererRegistry.register(ModEntities.TEST, TestRenderer::new);
	}
}