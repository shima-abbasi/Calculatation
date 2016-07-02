/**
 * Created by Shima Abbasi on 6/29/2016.
 */
public class ShortTerm extends DepositType{
    public ShortTerm(){
        super();
        set();
        get();
    }

    public int get () {
        return  interestRate;
    }
    public void set() {
        super.interestRate = 10;
    }
}

