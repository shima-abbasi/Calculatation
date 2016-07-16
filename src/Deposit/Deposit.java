package Deposit;

import Exceptions.IncorrectValueExceptions;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by Shima Abbasi on 6/26/2016.
 */
public class Deposit implements Comparable<Deposit> {
    //-----Association---------------------
    DepositType depositTypeAssociation;

    public DepositType getDepositTypeAssociation() {
        return depositTypeAssociation;
    }

    public void setDepositTypeAssociation(DepositType depositTypeAssociation) {
        this.depositTypeAssociation = depositTypeAssociation;
    }

    //----parameters-----------


    private String customerNumber;
    private BigDecimal durationInDays;
    private BigDecimal paidInterest;
    private BigDecimal depositBalance;
    private String depositType;
    private BigDecimal interestRate;


    //-----constructor-----------
    public Deposit(String customerNumber, String depositType, BigDecimal depositBalance, BigDecimal durationInDays) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IncorrectValueExceptions {
        setCustomerNumber(customerNumber);
        setDepositType(depositType);
        setDepositBalance(depositBalance);
        setDurationInDays(durationInDays);
        setInterestRate();
        setPaidInterest();
    }

    //------Getter Setter----------
    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }


    public void setDepositType(String depositType) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class loadClassType = Class.forName(depositType);
        this.depositTypeAssociation = (DepositType) loadClassType.newInstance();
    }

    public void setDepositBalance(BigDecimal depositBalance) throws IncorrectValueExceptions{
        if(depositBalance.compareTo(BigDecimal.ZERO)<0)
           throw  new  IncorrectValueExceptions("Deposit Balance value ins not correct");
        this.depositBalance = depositBalance;
    }

    public void setDurationInDays(BigDecimal durationInDays) throws  IncorrectValueExceptions{
        if (durationInDays.compareTo(BigDecimal.ZERO) > 0)
            throw  new IncorrectValueExceptions("Duration In Days value is not correct");

        this.durationInDays = durationInDays;
    }

    public void setPaidInterest() {
        this.paidInterest = (interestRate.multiply(depositBalance).multiply(durationInDays)).divide(BigDecimal.valueOf(36500), RoundingMode.HALF_DOWN);
    }

    public BigDecimal getPaidInterest() {
        return paidInterest;
    }


    public void setInterestRate() {
        interestRate = BigDecimal.valueOf(depositTypeAssociation.getInterestRate());
    }

    @Override
    public int compareTo(Deposit deposits) {
        return paidInterest.compareTo(deposits.paidInterest);
    }

}

