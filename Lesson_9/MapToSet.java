package JavaRushTask.JR_9;

/*
Есть класс кот - Cat, с полем "имя" (String).
        Создать словарь Map<String, Cat> и добавить туда 10 котов в виде "Имя"-"Кот".
        Получить из Map множество(Set) всех котов и вывести его на экран.
*/

import java.util.*;
public class MapToSet {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        Map<String, Cat> map = new HashMap<String, Cat>();
        map.put("Vaska",new Cat("Vasya"));
        map.put("Murka",new Cat("Murka"));
        map.put("Folka",new Cat("Folka"));
        map.put("Barsik",new Cat("Barsik"));
        map.put("Jac",new Cat("Jac"));
        map.put("Vlad",new Cat("Vlad"));
        map.put("Dark",new Cat("Dark"));
        map.put("Sleep",new Cat("Sleep"));
        map.put("Lica",new Cat("Lica"));
        map.put("Vara",new Cat("Vara"));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set<Cat> set= new HashSet<Cat>(map.values());
       // Set<Cat> set = new HashSet<>();
        set.addAll(map.values());
        return set;
    }

  /*  Set<Cat> set = new HashSet<Cat>();
        for (Cat cat : map.values()){    в коммент аналогичный работающий вариант
        set.add(cat);
        }
        return set;
    }*/

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}

