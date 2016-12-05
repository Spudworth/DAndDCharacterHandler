public class createCharacter {

    // Basic info
    private String name;
    private String classType;
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
    final private int  strMod = (int)(getStrength() -10)/2;
    final private int  dexMod = (int)(getDexterity() -10)/2;
    final private int  conMod = (int)(getConstitution() -10)/2;
    final private int  intMod = (int)(getIntelligence() -10)/2;
    final private int  wisMod = (int)(getWisdom() -10)/2;
    final private int  chaMod = (int)(getCharisma() -10)/2;

    //skills
    private int acrobatics;
    private int athletics;
    private int history;
    private int nature;
    private int religion;
    private int sleightOfHand;
    private int stealth;
    private int healing;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
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

    public int getAcrobatics() {
        return acrobatics;
    }

    public void setAcrobatics(int acrobatics) {
        this.acrobatics = acrobatics;
    }

    public int getAthletics() {
        return athletics;
    }

    public void setAthletics(int athletics) {
        this.athletics = athletics;
    }

    public int getHistory() {
        return history;
    }

    public void setHistory(int history) {
        this.history = history;
    }

    public int getNature() {
        return nature;
    }

    public void setNature(int nature) {
        this.nature = nature;
    }

    public int getReligion() {
        return religion;
    }

    public void setReligion(int religion) {
        this.religion = religion;
    }

    public int getSleightOfHand() {
        return sleightOfHand;
    }

    public void setSleightOfHand(int sleightOfHand) {
        this.sleightOfHand = sleightOfHand;
    }

    public int getStealth() {
        return stealth;
    }

    public void setStealth(int stealth) {
        this.stealth = stealth;
    }

    public int getHealing() {
        return healing;
    }

    public void setHealing(int healing) {
        this.healing = healing;
    }


    public void createCharacter(String classType, Race raceType, int str, int dex, int con, int intel, int wis, int cha)
    {
        setClassType(classType);
        setRaceType(raceType);
        setAbilityScores(str, dex, con, intel, wis, cha);
        setSkillValues();



    }

    private void setAbilityScores(int str, int dex, int con, int intel, int wis, int cha) {

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
