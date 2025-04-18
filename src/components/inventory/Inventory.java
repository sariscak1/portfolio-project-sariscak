package components.inventory;

/**
 * {@code InventoryKernel} enhanced with secondary methods.
 */
public interface Inventory extends InventoryKernel {

    /**
     * Adds an item to the inventory.
     *
     * @param item
     *            the item to be added
     * @updates this
     * @ensures this = #this + item
     */
    void addItem(String item);

    /**
     * Removes an item from the inventory.
     *
     * @param item
     *            the item to be removed
     * @return the item removed
     * @updates this
     * @requires item is in this
     * @ensures this = #this - item
     */
    String removeItem(String item);

    /**
     * Reports the item from the inventory based off of the name of the item.
     *
     * @param itemName
     *            the name of the item you would like to get
     * @return the item with the same name
     * @requires an item with the same name is in this
     */
    String getItem(String itemName);
}
