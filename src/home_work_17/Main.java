package home_work_17;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
   Farm farm1 = new Farm("talas",new Animal[]{
           new Cow(1,2,"male","CowName1"),
           new Cow(1,2,"male","CowName2"),
           new Cow(1,2,"male","CowName3"),
           new Cow(1,2,"male","CowName4"),
           new Cow(1,2,"male","CowName5"),
           new Horse(1,2,"male","HorseName1","black"),
           new Horse(1,2,"male","HorseName2","White"),
           new Sheep(1,2,"male","SheepName1" ),
           new Sheep(1,2,"male","SheepName2" ),
           new Sheep(1,2,"male","SheepName3" ),
   },"TIlek");

   Farm farm2 = new Farm("Batken",new Animal[]{
           new Cow(1,2,"male","CowName1"),
           new Horse(1,2,"male","HorseName1","black"),
           new Sheep(1,2,"male","SheepName1" )
   },"Tilek2");

        System.out.println("farm1 ="+farm1.toString());
        System.out.println("farm2 ="+farm2.toString());
    }

}

