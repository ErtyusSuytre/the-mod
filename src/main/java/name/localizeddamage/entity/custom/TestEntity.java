package name.localizeddamage.entity.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.world.World;

public class TestEntity extends HostileEntity {
    public TestEntity(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
    }
}
