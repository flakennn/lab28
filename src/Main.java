import java.util.*;

public class Main {
    public static void main(String[] args){
        System.out.println("1.\tПреобразовать структуру данных HashSet в структуру TreeSet");
        HashSet<String> set = new HashSet<String>();
        set.add("geeks");
        set.add("practice");
        set.add("contribute");
        set.add("ide");
        System.out.println("Original HashSet: \nTreeSet: "+getInstance(set)+"" +
                "\n2.\tСоздайте класс Map<String, String> и добавьте десять записей, которые представляют пары" +
                "\n(фамилия, имя). Проверьте, сколько людей имеют одинаковое имя или фамилию. Требования к " +
                "\nпрограмме:" +
                "\n\ta)Программа не должна отображать текст на экране." +
                "\n\tb)Программа не должна считывать значения с клавиатуры" +
                "\n\tc)Метод createMap () должен создать и вернуть HashMap, который имеет элементы " +
                "\n\t(String, String) и содержит 10 записей, представляющих пары (фамилия, имя)." +
                "\n\td)Метод getSameFirstNameCount () должен возвращать количество людей с одинаковыми именами." +
                "\n\te)Метод getSameLastNameCount () должен возвращать количество людей с одинаковой фамилией");
        Solution task2=new Solution();
        HashMap<String, String> map=new HashMap<String, String>();
        map=task2.createMap();
        int duplicates_of_Name=task2.getCountTheSameFirstName(map);
        int duplicates_of_Last_Name=task2.getCountTheSameLastName(map);
        System.out.println("\n3.\tРеализовать хеш-таблицу, в которой ключи имеют вещественные значения.");
        Task3 task3=new Task3();
        Hashtable<Integer, String> dic=new Hashtable<Integer, String>();
        System.out.println(dic);
        task3.put(dic);
        System.out.println(dic);
    }
    public static <T> Set<T> getInstance(Set<T> hashSet) {
        return new TreeSet<>(hashSet);
    }
}