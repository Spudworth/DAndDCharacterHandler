import java.util.*;

/**
 * Created by t00182938 on 28/11/2016.
 */
public class Inventory {

    //Map<Weapon, String> weaponsEquippedMap;
    List<Weapon> weaponsEquipped;
    public ArrayList<Weapon> weaponsOwned;
   // Map<Weapon, String> weaponsOwnedMap ;

    Inventory()
    {
        //weaponsEquippedMap = new HashMap<Weapon, String>();
        weaponsOwned = new ArrayList<Weapon>();
        weaponsEquipped  = new ArrayList<Weapon>();
        Weapon axe = new Weapon("Axe",true,true,false,40);
        weaponsOwned.add(axe);
    }
    public void addWeapon(String weaponName,boolean isSharp, boolean isHeavy, boolean isEnchanted, double damage)
    {
        Weapon weapon = new Weapon(weaponName, isSharp,  isHeavy,  isEnchanted, damage);
        weaponsOwned.add(weapon);
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
        for(Weapon e: weaponsOwned)
        {
            System.out.println(e);
        }
    }
    public void equipWeapon(Weapon weapon)
    {
        if(weaponsEquipped.isEmpty())
        {
            if(weaponsOwned.contains(weapon))
            weaponsEquipped.add(weapon);

        }
        else
            System.out.println("You already have a weapon Equipped");
    }
}
