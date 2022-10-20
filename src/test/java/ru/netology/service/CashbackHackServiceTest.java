package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;



public class CashbackHackServiceTest {

    @Test
    public void shouldCountTheBalanceIfThePurchaseIsLessThan1000() {
        int amount = 700;
        CashbackHackService service = new CashbackHackService();
        int expected = 300;
        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldCountTheBalanceIfThePurchaseIsMoreThan1000() {
        int amount = 1500;
        CashbackHackService service = new CashbackHackService();
        int expected = 500;
        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldCountTheBalanceIfThePurchaseIs1000() {
        int amount = 1000;
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);
    }
}
