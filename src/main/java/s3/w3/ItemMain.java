package s3.w3;

public class ItemMain {

    public static void main(String[] args) {
        Item item = new Item(10, "Milk", "Diary");
        item.addStock(10);
        item.showInfo();
    }

}
