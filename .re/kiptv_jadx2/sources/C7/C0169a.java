package C7;

public final class C0169a extends AbstractC0182n {

    public final B f1575i;
    public final B j;

    public C0169a(B delegate, B abbreviation) {
        kotlin.jvm.internal.m.e(delegate, "delegate");
        kotlin.jvm.internal.m.e(abbreviation, "abbreviation");
        this.f1575i = delegate;
        this.j = abbreviation;
    }

    @Override
    public final B A0(I newAttributes) {
        kotlin.jvm.internal.m.e(newAttributes, "newAttributes");
        return new C0169a(this.f1575i.A0(newAttributes), this.j);
    }

    @Override
    public final B D0() {
        return this.f1575i;
    }

    @Override
    public final AbstractC0182n F0(B b9) {
        return new C0169a(b9, this.j);
    }

    @Override
    public final C0169a y0(boolean z6) {
        return new C0169a(this.f1575i.y0(z6), this.j.y0(z6));
    }

    @Override
    public final C0169a z0(D7.f kotlinTypeRefiner) {
        kotlin.jvm.internal.m.e(kotlinTypeRefiner, "kotlinTypeRefiner");
        B type = this.f1575i;
        kotlin.jvm.internal.m.e(type, "type");
        B type2 = this.j;
        kotlin.jvm.internal.m.e(type2, "type");
        return new C0169a(type, type2);
    }
}
