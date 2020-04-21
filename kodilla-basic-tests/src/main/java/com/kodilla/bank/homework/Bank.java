package com.kodilla.bank.homework;

public class Bank {

    private CashMachine cM1;
    private CashMachine cM2;
    private CashMachine cM3;

    public Bank(){
        this.cM1 = new CashMachine();
        this.cM2 = new CashMachine();
        this.cM3 = new CashMachine();
    }


    public void depositCM1(int value) {
        if (value > 0 && value <= 4000 && value%10 == 0) {
            this.cM1.deposit(value);
        }
    }

    public void depositCM2(int value) {
        if (value > 0 && value <= 4000 && value%10 == 0) {
            this.cM2.deposit(value);
        }
    }

    public void depositCM3(int value) {
        if (value > 0 && value <= 4000 && value%10 == 0) {
            this.cM3.deposit(value);
        }
    }

    public void withdrawalCM1(int value) {
        if (value > 0 && value <= 4000 && value%10 == 0) {
            this.cM1.withdrawal(value);
        }
    }

    public void withdrawalCM2(int value) {
        if (value > 0 && value <= 4000 && value%10 == 0) {
            this.cM2.withdrawal(value);
        }
    }

    public void withdrawalCM3(int value) {
        if (value > 0 && value <= 4000 && value%10 == 0) {
            this.cM3.withdrawal(value);
        }
    }

    public int getCM1Balance() {
        return this.cM1.getBalance();
    }

    public int getCM2Balance() {
        return this.cM2.getBalance();
    }

    public int getCM3Balance() {
        return this.cM3.getBalance();
    }

    public int getBalanceAll() {
        int balanceAll = this.cM1.getBalance() + this.cM2.getBalance() + this.cM3.getBalance();
        return balanceAll;
    }

    public int getNumberOfDeposits() {
        int numberOfDeposits = this.cM1.getDepositNumber() + this.cM2.getDepositNumber() + this.cM3.getDepositNumber();
        return numberOfDeposits;
    }

    public int getNumberOfWithdrawals() {
        int numberOfWithdrawals = this.cM1.getWithdrawalNumber() + this.cM2.getWithdrawalNumber() + this.cM3.getWithdrawalNumber();
        return numberOfWithdrawals;
    }

    public double getDepositAverage() {
        double depositSum = this.cM1.getDepositSum() + this.cM2.getDepositSum() + this.cM3.getDepositSum();
        double numberOfDeposits = this.cM1.getDepositNumber() + this.cM2.getDepositNumber() + this.cM3.getDepositNumber();
        double depositAverage = depositSum/numberOfDeposits;
        return depositAverage;
    }

    public double getWithdrawalAverage() {
        double withdrawalSum = this.cM1.getWithdrawalSum() + this.cM2.getWithdrawalSum() + this.cM3.getWithdrawalSum();
        double numberOfWithdrawals = this.cM1.getWithdrawalNumber() + this.cM2.getWithdrawalNumber() + this.cM3.getWithdrawalNumber();
        double withdrawalAverage = withdrawalSum/numberOfWithdrawals;
        return withdrawalAverage;
    }

}
