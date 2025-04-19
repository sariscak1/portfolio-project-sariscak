package components.inventory;

/**
 * Layered implementations of secondary methods for {@code Inventory}.
 */
public abstract class InventorySecondary implements Inventory {

    /*
     * Private variables
     */

    /**
     * How many items are currently in the inventory.
     */
    private int currentSize = 0;

    /*
     * Common Methods
     */

    // CHECKSTYLE: ALLOW THIS METHOD TO BE OVERRIDDEN
    @Override
    public String toString() {
        String printLine = "[";
        String[] inventory = this.returnInventory();
        int maxSize = this.returnMaxSize();
        for (int i = 0; i < maxSize; i++) {
            printLine = printLine + inventory[i] + ", ";
        }
        printLine = printLine.substring(0, printLine.length() - 2) + "]";
        return printLine;
    }

    // CHECKSTYLE: ALLOW THIS METHOD TO BE OVERRIDDEN
    @Override
    public boolean equals(Object o) {
        boolean check = true;
        String inventory = this.toString();
        String oInventory = o.toString();
        check = inventory.equals(oInventory);
        return check;
    }

    // CHECKSTYLE: ALLOW THIS METHOD TO BE OVERRIDDEN
    @Override
    public int hashCode() {
        int maxSize = this.returnMaxSize();
        return maxSize;
    }

    /*
     * Non Kernel Methods
     */

    // CHECKSTYLE: ALLOW THIS METHOD TO BE OVERRIDDEN
    @Override
    public void addItem(String itemName) {
        int maxSize = this.returnMaxSize();
        String[] inventory = this.returnInventory();
        assert (this.currentSize < maxSize);
        for (int i = 0; i < maxSize; i++) {
            if (inventory[i].equals("")) {
                inventory[i] = itemName;
                i = maxSize;
            }
        }
        this.currentSize = this.currentSize + 1;
    }

    // CHECKSTYLE: ALLOW THIS METHOD TO BE OVERRIDDEN
    @Override
    public String removeItem(String itemName) {
        int maxSize = this.returnMaxSize();
        String[] inventory = this.returnInventory();
        String itemReturned = "";
        for (int i = 0; i < maxSize; i++) {
            if (inventory[i].equals(itemName)) {
                itemReturned = inventory[i];
                inventory[i] = "";
                i = maxSize;
            }
        }
        this.currentSize = this.currentSize - 1;
        return itemReturned;
    }

    // CHECKSTYLE: ALLOW THIS METHOD TO BE OVERRIDDEN
    @Override
    public String getItem(String itemName) {
        int maxSize = this.returnMaxSize();
        String[] inventory = this.returnInventory();
        String itemReturned = "";
        for (int i = 0; i < maxSize; i++) {
            if (inventory[i].equals(itemName)) {
                itemReturned = inventory[i];
                i = maxSize;
            }
        }
        this.currentSize = this.currentSize - 1;
        return itemReturned;
    }

}
