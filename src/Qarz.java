/**
 * Created by Shima Abbasi on 6/29/2016.
 */
public class Qarz extends DepositType {
    public Qarz() {
        super();
        set();
        get();
    }

    public int get() {
        return interestRate;
    }

    public void set() {
        super.interestRate = 0;
    }
}