

public class Weapon{

    String name;
    double damage;
    boolean isSharp;
    boolean isHeavy;
    boolean isEnchanted;


    public Weapon(String name, boolean isSharp, boolean isHeavy, boolean isEnchanted, double damage)
    {
        setName(name);
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


    public void setName(String name) {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                "\nisSharp: " + isSharp +
                "\nIs Heavy? " + isHeavy +
                "\nIs Enchanted? " + isEnchanted +
                "\nDamage: " + damage +"\n";
    }
}