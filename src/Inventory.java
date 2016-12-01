import java.util.*;

/**
 * Created by t00182938 on 28/11/2016.
 */
public class Inventory {

    //Map<Weapon, String> weaponsEquippedMap;
    List<Weapon> weaponsEquipped;
    Map<Weapon, String> weaponsOwnedMap ;

    Inventory()
    {
        //weaponsEquippedMap = new HashMap<Weapon, String>();
        weaponsOwnedMap = new HashMap<Weapon, String>();
        weaponsEquipped  = new ArrayList<Weapon>();
    }
    public void addWeapon(String weaponName,boolean isSharp, boolean isHeavy, boolean isEnchanted, double damage)
    {
        Weapon weapon = new Weapon( isSharp,  isHeavy,  isEnchanted, damage);
        weaponsOwnedMap.put(weapon,weaponName);
    }
    public void viewWeaponsEquipped()
    {
        if(!weaponsEquipped.isEmpty())
        System.out.print(weaponsEquipped.get(0));
        else
            System.out.println("You have no weapons equipped");
    }
    public void viewAllWeapons()
    {
        System.out.print(weaponsOwnedMap.values() +" , "+ weaponsOwnedMap.keySet() );
    }
    public void equipWeapon(Weapon weapon)
    {
        if(weaponsEquipped.isEmpty())
        {
            weaponsEquipped.add(weapon);

        }
        else
            System.out.println("You already have a weapon Equipped");
    }
}
