package replIt.Repl_235;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TJMaxx {
    /**
     * Private lists to hold regular Item objects
     * and OnSaleItem objects that represent items that sell in TJMaxx
     */
    private List<Item> regularItems;
    private List<OnSaleItem> onSaleItems;

    /**
     * Public no-args constructor - Instantiates regularItems and onSaleItems lists
     * as new ArrayList
     */
    public TJMaxx() {
        //TODO
        List<Item> regularItems = new ArrayList<>();
        List<OnSaleItem> onSaleItems=new ArrayList<>();
    }

    /**
     * adds an item object to regularItems list
     * @param item
     */
    public void addRegularItem(Item item) {
        regularItems.add(item);

    }

    /**
     * adds OnSaleItem object to onSaleItems list
     * @param item
     */
    public void addOnSaleItem(OnSaleItem item) {
        onSaleItems.add(item);

    }

    /**
     * getter for regularItems
     * @return
     */
    public List<Item> getRegularItems() {
        return regularItems;
    }

    /**
     * getter for onSaleItems
     * @return
     */
    public List<OnSaleItem> getOnSaleItems() {
        return onSaleItems;
    }

    /**
     * return count of regularItem object
     * @return
     */
    public int regularItemsCount() {
        return regularItems.size();
    }

    /**
     * returns count of onSaleItems in TJ Maxx
     * @return
     */
    public int onSaleItemsCount() {
        return onSaleItems.size();
    }

    /**
     * returns the name of each item in TJ Maxx starting
     * from regular item then onSaleItems
     * @return
     */
    public List<String> getAllItemNames() {
        List<String> allItemNames= new ArrayList<>();
        for ( Item each: regularItems ) {
            allItemNames.add(each.getName());
        }
        for (OnSaleItem each : onSaleItems) {
            allItemNames.add(each.getName());
        }
//        for (int i = 0; i < onSaleItems.size(); i++) {
//            allItemNames.add(onSaleItems.get(i).getName());
//        }

        return allItemNames;
    }

    /**
     * gets catalog number and returns price for the item
     * it will search for the item both regularItems and onsaleonSaleItems
     * @param catalogNumber
     * @returns 0.0 if product cannot be found with that catalognumber
     */
    public double getItemPrice(int catalogNumber)
    {
        for ( Item each: regularItems ) {
            if (each.getCatalogNumber()==catalogNumber){
                return each.getPrice();
            }
        }
        for (OnSaleItem each : onSaleItems) {
            if (each.getCatalogNumber()==catalogNumber){
                return each.getPrice();
            }
        }

        // at what point we come here ??? if nothing found!!
        return 0.0;
//        List<Item> allItems=new ArrayList<>(regularItems);
//        allItems.addAll(onSaleItems);
//        for (Item each:allItems){
//            if (catalogNumber==each.getCatalogNumber()){
//                return each.getPrice();
//            }
//        }
//        return 0.0;
    }

    /**
     * accepts a name then searches
     * amoung onSaleItems. Once it finds, the method will return
     * that OnSaleItem object
     * @param name
     * @return
     */
    public OnSaleItem getOnSaleItem(String name)
    {
        for (OnSaleItem each : onSaleItems) {
            if (each.getName().equals(name)){
                return each;
            }
        }

        return null;
    }

    /**
     * removes the item with matching catalogNumber
     * from both regularItems and onSaleItems.
     * Does nothing if not found
     * @param catalogNumber
     */
    public void removeItem(int catalogNumber) {
       // int targetIndex=-1;


        for (int i=0;  i<regularItems.size(); i++) {
            if (regularItems.get(i).getCatalogNumber()==catalogNumber){
                regularItems.remove(i);
                --i; // shift the index so we can stay same
            }
        }
        for (int i=0;  i<onSaleItems.size(); i++) {
            if (onSaleItems.get(i).getCatalogNumber()==catalogNumber){
                onSaleItems.remove(i);
                --i; // shift the index so we can stay same
            }
        }
    }

    /**
     * - it accepts a catalog number and finds that item
     * among regularItems and onSaleItems
     * - if it finds the item:
     *   - decrease the count of the Item by 1
     *   - if count reaches 0 after decrementing then remove the product(call removeItem method)
     *
     * @param catalogNumber
     */
    public void buyItem(int catalogNumber) {
        for (int i=0;i<regularItems.size();i++) {
            if (regularItems.get(i).getCatalogNumber() == catalogNumber) {
                regularItems.get(i).setQuantity(regularItems.get(i).getQuantity() - 1);
                if (regularItems.get(i).getQuantity() == 0) {
                    removeItem(catalogNumber);
                }
            }


        }
    }
}
