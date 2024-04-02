package by.itstep.goutor.javalesson.lesson32.task.task1.model.entity.container.iterator;

public class TestContainer {
    public static void main(String[] args) {

        int n = 10;
        Integer on = n;
        Integer result = on + on;
        System.out.println(result);
    }

    public static void test(java.lang.Iterable iteratorable) {

    }

    public static void test(Iterator iterator) {
        while (iterator.hashElement()) {
            System.out.println(iterator.element() + " ");
        }

    }


}
