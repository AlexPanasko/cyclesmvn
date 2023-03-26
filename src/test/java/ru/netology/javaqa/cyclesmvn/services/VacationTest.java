package ru.netology.javaqa.cyclesmvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import ru.netology.javaqa.cyclesmvn.services.Vacation;

public class VacationTest {

    @Test
    public void testSumVacationLow() {
        Vacation service = new Vacation();

        int expected = 3;
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testSumVacationHigh() {
        Vacation service = new Vacation();

        int expected = 2;
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
