import java.util.*;

class Marks {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(50); list.add(70); list.add(90);

        System.out.println(list);
        System.out.println("Max: "+Collections.max(list));
        System.out.println("Min: "+Collections.min(list));
    }
}