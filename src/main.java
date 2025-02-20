public class main {
    //Main method to see component in action
    public static void main(String args[]) {
        //Demonstration of the methods working in an example game

        /*
         * Say you wanted to create an inventory for a chest in game with items
         * inside The chest has a maximum of 6 spaces for items You declare the
         * constructor with the parameter of 6
         */

        final int chestSize = 6;
        inventory chest = new inventory(chestSize);

        /*
         * the chest is empty
         */
        chest.print();

        /*
         * Adding 2 items to the chest
         */

        chest.addItem("Flame Sword");
        chest.addItem("Ice Bow");

        /*
         * The chest has two items now
         */
        chest.print();

        /*
         * removing the ice bow from the chest
         */

        String iceBow = chest.removeItem("Ice Bow");

        /*
         * The Chest now only has the flame sword
         */
        chest.print();

        /*
         * getting the flame sword but not removing it
         */

        String flameSword = chest.getItem("Flame Sword");

        /*
         * The chest still has the flame sword
         */
        chest.print();

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
        chest.print();
    }
}
