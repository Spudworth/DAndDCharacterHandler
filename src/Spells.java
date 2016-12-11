

public class Spells extends SpellsAndAbilities {


    private String damageType;
    private int damage;

    public Spells(String spellName, String spellDescription, String damageType, int damage){
        super(spellName,spellDescription);
        setDamageType(damageType);
        setDamage(damage);

    }


    public String getDamageType() {
        return damageType;
    }

    public void setDamageType(String damageType) {
        this.damageType = damageType;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }


    @Override
    public  String toString() {
        return super.toString()+ "\nDamage Type: " + getDamageType() +
                "\nDamage: " + getDamage()+"\n";
    }
}
