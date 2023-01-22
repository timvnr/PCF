package ast;

import interp.Env;
import interp.Value;
import typer.Type;

public class Var extends Term {
    String varName;

    public Var(String varName) {
        this.varName = varName;
    }

    @Override
    public Value interp(Env e) {
        return null;
    }

    @Override
    public Type typer(Env e) {
        return null;
    }
}