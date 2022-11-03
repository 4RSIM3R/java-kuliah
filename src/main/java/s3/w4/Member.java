package s3.w4;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import utils.CurrencyUtils;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Member {

    private String name;
    private int limit;
    private int debt;

    public void addDebt(int amount) {
        int temp = debt + amount;
        if (temp > limit) {
            System.out.println("You are reaching limit");
        } else {
            debt += amount;
            System.out.printf("Your debt now is : %s \n", CurrencyUtils.getRupiahFormat().format(debt));
        }
    }

    public void payDebt(int amount) throws Exception {
        if (amount < getMinimalPaymentDebt()) {
            throw new Exception("please follow the minimum debt payment");
        }

        System.out.printf("Pay debt : %s \n", CurrencyUtils.getRupiahFormat().format(amount));
        debt -= amount;
        System.out.printf("Your loan now is : %s \n", CurrencyUtils.getRupiahFormat().format(debt));
    }

    private int getMinimalPaymentDebt() {
        return (int) (debt * 0.07);
    }

    @Override
    public String toString() {
        return String.format("Name : %s \nDebt : %s \nLimit: %s", name, CurrencyUtils.getRupiahFormat().format(debt), CurrencyUtils.getRupiahFormat().format(limit));
    }
}
