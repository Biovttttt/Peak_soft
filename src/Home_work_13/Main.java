package Home_work_13;

import java.awt.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Class clas = new Class(1,"Tilek", new int[]{1,2,3});
        System.out.println("Соз: "+clas.getWord()+", Номер: "+clas.getNumber()+",massive: "+Arrays.toString(clas.getMassiv()));
    }
}
