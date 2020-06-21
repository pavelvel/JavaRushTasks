package JavaRushTask.JR_8;

/*Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
        Удалить из множества все числа больше 10.*/

import java.util.*;
public class SetAndIterator {

    public static Set<Integer> createSet() {
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= 20; i++) {
            set.add(i);
        }
        return set;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        Iterator<Integer> i = set.iterator();
        while (i.hasNext()){
            if (i.next()>10) i.remove();}
        return set;// напишите тут ваш код
    }

    public static void main(String[] args) {

    }
}

