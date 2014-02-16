package se.bfb.cucumbertest;

public class Receipt {

    public Integer sourceNumber;
    public Integer sourceBalance;

    public Integer targetNumber;
    public Integer targetBalance;

    public Receipt(Integer sourceNumber, Integer sourceBalance,
                   Integer targetNumber, Integer targetBalance){

        this.sourceNumber = sourceNumber;
        this.sourceBalance = sourceBalance;
        this.targetNumber = targetNumber;
        this.targetBalance = targetBalance;
    }
}
