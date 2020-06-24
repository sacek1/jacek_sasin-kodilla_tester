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

}
