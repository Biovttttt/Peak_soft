package Set;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(0);
        set2.add(1);
        set2.add(2);

        System.out.println(symmetricDifference(set1,set2));

    }
    public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>();
        Set<Integer> result2 = new HashSet<>();
        result.addAll(set1);
        result.removeAll(set2);
        result2.addAll(set2);
        result2.removeAll(set1);
        result.addAll(result2);
        return result;
    }



}
