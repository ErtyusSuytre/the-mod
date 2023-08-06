package name.localizeddamage.body;

public class TorsoBodyPart extends BodyPart{
    public TorsoBodyPart(float maxHealth, float health) {
        super(maxHealth, health);
        setPart(PlayerBody.Part.TORSO);
    }
}
