package home_work_28;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] massiv = {1,2,3,4,5,6,7,8,9};

        double A=Arrays.stream(massiv).map(x-> x%2 ==0?Math.pow(x,2):0).max(Double::compareTo).get();
        System.out.println(A);
    }
}
