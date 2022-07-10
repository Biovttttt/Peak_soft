package home_work_17;

import java.util.Arrays;

public   class Farm     {
    private String addres;
    private Animal animals[];
    private String OwnerName;

    public Farm(String addres, Animal[] animals, String ownerName) {
        this.addres = addres;
        this.animals = animals;
        OwnerName = ownerName;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "addres='" + addres + '\'' +
                ", animals=" + Arrays.toString(animals) +
                ", OwnerName='" + OwnerName + '\'' +
                '}';
    }
}
