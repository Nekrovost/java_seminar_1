package семинары;

import java.util.HashMap;
import java.util.Iterator;

public class seminar_6 {
    private static HashMap<Integer, Object> mapa = new HashMap<>();
    private static final Object objectiv = new Object();
    public static void main(String[] args) {
        AddChislo(1234);
        AddChislo(43214);
        AddChislo(898);
        AddChislo(80085); 
        AddChislo(4444);
        AddChislo(1);
        AddChislo(9);
        AddChislo(3568);
        AddChislo(1);
        AddChislo(5);
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

