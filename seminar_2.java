package семинары;

import java.util.Scanner;
import java.util.HashMap;

// public class seminar_2 {
//     // ввести с консоли две сроки и сказать, есть ли в первой строке вторая строка
//     public static void main(String[] args){
//         Scanner stroka=new Scanner(System.in);
//         System.out.printf("Введите первую строку: ");
//         String stroka_1=stroka.nextLine();
//         System.out.println(stroka_1);
//         System.out.printf("Введите вторую строку: ");
//         String stroka_2=stroka.nextLine();
//         System.out.println(stroka_2);
//         stroka.close();
//         int n=stroka_1.indexOf(stroka_2);
//         if (n>-1){ // моё решение
//             System.out.println("Строка " + stroka_2 + " содержится в строке " + stroka_1);
//         }
//         else{
//             System.out.println("Строка " + stroka_2 + " не содержится в строке " + stroka_1);
//         }
//         if (stroka_1.contains(stroka_2)){ // не моё решение
//             System.out.println("Строка " + stroka_2 + " содержится в строке " + stroka_1);
//         }
//         else{
//             System.out.println("Строка " + stroka_2 + " не содержится в строке " + stroka_1);
//         }
//     }
// }






// public class seminar_2 {
//     // проверить являются ли две строки вращением друг друга, 0123  содержит 23, а 32 содержит но в обратном порядке, должна быть полная копия
//     public static void main(String[] args){
//         Scanner stroka=new Scanner(System.in);
//         System.out.printf("Введите первую строку: ");
//         String stroka_1=stroka.nextLine();
//         System.out.println(stroka_1);
//         System.out.printf("Введите вторую строку: ");
//         String stroka_2=stroka.nextLine();
//         System.out.println(stroka_2);
//         stroka.close();
//         StringBuilder stroka_1_revers = new StringBuilder(stroka_1).reverse();
//         System.out.println("реверс "  + stroka_1_revers);
//         if (stroka_2.equals(stroka_1_revers.toString())){
//             System.out.println("Строка " + stroka_2 + " содержится в строке " + stroka_1);
//         }
//         else{
//             System.out.println("Строка " + stroka_2 + " не содержится в строке " + stroka_1);
//         }

//     }
// }



// HOMEWORK
// Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// В итоге должно получится select * from students where name=Ivanov, country=Russia, city=Moscow, age=null

public class  seminar_2 {
    public static  void  main(String[] args){
        String stroka="{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        System.out.println(stroka);
        String str999="select * from students where ";
        String str1=stroka.replace("{","");
        System.out.println(str1);
        String str2=str1.replace("}","");
        System.out.println(str2);
        String str3=str2.replaceAll("\"","");
        System.out.println(str3);
        StringBuilder num=new  StringBuilder(str999);
        String [] arr = str3.split(", ");
        for (int i=0; i<arr.length;  i++){
            String []  array=arr[i].split(":");
            if (array[1].equals("null")==false){
                if  (i==0){
                    num.append(array[0]);
                    num.append("=");
                    num.append(array[1]);
                }
                else{
                    num.append(", ");
                    num.append(array[0]);
                    num.append("=");
                    num.append(array[1]);
                }
            }
        }
        System.out.println(num);
    }



}

