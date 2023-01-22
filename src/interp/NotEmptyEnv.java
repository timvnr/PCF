package interp;

import java.util.Optional;

public class NotEmptyEnv extends Env {
    public Binding binding;
    public Env env;

    public NotEmptyEnv(Binding binding, Env env) {
        this.binding = binding;
        this.env = env;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Binding last() {
        return this.binding;
    }

    @Override
    public Env previous() {
        return this.env;
    }

    @Override
    public Env add(String id, Value value) {
        return new NotEmptyEnv(new Binding(id, value), this);
    }

    @Override
    public Optional<Value> lookup(String id) {
        return this.binding.getName().equals(id) ? Optional.of(this.binding.getValue()) : this.env.lookup(id);
    }
}
