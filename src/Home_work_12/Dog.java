package Home_work_12;
// Собака
public class Dog {
    private String breed ;// порода
    private String name;
    private String color;
    private int age;


    public String toString() {
        return "Собака{" +
                "Порода='" + breed + '\'' +
                ", Имя='" + name + '\'' +
                ", цвет='" + color + '\'' +
                ", возраст=" + age +
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
