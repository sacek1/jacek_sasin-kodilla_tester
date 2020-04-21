package com.kodilla.bank.homework;

public class CashMachine {

    private int[] deposits;
    private int[] withdrawals;
    private int depositSum;
    private int withdrawalSum;
    private int depositNumber;
    private int withdrawalNumber;

    public CashMachine() {
        this.depositSum = 0;
        this.withdrawalSum = 0;
        this.depositNumber = 0;
        this.withdrawalNumber = 0;
        this.deposits = new int[0];
        this.withdrawals = new int[0];
    }

    public void deposit(int value) {
        this.depositNumber++;
        int[] newTab = new int[this.depositNumber];
        System.arraycopy(deposits, 0, newTab, 0, deposits.length);
        newTab[this.depositNumber - 1] = value;
        this.deposits = newTab;
        depositSum = depositSum + value;
    }

    public void withdrawal(int value) {
        this.withdrawalNumber++;
        int[] newTab = new int[this.withdrawalNumber];
        System.arraycopy(withdrawals, 0, newTab, 0, withdrawals.length);
        newTab[this.withdrawalNumber - 1] = value;
        this.withdrawals = newTab;
        withdrawalSum = withdrawalSum + value;
    }

    public int[] getDeposits() {return deposits;}

    public int[] getWithdrawals() {return withdrawals;}

    public int getDepositNumber() {return depositNumber;}

    public int getWithdrawalNumber() {return withdrawalNumber;}

    public int getBalance() {
        if (this.deposits.length == 0 && this.withdrawals.length == 0) {
            return 0;
        }

        int balance = 0;
        balance = depositSum - withdrawalSum;

        return balance;
    }

    public int getDepositSum() {return depositSum;}

    public int getWithdrawalSum() {return withdrawalSum;}


}
