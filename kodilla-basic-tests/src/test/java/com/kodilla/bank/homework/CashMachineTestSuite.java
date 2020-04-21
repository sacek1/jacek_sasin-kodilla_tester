package com.kodilla.bank.homework;

import com.kodilla.school.Grades;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    @Test
    public void shouldHaveNoDeposits() {
        CashMachine cashMachine = new CashMachine();
        int deposits = cashMachine.getDepositSum();
        assertEquals(0, deposits);
    }

    @Test
    public void shouldHaveNoWithdrawals() {
        CashMachine cashMachine = new CashMachine();
        int withdrawals = cashMachine.getWithdrawalNumber();
        assertEquals(0, withdrawals);
    }

    @Test
    public void shouldPostThreeDeposits() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.deposit(50);
        cashMachine.deposit(10);
        cashMachine.deposit(1000);

        int[] deposits = cashMachine.getDeposits();

        assertEquals(3, deposits.length);
        assertEquals(50, deposits[0]);
        assertEquals(10, deposits[1]);
        assertEquals(1000, deposits[2]);
    }

    @Test
    public void shouldPostThreeWithdrawals() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.withdrawal(2000);
        cashMachine.withdrawal(300);
        cashMachine.withdrawal(1500);

        int[] withdrawals = cashMachine.getWithdrawals();

        assertEquals(3, withdrawals.length);
        assertEquals(2000, withdrawals[0]);
        assertEquals(300, withdrawals[1]);
        assertEquals(1500, withdrawals[2]);
    }

    @Test
    public void shouldCalculateNumberOfDeposits() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.deposit(50);
        cashMachine.deposit(10);
        cashMachine.deposit(1000);

        assertEquals(3, cashMachine.getDepositNumber());
    }

    @Test
    public void shouldCalculateNumberOfWithdrawals() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.withdrawal(10);
        cashMachine.withdrawal(10);
        cashMachine.withdrawal(4000);

        assertEquals(3, cashMachine.getWithdrawalNumber());
    }

    @Test
    public void shouldCalculateBalance() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.deposit(10);
        cashMachine.deposit(10);
        cashMachine.deposit(100);
        cashMachine.withdrawal(50);
        cashMachine.withdrawal(40);
        cashMachine.withdrawal(200);

        assertEquals(-170, cashMachine.getBalance());
    }

    @Test
    public void shouldReturnBalanceEqualsZeroIfArrayIsEmpty() {
        CashMachine cashMachine = new CashMachine();
        assertEquals(0, cashMachine.getBalance(), 0.0001);
    }

    @Test
    public void shouldCalculateDepositSum() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.deposit(100);
        cashMachine.deposit(300);
        cashMachine.deposit(1000);

        assertEquals(1400, cashMachine.getDepositSum());
    }

    @Test
    public void shouldCalculateWithdrawalSum() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.withdrawal(1000);
        cashMachine.withdrawal(3000);
        cashMachine.withdrawal(1000);

        assertEquals(5000, cashMachine.getWithdrawalSum());
    }


}
