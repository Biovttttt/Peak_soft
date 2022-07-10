package home_work;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Triangle tr = new Triangle();
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите стороны A,B,C последовательно test ");
        tr.area(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
    }
}
