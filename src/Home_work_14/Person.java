package Home_work_14;

public class Person {
    private String name;
    private String desingnation;

    public  Person(String name,String desingnation){
        this.name=name;
        this.desingnation=desingnation;
    }

    void learn(){
        System.out.println("This is the Learn method from the Person class");
    }
    void walk(){
        System.out.println("This is the walk method from the Person class");
    }
    void eat(){
        System.out.println("This is the eat method from the Person class");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesingnation() {
        return desingnation;
    }

    public void setDesingnation(String desingnation) {
        this.desingnation = desingnation;
    }
}
