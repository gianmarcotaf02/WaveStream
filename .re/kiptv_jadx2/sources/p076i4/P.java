package p076i4;

public abstract class P {
    public abstract Object delegate();

    public String toString() {
        return delegate().toString();
    }
}
