package org.jruby.util.collections;

/**
 * A carrier object with a single field
 */
public class SingleObject<T> {
    public SingleObject() {}

    public SingleObject(T object) {
        this.object = object;
    }

    public T object;
}
