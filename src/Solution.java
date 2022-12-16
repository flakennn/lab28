import java.util.*;

public class Solution {
    public Solution() {
    }

    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Бандерлог" + 0, "Казантип");//
        map.put("Барабас" + 1, "Карабас");//
        map.put("Бергамот" + 2, "Кабачок");//
        map.put("Беломор" + 3, "Кенингсберг");//
        map.put("Бателфилд" + 4, "Овервотч");
        map.put("Бандикут" + 5, "Купидон");//
        map.put("Будапешт" + 6, "Хасаврют");
        map.put("Буерак" + 7, "Корвалол");
        map.put("Баблгам" + 8, "Курткобейн");
        map.put("Базилик" + 9, "Кинза");//
        map.put("Бадминтон" + 10, "Коленвал");//
        return map;
    }

    public static String removeAllDigit(String str)//удаление ключей из хешмапа
    {
        char[] charArray = str.toCharArray();
        String result = "";
        for (int i = 0; i < charArray.length; i++) {
            if (!Character.isDigit(charArray[i])) {
                result = result + charArray[i];
            }
        }
        return result;
    }
    public static String[] remove_Duplicate_Elements(String[] arr) {
        Set<String> stringSet = new HashSet<>(Arrays.asList(arr));
        String[] filteredArray = stringSet.toArray(new String[0]);
        return filteredArray;
    }
    public static int getCountTheSameFirstName(HashMap<String, String> map) {
        String[] keys = new String[map.size()];
        String[] values = new String[map.size()];
        int index = 0;
        for (Map.Entry<String, String> mapEntry : map.entrySet()) {//конвертация хешмапа в массивы для подсчета
            keys[index] = mapEntry.getKey();
            values[index] = mapEntry.getValue();
            index++;
        }
        for (int i = 0; i < keys.length; i++) {
            keys[i] = removeAllDigit(keys[i]);
        }
        String[] dictaniory=keys;
        dictaniory=remove_Duplicate_Elements(dictaniory);
        int[] counting=new int[dictaniory.length];
        int count = 0;
        for (int i = 0; i < keys.length; i++) {
            for (int j = 0; j < dictaniory.length; j++) {
                if(dictaniory[j].equals(keys[i])){
                    counting[j]=counting[j]+1;
                }
            }
        }
        return summ(counting);
    }

    public static int getCountTheSameLastName(HashMap<String, String> map) {
        String[] keys = new String[map.size()];
        String[] values = new String[map.size()];
        int index = 0;
        for (Map.Entry<String, String> mapEntry : map.entrySet()) {
            keys[index] = mapEntry.getKey();
            values[index] = mapEntry.getValue();
            index++;
        }
        String[] dictaniory=remove_Duplicate_Elements(values);
        int[] counting=new int[dictaniory.length];
        int count = 0;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < dictaniory.length; j++) {
                if(dictaniory[j].equals(values[i])){
                    counting[j]=counting[j]+1;
                }
            }
        }
        return summ(counting);
    }
    public static void outputMass(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static int summ(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            count=count+arr[i];
        }
        return count-arr.length;
    }
}