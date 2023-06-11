package семинары;

import java.util.Random;


// public class seminar_1 {
//     // точка входа
//     public static void main(String[] args)
//     {
//         int[] arr={1,2,3,4,5};
//         String str="Hello fucking world!";
//         String str_1="Hello fucking world!";
//         str+=" Hello fucking fagot";
//         System.out.println(str+"hajskdlf "+arr[1]+" hentai");
//         int[] arr_1=new int[arr.length+1];
//         for (int i=0;i<arr_1.length-1;i++){
//             arr_1[i]=arr[i];
//         }
//         arr=arr_1;

//         if (str==str_1){
//             System.out.println(true);
//         }
//         if (str!=str_1){
//             System.out.println(false);
//         }
//     }
// }



// HOMEWORK

// Первый семинар.
// 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
// 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
// 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
// 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

// Пункты реализовать в методе main
// *Пункты реализовать в разных методах

// int i = new Random().nextInt(k); //это кидалка случайных чисел!)

public class seminar_1
{
    public static void main(String[] args) 
    {
        int i = new Random().nextInt(0, 2000);
        System.out.println("Случайное число - "+i);

        int n = Integer.toBinaryString(i).length()-1;
        System.out.println("Номер старшего значащего бита - " + n + ", числа " + i);

        short count_1=0;
        for (int j=i; j<Short.MAX_VALUE; j++){
            if (j%n==0){
                count_1++;
            }
        }
        
        int[] m1=new int[count_1];
        for (int j=i, q=0; j<Short.MAX_VALUE; j++){
            if (j%n==0){
                m1[q]=j;
                q++;
            }
        }

        short count_2=0;
        for (int w=Short.MIN_VALUE; w<i; w++){
            if (w%n!=0){
                count_2++;
            }
        }

        int[] m2=new int[count_2];
        for (int w=Short.MIN_VALUE, e=0; w<i; w++){
            if (w%n!=0){
                m2[e]=w;
                e++;
            }
        }
    }
}