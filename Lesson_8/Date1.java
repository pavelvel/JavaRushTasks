package JavaRushTask.JR_8;

/*
Измерить, сколько времени занимает 10 тысяч вставок для каждого списка.
        Метод getInsertTimeInMs должен вернуть время своего исполнения в миллисекундах.
*/

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Date1 {
    public static void main(String[] args) {
        System.out.println(getInsertTimeInMs(new ArrayList()));
        System.out.println(getInsertTimeInMs(new LinkedList()));
    }

    public static long getInsertTimeInMs(List list) {
        Date start = new Date();
        insert10000(list);
        Date end = new Date();


        long result = end.getTime() - start.getTime();
        return result;
    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }
}
