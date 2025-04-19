import components.inventory.Inventory;
import components.inventory.Inventory1;

public class inventoryDemo {

    public static void main(String[] args) {
        //Demonstration of the methods working in an example game

        /*
         * Say you wanted to create an inventory for a chest in game with items
         * inside The chest has a maximum of 6 spaces for items You declare the
         * constructor with the parameter of 6
         */

        final int chestSize = 6;
        Inventory chest = new Inventory1(chestSize);

        /*
         * the chest is empty
         */
        System.out.println(chest.toString());

        /*
         * Adding 2 items to the chest
         */

        chest.addItem("Flame Sword");
        chest.addItem("Ice Bow");

        /*
         * The chest has two items now
         */
        System.out.println(chest.toString());

        /*
         * removing the ice bow from the chest
         */

        String iceBow = chest.removeItem("Ice Bow");

        /*
         * The Chest now only has the flame sword
         */
        System.out.println(chest.toString());

        /*
         * getting the flame sword but not removing it
         */

        String flameSword = chest.getItem("Flame Sword");

        /*
         * The chest still has the flame sword
         */
        System.out.println(chest.toString());

        /*
         * Checking to see if the chest is full, if it is not then it adds the
         * Ice bow back in
         */

        if (!chest.isFull()) {
            chest.addItem(iceBow);
        }

        /*
         * The ice bow is now in the inventory
         */
        System.out.println(chest.toString());
    }
}
