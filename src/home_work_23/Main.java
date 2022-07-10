package home_work_23;

import java.lang.reflect.Array;
import java.util.*;

public class Main  {

  public static   void main(String[] args) {



        int [] a = new int[10];
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < a.length ; i++) {
            a[i]=new Random().nextInt(2);
        }
        for (int i = 0; i <a.length ; i++) {
            arrayList.add(new Random().nextInt(2));
        }
        for (int i = 0; i <a.length ; i++) {
            linkedList.add(new Random().nextInt(2));
        }


       Sort1(a);
       Sort1(linkedList);
       Sort1(arrayList);

        for (int b : a) {
            System.out.println("massibe: "+b);
        }
        for (int c : arrayList) {
            System.out.println("arrayList: "+c);
        }
        for (int d : linkedList) {
            System.out.println("Linked List: "+d);
        }





    }

    public static void Sort1(LinkedList<Integer> linkedList) {
        Collections.sort(linkedList);  }
    public static void Sort1(ArrayList <Integer> arrayList) {
        Collections.sort(arrayList);
       }
    public static void Sort1 (int a[]){
        Arrays.sort(a);
           }

}

