package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void shouldPostOnlyGoodValuesOnCM1() {
        // given
        CashMachine c1  = new CashMachine();
        fillInCashMachine(c1, new int[]{50, 150, 33, 4010, 1});
        // when
        Bank bank = new Bank(new CashMachine[]{c1});
        // then
        assertEquals(200, bank.getBalanceAll());
    }

    @Test
    public void shouldPostValuesOnTwoCashMachines() {
        // given
        CashMachine c1  = new CashMachine();
        fillInCashMachine(c1, new int[]{50, 150, 33, 4010, 1});
        CashMachine c2  = new CashMachine();
        fillInCashMachine(c2, new int[]{5, 15, 3, 40, 1});
        // when
        Bank bank = new Bank(new CashMachine[]{c1, c2});
        // then
        assertEquals(240, bank.getBalanceAll());
    }

    private void fillInCashMachine(CashMachine c, int[] vals) {
        for (int i = 0; i < vals.length; i++) {
            c.deposit(vals[i]);
        }
    }
}
