package name.localizeddamage.body;

import net.minecraft.entity.player.PlayerEntity;

public class TorsoBodyPart extends BodyPart{
    public TorsoBodyPart(float maxHealth, float health, PlayerEntity player) {
        super(maxHealth, health, player);
        setPart(PlayerBody.Part.TORSO);
    }
}
