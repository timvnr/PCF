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
    public Env previous() {
        return null;
    }

    @Override
    public Env add(String id, Value value) {
        return null;
    }

    @Override
    public Optional<Value> lookup(String id) {
        return null;
    }
}

