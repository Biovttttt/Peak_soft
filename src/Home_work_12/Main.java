package Home_work_12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cat cat = new Cat();
        Dog dog = new Dog();
        Fish fish = new Fish();
        Parrot parrot = new Parrot();
        // Кошка
        cat.sets("Домашняя кошка","Кошка1","Белая",2);    // По методу SETS присваение сразу 4 переменных из класса CAT , так как после него стоит setter для данного класса эти введенные данные будет переопределена , просто написал что и так можно  присваивать
        // по сеттеру
        cat.setBreed("Домашняя кошка");
        cat.setName("Koшка");
        cat.setColor("Белая");
        cat.setAge(1);
        // Собака // по сеттеру
        dog.setBreed("Бульдог");
        dog.setName("Алабай");
        dog.setColor("Желтая");
        dog.setAge(2);
        // Рыба // по сеттеру
        fish.setClas("хрящевых");
        fish.setColor("Темно синая");
        fish.setAge(1);
        // Попугай // по сеттеру
        parrot.setBreed("Корелла");
        parrot.setName("Виктория");
        parrot.setColor("Оранжевый");
        parrot.setAge(2);
        // Метод to String
        System.out.println("+++++++++++++++++++++++++++++++по методу to string +++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(cat.toString());
        System.out.println(dog.toString());
        System.out.println(fish.toString());
        System.out.println(parrot.toString());
        // по Getter из класса Cat
        System.out.println("++++++++++++++++++++++++++++++++++по Getter из класса Cat++++++++++++++++++++++++++++++++++++");
        System.out.println("Кошка {" +
                "Порода='" + cat.getBreed() + '\'' +
                ", имя='" + cat.getName() + '\'' +
                ", Цвет='" + cat.getColor() + '\'' +
                ", Возраст=" + cat.getAge() +
                '}');
        // по Getter из класса Dog
        System.out.println("+++++++++++++++++++++++++++++++++++// по Getter из класса Dog++++++++++++++++++++++++++++++++");
        System.out.println("Собака {" +
                "Порода='" + dog.getBreed() + '\'' +
                ", имя='" + dog.getName() + '\'' +
                ", Цвет='" + dog.getColor() + '\'' +
                ", Возраст=" + dog.getAge() +
                '}');
        // по Getter из класса Parrot
        System.out.println("+++++++++++++++++++++++++++++++++++++// по Getter из класса Parrot+++++++++++++++++++++++++++++++++++");
        System.out.println("Попугай {" +
                "Вид Попугая='" + parrot.getBreed() + '\'' +
                ", имя='" + parrot.getName() + '\'' +
                ", Цвет='" + parrot.getColor() + '\'' +
                ", Возраст=" + parrot.getAge() +
                '}');

        System.out.println("+++++++++++++++++++++++++++++++++// по Getter из класса Fish+++++++++++++++++++++++++++++++++++++");
        System.out.println("Рыба {" +
                "Класс рыбы='" + fish.getClas() + '\'' +
                ", Цвет='" + fish.getColor() + '\'' +
                ", Возраст='" + fish.getAge() + '\'' +
                 '}');
    }
}
