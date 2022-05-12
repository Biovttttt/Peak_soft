package Home_work_14;

public class Programmer extends Person  {
    private String companyName;

    public Programmer(String name, String desingnation, String companyName) {
        super(name, desingnation);
        this.companyName = companyName;
    }



    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    void coding(){
        System.out.println(super.getName() + " Coding , CompanyName :" + getCompanyName() +"      This is the coding method from the Programmer Class ");
    }
    @Override
    public String toString() {
        return "Programmer{ Programmer name: " + super.getName()+
                ",companyName='" + companyName + '\'' +
                '}';
    }
}
