package JavaRushTask.JR_8;

import java.util.Date;

public class Date2 {
    public static void main(String[] args) {
        System.out.println(isDateOdd("JANUARY 4 2022"));
    }

    public static boolean isDateOdd(String date) {
        Date yearStartTime = new Date(date);
        yearStartTime.setHours(0);
        yearStartTime.setMinutes(0);
        yearStartTime.setSeconds(0);
        yearStartTime.setDate(1);
        yearStartTime.setMonth(0);

        Date currentTime = new Date(date);
        long msTimeDistance = currentTime.getTime() - yearStartTime.getTime();
        long msDay = 24 * 60 * 60 * 1000;

        int dayCount = (int) (msTimeDistance/msDay);

        if (dayCount % 2 == 0)
            return true;
        else
            return false;
    }
}


