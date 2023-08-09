package name.localizeddamage.body;

import net.minecraft.entity.player.PlayerEntity;

public class LeftArmBodyPart extends BodyPart{
    public LeftArmBodyPart(float maxHealth, float health, PlayerEntity player) {
        super(maxHealth, health, player);
        setPart(PlayerBody.Part.LEFT_ARM);
    }
}
