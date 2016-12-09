import org.junit.Assert;
import org.junit.Test;

import javax.tools.Tool;

import static org.junit.Assert.*;


public class ToolsTest {
    @Test
    public void getToolNamePass() throws Exception {

        Tools testTool = new Tools("Shovel","It can dig",6);
        String currentToolName = testTool.getToolName();
        Assert.assertEquals(currentToolName,"Shovel");

    }
    @Test
    public void getToolNameFail() throws Exception {

        Tools testTool = new Tools("Shovel","It can dig",6);
        String currentToolName = testTool.getToolName();
        Assert.assertNotEquals(currentToolName,"Pickaxe");

    }

    @Test
    public void setToolNamePass() throws Exception {

        Tools testTool = new Tools("Pickaxe","It can dig",6);
        testTool.setToolName("Shovel");
        String currentToolName = testTool.getToolName();
        Assert.assertEquals(currentToolName,"Shovel");

    }
    @Test
    public void setToolNameFail() throws Exception {

        Tools testTool = new Tools("Pickaxe","It can dig",6);
        testTool.setToolName("Shovel");
        String currentToolName = testTool.getToolName();
        Assert.assertNotEquals(currentToolName,"Pickaxe");

    }

    @Test
    public void getToolDescriptionPass() throws Exception {

        Tools testTools = new Tools("Shovel","It can dig",6);
        String currentToolDescription = testTools.getToolDescription();
        Assert.assertEquals(currentToolDescription,"It can dig");

    }
    @Test
    public void getToolDescriptionFail() throws Exception {

        Tools testTools = new Tools("Shovel","It can dig",6);
        String currentToolDescription = testTools.getToolDescription();
        Assert.assertNotEquals(currentToolDescription,"It can't dig");

    }

    @Test
    public void setToolDescriptionPass() throws Exception {

        Tools testTools = new Tools("Shovel","It can't dig",6);
        testTools.setToolDescription("It can dig");
        String currentToolDescription = testTools.getToolDescription();
        Assert.assertEquals(currentToolDescription,"It can dig");

    }
    @Test
    public void setToolDescriptionFail() throws Exception {

        Tools testTools = new Tools("Shovel","It can't dig",6);
        testTools.setToolDescription("It can dig");
        String currentToolDescription = testTools.getToolDescription();
        Assert.assertNotEquals(currentToolDescription,"It can't dig");

    }

    @Test
    public void getToolWeightPass() throws Exception {

        Tools testTools = new Tools("Shovel","It can dig",6);
        int currentToolWeight = testTools.getToolWeight();
        Assert.assertEquals(currentToolWeight,6);

    }
    @Test
    public void getToolWeightFail() throws Exception {

        Tools testTools = new Tools("Shovel","It can dig",6);
        int currentToolWeight = testTools.getToolWeight();
        Assert.assertNotEquals(currentToolWeight,8);

    }

    @Test
    public void setToolWeightPass() throws Exception {

        Tools testTools = new Tools("Shovel","It can dig",6);
        testTools.setToolWeight(8);
        int currentToolWeight = testTools.getToolWeight();
        Assert.assertEquals(currentToolWeight,8);

    }
    @Test
    public void setToolWeightFail() throws Exception {

        Tools testTools = new Tools("Shovel","It can dig",6);
        testTools.setToolWeight(8);
        int currentToolWeight = testTools.getToolWeight();
        Assert.assertNotEquals(currentToolWeight,6);

    }

}