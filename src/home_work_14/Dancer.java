package home_work_14;

public class Dancer extends Person {
    private  String groupName;

    public Dancer(String name, String desingnation, String groupName) {
        super(name, desingnation);
        this.groupName = groupName;
    }


    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    void dancing(){
        System.out.println(super.getName() + " Dancing, desingnation : " +super.getDesingnation() + ", GroupName :" + getGroupName()+"   This is the dancing method from the Dancer class  " );
    }


    public String toString() {
        return "Dancer{ Dancer name: "  + super.getName() +
                ",groupName='" + groupName + '\'' +
                '}';
    }
}
