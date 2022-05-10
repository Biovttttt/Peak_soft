package Home_work_12;
// Попугай
public class Parrot {
    private String breed ;// порода
    private String name;
    private String color;
    private int age;


    public String toString() {
        return "Попугай {" +
                "Виды Попугая='" + breed + '\'' +
                ", Имя ='" + name + '\'' +
                ", Цвет ='" + color + '\'' +
                ", Возраст =" + age +
                '}';
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
