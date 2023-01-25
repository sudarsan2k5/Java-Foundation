//                                    Assignment Questions
//Q2. Convert the list of Strings {“ab”, “bc”, “cd”, “de”, “ef”, “fg”, “gh”} into an array of strings and print all
//        strings stored on odd indices of the array.
//        Output:
//        bc
//        de
//        fg

public class covert_string_into_array {
    public static void main(String[] args) {
        String[] name = {"ab", "bc", "cd", "de", "ef", "fg", "gh"};
        for(int i = 0; i < name.length; i++){
            if(i % 2 != 0){
                System.out.println(name[i]);
            }
        }

    }
}
