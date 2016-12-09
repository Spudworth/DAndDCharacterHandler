import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by X99-A on 09-Dec-16.
 */
public class SpellsAndAbilitiesTest {
    @Test
    public void getSpellOrAbilityNamePass() throws Exception {

        SpellsAndAbilities spellsAndAbilities = new SpellsAndAbilities("Stealth","I'm very Sneaky");
        String currentName = spellsAndAbilities.getSpellOrAbilityName();
        Assert.assertEquals(currentName,"Stealth");

    }

    @Test
    public void getSpellOrAbilityNameFail() throws Exception {

        SpellsAndAbilities spellsAndAbilities = new SpellsAndAbilities("Stealth","I'm very Sneaky");
        String currentName = spellsAndAbilities.getSpellOrAbilityName();
        Assert.assertNotEquals(currentName,"Night vision");

    }

    @Test
    public void setSpellOrAbilityNamePass() throws Exception {

        SpellsAndAbilities spellsAndAbilities = new SpellsAndAbilities("Night Vision","I'm very Sneaky");
        spellsAndAbilities.setSpellOrAbilityName("Stealth");
        String currentName = spellsAndAbilities.getSpellOrAbilityName();
        Assert.assertEquals(currentName,"Stealth");

    }

    @Test
    public void setSpellOrAbilityNameFail() throws Exception {

        SpellsAndAbilities spellsAndAbilities = new SpellsAndAbilities("Night Vision","I'm very Sneaky");
        spellsAndAbilities.setSpellOrAbilityName("Stealth");
        String currentName = spellsAndAbilities.getSpellOrAbilityName();
        Assert.assertNotEquals(currentName,"Night Vision");

    }

    @Test
    public void getSpellOrAbilityDescriptionPass() throws Exception {

        SpellsAndAbilities spellsAndAbilities = new SpellsAndAbilities("Stealth","I'm very Sneaky");
        String currentDescription = spellsAndAbilities.getSpellOrAbilityDescription();
        Assert.assertEquals(currentDescription,"I'm very Sneaky");

    }

    @Test
    public void getSpellOrAbilityDescriptionFail() throws Exception {

        SpellsAndAbilities spellsAndAbilities = new SpellsAndAbilities("Stealth","I'm very Sneaky");
        String currentDescription = spellsAndAbilities.getSpellOrAbilityDescription();
        Assert.assertNotEquals(currentDescription,"I'm not very Sneaky");

    }

    @Test
    public void setSpellOrAbilityDescriptionPass() throws Exception {

        SpellsAndAbilities spellsAndAbilities = new SpellsAndAbilities("Night Vision","I'm very Sneaky");
        spellsAndAbilities.setSpellOrAbilityDescription("I can see in the dark");
        String currentDescription = spellsAndAbilities.getSpellOrAbilityDescription();
        Assert.assertEquals(currentDescription,"I can see in the dark");

    }

    @Test
    public void setSpellOrAbilityDescriptionFail() throws Exception {

        SpellsAndAbilities spellsAndAbilities = new SpellsAndAbilities("Night Vision","I'm very Sneaky");
        spellsAndAbilities.setSpellOrAbilityDescription("I can see in the dark");
        String currentDescription = spellsAndAbilities.getSpellOrAbilityDescription();
        Assert.assertNotEquals(currentDescription,"I'm very Sneaky");

    }

}