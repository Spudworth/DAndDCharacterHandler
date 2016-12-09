import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Andrew on 09-Dec-16.
 */
public class AbilityScores {
    private JLabel lblSTR;
    private JLabel lblDEX;
    private JLabel lblCON;
    private JLabel lblINT;
    private JLabel lblWIS;
    private JLabel lblCHA;
    private JTextField txtStr;
    private JTextField txtDex;
    private JTextField txtCon;
    private JTextField txtInt;
    private JTextField txtWis;
    private JTextField txtCha;
    private JLabel lblSTRmod;
    private JLabel lblDEXmod;
    private JLabel lblCONmod;
    private JLabel lblINTmod;
    private JLabel lblWISmod;
    private JLabel lblCHAmod;
    private JButton btnContinue;
    private JPanel pnlAbility;
    private createCharacter newCharacter = new createCharacter();

    public AbilityScores(createCharacter newCharacter) {

        this.newCharacter = newCharacter;

        JFrame abilityPane = new JFrame("AbilityScores");
        abilityPane.setContentPane(pnlAbility);
        abilityPane.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        abilityPane.pack();
        abilityPane.setVisible(true);

        btnContinue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                newCharacter.setAbilityScores(Integer.parseInt(txtStr.getText()),
                                                Integer.parseInt(txtDex.getText()),
                                                Integer.parseInt(txtCon.getText()),
                                                Integer.parseInt(txtInt.getText()),
                                                Integer.parseInt(txtWis.getText()),
                                                Integer.parseInt(txtCha.getText()));

            }
        });
    }

    private void createUIComponents() {
        if (newCharacter.getRaceType() == Race.DWARF)
        {
            lblSTRmod.setText("+2");
            lblCONmod.setText("+1");
        }

        else if(newCharacter.getRaceType() == Race.HALFLING)
        {
            lblCHAmod.setText("+2");
            lblDEXmod.setText("+1");
        }

        else if (newCharacter.getRaceType() == Race.ELF)
        {
            lblDEXmod.setText("+2");
            lblINTmod.setText("+1");
        }

        else
        {
            lblSTRmod.setText("+1");
            lblDEXmod.setText("+1");
            lblCONmod.setText("+1");
            lblINTmod.setText("+1");
            lblWISmod.setText("+1");
            lblCHAmod.setText("+1");


        }
    }

    public JPanel getPanel()
    {
        return pnlAbility;
    }
}
