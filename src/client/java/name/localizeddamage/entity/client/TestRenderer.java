package name.localizeddamage.entity.client;

import name.localizeddamage.LocalizedDamageMod;
import name.localizeddamage.entity.custom.TestEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class TestRenderer extends GeoEntityRenderer<TestEntity> {
    public TestRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new TestModel());
        this.shadowRadius = 0.6f;
    }

    @Override
    public Identifier getTextureLocation(TestEntity instance) {
        return new Identifier(LocalizedDamageMod.MOD_ID, "textures/entity/test_texture.png");
    }

    @Override
    public RenderLayer getRenderType(TestEntity animatable, Identifier texture, @Nullable VertexConsumerProvider bufferSource, float partialTick) {
        return super.getRenderType(animatable, texture, bufferSource, partialTick);
    }
}
