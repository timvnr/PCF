package interp;

import ast.Term;
import ast.Var;

public class Closure extends Value {
    public Var name;
    public Term body;
    public Env env;

    public Closure(Var name, Term body, Env env) {
        this.name = name;
        this.body = body;
        this.env = env;
    }
}
