import java.util.List;


public class Tools {

    private String toolName;
    private String toolDescription;
    private int toolWeight;

    public Tools(String toolName, String toolDescription, int toolWeight) {
        setToolName(toolName);
        setToolDescription(toolDescription);
        setToolWeight(toolWeight);
    }

    public String getToolName() {
        return toolName;
    }

    public void setToolName(String toolName) {
        this.toolName = toolName;
    }

    public String getToolDescription() {
        return toolDescription;
    }

    public void setToolDescription(String toolDescription) {
        this.toolDescription = toolDescription;
    }


    public int getToolWeight() {
        return toolWeight;
    }

    public void setToolWeight(int toolWeight) {
        this.toolWeight = toolWeight;
    }


}
