import java.util.ArrayList;
import java.util.Arrays;

public class arrayList {
    public static void main(String[] args) {
        //Wrapper classes
//        Integer in = Integer.valueOf(4);
//        System.out.println(in);
//        Float f = Float.valueOf(2.5f);
//        System.out.print(f);

        ArrayList<Integer> l1 = new ArrayList<>();
//        ArrayList<Float> l2 = new ArrayList<>();
//        ArrayList<Boolean> l3 = new ArrayList<>();

        //add new elements
        l1.add(5); // 5
        l1.add(6); // 5 6      adding value in right side
        l1.add(7); // 5 6 7
        l1.add(8); // 5 6 7 8

        // get an elements at index i
//        System.out.print(l1.get(1)); // ans -> 6
//        System.out.print(l1.get(2)); // ans -> 5
//        System.out.print(l1.get(3)); // ans -> 8

//       // Print with for loops
//        for(int i = 0; i < l1.size(); i++){
//                System.out.println(l1.get(i)); // 5 6 7 8
//        }

        // Printing The Array List directly
//            System.out.print(l1); // ans -> [5, 6, 7, 8]

        // Adding Elements at index i ---> adding 100 in index 1
        l1.add(1, 100); // output --> [5, 100, 6, 7, 8]
        System.out.println(l1);

        //Modifying elements at index i
        l1.set(1, 10);
        System.out.println(l1); // output --> [5, 10, 6, 7, 8]

        // Removing an elements at index i
        l1.remove(1);
        System.out.println(l1); // output --> [5, 6, 7, 8]

        // Removing an elements e not using index
        l1.remove(Integer.valueOf(7)); // removing elements not using index
        System.out.print(l1); // output --> [5, 6, 8]

        // Checking if an elements exists or not
        boolean ans = l1.contains(Integer.valueOf(60));
        System.out.println(ans); // output --> False because 60 not exist in arr

        // If you don't specify class, you can put anything inside l
        ArrayList l = new ArrayList();
        l.add("asdf");
        l.add(1);
        l.add(true);
        System.out.print(l);
    }
}
