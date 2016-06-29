import java.math.BigDecimal;

/**
 * Created by Shima Abbasi on 6/26/2016.
 */
public class Deposit {

    //----parameters-----------
    int customerNumber, durationInDays;
    double paidInterest;
    String depositBalance;
    BigDecimal depositBalance_BD = new BigDecimal(depositBalance);

    //-----objects---------------------
    DepositType depositType_ob = new DepositType()
            ;
    //-----methods----------------
    public Double Calculate (){
        return paidInterest = (depositType_ob.interestRate * durationInDays)/ 3600 ;
      }

}