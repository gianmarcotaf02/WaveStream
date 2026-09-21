package C7;

public abstract class AbstractC0183o extends AbstractC0182n {

    public final B f1596i;

    public AbstractC0183o(B b9) {
        this.f1596i = b9;
    }

    @Override
    public final B y0(boolean z6) {
        return z6 == v0() ? this : this.f1596i.y0(z6).A0(t0());
    }

    @Override
    public final B A0(I newAttributes) {
        kotlin.jvm.internal.m.e(newAttributes, "newAttributes");
        return newAttributes != t0() ? new D(this, newAttributes) : this;
    }

    @Override
    public final B D0() {
        return this.f1596i;
    }
}
