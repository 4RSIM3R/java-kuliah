package s3.midtest;

public class Main {

    public static void main(String[] args) {

        Book book = new Book("isbn-123", "The Book", 10, 1);
        Customer customer = new Customer("customer-123", "John", "California");
        Cashier cashier = new Cashier("employee-123", "Travolta", "California", "123", "Men", 0, 10);

        Transaction transaction = new Transaction("transaction-123", "27/10/2022", customer, book, cashier);

        transaction.info();


    }

}
