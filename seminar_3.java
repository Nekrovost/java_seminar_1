package семинары;
import java.util.ArrayList;  
import java.util.List;
import java.util.Random;
import java.util.Collections;
//Пусть дан произвольный список целых чисел.
// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение
public class seminar_3 {
    public static void main(String[] args){
        int j = new Random().nextInt(0, 50);
        System.out.println("размер листа= "+j);
        ArrayList<Integer> list_1=new ArrayList<Integer>(j);
        for (int i = 0; i < j; i++) {
            list_1.add(new Random().nextInt(0, 1000));
            System.out.println(list_1.get(i));
        }
        Object object;
        
        // 1 задание   
        // for (int a=j-1; a>0; a--){
        //     if  (list_1.get(a) % 2==0){
        //         list_1.remove(a);
        //     }
        // }
        // System.out.println("ashldjgfaslkdghlke");
        // for (int q = 0; q < list_1.size(); q++) {
        //     System.out.println(list_1.get(q));
        // }

        // 2 задание
        // int  min=1000;
        // for  (int qwe=0; qwe<j; qwe++){
        //     if(min>list_1.get(qwe)){
        //         min=list_1.get(qwe);
        //     }
        // }
        // System.out.println("min= "+min);
        
        
        // 3 задание
        // int  max=0;
        // for  (int qwe=0; qwe<j; qwe++){
        //     if(max<list_1.get(qwe)){
        //         max=list_1.get(qwe);
        //     }
        // }
        // System.out.println("max= "+max);
            
        // 4 задание
        int num=0;
        for (int qwe=0; qwe<j; qwe++){
            num=num+list_1.get(qwe);
        }
        System.out.println("среднее значение="+num/j);
    }
}
