import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by t00182938 on 05/12/2016.
 */

public class MenuInterface extends JFrame implements ActionListener {

    JMenu WeaponMenu;
    Inventory inventory = new Inventory();
    ArrayList<Weapon> weaponsOwned = new ArrayList<Weapon>();


    public MenuInterface()
    {
        setTitle("Weapon Menu");
        setSize(500,250);
        setLocation(100,100);
        Container pane = getContentPane();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        createWeaponMenu();
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.add(WeaponMenu);
    }

    private void createWeaponMenu() {

        WeaponMenu = new JMenu("Weapons");
        JMenuItem item;


        item = new JMenuItem("View Weapons");
        item.addActionListener(this);
        WeaponMenu.add(item);

        item = new JMenuItem("Equip Weapon");
        item.addActionListener(this);
        WeaponMenu.add(item);

        item = new JMenuItem("Quit");
        item.addActionListener(this);
        WeaponMenu.add(item);
    }
    public void display()
    {
      JTextArea area = new JTextArea();
        area.setText("Weapons Inventory");
        for(Weapon c: weaponsOwned)

         area.append("" + c);
        showMessage(area);

    }

    private void showMessage(JTextArea area) {
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
        else
            showMessage("Not implemented yet");

    }

    private void showMessage(String s) {
        JOptionPane.showMessageDialog(null,s);
    }
}