import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        CustomList<String> customList = new CustomList<>();
        customList.addLast("test");
        customList.addFirst("test2");

        System.out.println(customList.getFirst());
        String test3 = "";
        Double test4 = 2.0;

        Class t1 = test3.getClass();

        if(t1.equals(test4.getClass())) {

        }
    }
}