package ast;

import interp.Env;
import interp.IntVal;
import interp.Value;
import typer.Type;
import typer.TypeError;

public class BinOp extends Term {
    public OP op;
    public Term term1;
    public Term term2;
    public BinOp(OP op, Term term1, Term term2) {
        this.op = op;
        this.term1 = term1;
        this.term2 = term2;
    }

    @Override
    public Value interp(Env e) {
        switch (op) {
            case PLUS:
                return new IntVal(((IntVal) term1.interp(e)).value + ((IntVal) term2.interp(e)).value);
            case MINUS:
                return new IntVal(((IntVal) term1.interp(e)).value - ((IntVal) term2.interp(e)).value);
            case TIMES:
                return new IntVal(((IntVal) term1.interp(e)).value * ((IntVal) term2.interp(e)).value);
            case DIVIDE:
                if (((IntVal) term2.interp(e)).value == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return new IntVal(((IntVal) term1.interp(e)).value / ((IntVal) term2.interp(e)).value);
            default:
                throw new IllegalArgumentException("Unexpected operator: " + op);
        }
    }

    @Override
    public Type typer(Env<Type> e) {
        Type type = term1.typer(e);
        if(!type.unify(term2.typer(e))) {
            throw new TypeError(String.format("Couldn't unify %s and %s", term1.toString(), term2.toString()));
        }
        return type;
    }
}
