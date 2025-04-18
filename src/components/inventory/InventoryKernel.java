package components.inventory;

/**
 * Inventory Kernel component with primary methods.
 */
public interface InventoryKernel {

    /**
     * Returns the current inventory as an array of strings with the strings
     * being the name of the objects.
     *
     * @return String[] inventory
     */
    String[] returnInventory();

    /**
     * Returns the maximum size of the inventory.
     *
     * @return int maxSize
     */
    int returnMaxSize();

    /**
     * Returns the current size of the inventory
     * 
     * @return
     */

    /**
     * Reports whether or not the inventory is empty.
     *
     * @return true if String[] inventory is empty
     * @ensures isEmpty = (String[] inventory.length == 0)
     */
    boolean isEmpty();

    /**
     * Reports whether or not the inventory has reached it's maximum limit.
     *
     * @return true if String[] inventory is full
     * @ensures isEmpty = (String[] inventory.length == int maximumSize)
     */
    boolean isFull();
}
