package entities;

import java.util.ArrayList;
import java.util.List;

public class ValueList<T> {

    public List<T> listOf = new ArrayList<>();

    public void addValue(T value) {
        listOf.add(value);

    }


    public T first() {
        if (listOf.isEmpty()) {
            throw new IllegalStateException("Error: List is empty");
        }
        return listOf.getFirst();
    }

    public void print() {
        System.out.print("[");
        for (int i = 0; i < listOf.size(); i++) {
            System.out.print(listOf.get(i));
            if (i < listOf.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }


}
