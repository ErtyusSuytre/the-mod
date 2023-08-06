package name.localizeddamage.body;

public class LeftArmBodyPart extends BodyPart{
    public LeftArmBodyPart(float maxHealth, float health) {
        super(maxHealth, health);
        setPart(PlayerBody.Part.LEFT_ARM);
    }
}
