package home_work_12;
// Рыба
public class Fish {
    private String clas ;// порода
    private String color;
    private int age;


    public String toString() {
        return "Рыба {" +
                "Класс рыбы='" + clas + '\'' +
                ", цвет='" + color + '\'' +
                ", возраст=" + age +
                '}';
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
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
