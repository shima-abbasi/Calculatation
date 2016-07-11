/**
 * Created by Shima Abbasi on 6/26/2016.
 */
public abstract class DepositType {

    protected int interestRate =  getInterestRate();

    public abstract int getInterestRate();
}
