

import javax.tools.Tool;
import java.util.*;

public class Inventory {

    private List<Tools> tools;
    private Set<Spells> spells;
    private Set<Abilities> abilities;
    List<Weapon> weaponsEquipped;
    public ArrayList<Weapon> weaponsOwned;

    public Inventory(){
        tools = new LinkedList<Tools>();
        spells = new HashSet<Spells>();
        abilities = new HashSet<Abilities>();
        weaponsOwned = new ArrayList<Weapon>();
        weaponsEquipped  = new ArrayList<Weapon>();
    }

    public void addSpells(String spellName, String spellDescription, String damageType, int damage){
        Spells spell = new Spells(spellName,spellDescription,damageType,damage);
        spells.add(spell);
    }

    public void addAbilities(String abilityName, String abilityDescription, boolean isPassive){
        Abilities ability = new Abilities(abilityName,abilityDescription,isPassive);
        abilities.add(ability);
    }

    public void addTools(String toolName, String toolDescription, int toolWeight){
        Tools tool = new Tools(toolName,toolDescription,toolWeight);
        tools.add(tool);
    }



    public void addWeapon(String weaponName,boolean isSharp, boolean isHeavy, boolean isEnchanted, double damage)
    {
        Weapon weapon = new Weapon(weaponName, isSharp,  isHeavy,  isEnchanted, damage);
        weaponsOwned.add(weapon);
    }


    public void viewSpells(){

            for(Spells spell : spells){

                System.out.println(spell.toString());
            }
    }

    public void viewAbilities(){

        for(Abilities ability : abilities){

            System.out.println(ability.toString());
        }
    }

    public void viewTools(){

        for(Tools tool : tools){

            System.out.println(tool.toString());
        }
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
            System.out.println(e.toString());
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
