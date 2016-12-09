import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Andrew on 09-Dec-16.
 */
public class CharacterCreation {
    private JLabel lblName;
    private JTextField txtName;
    private JLabel lblClass;
    private JLabel lblRace;
    private JComboBox cboClass;
    private JComboBox cboRace;
    private JButton btnSubmit;

    private createCharacter newCharacter;

    public CharacterCreation() {
        btnSubmit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                if(e.getSource() == btnSubmit) {


                    newCharacter.setName(txtName.getText());

                    setRace();

                    setClass();

                }
            }

            private void setClass() {

                if (cboClass.getSelectedItem() == "Fighter")
                    newCharacter.setClassType(CharacterClass.FIGHTER);
                else if(cboClass.getSelectedItem() == "Cleric")
                    newCharacter.setClassType(CharacterClass.CLERIC);
                else if (cboClass.getSelectedItem() == "Wizard")
                    newCharacter.setClassType(CharacterClass.WIZARD);
                else
                    newCharacter.setClassType(CharacterClass.ROUGE);
            }

            private void setRace() {

                if(cboRace.getSelectedItem() == "Human")
                    newCharacter.setRaceType(Race.HUMAN);
                else if(cboRace.getSelectedItem() == "Dwarf")
                    newCharacter.setRaceType(Race.DWARF);
                else if (cboRace.getSelectedItem() == "Halfling")
                    newCharacter.setRaceType(Race.HALFLING);
                else
                    newCharacter.setRaceType(Race.ELF);
            }
        });


    }
}
