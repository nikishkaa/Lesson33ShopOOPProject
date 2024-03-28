package by.itstep.goutor.javalesson.lesson32.task.task1.model.entity.container.iterator;

public class MyArray {
    private int[] array;

    public MyArray() {
        array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
    }

    public MyArray(int[] array) {
        this.array = array;
    }

    int getLength() {
        return array.length;

    }

    int getElement(int index) {
        return array[index];
    }

}
