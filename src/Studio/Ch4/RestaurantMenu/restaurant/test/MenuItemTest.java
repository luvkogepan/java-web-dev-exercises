package Studio.Ch4.RestaurantMenu.restaurant.test;

import Studio.Ch4.RestaurantMenu.restaurant.main.MenuItem;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class MenuItemTest {

    private MenuItem genericItem;

    @Before
    public void setUp() {
        genericItem = new MenuItem(42, "chili", "soups");
    }

    //isNew returns false after 30 days
    @Test
    public void testIsNewReturnsFalseAfterThirtyDays() {
        Date notSoRecently = new Date(2021-1900, 11, 25);

        MenuItem item = new MenuItem(42, "chili", "soups");

        assertFalse(item.isNew());
    }

    //isNew returns true before 30 days
    @Test
    public void testIsNewReturnsTrueBeforeThirtyDays() {
        Date recently = new Date(2022-1900, 0, 5);

        MenuItem item = new MenuItem(42, "chili", "soups");

        assertTrue(item.isNew());
    }

    //first constructor sets proper fields
    @Test
    public void testConstructorSetsMainFields() {
        //arrange
        double price = 42;
        String description = "chili";
        String category = "soups";
        //act
        MenuItem item = new MenuItem(price, description, category);
        //assert
        assertEquals(price, item.getPrice(), .01);
        assertEquals(description, item.getDescription());
        assertEquals(category, item.getCategory());
    }

    //first constructor sets creation date to now
    @Test
    public void testConstructorSetsCreatedToNowByDefault() {
        Date now = new Date();

        //MenuItem item = new MenuItem(42, "chili", "soups");

        assertTrue(now.getTime() - genericItem.getCreated().getTime() < 1000);
    }

    //second constructor sets custom creation date

    //.equals compares description and price
    @Test
    public void testEqualsIsTrueForSamePrimaryFields() {
        MenuItem anotherItem = new MenuItem(genericItem.getPrice(), genericItem.getDescription(), genericItem.getCategory());
        assertEquals(anotherItem, genericItem);
        //assertTrue(anotherItem.equals(genericItem));
    }

    @Test
    public void testEqualsIsFalseForDifferentPrices() {

    }

}
