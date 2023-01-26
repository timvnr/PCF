package ast;

import interp.*;
import typer.Type;

import java.util.Optional;

public abstract class Term extends AST {

    public abstract Value interp(Env<Value> e);
    public abstract Type typer(Env<Type> e);
}
