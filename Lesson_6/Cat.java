package JavaRushTask.JR_6;
import java.util.*;
// добавление в массив и вывод его элементов на экран
public class Cat{
    public static ArrayList<Cat> cats = new ArrayList<>();

    public Cat() {
    }

    public static void main(String[] args) {

        for(int i=0;i<10;i++){
            cats.add(new Cat());
        }
        printCats();
    }

    public static void printCats() {
        for(int i=0;i<10;i++){
            System.out.println(cats.get(i));
        }
    }
}
