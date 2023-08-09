package name.localizeddamage.body;

public class HeadBodyPart extends BodyPart{
    public HeadBodyPart(float maxHealth, float health) {
        super(maxHealth, health);
        setPart(PlayerBody.Part.HEAD);
    }
}
