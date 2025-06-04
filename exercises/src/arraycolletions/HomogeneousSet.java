package arraycolletions;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class HomogeneousSet {

    public static void main(String[] args) {
        //Set<String> approvedList = new HashSet<>(); //defining the type of the elements in the set
        SortedSet<String> approvedList = new TreeSet<>(); //guarantees the order of the elements
        approvedList.add("Ana");
        approvedList.add("Carlos");
        approvedList.add("Lucas");
        approvedList.add("Pedro");

        for(String name: approvedList) {
            System.out.println(name);
        }
    }
}
