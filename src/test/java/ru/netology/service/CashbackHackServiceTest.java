package ru.netology.service;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    @Test
   public  void shouldRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
   public void shouldRemain0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1128;

        int actual = service.remain(amount);
        int expected = 872;

        assertEquals(actual, expected);
    }

    @Test
   public void shouldRemain1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;

        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);
    }
    @Test
   public void shouldRemain2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }
    @Test
   public void shouldRemain3() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);
    }
    @Test
   public void shouldRemain4() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;

        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);
    }

        @Test
        public  void shouldRemainApi() {
            CashbackHackService service = new CashbackHackService();
            int amount = 1000;

            int actual = service.remain(amount);
            int expected = 0;

            Assertions.assertEquals(actual, expected);
        }

        @Test
        public void shouldRemain0Api() {
            CashbackHackService service = new CashbackHackService();
            int amount = 1128;

            int actual = service.remain(amount);
            int expected = 872;

            Assertions.assertEquals(actual, expected);

        }

        @Test
        public void shouldRemain1Api() {
            CashbackHackService service = new CashbackHackService();
            int amount = 1001;

            int actual = service.remain(amount);
            int expected = 999;

            Assertions.assertEquals(actual, expected);

        }
        @Test
        public void shouldRemain2Api() {
            CashbackHackService service = new CashbackHackService();
            int amount = 0;

            int actual = service.remain(amount);
            int expected = 1000;

            Assertions.assertEquals(actual, expected);

        }
        @Test
        public void shouldRemain3Api() {
            CashbackHackService service = new CashbackHackService();
            int amount = 999;

            int actual = service.remain(amount);
            int expected = 1;

            Assertions.assertEquals(actual, expected);

        }
        @Test
        public void shouldRemain4Api() {
            CashbackHackService service = new CashbackHackService();
            int amount = 1;

            int actual = service.remain(amount);
            int expected = 999;

            Assertions.assertEquals(actual, expected);

        }

    }

