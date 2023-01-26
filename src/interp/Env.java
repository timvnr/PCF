package interp;

import java.util.Optional;

public abstract class Env<T> {
    public abstract boolean isEmpty();
    // last() returns the last binding added to the environment
    public abstract Binding last();
    // previous() returns the previous environment
    public abstract Env previous();
    // creates a new environment whose last binding is id = value
    public Env<T> add(String id, T value) {
        return new NotEmptyEnv<T>(new Binding<T>(id, value), this);
    }

    // returns the value of id if it exists, hence the use of Optional
    public abstract Optional<T> lookup(String id);
}
