package s2.midtest;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.Random;

public class Bank {

    public static ArrayList<Customer> customers = new ArrayList<>();
    static Faker faker = new Faker();
    static Random random = new Random();

    public static void main(String[] args) {
        seedCustomer();
        int resultIndex = findCustomerBySSN(2222, 0, customers.size() - 1);
        if (resultIndex != -1) showCustomerByIndex(resultIndex);

        System.out.println("\n======Sorted Customer========\n");

        sortCustomerByBalance();
        showAllCustomer();
    }


    public static int findCustomerBySSN(int ssn, int left, int right) {
        int middle = (left +right) / 2;
       if (right >= left) {
           if (customers.get(middle).getSsn() == ssn) {
               return middle;
           } else if (customers.get(middle).getSsn() > ssn) {
               return findCustomerBySSN(ssn, left, middle - left);
           } else {
               return findCustomerBySSN(ssn, middle + left, right);
           }
       } else {
            return -1;
        }
    }

    public static void sortCustomerByBalance() {
        for (int i = 1; i < customers.size(); i++) {
            int j = i;
            while ((j > 0) && (customers.get(j - 1).getBalance() < customers.get(j).getBalance())) {
                Customer tempCustomer = customers.get(j);
                customers.set(j, customers.get(j - 1));
                customers.set(j - 1, tempCustomer);
                j--;
            }
        }
    }

    public static void showCustomerByIndex(int index) {
        Customer customer = customers.get(index);
        customer.show();
    }

    public static void showAllCustomer() {
        for (Customer customer : customers) {
            customer.show();
        }
    }

    public static void seedCustomer() {
        for (int i = 0; i < 6; i++) {
            String name = faker.name().username();
            String accountNumber = faker.business().creditCardNumber();
            int age = random.nextInt((50 - 18) + 1) + 18;
            double balance = random.nextDouble() * 1000;
            customers.add(new Customer(accountNumber, name, Dummy.ssn[i], age, balance));
        }
    }

}
