import components.inventory.Inventory;
import components.inventory.Inventory1;

public class LootBoxes {

    public static void main(String[] args) {
        //Demonstration of the methods working in an example game

        /*
         * Say you wanted to create a lootbox system for your players
         */

        //First you would create the lootboxes by initializing the inventory
        final int normalLootBoxSize = 1;
        final int rareLootBoxSize = 3;
        final int legendaryLootBoxSize = 5;

        Inventory normalLootBox = new Inventory1(normalLootBoxSize);
        Inventory rareLootBox = new Inventory1(rareLootBoxSize);
        Inventory legendaryLootBox = new Inventory1(normalLootBoxSize);

        //Then you add the items you want to the lootboxes
        normalLootBox.addItem("Stone");

        rareLootBox.addItem("Leather Armor");
        rareLootBox.addItem("Basic Sword");
        rareLootBox.addItem("Wood");

        legendaryLootBox.addItem("Iron Armor");
        legendaryLootBox.addItem("Flame Sword");
        legendaryLootBox.addItem("Health Potion");
        legendaryLootBox.addItem("Stone");
        legendaryLootBox.addItem("Gold");

        /*
         * Lets say the player rolls the normal loot box and they claim it, you
         * can add it to their inventory while removing it from the lootbox
         */
        normalLootBox.removeItem("Stone");

        /*
         * Lets say the player rolls the rare loot box and they want to see what
         * they got, you can use the returnInventory function to display all the
         * results to the player and then removing the items
         */
        String[] displayItems = rareLootBox.returnInventory();
        rareLootBox.removeItem("Leather Armor");
        rareLootBox.removeItem("Basic Sword");
        rareLootBox.removeItem("Wood");

        /*
         * finally the player rolls the legendary lootbox, they want to see the
         * specifics of the items on display when they open the box before
         * putting it in their inventory
         */
        displayItems = legendaryLootBox.returnInventory();
        String armor = legendaryLootBox.getItem("Iron Armor");
        String sword = legendaryLootBox.getItem("Flame Sword");
        String healthPotion = legendaryLootBox.getItem("Health Potion");
        legendaryLootBox.removeItem("Iron Armor");
        legendaryLootBox.removeItem("Flame Sword");
        legendaryLootBox.removeItem("Health Potion");
        legendaryLootBox.removeItem("Stone");
        legendaryLootBox.removeItem("Gold");

    }
}
