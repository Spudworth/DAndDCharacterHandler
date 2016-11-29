import java.util.*;

/**
 * Created by t00182938 on 28/11/2016.
 */
public class Inventory {
 Map<Weapon, String> weaponsMap ;

    Inventory()
    {
        weaponsMap = new HashMap<Weapon, String>();
    }

    public void addWeapon(String weaponName,boolean isSharp, boolean isHeavy, boolean isEnchanted, double damage)
    {

        Weapon weapon = new Weapon( isSharp,  isHeavy,  isEnchanted, damage);
        weaponsMap.put(weapon,weaponName);

    }

}
