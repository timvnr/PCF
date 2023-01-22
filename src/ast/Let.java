package ast;

import interp.Env;
import interp.Value;
import typer.Type;

public class Let extends Term {
    String name;
    Term value;
    Term link;

    public String getName() {
        return name;
    }

    public Term getValue() {
        return value;
    }

    public Let(String name, Term value, Term link) {
        this.name = name;
        this.value = value;
        this.link = link;
    }

    @Override
    public Value interp(Env e) {
        return null;
    }

    @Override
    public Type typer(Env<Type> e) {
        return null;
    }


}