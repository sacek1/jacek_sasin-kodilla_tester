package com.kodilla.bank.homework;

public class Bank {

    private CashMachine[] cashMachines;

    public Bank(CashMachine[] cashMachines) {
        this.cashMachines = cashMachines;
    }


    public int getBalanceAll() {
        int s = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            s += cashMachines[i].getBalance();
        }
        return s;
    }

    public int getNumberOfDeposits() {
        int s = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            s += cashMachines[i].getDepositNumber();
        }
        return s;
    }
//
//    public int getNumberOfWithdrawals() {
//        int numberOfWithdrawals = this.cM1.getWithdrawalNumber() + this.cM2.getWithdrawalNumber() + this.cM3.getWithdrawalNumber();
//        return numberOfWithdrawals;
//    }
//
//    public double getDepositAverage() {
//        double depositSum = this.cM1.getDepositSum() + this.cM2.getDepositSum() + this.cM3.getDepositSum();
//        double numberOfDeposits = this.cM1.getDepositNumber() + this.cM2.getDepositNumber() + this.cM3.getDepositNumber();
//        double depositAverage = depositSum/numberOfDeposits;
//        return depositAverage;
//    }
//
//    public double getWithdrawalAverage() {
//        double withdrawalSum = this.cM1.getWithdrawalSum() + this.cM2.getWithdrawalSum() + this.cM3.getWithdrawalSum();
//        double numberOfWithdrawals = this.cM1.getWithdrawalNumber() + this.cM2.getWithdrawalNumber() + this.cM3.getWithdrawalNumber();
//        double withdrawalAverage = withdrawalSum/numberOfWithdrawals;
//        return withdrawalAverage;
//    }

}
