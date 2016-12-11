
public class Abilities extends SpellsAndAbilities {

    private Boolean isPassive = false;

    public Abilities(String abilityName, String abilityDescription, Boolean isPassive){
        super(abilityName,abilityDescription);
        setIsPassive(isPassive);
    }

    public Boolean getIsPassive() {
        return isPassive;
    }

    public void setIsPassive(Boolean passive) {
        isPassive = passive;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nIs Passive? " + getIsPassive()+"\n" ;
    }
}
