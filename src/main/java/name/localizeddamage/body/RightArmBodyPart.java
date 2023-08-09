package name.localizeddamage.body;

import net.minecraft.entity.player.PlayerEntity;

public class RightArmBodyPart extends BodyPart{
    public RightArmBodyPart(float maxHealth, float health, PlayerEntity player) {
        super(maxHealth, health, player);
        setPart(PlayerBody.Part.RIGHT_ARM);
    }
}
