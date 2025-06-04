package arraycolletions;

import java.util.HashSet;
import java.util.Set;

public class HeterogeneousSet {

    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("Hello");
        set.add(1);
        set.add(3.14);
        set.add(true);

        System.out.println(set.size());
        set.remove(3.14);
        System.out.println(set.contains(1));

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        System.out.println(nums);

        //set.addAll(nums); //Union between two sets
        //System.out.println(set);

        set.retainAll(nums); //Intersection between two sets

        //set.clear();
        System.out.println(set);
    }
}
