package s3.quiz1;

public class Main {

    public static void main(String[] args) throws Exception {

        Customer customer = new Customer("John", "Hammond");
        Account johnAccount = new Account(1000);

        customer.setAccount(johnAccount);

        System.out.printf("Customer Full Name : %s %s \n", customer.getFirstName(), customer.getLastName());
        System.out.printf("Customer Balance : %.2f \n", customer.getAccount().getBalance());

        customer.getAccount().saveBalance(200);

        catchNotEnoughBalance(!customer.getAccount().withdrawBalance(500));

        catchNotEnoughBalance(!customer.getAccount().withdrawBalance(100));

        customer.getAccount().saveBalance(200);

    }

    public static void catchNotEnoughBalance(boolean isNotEnough) {
        if (isNotEnough) System.out.println("Your Balance Is Not Enough For Withdrawal");
    }

}
