package семинары;

import java.util.HashMap;
import java.util.Iterator;

public class seminar_6 {
    private static HashMap<Integer, Object> mapa = new HashMap<>();
    private static final Object objectiv = new Object();
    public static void main(String[] args) {
        AddChislo(0);
        AddChislo(7);
        AddChislo(43);
        AddChislo(13); 
        AddChislo(44);
        AddChislo(1);
        AddChislo(9);
        AddChislo(38);
        AddChislo(10);
        AddChislo(50);
        System.out.println(isEmpty());
        Pechat();
        System.out.println();
        try {
            System.out.println(printOneEl(20));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void AddChislo(Integer number){
        mapa.put(number, objectiv);   
    } 
    private static boolean isEmpty(){
        return mapa.isEmpty();
    }
    private static void Pechat(){
        Iterator<Integer> iterator = mapa.keySet().iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
    }
    private static int printOneEl(int index){
        return (Integer)mapa.keySet().toArray()[index];
    }      
}

