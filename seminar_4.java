package семинары;

// 1. Организовать вводи и хранение данных пользователей. ФИО возраст и пол
// 2. вывод в формате Фамилия И.О. возраст пол
// 3. добавить возможность выхода или вывода списка отсортированного по возрасту!)
// 4. *реализовать сортировку по возрасту с использованием индексов
// 5. *реализовать сортировку по возрасту и полу с использованием индексов

import java.util.Scanner;
import java.util.ArrayList;  


public class seminar_4 {
    public static void main(String[] args) {
        ArrayList<String> soname=new ArrayList<String>();
        ArrayList<String> name=new ArrayList<String>();
        ArrayList<String> patronymic=new ArrayList<String>();
        ArrayList<String> age=new ArrayList<String>();
        ArrayList<String> floor=new ArrayList<String>();
        Scanner stroka=new Scanner(System.in);
        int i=0;
        while (true){
            System.out.println("Для выхода нажмите пробел и Enter");
            System.out.println("Введите фамилию: ");
            soname.add(i, stroka.nextLine());
            if (soname.get(i).equals(" ")){
                break;
            }
            System.out.println("Введите имя: ");
            name.add(i, stroka.nextLine());
            if (name.get(i).equals(" ")){
                break;
            }
            System.out.println("Введите отчество: ");
            patronymic.add(i, stroka.nextLine());
            if (patronymic.get(i).equals(" ")){
                break;
            }
            System.out.println("Введите возраст: ");
            age.add(i, stroka.nextLine());
            if (age.get(i).equals(" ")){
                break;
            }
            System.out.println("Введите пол: ");
            floor.add(i, stroka.nextLine());
            if (floor.get(i).equals(" ")){
                break;
            }
            i=i+1;
        }
        if (i>0){
            System.out.println("Список пользователей: ");
            for(int j=0; j<i;  j++){
                System.out.println(soname.get(j)+" "+name.get(j)+" "+patronymic.get(j)+" "+age.get(j)+" "+floor.get(j));
            }
        }
        else {
            System.out.println("Список пуст");
        }
        String m;
        for (int l=0; l<i-1; l++){
            for (int k=1; k<i; k++){
                if (Integer.parseInt(age.get(l))>Integer.parseInt(age.get(k))){
                    m=soname.get(l);
                    soname.set(l,soname.get(k));
                    soname.set(k, m);
                    m=name.get(l);
                    name.set(l,name.get(k));
                    name.set(k, m);
                    m=patronymic.get(l);
                    patronymic.set(l,patronymic.get(k));
                    patronymic.set(k, m);
                    m=age.get(l);
                    age.set(l,age.get(k));
                    age.set(k, m);
                    m=floor.get(l);
                    floor.set(l,floor.get(k));
                    floor.set(k, m);
                }
            }
        }
        System.out.println("Выходим или сортируем по возрасту?");
        System.out.println("Для выхода напишите 1 ");
        System.out.println("Для сортировки напишите 2 ");
        String stroka_1=stroka.nextLine();
        while  (stroka_1.equals("1")){
            System.out.println("Выход");
            break;
        }
        if (stroka_1.equals("2")){
            System.out.println("Список пользователей: ");
                for(int o=0; o<i;  o++){
                    System.out.println(soname.get(o)+" "+name.get(o)+" "+patronymic.get(o)+" "+age.get(o)+" "+floor.get(o));
                }
        }
        stroka.close();
    }
}
