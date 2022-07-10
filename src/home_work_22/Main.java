package home_work_22;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 50 ; i++) {
            int random = new Random().nextInt(100);
            list.add(random);
        }
        //list.forEach(System.out::println);

        ArrayList<Integer>list1 = new ArrayList<>();
        ArrayList<Integer>list2 = new ArrayList<>();

        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i)%2==0){
                list1.add(list.get(i));
            }
            else
            {
                list2.add(list.get(i));
            }
        }

        for (int a: list1) {
            System.out.println(a);
        }
         for (int b: list2) {
             System.out.println(b);
        }




    }

}
