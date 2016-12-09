import java.util.ArrayList;

public class createCharacter {

    // Basic info
    private String name;
    private CharacterClass classType;
    private Race raceType;
    private int level;

    // Ability Scores
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;

    //ability modifiers
    private int  strMod = (int)(getStrength() -10)/2;
    private int  dexMod = (int)(getDexterity() -10)/2;
    private int  conMod = (int)(getConstitution() -10)/2;
    private int  intMod = (int)(getIntelligence() -10)/2;
    private int  wisMod = (int)(getWisdom() -10)/2;
    private int  chaMod = (int)(getCharisma() -10)/2;

    //skills
    private Skills acrobatics = new Skills();
    private Skills athletics = new Skills();
    private Skills history = new Skills();
    private Skills nature = new Skills();
    private Skills religion = new Skills();
    private Skills sleightOfHand = new Skills();
    private Skills stealth = new Skills();
    private Skills healing = new Skills();


    // GENERAL INFORMATION
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CharacterClass getClassType() {
        return classType;
    }

    public void setClassType(CharacterClass classType) {
        this.classType = classType;
    }

    public Race getRaceType() {
        return raceType;
    }

    public void setRaceType(Race raceType) {
        this.raceType = raceType;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    //ABILITY SCORES

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    // MODIFIERS

    public int getStrMod() {
        return strMod;
    }

    public int getDexMod() {
        return dexMod;
    }

    public int getConMod() {
        return conMod;
    }

    public int getIntMod() {
        return intMod;
    }

    public int getWisMod() {
        return wisMod;
    }

    public int getChaMod() {
        return chaMod;
    }

    public void setStrMod(int strMod) {
        this.strMod = strMod;
    }

    public void setDexMod(int dexMod) {
        this.dexMod = dexMod;
    }

    public void setConMod(int conMod) {
        this.conMod = conMod;
    }

    public void setIntMod(int intMod) {
        this.intMod = intMod;
    }

    public void setWisMod(int wisMod) {
        this.wisMod = wisMod;
    }

    public void setChaMod(int chaMod) {
        this.chaMod = chaMod;
    }

    //SKILLS

    public int getAcrobatics() {
        return acrobatics.getSkillValue();
    }

    public void setAcrobatics(int acrobatics) {
       this.acrobatics.setSkillValues(acrobatics);
    }

    public int getAthletics() {
        return athletics.getSkillValue();
    }

    public void setAthletics(int athletics) {
        this.athletics.setSkillValues(athletics);
    }

    public int getHistory() {
        return history.getSkillValue();
    }

    public void setHistory(int history) {
        this.history.setSkillValues(history);
    }

    public int getNature() {
        return nature.getSkillValue();
    }

    public void setNature(int nature) {
        this.nature.setSkillValues(nature);
    }

    public int getReligion() {
        return religion.getSkillValue();
    }

    public void setReligion(int religion) {
        this.religion.setSkillValues(religion);
    }

    public int getSleightOfHand() {
        return sleightOfHand.getSkillValue();
    }

    public void setSleightOfHand(int sleightOfHand) {
        this.sleightOfHand.setSkillValues(sleightOfHand);
    }

    public int getStealth() {
        return stealth.getSkillValue();
    }

    public void setStealth(int stealth) {
        this.stealth.setSkillValues(stealth);
    }

    public int getHealing() {
        return healing.getSkillValue();
    }

    public void setHealing(int healing) {
        this.healing.setSkillValues(healing);
    }


    public void createCharacter(CharacterClass classType, Race raceType, int str, int dex, int con, int intel, int wis, int cha)
    {
        setClassType(classType);
        setRaceType(raceType);
        setAbilityScores(str, dex, con, intel, wis, cha);
        setSkillValues();

    }

    public void createCharacter(){

    }

    public void setAbilityScores(int str, int dex, int con, int intel, int wis, int cha) {

        // STRENGTH
        if(getRaceType() == Race.DWARF)
            setStrength(str+2);
        else if(getRaceType() == Race.HUMAN)
            setStrength(str+1);
        else
            setStrength(str);

        //DEXTERITY
        if(getRaceType() == Race.ELF)
            setDexterity(dex+2);
        else if (getRaceType() == Race.HUMAN || getRaceType() == Race.HALFLING)
            setDexterity(dex+1);
        else
            setDexterity(dex);

        //CONSTITUTION
        if(getRaceType() == Race.DWARF || getRaceType() == Race.HUMAN)
            setConstitution(con+1);
        else
            setConstitution(con);

        //INTELLIGENCE
        if(getRaceType() == Race.ELF || getRaceType() == Race.HUMAN)
            setIntelligence(intel+1);
        else
            setIntelligence(intel);

        //WISDOM
        setWisdom(wis);

        //CHARISMA
        if(getRaceType() == Race.HALFLING)
            setCharisma(cha+2);
        else if (getRaceType()== Race.HUMAN)
            setCharisma(cha+1);
        else
            setCharisma(cha);
    }

    public void skillTraining(ArrayList<Skills> trained)
    {
        for (Skills s :
                trained) {

            s.isTrained(true);

        }
    }

    private void setSkillValues() {
        setAcrobatics(getDexMod());
        setAthletics(getStrMod());
        setHealing(getWisMod());
        setHistory(getIntMod());
        setNature(getIntMod());
        setReligion(getIntMod());
        setSleightOfHand(getDexMod());
        setStealth(getDexMod());
    }



}
