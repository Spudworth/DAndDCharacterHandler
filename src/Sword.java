/**
        * Created by t00182938 on 28/11/2016.
        */
public abstract class Sword extends Weapon{

    public void setIsSwordSharp(boolean isSharp)
    {
        Weapon.setSharp(isSharp);
    }
    public void setIsSwordHeavy(boolean isHeavy)
    {
        Weapon.setHeavy(isHeavy);
    }
    public void setIsSwordEnchanted(boolean isEnchanted)
    {
        Weapon.setEnchanted(isEnchanted);
    }

    public void setSwordDamage(double damage) {
        Weapon.setDamage(damage);
    }
}

