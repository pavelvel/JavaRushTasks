package JavaRushTask.JR_10;
import java.util.*;

public class ALIntoArray {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);

    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] arrayOfStringList =new ArrayList[2];
        ArrayList<String> list1 = new ArrayList<>();
        list1.add(0, "a");
        list1.add(1, "b");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add(0, "с");
        list2.add(1, "л");
        arrayOfStringList[0] = list1;
        arrayOfStringList[1] = list2;//напишите тут ваш код

        return arrayOfStringList;
    }


    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}

