package it.intersistemi.corsojava.lambdaexpressions.exercises.library;

import java.util.Calendar;

public class Data {

    private int day;
    private int month;
    private int year;

    public Data(int day, int month, int year) {
        super();
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static Data dataNow(){
        Calendar calendar = Calendar.getInstance();
        return new Data(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH));
    }

    public int getDifference(Data data) {
        int daysOtherDate = calculateDays(data);
        int daysToday = calculateDays(this);
        return daysOtherDate - daysToday;
    }

    private int calculateDays(Data data) {
        return data.getYear() * 365 + data.getMonth() * 30 + data.getDay();
    }
}
