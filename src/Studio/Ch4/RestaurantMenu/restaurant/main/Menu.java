package Studio.Ch4.RestaurantMenu.restaurant.main;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    /*
    -Arraylist of menuItems
    -boolean isNew
    -menu lastUpdated String
    addItem method would update lastUpdated
     */
    private static Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu() {
        this.lastUpdated = new Date();
        this.items = new ArrayList<>();
    }

//    public void getItems() {
//        for (MenuItem i : items) {
//            System.out.println(i.getItem());
//        }
//    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public void setItems(MenuItem item) {
        this.items.add(item);
    }
}
