package home_work;

public class Triangle {
    double a,b,c;

    void area (double a,double b, double c){
        double r=(a+b+c)/2;
        double S=Math.sqrt(r*(r-a)*(r-b)*(r-c));
        System.out.println(" Площадь треугольника A b C равна :" + S );
    }
}
