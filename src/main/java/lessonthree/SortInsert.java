package lessonthree;

import java.util.ArrayList;
import java.util.List;

public class SortInsert {

    public static void main(String[] args) {
        final List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add((int) (Math.random() * 1000));
        }
        System.out.println(list);
        doSort(list);
        System.out.println(list);
    }

    private static void doSort(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j > 0; j--) {
                if (list.get(j) < list.get(j - 1)) {
                    final int current = list.get(j);
                    list.set(j, list.get(j - 1));
                    list.set(j - 1, current);
                } else {
                    break;
                }
            }
        }
    }

}
