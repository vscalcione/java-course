package it.intersistemi.corsojava.incapsulation;

import it.intersistemi.corsojava.consoleinput.ConsoleInputString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Day{
     static enum DayEnum {
        MONDAY(false),
        TUESDAY(false),
        WEDNESDAY(false),
        THURSDAY(false),
        FRIDAY(false),
        SATURDAY(true),
        SUNDAY(true);

        private boolean isHoliday;

        DayEnum(boolean isHoliday) {
            this.isHoliday = isHoliday;
        }

        public boolean isHoliday() {
            return isHoliday;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        do{
            String stringDay = ConsoleInputString.readString(console, "Insert stringDay: ");
            try{
                DayEnum day = DayEnum.valueOf(stringDay.toUpperCase());
                System.out.println("Day: " + (day.isHoliday() ? "Holiday" : "Weekday"));
            }catch(Exception e){
                System.out.println(e.getClass().getName() + ": " + e.getMessage());
            }
        }while(true);
    }
}
