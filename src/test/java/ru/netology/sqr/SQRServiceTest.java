package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldSquareNomber() {
        SQRService service = new SQRService();
        // подготавливаем данные:
        int rangeStart = 200;
        int rangeEnd = 300;
        int expected = 3;

        // вызываем целевой метод:
        int actual = service.squareNomber(rangeStart, rangeEnd);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);






    }
}