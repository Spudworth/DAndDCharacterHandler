import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class SpellsTest {
    @Test
    public void getDamageTypePass() throws Exception {

        Spells spell = new Spells("Fire","Fire","Fire",8);
        String currentSpellType = spell.getDamageType();
        Assert.assertEquals(currentSpellType,"Fire");

    }
    @Test
    public void getDamageTypeFail() throws Exception {

        Spells spell = new Spells("Fire","Fire","Fire",8);
        String currentSpellType = spell.getDamageType();
        Assert.assertNotEquals(currentSpellType,"Ice");

    }

    @Test
    public void setDamageTypePass() throws Exception {

        Spells spell = new Spells("Fire","Fire","",8);
        spell.setDamageType("Fire");
        String currentSpellType = spell.getDamageType();
        Assert.assertEquals(currentSpellType,"Fire");

    }

    @Test
    public void setDamageTypeFail() throws Exception {

        Spells spell = new Spells("Fire","Fire","",8);
        spell.setDamageType("Fire");
        String currentSpellType = spell.getDamageType();
        Assert.assertNotEquals(currentSpellType,"Ice");

    }

    @Test
    public void getDamagePass() throws Exception {

        Spells spell = new Spells("Fire","Fire","Fire",8);
        int currentSpellDamage = spell.getDamage();
        Assert.assertEquals(currentSpellDamage,8);

    }

    @Test
    public void getDamageFail() throws Exception {

        Spells spell = new Spells("Fire","Fire","Fire",8);
        int currentSpellDamage = spell.getDamage();
        Assert.assertNotEquals(currentSpellDamage,11);

    }

    @Test
    public void setDamagePass() throws Exception {

        Spells spell = new Spells("Fire","Fire","Fire",1);
        spell.setDamage(8);
        int currentSpellDamage = spell.getDamage();
        Assert.assertEquals(currentSpellDamage,8);

    }

    @Test
    public void setDamageFail() throws Exception {

        Spells spell = new Spells("Fire","Fire","Fire",1);
        spell.setDamage(8);
        int currentSpellDamage = spell.getDamage();
        Assert.assertNotEquals(currentSpellDamage,1);

    }

}