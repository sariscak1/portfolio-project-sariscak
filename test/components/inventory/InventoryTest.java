package components.inventory;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class InventoryTest {

    @Test
    public void testAddItem1() {
        final int maxSize = 5;
        String[] expected = { "Sword", "", "", "", "" };
        Inventory n = new Inventory1(maxSize);

        n.addItem("Sword");

        assertEquals(Arrays.toString(expected), n.toString());
        assertEquals(expected.length, n.returnMaxSize());
    }

    @Test
    public void testAddItem2() {
        final int maxSize = 5;
        String[] expected = { "Sword", "Bug", "Bow", "Stone", "Arrow" };
        Inventory n = new Inventory1(maxSize);

        n.addItem("Sword");
        n.addItem("Bug");
        n.addItem("Bow");
        n.addItem("Stone");
        n.addItem("Arrow");

        assertEquals(Arrays.toString(expected), n.toString());
        assertEquals(expected.length, n.returnMaxSize());
    }

    @Test
    public void testRemoveItem1() {
        final int maxSize = 5;
        String[] expected = { "Sword", "Bug", "Bow", "Stone", "" };
        Inventory n = new Inventory1(maxSize);

        n.addItem("Sword");
        n.addItem("Bug");
        n.addItem("Bow");
        n.addItem("Stone");
        n.addItem("Arrow");

        n.removeItem("Arrow");

        assertEquals(Arrays.toString(expected), n.toString());
        assertEquals(expected.length, n.returnMaxSize());
    }

    @Test
    public void testRemoveItem2() {
        final int maxSize = 5;
        String[] expected = { "", "Bug", "", "Stone", "" };
        Inventory n = new Inventory1(maxSize);

        n.addItem("Sword");
        n.addItem("Bug");
        n.addItem("Bow");
        n.addItem("Stone");
        n.addItem("Arrow");

        n.removeItem("Arrow");
        n.removeItem("Bow");
        n.removeItem("Sword");

        assertEquals(Arrays.toString(expected), n.toString());
        assertEquals(expected.length, n.returnMaxSize());
    }

    @Test
    public void testRemoveItem3() {
        final int maxSize = 5;
        String[] expected = { "", "", "", "", "" };
        Inventory n = new Inventory1(maxSize);

        n.addItem("Sword");
        n.addItem("Bug");

        n.removeItem("Sword");
        n.removeItem("Bug");

        assertEquals(Arrays.toString(expected), n.toString());
        assertEquals(expected.length, n.returnMaxSize());
    }

    @Test
    public void testGetItem1() {
        final int maxSize = 5;
        String[] expected = { "Sword", "Bug", "", "", "" };
        String expectedItem = "Sword";
        Inventory n = new Inventory1(maxSize);

        n.addItem("Sword");
        n.addItem("Bug");

        String result = n.getItem("Sword");

        assertEquals(Arrays.toString(expected), n.toString());
        assertEquals(expected.length, n.returnMaxSize());
        assertEquals(expectedItem, result);
    }

    @Test
    public void testGetItem2() {
        final int maxSize = 5;
        String[] expected = { "Sword", "", "", "", "" };
        String expectedItem = "Sword";
        Inventory n = new Inventory1(maxSize);

        n.addItem("Sword");

        String result = n.getItem("Sword");

        assertEquals(Arrays.toString(expected), n.toString());
        assertEquals(expected.length, n.returnMaxSize());
        assertEquals(expectedItem, result);
    }
}
