package name.localizeddamage.body;

import net.minecraft.entity.player.PlayerEntity;

public class RightLegBodyPart extends BodyPart{
    public RightLegBodyPart(float maxHealth, float health, PlayerEntity player) {
        super(maxHealth, health, player);
        setPart(PlayerBody.Part.RIGHT_LEG);
    }
}
