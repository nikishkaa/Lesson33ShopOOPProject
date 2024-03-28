package by.itstep.goutor.javalesson.lesson32.task.task1.model.entity.container.iterator;

public class MyArrayIterator {
    private MyArray myArray;
    private int cursor = 0;

    public MyArrayIterator(MyArray myArray) {
        this.myArray = myArray;
    }

    @Override
    public int element() {
        return myArray.getElement(cursor++);
    }

    @Override
    public boolean hasElement() {
        return cursor < myArray.getLength();
    }
}
