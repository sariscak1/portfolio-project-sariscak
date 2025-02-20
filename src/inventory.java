import java.util.Arrays;

public class inventory {
    //Class variables

    /* Representation of the inventory */
    private String[] inventory;

    private int currentSize;

    private int maxSize;

    //Constructors

    /*
     * Constructor with empty inventory
     *
     * @param maxSize, designates the maximum size of the inventory
     */
    public inventory(int maxSize) {
        this.maxSize = maxSize;
        this.inventory = new String[maxSize];
        Arrays.fill(this.inventory, "");
    }

    //Kernel Methods

    /*
     * returns the current inventory as an array of strings
     */
    public String[] returnInventory() {
        return this.inventory;
    }

    /*
     * returns whether or not the inventory is empty
     */
    public boolean isEmpty() {
        return this.currentSize == 0;
    }

    /*
     * returns whether of not the inventory is full
     */
    public boolean isFull() {
        return this.currentSize == this.maxSize;
    }

    //Secondary Methods

    /*
     * adds an "item" (just a string of the name for now)
     *
     * @param itemName, the name of the item you are putting into the inventory
     *
     * @requires, this.currentSize > this.maxSize
     */
    public void addItem(String itemName) {
        assert (this.currentSize < this.maxSize);

        for (int i = 0; i < this.maxSize; i++) {
            if (this.inventory[i].equals("")) {
                this.inventory[i] = itemName;
                i = this.maxSize;
            }
        }
        this.currentSize = this.currentSize + 1;
    }

    /*
     * removes an item based off a name and returns the item (just the name as a
     * string for now)
     *
     * @param itemName, the name of the item you are trying to remove
     *
     * @requires, item to be in the inventory
     */
    public String removeItem(String itemName) {
        String itemReturned = "";
        for (int i = 0; i < this.maxSize; i++) {
            if (this.inventory[i].equals(itemName)) {
                itemReturned = this.inventory[i];
                this.inventory[i] = "";
                i = this.maxSize;
            }
        }
        this.currentSize = this.currentSize - 1;
        return itemReturned;
    }

    /*
     * returns an item based off of its name (just returns the name for now)
     *
     * @param itemName, the name of the item you want returned
     *
     * @requres, item to be in the inventory
     */
    public String getItem(String itemName) {
        String itemReturned = "";
        for (int i = 0; i < this.maxSize; i++) {
            if (this.inventory[i].equals(itemName)) {
                itemReturned = this.inventory[i];
                i = this.maxSize;
            }
        }
        this.currentSize = this.currentSize - 1;
        return itemReturned;
    }

    /*
     * prints the inventory to the terminal
     */
    public void print() {
        String printLine = "{";
        for (int i = 0; i < this.maxSize; i++) {
            printLine = printLine + this.inventory[i] + ", ";
        }
        printLine = printLine.substring(0, printLine.length() - 2) + "}";
        System.out.println(printLine);
    }

}