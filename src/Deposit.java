import java.math.BigDecimal;

/**
 * Created by Shima Abbasi on 6/26/2016.
 */
public class Deposit {
    //-----objects---------------------
    DepositType depositTypeAssociation;

    //----parameters-----------
    public String customerNumber;
    private int durationInDays;
    private BigDecimal paidInterest;
    private BigDecimal depositBalance;
    //-----constructor-----------
    public Deposit(String customerNumber, int durationInDays, BigDecimal paidInterest, BigDecimal depositBalance) {
        this.customerNumber = customerNumber;
        this.durationInDays = durationInDays;
        this.paidInterest = paidInterest;
        this.depositBalance = depositBalance;
    }
    //------Association----------
    public DepositType getDepositTypeAssociation() {
        return depositTypeAssociation;
    }

    public void setDepositTypeAssociation(DepositType depositTypeAssociation) {
        this.depositTypeAssociation = depositTypeAssociation;
    }
    //------Getter Setter----------
    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public int getDurationInDays() {
        return durationInDays;
    }

    public void setDurationInDays(int durationInDays) {
        this.durationInDays = durationInDays;
    }

    public BigDecimal getPaidInterest() {
        return paidInterest;
    }

    public void setPaidInterest(BigDecimal paidInterest) {
        this.paidInterest = paidInterest;
    }

    public BigDecimal getDepositBalance() {
        return depositBalance;
    }

    public void setDepositBalance(BigDecimal depositBalance) {
        this.depositBalance = depositBalance;
    }

