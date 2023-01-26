package ast;

import interp.Env;
import interp.Value;
import typer.Type;

import java.util.Optional;

public class Var extends Term {
    String name;

    public Var(String name) {
        this.name = name;
    }

    @Override
    public Value interp(Env<Value> e) {
        Optional<Value> value = e.lookup(name);
        if (value.isPresent()) {
            return value.get();
        } else {
            throw new RuntimeException("Variable " + name + " not found");
        }
    }

    @Override
    public Type typer(Env<Type> e) {
        Optional<Type> value = e.lookup(name);
        if (value.isPresent()) {
            return value.get().deref();
        } else {
            return new typer.Var().deref();
        }
    }
}