package name.localizeddamage.body;

import name.localizeddamage.LocalizedDamageMod;

import static java.lang.Float.max;

public abstract class BodyPart {
    public BodyPart(float maxHealth, float health) {
        setHealth(health);
        setMaxHealth(maxHealth);
    }

    private float maxHealth;
    private float health;
//    protected float criticalHealth;
    protected float partKills;
    private PlayerBody.Part part;

    public float getHealth() {
        return this.health;
    }

    public float getMaxHealth() {
        return this.maxHealth;
    }

    public PlayerBody.Part getPart() {
        return this.part;
    }

    public void setMaxHealth(float maxHealth) {
        this.maxHealth = maxHealth;
    }

    public void setHealth(float health) {
        this.health = Float.max(0.0f, health);
//        LocalizedDamageMod.LOGGER.info(String.valueOf(this.health) + " health");
    }

    public void setPart(PlayerBody.Part part) {
        this.part = part;
    }

    //    public float getCriticalHealth() {
//        return this.criticalHealth;
//    }


    public float getPartKills() {
        return this.partKills;
    }

    public float damage(float amount) {
        float newHealth = health - amount;
        setHealth(newHealth);
        return Float.max(0.0f, newHealth);
    }
}
