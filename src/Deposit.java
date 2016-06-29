import java.math.BigDecimal;

/**
 * Created by Shima Abbasi on 6/26/2016.
 */
public class Deposit {
    //----parameters-----------
    int customerNumber, durationInDays, paidInterest;
    String depositBalance;
    BigDecimal depositBalance_BD = new BigDecimal(depositBalance);
    //-----objects---------------------
    Qarz qarzObject = new Qarz();
    ShortTerm shortTermObject = new ShortTerm();
    LongTerm longTermObject = new LongTerm();
    //--------------------------


}