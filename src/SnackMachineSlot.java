public class SnackMachineSlot {
    private String itemName;
    private double price;
    private int quantity;
    private int itemsSold;

    public SnackMachineSlot(String a, double b, int c) {

        itemName = a;

        if (b < 0) {
            price = 0.0;
        } else {
            price = b;
        }

        if (c < 0) {
            price = 0.0;
        } else {
            quantity = c;
        }

        itemsSold = 0;

    }

    public String toString() {
        return "" + "Item: " + itemName + "," + " price:" + price + "," + " In Stock: " + quantity;

    }

    public void purchaseOne() {
        if (quantity > 0) {
            quantity--;
            itemsSold++;
        }
        if (quantity == 0) {
            quantity = quantity; // wasnt sure how to make it return something in the void method
            itemsSold = itemsSold;
    
          

        }

    }

    public double getRevenue() {
        return itemsSold * price;

    }
}

