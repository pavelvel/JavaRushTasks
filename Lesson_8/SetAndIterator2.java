package JavaRushTask.JR_8;
/*1. Внутри класса Solution создать public static класс кот - Cat.
        2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
        3. В методе main удалите одного кота из Set cats.
        4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве.
        Каждый кот с новой строки.*/
import java.util.*;



public class SetAndIterator2 {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        Iterator<Cat> iterator = cats.iterator();
        cats.remove(iterator.next());
        //напишите тут ваш код. step 3 - пункт 3

       /*      for (Cat cat : cats) {
         cats.remove(cat);
         break;
     }*/

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> cats = new HashSet<Cat>();
        for (int i = 0; i < 3; i++){
            Cat cat = new Cat();
            cats.add(cat);
        }//напишите тут ваш код. step 2 - пункт 2
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat cat : cats){
            System.out.println(cat);
        }// step 4 - пункт 4
    }

    public static class Cat {
    }// step 1 - пункт 1
}


