package JavaRushTask.JR_8;
/*
Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
        Удалить людей, имеющих одинаковые имена.
*/





import java.util.*;

public class HashMap3 {
    public static Map<String, String> createMap() {
        Map<String,String> map=new HashMap<>();
        map.put("Федченко", "Алексей");
        map.put("Понасенко", "Александр");
        map.put("Степашкин", "Владимир");
        map.put("Иванов", "Владимир");
        map.put("Матвиенко", "Дмитрий");
        map.put("Степаненко", "Алексей");
        map.put("Михайлов", "Дмитрий");
        map.put("Каратанян", "Али");
        map.put("Нурмагомедов", "Хабиб");
        map.put("Фергисон", "Тони");
        return map;


    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        HashMap<String, String> test = new HashMap<>(map);
        List<String> list = new ArrayList<>();

        Iterator<Map.Entry<String, String>> iterator = test.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            String value = pair.getValue();
            String key = pair.getKey();

            Iterator<Map.Entry<String, String>> iterator2 = test.entrySet().iterator();
            while (iterator2.hasNext()) {
                Map.Entry<String, String> pair2 = iterator2.next();
                String value2 = pair2.getValue();
                String key2 = pair2.getKey();
                if (value2.equals(value) && !key2.equals(key))
                    list.add(value2);
            }
        }
        for(String s: list) {
            removeItemFromMapByValue(map, s);
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}

