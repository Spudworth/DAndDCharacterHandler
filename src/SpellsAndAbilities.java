
public abstract class SpellsAndAbilities {
    private String spellOrAbilityName;
    private String spellOrAbilityDescription;

    public SpellsAndAbilities(String spellOrAbilitiesName, String spellOrAbilitiesDescription) {

        setSpellOrAbilityName(spellOrAbilitiesName);
        setSpellOrAbilityDescription(spellOrAbilitiesDescription);
    }

    public String getSpellOrAbilityName() {
        return spellOrAbilityName;
    }

    public void setSpellOrAbilityName(String spellOrAbilityName) {
        this.spellOrAbilityName = spellOrAbilityName;
    }

    public String getSpellOrAbilityDescription() {
        return spellOrAbilityDescription;
    }

    public void setSpellOrAbilityDescription(String spellOrAbilityDescription) {
        this.spellOrAbilityDescription = spellOrAbilityDescription;
    }
    public String toString(){
        return "Name:" +getSpellOrAbilityName()+
                "\nDescription:" +getSpellOrAbilityDescription();
    }
}
