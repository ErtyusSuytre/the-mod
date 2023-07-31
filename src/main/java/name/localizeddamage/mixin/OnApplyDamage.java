package name.localizeddamage.mixin;

import name.localizeddamage.LocalizedDamageMod;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

import java.util.Objects;

@Mixin(PlayerEntity.class)
public class OnApplyDamage {
    @ModifyVariable(method = "applyDamage(Lnet/minecraft/entity/damage/DamageSource;F)V", at = @At("HEAD"), ordinal = 0, argsOnly = true)
    public float handleHealthChange(float amount, DamageSource source) {
//        LocalizedDamageMod.LOGGER.info("Took " + amount + " damage from " + source);
        if(Objects.equals(source.getName(), "outOfWorld") || Objects.equals(source.getName(), "genericKill")) {
            return amount;
        }
        return 0;
    }

}
