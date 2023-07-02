package семинары;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;


// public class seminar_5 {
//     public static void main(String[] args) {
//         Object o = new Object();
//         o.hashCode();

//         HashMap<Integer, String> map = new HashMap<>();
//         map.put(1,"!");
//         map.putIfAbsent(1,"j");

//         map.replace(1, "j");
//         map.replace(1, "!" , "j");
//         map.remove(1);
//         map.remove(1, "!");
//         map.get(1);
//         map.getOrDefault(1, "#");

//         Set<Integer> se=map.keySet();
//         for  (int i=0; i<se.size();i++){
//             System.out.println(map.get((int)se.toArray()[i]));
//         }
//         for (String s: map.values()) {
//             System.out.println(s);            
//         }

//         map.containsValue("!");
//         map.containsKey(1);

//         map.compute(1, (key, value) -> value != null ? value + key : "0");
//         map.computeIfPresent(1, (key, value) -> value == null ? value + "!" : "0");
//         map.computeIfAbsent(1, value -> value != null ? value + "!" : "0");

//         HashMap<Integer, Integer> map1 = new HashMap<>();
//         HashMap<Integer, Integer> map2 = new HashMap<>();

//         map.clear();
//         for (int i = 0; i < 10; i++) {
//             map1.put(i, i);
//         }

//         for (int i = 0; i < 10; i++) {
//             map2.put(i, new Random().nextInt(5));
//         }
//         System.out.println(map1);
//         System.out.println(map2);
//         map1.replaceAll((key, value) -> map2.computeIfPresent(value, (k, v) -> v * key));
//         System.out.println(map2);
//     }
// }


// Создать список, в котором ключ это число,  а значение случайное число. 
// Вывести в консоль пару ключ, значение,  но только если значение кратно двум
// public class seminar_5{
//     public static void main(String[] args) {
//         HashMap<Integer, Integer> map = new HashMap<>();
//         for (int i=0; i<10;i++){
//             map.put(i, new Random().nextInt(0, 2000));
//         }
//         for(int i:map.values()){
//             if (i%2==0){
//                 System.out.println(i);
//             }
//         }
//         System.out.println(map);

//     }
// }

//создать два списка где ключ это число от 1 до 25, а значение это имя, в одном списке мужские в другом женские
// вывести мужские  имена  плюс  женские  у  которых  ключи  одинаковые

// public class seminar_5{
//     public static void main(String[] args) {
//         HashMap<Integer, String> map_man = new HashMap<>();
//         HashMap<Integer, String> map_women = new HashMap<>();
//         Scanner stroka=new Scanner(System.in);
//         for (int i=0; i<5;i++){
//             System.out.println("Введите мужское имя: ");
//             map_man.put(new Random().nextInt(1,25), stroka.nextLine());
//         }
//         for (int j=0; j<5;j++){
//             System.out.println("Введите женское имя: ");
//             map_women.put(new Random().nextInt(1,25), stroka.nextLine());
//         }
//         // МОЁ РЕШЕНИЕ
//         // for(int i:map_man.keySet()){
//         //     for (int j:map_women.keySet()){
//         //         if (i==j){
//         //             System.out.println(map_man.get(i)+"+"+map_women.get(j));
//         //         }
//         //     }
//         // }
//         for (int m: map_man.keySet()){
//             if  (map_women.containsKey(m)){
//                 System.out.println(map_man.get(m)+"+"+map_women.get(m));
//             }
//         }
//         System.out.println(map_man);
//         System.out.println(map_women);
//         stroka.close();

//     }
// }



// HOMEWORK

// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что во входной структуре будут повторяющиеся имена 
// с разными телефонами, их необходимо считать, как одного человека с разными телефонами. 
// Вывод должен быть отсортирован по убыванию числа телефонов.
import java.util.Map;
import java.util.Stack;

public class seminar_5 {
    public static void main(String[] args) {
        // Инициализация начального списка
        Map<String, ArrayList> phone_book = new HashMap<>() 
        {
            {
                put("qwerty qwerty qwerty", new ArrayList<Integer>() {
                    {
                        add(123456);
                        add(1234567);
                        add(12345678);
                    }
                });
                put("asdfgh asdfgh", new ArrayList<Integer>() {
                    {
                        add(789456132);
                    }
                });
                put("zxcvbnm zxcvbnm zxcvbnm", new ArrayList<Integer>() {
                    {
                        add(456123789);
                        add(987321456);

                    }
                });
            }
        };
        System.out.println();
        Scanner scan = new Scanner(System.in, "UTF-8");
        Boolean getOut = false;
        String st;
        while (!getOut) {
            System.out.println("qwerty123456 - добавить ФИО и номера, 654321ytrewq - закончить");
            st = scan.nextLine();
            String name = "";
            String phString;
            switch (st) {
                case "qwerty123456": {
                    System.out.println("Введите ФИО:");
                    name = scan.nextLine();
                    if (phone_book.containsKey(name)) {
                        System.out.println("ФИО уже используется");
                        System.out.println();
                        break;
                    } else {
                        System.out.println("Введите номер телефонов через запятую с пробелом");
                        phString = scan.nextLine();
                        String[] arr = phString.split(", ");
                        ArrayList<Integer> arrInt = new ArrayList<>();
                        for (String item: arr) {
                            arrInt.add(Integer.parseInt(item.trim())) ;
                        }
                        phone_book.put(name, arrInt);
                        System.out.println();
                        Set<String> keySet = phone_book.keySet();
                        int maxCount = 0;
                        int minCount = 1000000;
                        for (var item : phone_book.entrySet()) {
                            if (maxCount < item.getValue().size())
                                maxCount = item.getValue().size();
                            if (minCount > item.getValue().size())
                                minCount = item.getValue().size();
                            
                        }
                        Stack<String> stak = new Stack<>();
                        int num = minCount;
                        while (num <= maxCount) {
                            for (var item : phone_book.entrySet()) {
                                if (item.getValue().size() == num) {
                                    stak.push(item.getKey());
                                }  
                            }
                            num += 1;
                        }
                        for (int i = 0; i < keySet.size(); i++) {
                            name = stak.pop();
                            for (var item : phone_book.entrySet()) {
                                if (name == item.getKey()) {
                                    System.out.printf("%8s: ", item.getKey());
                                    System.out.println(item.getValue());
                                }
                            }
                        }
                        break;
                    }
                }
                case "654321ytrewq": {
                    getOut = true;
                    break;
                }   
                    
               
            }
        }
    }

}