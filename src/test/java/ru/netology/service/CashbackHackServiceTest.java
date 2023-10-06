package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    @Test
    void shouldRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    void shouldRemain0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    void shouldRemain1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 600;

        int actual = service.remain(amount);
        int expected = 400;

        assertEquals(actual, expected);
    }
    @Test
    void shouldRemain2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }
    @Test
    void shouldRemain3() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;

        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);
    }
    @Test
    void shouldRemain4() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1128;

        int actual = service.remain(amount);
        int expected = 872;

        assertEquals(actual, expected);
    }
}
