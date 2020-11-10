package ru.netology.stat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void findSumAllPurchase() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.findSum(purchases);
        int expect = 180;
        assertEquals(expect, actual);
    }

    @Test
    void findAverageAllPurchase() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.findAverage(purchases);
        int expect = 15;
        assertEquals(expect, actual);

    }

    @Test
    void findMonthWithMaxPurchases() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.findMax(purchases);
        int expect =8;
        assertEquals(expect, actual);
    }

    @Test
    void findMonthWithMinPurchases() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.findMin(purchases);
        int expect = 9;
        assertEquals(expect, actual);
    }

    @Test
    void findMonthUnderAverage() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.findUnderAverage(purchases);
        int expect = 5;
        assertEquals(expect, actual);
    }

    @Test
    void findMonthOverAverage() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.findOverAverage(purchases);
        int expect = 5;
        assertEquals(expect, actual);
    }
}