/**
 * Created by Shima Abbasi on 6/29/2016.
 */
public class LongTerm extends DepositType {
    public LongTerm() {
        super();
        set();
        get();
    }

    public int get() {
        return interestRate;
    }

    public void set() {
        super.interestRate = 20;
    }
}
