package Home_work_14;

public class Singer extends Person {
    private String bandName;

    public Singer(String name, String desingnation, String bandName) {
        super(name, desingnation);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    void Singing(){
        System.out.println(super.getName() + " sings, BandName :" + getBandName() +"      This is the singing method from the Singer class ");
    }
    void playGitar(){
        System.out.println(super.getName() + " playing Guitar, BandName :" + getBandName()+"      This is the playGitar method from the   Singer class " );
    }


    public String toString() {
        return "Singer{ Singer name: " + super.getName()+
                ",bandName='" + bandName + '\'' +
                '}';
    }
}
