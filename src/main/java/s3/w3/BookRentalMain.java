package s3.w3;

public class BookRentalMain {

    public static void main(String[] args) {

        BookRentalMember member = new BookRentalMember(1, "John", "Denver");
        BookRentalItem item = new BookRentalItem("Data Structures In Java", 10);
        BookRental bookRental = new BookRental(member, item, "2022-09-08", "2022-09-10");
        float price = bookRental.getTotalPrice();
        System.out.printf("Total Price : %.0f", price);

    }

}
