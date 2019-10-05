package lessonthree;

import java.util.ArrayList;
import java.util.List;

public class FibonachiNumbers {

    public static void main(String[] args) {
        final List<Integer> fibonachiList = new ArrayList<>();
        countNumbers(fibonachiList);
        System.out.println(fibonachiList);
    }

    private static void countNumbers(List<Integer> list) {
        list.clear();
        list.add(0);
        list.add(1);
        for (int i = 2; i < 30; i++) {
            list.add(list.get(i - 1) + list.get(i - 2));
        }
    }

}
