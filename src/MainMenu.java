/**
 * Created by t00182938 on 05/12/2016.
 */

public class MainMenu  {



    public static void main(String args[])
    {
        /*Inventory inventory = new Inventory();
        initialiseInventory(inventory);*/
        MenuGUI menuGUI = new MenuGUI();
        menuGUI.setVisible(true);


    }

   /* private static void initialiseInventory(Inventory inventory){


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
    }*/


}