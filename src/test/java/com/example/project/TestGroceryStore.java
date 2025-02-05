package com.example.project;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.example.project.Grocery_Store.*;

public class TestGroceryStore{
    public static Product[] initialList;

    public static void setupProductArray() {
        Product p0 = new Product("cereal", 5);
        Product p1 = new Product("milk", 10);
        Product p2 = new Product("bread", 1);
        Product p3 = new Product("frozen pizza", 4);
        Product p4 = new Product("ice cream", 0);
        Product p5 = new Product("spaghetti", 6);
        Product p6 = new Product("muffins", 0);
        Product p7 = new Product("apples", 3);

        initialList = new Product[]{p0, p1, p2, p3, p4, p5, p6, p7};
    }

    @Test
    public void testReorderPARTA(){
        setupProductArray();
        GroceryStore store = new GroceryStore(initialList);
        ArrayList<Integer> toReorder = store.getReorderList(5);
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(0,2,3,4,6,7));
        assertEquals(toReorder,expected);

        ArrayList<Integer> toReorder2 = store.getReorderList(2);
        ArrayList<Integer> expected2 = new ArrayList<Integer>(Arrays.asList(2,4,6));
        assertEquals(toReorder2,expected2);
    }

    @Test
    public void testReorderPARTB(){
        setupProductArray();
        GroceryStore store = new GroceryStore(initialList);
        ArrayList<String> shoppingList1 = new ArrayList<String>(Arrays.asList("cereal", "bread", "apples", "spaghetti"));
        boolean allItemsAvailable = store.checkAvailability(shoppingList1);
        assertEquals(allItemsAvailable, true);
        ArrayList<String> shoppingList2 = new ArrayList<String>(Arrays.asList("cereal", "milk", "muffins", "apples"));
        boolean allItemsAvailable2 = store.checkAvailability(shoppingList2);
        assertEquals(allItemsAvailable2,false);
        ArrayList<String> shoppingList3 = new ArrayList<String>(Arrays.asList("ice cream", "frozen pizza", "muffins", "bread"));
        boolean allItemsAvailable3 = store.checkAvailability(shoppingList3);
        assertEquals(allItemsAvailable3,false);
    }
}
