package interp;

import java.util.Optional;

public class EmptyEnv<T> extends Env {
    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Binding last() {
        return null;
    }

    @Override
    public Env<T> previous() {
        return null;
    }

    @Override
    public Optional<T> lookup(String id) {
        return null;
    }
}

