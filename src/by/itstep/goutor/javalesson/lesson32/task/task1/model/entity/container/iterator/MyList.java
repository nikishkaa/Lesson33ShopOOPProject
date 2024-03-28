package by.itstep.goutor.javalesson.lesson32.task.task1.model.entity.container.iterator;

import java.util.LinkedList;

public class MyList {
    private LinkedList<Integer> list;

    public MyList() {
        list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

    }

    public MyList(LinkedList<Integer> list) {
        this.list = list;
    }

    public int size() {
        return list.size();
    }

    public int get(int index) {
        return list.get(index);
    }

}
