import com.sun.org.apache.xpath.internal.operations.Bool;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by X99-A on 09-Dec-16.
 */
public class AbilitiesTest {

    @Test
    public void getIsPassivePass() throws Exception {

        Abilities ability = new Abilities("Stealth", "You are Sneaky",true);
        Boolean isPassiveTest = ability.getIsPassive();
        Assert.assertEquals(isPassiveTest,true);

    }

    @Test
    public void getIsPassiveFail() throws Exception {

        Abilities ability = new Abilities("Stealth", "You are Sneaky",true);
        Boolean isPassiveTest = ability.getIsPassive();
        Assert.assertNotEquals(isPassiveTest,false);

    }

    @Test
    public void setIsPassivePass() throws Exception {

        Abilities ability = new Abilities("Stealth", "You are Sneaky",true);
        ability.setIsPassive(false);
        Boolean isPassiveTest = ability.getIsPassive();
        Assert.assertEquals(isPassiveTest,false);

    }

    @Test
    public void setIsPassiveFail() throws Exception {

        Abilities ability = new Abilities("Stealth", "You are Sneaky",true);
        ability.setIsPassive(false);
        Boolean isPassiveTest = ability.getIsPassive();
        Assert.assertNotEquals(isPassiveTest,true);

    }

}