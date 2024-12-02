package KI.Tymkiv.Lab6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Jar<T extends Comparable<T>> extends ArrayList<T> {
    public Jar(Collection<T> collection) {
        super(collection);
    }
    public T findMin() {
        if (this.isEmpty()) {
            throw new IllegalStateException("Jar is empty");
        }
        return Collections.min(this);
    }
    public T findMax() {
        if (this.isEmpty()) {
            throw new IllegalStateException("Jar is empty");
        }
        return Collections.max(this);
    }
    public T getRandom() {
        return this.get(new Random().nextInt(0, size())
        );
    }
    public Jar<T> sorted() {
        Jar<T> copyToSort = new Jar<>(this);
        Collections.sort(copyToSort);
        return copyToSort;
    }
}