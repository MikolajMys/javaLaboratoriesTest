import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        CustomList<String> customList = new CustomList<>();
        customList.addLast("test");
        customList.addFirst("test2");

        System.out.println(customList.getFirst());
    }
}