package name.localizeddamage.block;

import name.localizeddamage.LocalizedDamageMod;
import net.minecraft.block.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;


public class TrapBlock extends Block {

    public TrapBlock(Settings settings) {
        super(settings);
    }
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return createCuboidShape(1, 0, 1, 15, 4, 15);
    }

    @Override
    public boolean isTransparent(BlockState state, BlockView world, BlockPos pos){
        return true;
    }
    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        LocalizedDamageMod.LOGGER.info(entity.getClass().getName().toString());
        if (entity.getClass().getName().contains("PlayerEntity")){
            LivingEntity livingEntity = (LivingEntity) entity;
            livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 200));
            String stringListStatus = livingEntity.getStatusEffects().toString();
            LocalizedDamageMod.LOGGER.info(stringListStatus);
            if (stringListStatus.contains("slowness")){
                if (stringListStatus.contains("blindness")){
                    entity.kill();
                }
            }
        }
        super.onSteppedOn(world, pos, state, entity);
    }


}
