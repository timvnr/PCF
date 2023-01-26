package ast;

import interp.Env;
import interp.Value;
import typer.Type;

public class Let extends Term {
    String name;
    Term term1;
    Term term2;

    public String getName() {
        return name;
    }

    public Term getValue() {
        return term1;
    }

    public Let(String name, Term term1, Term term2) {
        this.name = name;
        this.term1 = term1;
        this.term2 = term2;
    }

    @Override
    public Value interp(Env e) {
        e = e.add(name,term1.interp(e));
        return term2.interp(e);
    }

    @Override
    public Type typer(Env<Type> e) {
        e = e.add(name,term1.typer(e));
        return term2.typer(e);
    }


}