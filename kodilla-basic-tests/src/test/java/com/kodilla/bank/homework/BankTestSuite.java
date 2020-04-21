package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void shouldPostOnlyGoodValuesOnCM1() {
        Bank bank = new Bank();
        bank.depositCM1(50);
        bank.depositCM1(150);
        bank.depositCM1(33);
        bank.depositCM1(4010);
        bank.depositCM1(1);
        assertEquals(200, bank.getCM1Balance());
    }

    @Test
    public void shouldPostOnlyGoodValuesOnCM2() {
        Bank bank = new Bank();
        bank.depositCM2(300);
        bank.depositCM2(1500);
        bank.depositCM2(330);
        bank.depositCM2(4050);
        bank.depositCM2(4);
        assertEquals(2130, bank.getCM2Balance());
    }

    @Test
    public void shouldPostOnlyGoodValuesOnCM3() {
        Bank bank = new Bank();
        bank.depositCM3(20);
        bank.depositCM3(10);
        bank.depositCM3(11);
        bank.depositCM3(3999);
        bank.depositCM3(8);
        assertEquals(30, bank.getCM3Balance());
    }

    @Test
    public void shouldPayOnlyGoodValuesOnCM1() {
        Bank bank = new Bank();
        bank.withdrawalCM1(50);
        bank.withdrawalCM1(150);
        bank.withdrawalCM1(33);
        bank.withdrawalCM1(4010);
        bank.withdrawalCM1(1);
        assertEquals(-200, bank.getCM1Balance());
    }

    @Test
    public void shouldPayOnlyGoodValuesOnCM2() {
        Bank bank = new Bank();
        bank.withdrawalCM2(300);
        bank.withdrawalCM2(1500);
        bank.withdrawalCM2(330);
        bank.withdrawalCM2(4050);
        bank.withdrawalCM2(4);
        assertEquals(-2130, bank.getCM2Balance());
    }

    @Test
    public void shouldPayOnlyGoodValuesOnCM3() {
        Bank bank = new Bank();
        bank.withdrawalCM3(20);
        bank.withdrawalCM3(10);
        bank.withdrawalCM3(11);
        bank.withdrawalCM3(3999);
        bank.withdrawalCM3(8);
        assertEquals(-30, bank.getCM3Balance());
    }

    @Test
    public void shouldCalculateTotalBalance() {
        Bank bank = new Bank();
        bank.depositCM1(50);
        bank.withdrawalCM1(150);
        bank.depositCM1(33);
        bank.depositCM1(4010);
        bank.withdrawalCM1(1);
        bank.depositCM2(300);
        bank.withdrawalCM2(1500);
        bank.depositCM2(330);
        bank.depositCM2(4050);
        bank.depositCM2(4);
        bank.withdrawalCM3(20);
        bank.depositCM3(10);
        bank.depositCM3(11);
        bank.depositCM3(3999);
        bank.withdrawalCM3(8);
        assertEquals(-980, bank.getBalanceAll());
    }

    @Test
    public void shouldCalculateNumberOfDeposits() {
        Bank bank = new Bank();
        bank.depositCM1(50);
        bank.depositCM1(150);
        bank.depositCM1(33);
        bank.depositCM1(4010);
        bank.depositCM1(1);
        bank.depositCM2(300);
        bank.depositCM2(1500);
        bank.depositCM2(330);
        bank.depositCM2(4050);
        bank.depositCM2(4);
        bank.depositCM2(20);
        bank.depositCM3(10);
        bank.depositCM3(11);
        bank.depositCM3(3999);
        bank.depositCM3(8);
        assertEquals(7, bank.getNumberOfDeposits());
    }

    @Test
    public void shouldCalculateNumberOfWithdrawals() {
        Bank bank = new Bank();
        bank.withdrawalCM1(50);
        bank.withdrawalCM1(150);
        bank.withdrawalCM1(33);
        bank.withdrawalCM1(4010);
        bank.withdrawalCM1(1);
        bank.withdrawalCM2(300);
        bank.withdrawalCM2(1500);
        bank.withdrawalCM2(330);
        bank.withdrawalCM2(4050);
        bank.withdrawalCM2(4);
        bank.withdrawalCM2(20);
        bank.withdrawalCM3(10);
        bank.withdrawalCM3(11);
        bank.withdrawalCM3(3999);
        bank.withdrawalCM3(8);
        assertEquals(7, bank.getNumberOfWithdrawals());
    }

    @Test
    public void shouldCalculateAverageOfDeposits() {
        Bank bank = new Bank();
        bank.depositCM1(50);
        bank.depositCM1(150);
        bank.depositCM1(33);
        bank.depositCM1(4010);
        bank.depositCM1(1);
        bank.depositCM2(300);
        bank.depositCM2(1500);
        bank.depositCM2(330);
        bank.depositCM2(4050);
        bank.depositCM2(4);
        bank.depositCM2(20);
        bank.depositCM3(10);
        bank.depositCM3(11);
        bank.depositCM3(3999);
        bank.depositCM3(8);
        assertEquals(337.14, bank.getDepositAverage(), 0.01);
    }

    @Test
    public void shouldCalculateAverageOfWithdrawals() {
        Bank bank = new Bank();
        bank.withdrawalCM1(50);
        bank.withdrawalCM1(150);
        bank.withdrawalCM1(33);
        bank.withdrawalCM1(4010);
        bank.withdrawalCM1(1);
        bank.withdrawalCM2(300);
        bank.withdrawalCM2(1500);
        bank.withdrawalCM2(330);
        bank.withdrawalCM2(4050);
        bank.withdrawalCM2(4);
        bank.withdrawalCM2(20);
        bank.withdrawalCM3(10);
        bank.withdrawalCM3(11);
        bank.withdrawalCM3(3999);
        bank.withdrawalCM3(8);
        assertEquals(337.14, bank.getWithdrawalAverage(), 0.01);
    }
}
