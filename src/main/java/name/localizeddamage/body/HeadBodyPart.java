package name.localizeddamage.body;

import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;

public class HeadBodyPart extends BodyPart{
    public HeadBodyPart(float maxHealth, float health, PlayerEntity player) {
        super(maxHealth, health, player);
        setPart(PlayerBody.Part.HEAD);
    }

    @Override
    public boolean damage(float amount, DamageSource source) {
        super.damage(amount, source);
        if (getHealth() == 0) {
            System.out.println("Head Hurt");
            kill(source);
        }
        return true;
    }
}
