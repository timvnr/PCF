package ast;

import interp.*;
import typer.Type;

public abstract class Term extends AST {

    public abstract Value interp(Env e);
    public abstract Type typer(Env<Type> e);
}
