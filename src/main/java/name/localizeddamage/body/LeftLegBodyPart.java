package name.localizeddamage.body;

import net.minecraft.entity.player.PlayerEntity;

public class LeftLegBodyPart extends BodyPart{
    public LeftLegBodyPart(float maxHealth, float health, PlayerEntity player) {
        super(maxHealth, health, player);
        setPart(PlayerBody.Part.LEFT_LEG);
    }
}
