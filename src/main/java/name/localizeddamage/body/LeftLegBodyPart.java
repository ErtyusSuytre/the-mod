package name.localizeddamage.body;

public class LeftLegBodyPart extends BodyPart{
    public LeftLegBodyPart(float maxHealth, float health) {
        super(maxHealth, health);
        setPart(PlayerBody.Part.LEFT_LEG);
    }
}
