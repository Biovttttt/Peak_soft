package home_work_25;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Car Honda = new Car(1,111,2016,"black","Honda","5000");
        Car Toyota = new Car(2,222,2015,"Yellow","Toyota","7000");
       
        HashMap<Integer,String> hashMap = new HashMap<>();

        hashMap.put(Honda.getId()," ,Цвет "+Honda.getColor()+",Модел "+Honda.getModel()+", цвет " +Honda.getColor()+", Цена "+Honda.getPrice());
        hashMap.put(Toyota.getId()," ,Цвет "+Toyota.getColor()+",Модел "+Toyota.getModel()+", цвет " +Toyota.getColor()+", Цена "+Toyota.getPrice());

        System.out.println(hashMap.entrySet());;



    }
}
