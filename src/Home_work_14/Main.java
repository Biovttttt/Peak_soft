package Home_work_14;

public class Main {
    public static void main(String[] args) {
        System.out.println("++++++++++++++++++++++++++++++ Оснавная Задания по этому уроку  начало ++++++++++++++++++++++++++++++++");
        System.out.println("МЕЙН МЕТОДКО 3 КЛАССТЫН ОБЪЕКТИЛЕРИН ТУЗОСУЗДОР, ПОЛЕЛЕРИНЕ КОНСТРУКТОР МЕНЕН МААНИ БЕРИП,\n" +
                "КОНСОЛГО TOSTRING() МЕТОДУН КОЛДОНУП МААЛЫМАТТАРЫН  ЧЫГАРЫНЫЗДАР.\n");
        Dancer dancer= new Dancer("Filipp","Танцор","YeYe");
        System.out.println(dancer.toString());
        Singer singer=new Singer("Asel","Singer","Kyz Burak");
        System.out.println(singer.toString());
        Programmer programmer = new Programmer("Tilek","Programmer","C Technolgy");
        System.out.println(programmer.toString());

        System.out.println("++++++++++++++++++++++++++++++ Задание конец+++++ +++++++++++++++++++++++++++");
        System.out.println("++++++++++++++++++++++++++++++ Дополнительная работа под этой задачей. вызовы методы из класса PERSON через подклассов Dancer/Programmer/Singer, Также вызовы методов классов Dancer/Programmer/Singer ++++++++++++++++++++++++++++++++");
        dancer.dancing();  // метод из класса Dancer
        dancer.eat();
        dancer.learn();
        dancer.walk();
        singer.eat();
        singer.learn();
        singer.walk();
        singer.playGitar();  // метод из класса Singer
        singer.Singing();  // метод из класса Singer
        programmer.eat();
        programmer.learn();
        programmer.walk();
        programmer.coding();  // метод из класса Programmer
        System.out.println("++++++++++++++++++++++++++++++ Дополнительная работа под этой задачей. конец ++++++++++++++++++++++++++++++++");

    }
}
