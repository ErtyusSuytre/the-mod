package name.localizeddamage.entity;

import name.localizeddamage.LocalizedDamageMod;
import name.localizeddamage.entity.custom.TestEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {

    public static final EntityType<TestEntity> TEST = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(LocalizedDamageMod.MOD_ID, "penis_biter"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, TestEntity::new)
                    .dimensions(EntityDimensions.fixed(0.75f, 0.75f)).build());

    public static void registerModEntities() {
        LocalizedDamageMod.LOGGER.info("Registering " + LocalizedDamageMod.MOD_ID + " Entities");
    }
}
