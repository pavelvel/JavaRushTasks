package JavaRushTask.JR_8;

/*
Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: "фамилия" - "зарплата".
        Удалить из словаря всех людей, у которых зарплата ниже 500.
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap4 {
    public static Map<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Иванов", 400);
        map.put("Петров", 1400);
        map.put("Сидоров", 450);
        map.put("Алексеев", 2400);
        map.put("Сергеев", 2500);
        map.put("Николаев", 4500);
        map.put("Гуляев", 200);
        map.put("Стояев", 300);
        map.put("Сидяев", 4600);
        map.put("Лежаев", 1000);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> pair = iterator.next();
            if(pair.getValue() < 500)
                iterator.remove();
        }
    }


    //map.entrySet().removeIf(pair -> pair.getValue() <  500); запись через лямбда

    public static void main(String[] args) {
    }
}