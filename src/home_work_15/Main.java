package home_work_15;

public class Main {
    public static void main(String[] args) {

        Animal[] massiv = new Animal[3];
        massiv[0] = new Shark();
        massiv[1] = new Turtle();
        massiv[2] = new Eagle();

 ///Для разделение создано 3 массива ниже
        Shark[] massiv_shark = new Shark[1];
        Turtle[] massiv_turtle = new Turtle[1];
        Eagle[] massiv_eagle = new Eagle[1];

        for (Animal a : massiv) {

            if (a instanceof Shark) {
                ((Shark) a).attack();
                massiv_shark[0] = (Shark) a;
            }

            if (a instanceof Turtle) {
                ((Turtle) a).swim();
                massiv_turtle[0] = (Turtle) a;
            }

            if (a instanceof Eagle) {
                ((Eagle) a).fly();
                massiv_eagle[0] = (Eagle) a;
            }
        }
        for (Eagle a: massiv_eagle ) {
            System.out.println(a);
        }
        for (Turtle b: massiv_turtle ) {
            System.out.println(b);
        }
        for (Shark c: massiv_shark ) {
            System.out.println(c);
        }
}

    }

