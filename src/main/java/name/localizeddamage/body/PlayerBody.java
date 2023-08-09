package name.localizeddamage.body;

import net.minecraft.entity.player.PlayerEntity;

public class PlayerBody {
    public PlayerBody(PlayerEntity player) {
        this.player = player;
    }
    PlayerEntity player;
    public enum Part {
        HEAD,
        LEFT_ARM,
        RIGHT_ARM,
        TORSO,
        LEFT_LEG,
        RIGHT_LEG
    }

    public void initBody() {
        bodyParts = new BodyPart[]{
                new HeadBodyPart(20.0f, 20.0f, player),
                new LeftArmBodyPart(20.0f, 20.0f, player),
                new RightArmBodyPart(20.0f, 20.0f, player),
                new TorsoBodyPart(20.0f, 20.0f, player),
                new LeftLegBodyPart(20.0f, 20.0f, player),
                new RightLegBodyPart(20.0f, 20.0f, player),
        };
    }

    protected BodyPart[] bodyParts;

    public BodyPart[] getBodyParts() {
        return bodyParts;
    }

    public BodyPart getBodyPart(Part bodyPart) {
        return bodyParts[bodyPart.ordinal()];
    }
}
