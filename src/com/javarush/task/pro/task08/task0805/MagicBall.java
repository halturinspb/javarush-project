package com.javarush.task.pro.task08.task0805;

import java.util.Random;

public class MagicBall {
    private static final String CERTAIN = "Бесспорно";
    private static final String DEFINITELY = "Определённо да";
    private static final String MOST_LIKELY = "Вероятнее всего";
    private static final String OUTLOOK_GOOD = "Хорошие перспективы";
    private static final String ASK_AGAIN_LATER = "Спроси позже";
    private static final String TRY_AGAIN = "Попробуй снова";
    private static final String NO = "Мой ответ — нет";
    private static final String VERY_DOUBTFUL = "Весьма сомнительно";

    public static String getPrediction() {
        Random random = new Random();
        int result = random.nextInt(8);

        String[] mas = new String[8];
        mas[0] = CERTAIN;
        mas[1] = DEFINITELY;
        mas[2] = MOST_LIKELY;
        mas[3] = OUTLOOK_GOOD;
        mas[4] = ASK_AGAIN_LATER;
        mas[5] = TRY_AGAIN;
        mas[6] = NO;
        mas[7] = VERY_DOUBTFUL;

        return result >= 0 && result <= 7 ? mas[result] : null;
    }
}
