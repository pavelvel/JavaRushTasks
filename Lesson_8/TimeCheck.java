package JavaRushTask.JR_8;
/*Измерить, сколько времени занимает 10 тысяч вызовов get для каждого списка.
        Метод getGetTimeInMs должен вернуть время своего исполнения в миллисекундах.*/

import java.util.*;
public class TimeCheck {
    public static void main(String[] args) {
        System.out.println(getGetTimeInMs(fill(new ArrayList())));
        System.out.println(getGetTimeInMs(fill(new LinkedList())));
    }

    public static List fill(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(new Object());
        }
        return list;
    }

    public static long getGetTimeInMs(List list) {
        // напишите тут ваш код
        Date timeStart = new Date();
        get10000(list);
        Date timeEnd = new Date();
        long time = timeEnd.getTime() - timeStart.getTime();
        return time;


        // напишите тут ваш код

    }

    public static void get10000(List list) {
        if (list.isEmpty()) {
            return;
        }
        int x = list.size() / 2;

        for (int i = 0; i < 10000; i++) {
            list.get(x);
        }
    }
}


