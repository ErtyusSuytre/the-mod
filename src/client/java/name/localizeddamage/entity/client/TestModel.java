package name.localizeddamage.entity.client;

import name.localizeddamage.LocalizedDamageMod;
import name.localizeddamage.entity.custom.TestEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class TestModel extends GeoModel<TestEntity> {
    @Override
    public Identifier getModelResource(TestEntity object) {
        return new Identifier(LocalizedDamageMod.MOD_ID, "geo/test.geo.json");
    }

    @Override
    public Identifier getTextureResource(TestEntity object) {
        return new Identifier(LocalizedDamageMod.MOD_ID, "textures/entity/test_texture.png");
    }

    @Override
    public Identifier getAnimationResource(TestEntity object) {
        return new Identifier(LocalizedDamageMod.MOD_ID, "animations/test.animation.json");
    }
}
