package interp;

import java.util.Optional;

public class NotEmptyEnv<T> extends Env {
    public Binding<T> binding;
    public Env<T> env;

    public NotEmptyEnv(Binding binding, Env env) {
        this.binding = binding;
        this.env = env;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Binding<T> last() {
        return this.binding;
    }

    @Override
    public Env<T> previous() {
        return this.env;
    }

    @Override
    public Optional<T> lookup(String id) {
        return this.binding.getName().equals(id) ? Optional.of(this.binding.getValue()) : this.env.lookup(id);
    }
}
