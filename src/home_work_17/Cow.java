package home_work_17;

public   class Cow  extends  Animal{

    public Cow(double weight, int age, String gender, String nickName) {
       super(weight,age,gender,nickName);

    }

    @Override
    public String toString() {
        return "Cow{" +
                super.toString()+
                "}";
    }
}
