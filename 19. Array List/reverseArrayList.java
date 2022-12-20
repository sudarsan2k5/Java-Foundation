import java.util.ArrayList;
public class reverseArrayList {
    static void reverseList(ArrayList<Integer> list){
       int i = 0;
       int j = list.size() - 1;

    while (i > j){
         /* int temp = a;
         a = b;               // Swap Method
         b = temp;
          */
        Integer temp = Integer.valueOf(list.get(i));
        list.set(i, list.get(j));
        list.set(j, temp);
        i++;
        j--;
    }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(22);
        list.add(32);
        list.add(90);
        list.add(12);
    System.out.println("Original List: " + list);
    reverseList(list);
    System.out.print("Reversed List: " + list);

    }
}
