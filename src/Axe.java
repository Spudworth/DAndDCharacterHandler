

public abstract class Axe extends Weapon{

    public void setIsAxeSharp(boolean isSharp)
    {
        Weapon.setSharp(isSharp);
    }
    public void setIsAxeHeavy(boolean isHeavy)
    {
        Weapon.setHeavy(isHeavy);
    }
    public void setIsAxeEnchanted(boolean isEnchanted)
    {
        Weapon.setEnchanted(isEnchanted);
    }

    public void setAxeDamage(double damage) {
        Weapon.setDamage(damage);
    }
}