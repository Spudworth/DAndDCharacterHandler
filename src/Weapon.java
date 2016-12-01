

public class Weapon{

    String type;
    double damage;
    boolean isSharp,isHeavy,isEnchanted;

    public Weapon()
    {

    }
    public Weapon(boolean isSharp, boolean isHeavy, boolean isEnchanted, double damage)
    {
        setSharp(isSharp);
        setHeavy(isHeavy);
        setEnchanted(isEnchanted);
        setDamage(damage);
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public boolean isSharp() {
        return isSharp;
    }

    public void setSharp(boolean sharp) {
        isSharp = sharp;
    }

    public boolean isHeavy() {
        return isHeavy;
    }

    public void setHeavy(boolean heavy) {
        isHeavy = heavy;
    }

    public boolean isEnchanted() {
        return isEnchanted;
    }

    public void setEnchanted(boolean enchanted) {
        isEnchanted = enchanted;
    }


}