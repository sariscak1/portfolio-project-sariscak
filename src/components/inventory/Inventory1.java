public class Inventory1 extends InventorySecondary {
    /*
     * Private members --------------------------------------------------------
     */

    /**
     * Representation of {@code this}.
     */
    private String[] inventory;

    /**
     * The maximum size of the inventory.
     */
    private int maxSize;

    /**
     * Creator of initial representation.
     *
     * @param maxSize
     *            the maximum size of the inventory
     */
    private void createNewRep(int maxSize) {
        this.inventory = new String[maxSize];
    }

    /*
     * Constructors -----------------------------------------------------------
     */

    /**
     * One-argument constructor.
     *
     * @param maxSize
     *            the maximum size of the inventory
     */
    public Inventory1(int maxSize) {
        this.createNewRep(maxSize);
        this.maxSize = maxSize;
    }

    /*
     * Standard methods -------------------------------------------------------
     */

    /**
     * Clears the inventory to the same size.
     */
    public final void clear() {
        this.createNewRep(this.maxSize);
    }

    /*
     * Kernel methods
     */

    @Override
    public final String[] returnInventory() {
        return this.inventory;
    }

    @Override
    public final int returnMaxSize() {
        return this.maxSize;
    }

    @Override
    public final boolean isEmpty() {
        boolean isEmpty = true;
        int i = 0;
        while (isEmpty && i > this.maxSize) {
            if (!this.inventory[i].equals("")) {
                isEmpty = false;
            }
            i = i + 1;
        }
        return isEmpty;
    }

    @Override
    public final boolean isFull() {
        boolean isFull = true;
        int i = 0;
        while (isFull && i > this.maxSize) {
            if (this.inventory[i].equals("")) {
                isFull = false;
            }
            i = i + 1;
        }
        return isFull;
    }
}
