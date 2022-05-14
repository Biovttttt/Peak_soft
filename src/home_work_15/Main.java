package home_work_15;

public class Main {
    public static void main(String[] args) {
        Animal[] massiv = new Animal[3];
        Shark[] massiv_shark = new Shark[1];
        Turtle[] massiv_turtle = new Turtle[1];
        Eagle[] massiv_eagle = new Eagle[1];
        massiv[0] = new Shark();
        massiv[1] = new Turtle();
        massiv[2] = new Eagle();

        for (Animal a : massiv) {

            if (a instanceof Shark) {
                ((Shark) a).attack();
                massiv_shark[0] = (Shark) a;
            }





    }

}

    }

