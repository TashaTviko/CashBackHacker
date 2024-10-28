package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    @Test
    public void testRemainWhenLessThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(service.remain(900), 100);
    }

    @Test
    public void testRemainWhenExactlyBoundary() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(service.remain(1000), 1000); // Ошибка: сервис не должен советовать 1000
    }

    @Test
    public void testRemainWhenMoreThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(service.remain(1100), 900);
    }
}
