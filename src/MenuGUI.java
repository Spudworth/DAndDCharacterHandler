import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by X99-A on 11-Dec-16.
 */
public class MenuGUI extends JFrame implements ActionListener{

    JMenu weaponMenu;
    JMenu spellsMenu;
    JMenu abilitiesMenu;
    Inventory inventory = new Inventory();
    ArrayList<Weapon> weaponsOwned;

    public MenuGUI(){
        setTitle("Weapon Menu");
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
        initialiseInventory(inventory);
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

    private static void initialiseInventory(Inventory inventory){


        inventory.addAbilities("Stealth","Ability to sneak", true);
        inventory.addAbilities("Climb","Ability to scale obstacles",false);
        inventory.addAbilities("Swim","Ability to cross rivers",false);
        inventory.addAbilities("Night Vision","Ability to see in the dark",true);

        inventory.addSpells("Fireball","Casts a fireball at target","Fire",8);
        inventory.addSpells("Lightning bolt","Casts lightning at target","Electric",8);
        inventory.addSpells("Ice spike","Casts a spike of ice at target","Ice",8);
        inventory.addSpells("Blindness","Blinds the target","Dark",0);

        inventory.addTools("Shovel","Able to dig holes",4);
        inventory.addTools("Rope","Able to bind items or climb obstacles",2);
        inventory.addTools("Pickaxe","Able to split stone",6);
        inventory.addTools("Lantern","Able to highlight dark areas",4);

        inventory.addWeapon("Longsword",true,true,false,20);
        inventory.addWeapon("Mace",false,true,false,20);
        inventory.addWeapon("Staff",false,false,true,15);
        inventory.addWeapon("Bow",false,false,false,12);
    }

}
