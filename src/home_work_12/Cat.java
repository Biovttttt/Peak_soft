package home_work_12;
// кошка
public class Cat {
    private String breed ;// порода
    private String name;
    private String color;
    private int age;


    public String toString() {
        return "Кошка {" +
                "Порода='" + breed + '\'' +
                ", Название='" + name + '\'' +
                ", Цвет='" + color + '\'' +
                ", Возраст=" + age +
                '}';
    }
    public void sets(String breed,String name,String color,int age){
        this.breed=breed;
        this.name=name;
        this.color=color;
        this.age=age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
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
