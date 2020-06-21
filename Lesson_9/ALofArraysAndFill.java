package JavaRushTask.JR_9;
/*Создать список, элементами которого будут массивы чисел.
        Добавить в список пять объектов-массивов длиной 5, 2, 4, 7, 0 соответственно.
        Заполнить массивы любыми данными и вывести их на экран.*/

import java.util.ArrayList;
import java.util.Arrays;

public class ALofArraysAndFill {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> list=new ArrayList<>();
        list.add(new int[5]); //созд пустой массив размером 5 и добавл в list
        list.add(new int[2]);
        list.add(new int[4]);
        list.add(new int[7]);
        list.add(new int[0]);
        for (int i = 0; i < list.size(); i++) { //fill заполняет массив в заданном диапазоне значениями
            Arrays.fill(list.get(i), i);
        }
        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}


