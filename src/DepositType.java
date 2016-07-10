/**
 * Created by Shima Abbasi on 6/26/2016.
 */
public abstract class DepositType {
    protected static int interestRate;

    public static int getInterestRate() {
        return interestRate;
    }
    public static void setInterestRate(int interestRate) {
        DepositType.interestRate = interestRate;
    }
}
