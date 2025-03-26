public abstract class InventorySecondary implements Inventory {
    /*
     * Common Methods
     */

    // CHECKSTYLE: ALLOW THIS METHOD TO BE OVERRIDDEN
    @Override
    public String toString() {
        String printLine = "{";
        for (int i = 0; i < this.maxSize; i++) {
            printLine = printLine + this.inventory[i] + ", ";
        }
        printLine = printLine.substring(0, printLine.length() - 2) + "}";
        return printLine;
    }

    // CHECKSTYLE: ALLOW THIS METHOD TO BE OVERRIDDEN
    @Override
    public boolean equals(Object o) {
        boolean check = true;
        try {
            for (int i = 0; i < this.maxSize; i++) {
                if (!this.inventory[i].equals(o.inventory[i])) {
                    check = false;
                }
            }
        } catch (Exception e) {
            check = false;
        }

        return check;
    }

    // CHECKSTYLE: ALLOW THIS METHOD TO BE OVERRIDDEN
    @Override
    public int hashCode() {
        return this.maxSize;
    }

    /*
     * Non Kernel Methods
     */

    // CHECKSTYLE: ALLOW THIS METHOD TO BE OVERRIDDEN
    @Override
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

    // CHECKSTYLE: ALLOW THIS METHOD TO BE OVERRIDDEN
    @Override
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

    // CHECKSTYLE: ALLOW THIS METHOD TO BE OVERRIDDEN
    @Override
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

}
