package C7;

/* JADX INFO: renamed from: C7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0169a extends C7.AbstractC0182n {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C7.B f1575i;
    public final C7.B j;

    public C0169a(C7.B delegate, C7.B abbreviation) {
        kotlin.jvm.internal.m.e(delegate, "delegate");
        kotlin.jvm.internal.m.e(abbreviation, "abbreviation");
        this.f1575i = delegate;
        this.j = abbreviation;
    }

    @Override // C7.B
    /* JADX INFO: renamed from: C0 */
    public final C7.B A0(C7.I newAttributes) {
        kotlin.jvm.internal.m.e(newAttributes, "newAttributes");
        return new C7.C0169a(this.f1575i.A0(newAttributes), this.j);
    }

    @Override // C7.AbstractC0182n
    public final C7.B D0() {
        return this.f1575i;
    }

    @Override // C7.AbstractC0182n
    public final C7.AbstractC0182n F0(C7.B b9) {
        return new C7.C0169a(b9, this.j);
    }

    @Override // C7.B, C7.a0
    /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] */
    public final C7.C0169a y0(boolean z6) {
        return new C7.C0169a(this.f1575i.y0(z6), this.j.y0(z6));
    }

    @Override // C7.AbstractC0182n, C7.a0
    /* JADX INFO: renamed from: H0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C7.C0169a z0(D7.f kotlinTypeRefiner) {
        kotlin.jvm.internal.m.e(kotlinTypeRefiner, "kotlinTypeRefiner");
        C7.B type = this.f1575i;
        kotlin.jvm.internal.m.e(type, "type");
        C7.B type2 = this.j;
        kotlin.jvm.internal.m.e(type2, "type");
        return new C7.C0169a(type, type2);
    }
}
