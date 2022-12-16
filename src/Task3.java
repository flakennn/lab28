import java.util.Hashtable;
import java.util.Scanner;

public class Task3 {
    public static void put(Hashtable<Integer, String> dic) {
        int key = 0;
        Scanner console = new Scanner(System.in);
        System.out.println("Введите значение");
        String values = console.nextLine();
        dic.put(putKey(), values);
    }
    static public int putKey(){
        Scanner console = new Scanner(System.in);
        int key = 0;
        while (true) {
            System.out.println("Введите ключ: ");
            while (!console.hasNextInt()) {
                System.out.println("Введите ключ: ");
                console.next();
            }
            key = console.nextInt();
            if (key > 0) {
                break;
            }
        }
        return key;
    }
}