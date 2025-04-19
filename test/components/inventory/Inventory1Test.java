package components.inventory;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class Inventory1Test {

    @Test
    public void testCreateNewRep1() {
        final int maxSize = 5;
        String[] expected = { "", "", "", "", "" };
        Inventory n = new Inventory1(maxSize);

        assertEquals(Arrays.toString(expected), n.toString());
        assertEquals(expected.length, n.returnMaxSize());
    }

    @Test
    public void testCreateNewRep2() {
        final int maxSize = 15;
        String[] expected = { "", "", "", "", "", "", "", "", "", "", "", "",
                "", "", "" };
        Inventory n = new Inventory1(maxSize);

        assertEquals(Arrays.toString(expected), n.toString());
        assertEquals(expected.length, n.returnMaxSize());
    }

    @Test
    public void testReturnInventoryRegular() {
        final int maxSize = 8;
        String[] expected = { "Sword", "Shield", "Bow", "", "", "", "", "" };
        Inventory n = new Inventory1(maxSize);

        n.addItem("Sword");
        n.addItem("Shield");
        n.addItem("Bow");

        assertEquals(Arrays.toString(expected), n.toString());
        assertEquals(expected.length, n.returnMaxSize());
    }

    @Test
    public void testReturnInventoryFull() {
        final int maxSize = 8;
        String[] expected = { "Sword", "Shield", "Bow", "Ice Bow",
                "Flame Sword", "Luck Charm", "Sand", "Wood" };
        Inventory n = new Inventory1(maxSize);

        n.addItem("Sword");
        n.addItem("Shield");
        n.addItem("Bow");
        n.addItem("Ice Bow");
        n.addItem("Flame Sword");
        n.addItem("Luck Charm");
        n.addItem("Sand");
        n.addItem("Wood");

        assertEquals(Arrays.toString(expected), n.toString());
        assertEquals(expected.length, n.returnMaxSize());
    }

    @Test
    public void testReturnMaxSize1() {
        final int maxSize = 8;
        final int expectedMaxSize = 8;
        Inventory n = new Inventory1(maxSize);

        assertEquals(expectedMaxSize, n.returnMaxSize());
    }

    @Test
    public void testReturnMaxSize2() {
        final int maxSize = 500;
        final int expectedMaxSize = 500;
        Inventory n = new Inventory1(maxSize);

        assertEquals(expectedMaxSize, n.returnMaxSize());
    }

    @Test
    public void testReturnMaxSize3() {
        final int maxSize = 0;
        final int expectedMaxSize = 0;
        Inventory n = new Inventory1(maxSize);

        assertEquals(expectedMaxSize, n.returnMaxSize());
    }

    @Test
    public void testIsEmpty1() {
        final int maxSize = 8;
        final boolean expected = false;
        Inventory n = new Inventory1(maxSize);

        n.addItem("Sword");
        n.addItem("Shield");
        n.addItem("Bow");
        n.addItem("Ice Bow");
        n.addItem("Flame Sword");
        n.addItem("Luck Charm");
        n.addItem("Sand");
        n.addItem("Wood");

        assertEquals(expected, n.isEmpty());
    }

    @Test
    public void testIsEmpty2() {
        final int maxSize = 8;
        final boolean expected = false;
        Inventory n = new Inventory1(maxSize);

        n.addItem("Sword");
        n.addItem("Shield");
        n.addItem("Bow");
        n.addItem("Ice Bow");
        n.addItem("Flame Sword");

        assertEquals(expected, n.isEmpty());
    }

    @Test
    public void testIsEmpty3() {
        final int maxSize = 8;
        final boolean expected = true;
        Inventory n = new Inventory1(maxSize);

        assertEquals(expected, n.isEmpty());
    }

    @Test
    public void testIsEmpty4() {
        final int maxSize = 8;
        final boolean expected = false;
        Inventory n = new Inventory1(maxSize);

        n.addItem("Sword");
        n.addItem("Shield");
        n.addItem("Bow");
        n.addItem("Ice Bow");
        n.addItem("Flame Sword");

        n.removeItem("Sword");
        n.removeItem("Bow");

        assertEquals(expected, n.isEmpty());
    }

    @Test
    public void testIsEmpty5() {
        final int maxSize = 8;
        final boolean expected = true;
        Inventory n = new Inventory1(maxSize);

        n.addItem("Sword");
        n.addItem("Shield");
        n.addItem("Bow");

        n.removeItem("Sword");
        n.removeItem("Shield");
        n.removeItem("Bow");

        assertEquals(expected, n.isEmpty());
    }

    @Test
    public void testIsFull1() {
        final int maxSize = 8;
        final boolean expected = true;
        Inventory n = new Inventory1(maxSize);

        n.addItem("Sword");
        n.addItem("Shield");
        n.addItem("Bow");
        n.addItem("Ice Bow");
        n.addItem("Flame Sword");
        n.addItem("Luck Charm");
        n.addItem("Sand");
        n.addItem("Wood");

        assertEquals(expected, n.isFull());
    }

    @Test
    public void testIsFull2() {
        final int maxSize = 8;
        final boolean expected = false;
        Inventory n = new Inventory1(maxSize);

        n.addItem("Sword");
        n.addItem("Shield");
        n.addItem("Bow");
        n.addItem("Ice Bow");

        assertEquals(expected, n.isFull());
    }

    @Test
    public void testIsFull3() {
        final int maxSize = 8;
        final boolean expected = false;
        Inventory n = new Inventory1(maxSize);

        assertEquals(expected, n.isFull());
    }

    @Test
    public void testIsFull4() {
        final int maxSize = 8;
        final boolean expected = false;
        Inventory n = new Inventory1(maxSize);

        n.addItem("Sword");
        n.addItem("Shield");
        n.addItem("Bow");
        n.addItem("Ice Bow");
        n.addItem("Flame Sword");
        n.addItem("Luck Charm");
        n.addItem("Sand");
        n.addItem("Wood");

        n.removeItem("Wood");

        assertEquals(expected, n.isFull());
    }

    @Test
    public void testIsFull5() {
        final int maxSize = 8;
        final boolean expected = true;
        Inventory n = new Inventory1(maxSize);

        n.addItem("Sword");
        n.addItem("Shield");
        n.addItem("Bow");
        n.addItem("Ice Bow");
        n.addItem("Flame Sword");
        n.addItem("Luck Charm");
        n.addItem("Sand");
        n.addItem("Wood");

        n.removeItem("Bow");
        n.removeItem("Wood");

        n.addItem("Cheese");
        n.addItem("Stone");

        assertEquals(expected, n.isFull());
    }
}
