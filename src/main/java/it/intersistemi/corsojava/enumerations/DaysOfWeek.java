package it.intersistemi.corsojava.enumerations;

import java.util.Arrays;
import java.util.Comparator;

public enum DaysOfWeek {
    MONDAY (1, false),
    TUESDAY (2, false),
    WEDNESDAY (3, false),
    THURSDAY (4, false),
    FRIDAY (5, false),
    SATURDAY (6, true),
    SUNDAY (7, true);


    private int numberDay;
    private boolean isHoliday;

    DaysOfWeek() {
    }

    DaysOfWeek(int numberDay, boolean isHoliday) {
        this.numberDay = numberDay;
        this.isHoliday = isHoliday;
    }

    public int getNumberDay() {
        return numberDay;
    }

    public void setNumberDay(int numberDay) {
        this.numberDay = numberDay;
    }

    public boolean isHoliday() {
        return isHoliday;
    }

    public void setHoliday(boolean holiday) {
        isHoliday = holiday;
    }

    public static void main(String[] args) {
        DaysOfWeek[] daysOfWeek = DaysOfWeek.values();
        for (int i = 0; i < daysOfWeek.length; i++) {
            printDaysOfWeek(daysOfWeek[i]);
        }
        System.out.println();
        DaysOfWeek[] days = {
                DaysOfWeek.TUESDAY,
                DaysOfWeek.MONDAY,
                DaysOfWeek.THURSDAY,
                DaysOfWeek.WEDNESDAY,
                DaysOfWeek.SATURDAY,
                DaysOfWeek.FRIDAY,
                DaysOfWeek.SUNDAY, };
        System.out.println("Before sorting");
        for (int i = 0; i < days.length; i++) {
            printDaysOfWeek(days[i]);
        }
        Comparator<DaysOfWeek> comparatorDays = new DayOfWeekComparator();
        Arrays.sort(days, comparatorDays);
        System.out.println("");
        for (int i = 0; i < days.length; i++) {
            printDaysOfWeek(days[i]);
        }
    }

    public static void printDaysOfWeek(DaysOfWeek dayOfTheWeek) {
        System.out.println(dayOfTheWeek + " " + dayOfTheWeek.getNumberDay() + " " + (dayOfTheWeek.isHoliday() ? " (holiday) " : "" ));
    }

    public static class DayOfWeekComparator implements Comparator<DaysOfWeek>{
        public int compare(DaysOfWeek day1, DaysOfWeek day2){
            return day2.getNumberDay() - day1.getNumberDay();
        }
    }
}
