/**
 * Created by Shima Abbasi on 6/26/2016.
 */
public class Deposit {
    //-----objects---------------------
    DepositType depositTypeAssociation;

    //----parameters-----------
    public int customerNumber;
    int durationInDays = 10;
    public double paidInterest;
    public String depositBalance;
    // BigDecimal depositBalance_BD = new BigDecimal(depositBalance);

     public Deposit(int customerNumber, int durationInDays, double paidInterest) {
        this.customerNumber = customerNumber;
        this.durationInDays = durationInDays;
        this.paidInterest= paidInterest;

    }

    public Deposit() {
    }

    public DepositType getDepositTypeAssociation() {
        return depositTypeAssociation;
    }

    public void setDepositTypeAssociation(DepositType depositTypeAssociation) {
        this.depositTypeAssociation = depositTypeAssociation;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public int getDurationInDays() {
        return durationInDays;
    }

    public void setDurationInDays(int durationInDays) {
        this.durationInDays = durationInDays;
    }

    public double getPaidInterest() {
        return paidInterest;
    }

    public void setPaidInterest(double paidInterest) {
        this.paidInterest = paidInterest;
    }

    public String getDepositBalance() {
        return depositBalance;
    }

    public void setDepositBalance(String depositBalance) {
        this.depositBalance = depositBalance;
    }
}