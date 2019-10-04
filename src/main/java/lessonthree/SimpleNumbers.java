package lessonthree;

import java.util.ArrayList;
import java.util.List;

public class SimpleNumbers {
    public static void main(String[] args) {
        System.out.println(getSimpleNumbers());
    }

    private static List<Integer> getSimpleNumbers() {
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i < 1000; i++) {
            Boolean canAttached = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    canAttached = false;
                    break;
                }
            }
            if (canAttached) {
                list.add(i);
            }
        }
        return list;
    }
}
