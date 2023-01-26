package ast;

import interp.Closure;
import interp.Env;
import interp.Value;
import typer.Arrow;
import typer.Type;
import ast.Var;
import typer.TypeError;

import java.util.Optional;

public class Fun extends Term {
    private final Var argument;
    private final Term execution;
    public Fun(Var argument, Term execution) {
        this.argument = argument;
        this.execution = execution;
    }

    public Var getArgValue() {
        return argument;
    }

    public Term getExecution() {
        return execution;
    }

    @Override
    public Type typer(Env<Type> e) {
        return new Arrow(argument.typer(e).deref(), execution.typer(e).deref()).deref();
    }
    @Override
    public Value interp(Env<Value> e) {
        return new Closure(argument, execution,e);
    }
}