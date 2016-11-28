import java.util.*;

/**
 * Created by t00182938 on 28/11/2016.
 */
public class Inventory {
 List<Weapon> weapons = new LinkedList<Weapon>();

    Inventory(Weapon weapon)
    {
        addWeapon(weapon);
    }

    public void addWeapon(Weapon weapon)
    {
        weapons.add(weapon);
    }
    public void addArmour()
    {

    }


}
