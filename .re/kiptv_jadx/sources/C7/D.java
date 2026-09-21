package C7;

/* JADX INFO: loaded from: classes4.dex */
public final class D extends C7.AbstractC0183o {
    public final C7.I j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(C7.B b9, C7.I attributes) {
        super(b9);
        kotlin.jvm.internal.m.e(attributes, "attributes");
        this.j = attributes;
    }

    @Override // C7.AbstractC0182n
    public final C7.AbstractC0182n F0(C7.B b9) {
        return new C7.D(b9, this.j);
    }

    @Override // C7.AbstractC0182n, C7.AbstractC0191x
    public final C7.I t0() {
        return this.j;
    }
}
