package name.localizeddamage.mixin;

import com.mojang.authlib.GameProfile;
import name.localizeddamage.body.PlayerBody;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Objects;

@Mixin(PlayerEntity.class)
public class PlayerBodyParts {
    @Unique
    PlayerBody playerBody;

    @Inject(method = "<init>*", at = @At("RETURN"))
    public void addBody(World world, BlockPos pos, float yaw, GameProfile gameProfile, CallbackInfo callbackInfo) {
        playerBody = new PlayerBody();
    }

    @Inject(method = "writeCustomDataToNbt", at = @At("RETURN"))
    public void saveBodyParts(NbtCompound nbt, CallbackInfo callbackInfo) {
        for (PlayerBody.Part bodyPart: PlayerBody.Part.values()) {
//            LocalizedDamageMod.LOGGER.info(bodyPart.name() + " save value: " + valueOf(playerBody.getBodyPart(bodyPart).getHealth()));
            nbt.putFloat(bodyPart.name(), playerBody.getBodyPart(bodyPart).getHealth());
        }
    }

    @Inject(method = "readCustomDataFromNbt", at = @At("RETURN"))
    public void loadBodyParts(NbtCompound nbt, CallbackInfo callbackInfo) {
        for (PlayerBody.Part bodyPart: PlayerBody.Part.values()) {
            playerBody.getBodyPart(bodyPart).setHealth(nbt.getFloat(bodyPart.name()));
//            LocalizedDamageMod.LOGGER.info(bodyPart.name() + " read value: " + valueOf(playerBody.getBodyPart(bodyPart).getHealth()));
        }
    }

    @ModifyVariable(method = "applyDamage(Lnet/minecraft/entity/damage/DamageSource;F)V", at = @At("HEAD"), ordinal = 0, argsOnly = true)
    public float handleHealthChange(float amount, DamageSource source) {
//        LocalizedDamageMod.LOGGER.info("Took " + amount + " damage from " + source);
        if(Objects.equals(source.getName(), "outOfWorld") || Objects.equals(source.getName(), "genericKill")) {
            return amount;
        }
        // TODO: Not sure how to distribute general mob damage
        playerBody.getBodyPart(PlayerBody.Part.TORSO).damage(amount);
        return 0;
    }
}
