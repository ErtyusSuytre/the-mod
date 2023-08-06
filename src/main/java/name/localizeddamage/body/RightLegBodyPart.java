package name.localizeddamage.body;

public class RightLegBodyPart extends BodyPart{
    public RightLegBodyPart(float maxHealth, float health) {
        super(maxHealth, health);
        setPart(PlayerBody.Part.RIGHT_LEG);
    }
}
