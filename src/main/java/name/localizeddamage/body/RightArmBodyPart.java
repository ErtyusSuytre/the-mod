package name.localizeddamage.body;

public class RightArmBodyPart extends BodyPart{
    public RightArmBodyPart(float maxHealth, float health) {
        super(maxHealth, health);
        setPart(PlayerBody.Part.RIGHT_ARM);
    }
}
