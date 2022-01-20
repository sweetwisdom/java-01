import java.util.ArrayList;
import java.util.List;

public class game01 {
    public static void main(String[] args) {
        double rand = Math.random();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int max = (int)(Math.random()*6+1);
            result.add (max);
//            System.out.println(max);
        }
        result.forEach(System.out::println);
//        int ok = (int)(rand*6+1);
    }
}
