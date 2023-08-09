package name.localizeddamage.body;

import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.event.GameEvent;

public abstract class BodyPart {
    public BodyPart(float maxHealth, float health, PlayerEntity player) {
        setHealth(health);
        setMaxHealth(maxHealth);
        this.player = player;
    }

    private PlayerEntity player;

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

    public boolean damage(float amount, DamageSource source) {
        float newHealth = health - amount;
        setHealth(newHealth);
        return true;
    }

//    public abstract void damageArmor(float amount, DamageSource source);
//
//    public abstract void addEffects();

    public void kill(DamageSource source) {
        player.getDamageTracker().onDamage(source, 20.0f);
        player.setHealth(0.0f);
        player.emitGameEvent(GameEvent.ENTITY_DAMAGE);
    }
}
