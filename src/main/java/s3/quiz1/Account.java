package s3.quiz1;

import lombok.Getter;

@Getter
public class Account {


    private float balance;

    Account(float balance) {
        this.balance = balance;
    }

    Account() {
        this.balance = 0;
    }

    public void saveBalance(float amount) {
        balance += amount;
        System.out.printf("Saving Amount : %.2f \n", amount);
        System.out.printf("Your Balance Now : %.2f \n", balance);
    }

    public boolean withdrawBalance(float amount)  {
        if (amount > balance) return false; // TODO : Catch Another Business Exception Here
        balance -= amount;
        System.out.printf("Withdraw Amount : %.2f \n", amount);
        System.out.printf("Your Balance Now :%.2f \n", balance);
        return true;
    }


}
