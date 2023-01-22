package interp;

public class IntVal extends Value {
    public int value;

    public IntVal(int value) {
        this.value = value;
    }

    public String toString() {
        return Integer.toString(value);
    }
}
