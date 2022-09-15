package s3.w4;

public class Cooperative {

    public static void main(String[] args) {

        Member member = new Member("James", 10000, 0);

        member.addDebt(5000);

        member.addDebt(2000);

        member.payDebt(4000);

        System.out.println("");

        System.out.println(member.toString());

    }

}
