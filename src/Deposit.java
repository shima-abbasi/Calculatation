import java.math.BigDecimal;

/**
 * Created by Shima Abbasi on 6/26/2016.
 */
public class Deposit {
<<<<<<< HEAD

    //----parameters-----------
   public int customerNumber, durationInDays;
   public double paidInterest;
   public  String depositBalance;
   BigDecimal depositBalance_BD = new BigDecimal(depositBalance);

    public Deposit() {
        int customerNumber ;
        int durationInDays ;
        BigDecimal depositBalance_BD;
    }

    //-----objects---------------------
    DepositType depositType_OB = new DepositType();
    //-----methods----------------
         public Double Calculate (){
        return paidInterest = (depositType_OB.interestRate * durationInDays)/ 3600 ;
     }
=======
    //----parameters-----------
    int customerNumber, durationInDays, paidInterest;
    String depositBalance;
    BigDecimal depositBalance_BD = new BigDecimal(depositBalance);
    //-----objects---------------------
    Qarz qarzObject = new Qarz();
    ShortTerm shortTermObject = new ShortTerm();
    LongTerm longTermObject = new LongTerm();
    //--------------------------

>>>>>>> origin/master

}