package name.localizeddamage.body;

public class PlayerBody {
    public enum Part {
        HEAD,
//        LEFT_ARM,
//        RIGHT_ARM,
//        TORSO,
//        LEFT_LEG,
//        COCK,
//        RIGHT_LEG
    }

    protected final BodyPart[] bodyParts = {
            new HeadBodyPart(20.0f, 20.0f),
    };

    public BodyPart[] getBodyParts() {
        return bodyParts;
    }

    public BodyPart getBodyPart(Part bodyPart) {
        return bodyParts[bodyPart.ordinal()];
    }
}
