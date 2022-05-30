package home_work_17;

public abstract class Animal {
    private double weight;
    private int age;
    private String gender;
    private String nickName;


    public Animal(double weight, int age, String gender, String nickName ) {
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.nickName = nickName;

    }

    @Override
    public String toString() {
        return
                "weight=" + weight +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", nickName='" + nickName + '\'';
    }
}
