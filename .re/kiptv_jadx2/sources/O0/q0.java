package O0;

public final class q0 {

    public final t0 f7679a;

    public N f7680b;

    public final p0 f7681c = new p0(this, 2);

    public final p0 f7682d = new p0(this, 0);

    public final p0 f7683e = new p0(this, 1);

    public q0(t0 t0Var) {
        this.f7679a = t0Var;
    }

    public final N a() {
        N n3 = this.f7680b;
        if (n3 != null) {
            return n3;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }
}
