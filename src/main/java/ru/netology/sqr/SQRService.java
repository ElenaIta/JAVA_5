package ru.netology.sqr;

public class SQRService {
    public int squareNomber(int rangeStart, int rangeEnd) {
        int counter = 0;
//        int rangeStart = 200;
//        int rangeEnd = 300;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= rangeStart && i * i <= rangeEnd) {
                counter++;
                System.out.println("Количество квадратов:" + counter);
            }
        }
        return counter;
    }
}
