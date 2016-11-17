

public class Axe extends Weapon{
    Weapon axe = new Weapon ();

    public void setIsAxeSharp(bool isSharp)
    {
        axe.setSharp(isSharp);
    }
    public void setIsAxeHeavy(bool isHeavy)
    {
        axe.setHeavy(isHeavy);
    }
    public void setIsAxeEnchanted(bool isEnchanted)
    {
        axe.setEnchanted(isEnchanted);
    }

    public void setAxeDamage(double damage) {
        axe.setDamage(damage);
    }
}