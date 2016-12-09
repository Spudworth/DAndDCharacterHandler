import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Inventory {

    private List tools;
    private Set spells;
    private Set abilities;

    public Inventory(){
        tools = new LinkedList<Tools>();
        spells = new HashSet<Spells>();
        abilities = new HashSet<Abilities>();
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

    /*public Spells viewSpells(){
      return   spells.forEach(System.out::println);
    }*/

}
