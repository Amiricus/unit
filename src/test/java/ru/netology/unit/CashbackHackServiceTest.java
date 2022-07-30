package ru.netology.unit;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldRemain1() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(100);
        int expected = 900;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldRemain2() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(700);
        int expected = 300;

        assertEquals(actual, expected);

    }

    @Test
    public void shouldRemain3() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);
    }
}