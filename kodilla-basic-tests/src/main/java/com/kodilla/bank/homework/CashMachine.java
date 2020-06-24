package com.kodilla.bank.homework;

public class CashMachine {

    private int[] deposits;
    private int[] withdrawals;



    public CashMachine() {
        this.deposits = new int[0];
        this.withdrawals = new int[0];
    }

    public void deposit(int value) {
        if (value > 0 && value <= 4000 && value % 10 == 0) {
            int[] newTab = new int[deposits.length + 1];
            System.arraycopy(deposits, 0, newTab, 0, deposits.length);
            newTab[newTab.length - 1] = value;
            this.deposits = newTab;
        }
    }

    public void withdrawal(int value) {
        if (value > 0 && value <= 4000 && value % 10 == 0) {
        int[] newTab = new int[withdrawals.length + 1];
        System.arraycopy(withdrawals, 0, newTab, 0, withdrawals.length);
        newTab[newTab.length - 1] = value;
        this.withdrawals = newTab;
        }
    }

        public int[] getDeposits() {
            return deposits;
        }

        public int[] getWithdrawals() {
            return withdrawals;
        }

        public int getDepositNumber() {
            return deposits.length;
        }

        public int getWithdrawalNumber() {
            return withdrawals.length;
        }

        public int getBalance() {
            if (this.deposits.length == 0 && this.withdrawals.length == 0) {
                return 0;
            }

            return getDepositSum() - getWithdrawalSum();
        }

        public int getDepositSum() {
            int s = 0;
            for (int i = 0; i < deposits.length; i++) {
                s += deposits[i];
            }
            return s;
        }

        public int getWithdrawalSum() {
            int s = 0;
            for (int i = 0; i < withdrawals.length; i++) {
                s += withdrawals[i];
            }
            return s;
        }
}
