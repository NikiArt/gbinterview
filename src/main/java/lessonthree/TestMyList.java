package lessonthree;

public class TestMyList {
    public static void main(String[] args) {

        final MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.addFirst("a");
        myLinkedList.addLast("b");
        myLinkedList.addFirst("c");
        myLinkedList.addLast("d");
        myLinkedList.add(3, "e");
        myLinkedList.add(1, "f");
        System.out.println(myLinkedList.toString());

    }
}
