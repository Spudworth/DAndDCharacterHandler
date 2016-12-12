import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class MenuGUI extends JFrame implements ActionListener{

    JMenu weaponMenu;
    JMenu spellsMenu;
    JMenu abilitiesMenu;
    Inventory inventory = new Inventory();
    ArrayList<Weapon> weaponsOwned;

    public MenuGUI(){
        setTitle("Main Menu");
        setSize(500,250);
        setLocation(100,100);
        Container pane = getContentPane();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        createWeaponMenu();
        createAbilitiesMenu();
        createSpellsMenu();
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.add(weaponMenu);
        menuBar.add(spellsMenu);
        menuBar.add(abilitiesMenu);
        inventory.initialiseInventory();
    }
    private void createWeaponMenu() {

        weaponMenu = new JMenu("Weapons");
        JMenuItem item;


        item = new JMenuItem("View Weapons");
        item.addActionListener(this);
        weaponMenu.add(item);

        item = new JMenuItem("Equip Weapon");
        item.addActionListener(this);
        weaponMenu.add(item);

        item = new JMenuItem("Quit");
        item.addActionListener(this);
        weaponMenu.add(item);
    }

    private void createSpellsMenu(){
        spellsMenu = new JMenu("Spells");
        JMenuItem item;

        item = new JMenuItem("View Spells");
        item.addActionListener(this);
        spellsMenu.add(item);

        item = new JMenuItem("Quit");
        item.addActionListener(this);
        spellsMenu.add(item);
    }
    private void createAbilitiesMenu(){
        abilitiesMenu = new JMenu("Abilities");
        JMenuItem item;

        item = new JMenuItem("View Abilities");
        item.addActionListener(this);
        abilitiesMenu.add(item);

        item = new JMenuItem("Quit");
        item.addActionListener(this);
        abilitiesMenu.add(item);
    }
    public void display()
    {
        JTextArea area = new JTextArea();
        area.setText("Weapons Inventory");
        for(Weapon c: weaponsOwned)

            area.append("" + c);
        //showMessage(area);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("View Weapons"))
        {
            inventory.viewAllWeapons();
        }
        else if(e.getActionCommand().equals("Equip Weapon"))
        {
            //inventory.equipWeapon();
        }
        else if(e.getActionCommand().equals("Quit"))
        {
            System.exit(0);
        }
        else if(e.getActionCommand().equals("View Spells")){
            inventory.viewSpells();
        }
        else if(e.getActionCommand().equals("View Abilities")){
            inventory.viewAbilities();
        }
        else
            showMessage("Not implemented yet");

    }

    private void showMessage(String s) {
        JOptionPane.showMessageDialog(null,s);
    }

}
