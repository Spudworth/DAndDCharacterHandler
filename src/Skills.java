/**
 * Created by T00182437 on 05/12/2016.
 */
public class Skills {

    private boolean trained;
    private int skillValue;
    private final int TRAINING_BONUS = 5;

    public Skills()
    {}

    public Skills (int v, boolean t)
    {
        trained = t;
        setSkillValues(v);
    }

    public void setSkillValues(int v)
    {
        if(trained)
            skillValue = v + TRAINING_BONUS;
        else
            skillValue = v;
    }

    public void isTrained(boolean t)
    {
        trained = t;
    }

    public int getSkillValue()
    {
        return skillValue;
    }


}
