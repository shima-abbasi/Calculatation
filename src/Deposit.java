/**
 * Created by Shima Abbasi on 6/26/2016.
 */
public class Deposit {

    //----parameters-----------
    public int customerNumber, durationInDays;
    public double paidInterest;
    public String depositBalance;
    // BigDecimal depositBalance_BD = new BigDecimal(depositBalance);

     public Deposit(int customerNumber, int durationInDays, double paidInterest) {
        this.customerNumber = customerNumber;
        this.durationInDays = durationInDays;
        this.paidInterest= paidInterest;

    }

    //-----objects---------------------
  //  DepositType depositType_OB = new DepositType();

    //-----methods----------------
   // public Double Calculate() {
}