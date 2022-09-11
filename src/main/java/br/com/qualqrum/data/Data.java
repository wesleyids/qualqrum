package br.com.qualqrum.data;

import java.util.Calendar;
import java.util.Random;

/**
 * Essa classe representa uma Data.
 *
 * @author Wesley Inacio
 *
 */
public class Data {

    private String value;

    private int year;

    private int currentYear;

    private boolean isMaiorIdade;

    public Data() {
        this.isMaiorIdade = false;
        init();
    }

    public Data(boolean isMaiorIdade) {
        this.isMaiorIdade = isMaiorIdade;
        init();
    }

    /**
     * Cria uma data aleatoria com o formato 'dd/MM/yyyy'
     *
     */
    private void init() {
        Random r = new Random();
        int minYear = 1900;
        int maxYear = Calendar.getInstance().get(Calendar.YEAR);

        this.currentYear = maxYear;

        int year = r.nextInt(maxYear - minYear) + minYear;
        this.year = year;

        // FIXME
        if (isMaiorIdade) {
            if ((currentYear - year) < 18) {
                init();
            }
        }

        int minMonth = 1;
        int maxMonth = 12;
        int month = r.nextInt(maxMonth - minMonth) + minMonth;

        int minDay = 1;
        int maxDay = 28;
        int day = r.nextInt(maxDay - minDay) + minDay;

        value = String.format("%s/%s/%s", formatNumber(day), formatNumber(month), year);
    }

    private String formatNumber(int number) {
        return number < 10 ? "0".concat(String.valueOf(number)) : String.valueOf(number);
    }

    public String getValue() {
        return value;
    }

    public int getYear() {
        return year;
    }

    public int getCurrentYear() {
        return currentYear;
    }
}
