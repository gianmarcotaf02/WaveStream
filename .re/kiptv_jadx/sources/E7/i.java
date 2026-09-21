package E7;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends C7.B {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C7.M f3241i;
    public final E7.g j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final E7.k f3242k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.util.List f3243l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f3244m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final java.lang.String[] f3245n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final java.lang.String f3246o;

    public i(C7.M m8, E7.g gVar, E7.k kind, java.util.List arguments, boolean z6, java.lang.String... formatParams) {
        kotlin.jvm.internal.m.e(kind, "kind");
        kotlin.jvm.internal.m.e(arguments, "arguments");
        kotlin.jvm.internal.m.e(formatParams, "formatParams");
        this.f3241i = m8;
        this.j = gVar;
        this.f3242k = kind;
        this.f3243l = arguments;
        this.f3244m = z6;
        this.f3245n = formatParams;
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(formatParams, formatParams.length);
        this.f3246o = java.lang.String.format(kind.f3277h, java.util.Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Override // C7.B, C7.a0
    public final C7.a0 A0(C7.I newAttributes) {
        kotlin.jvm.internal.m.e(newAttributes, "newAttributes");
        return this;
    }

    @Override // C7.B
    /* JADX INFO: renamed from: B0 */
    public final C7.B y0(boolean z6) {
        java.lang.String[] strArr = this.f3245n;
        return new E7.i(this.f3241i, this.j, this.f3242k, this.f3243l, z6, (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
    }

    @Override // C7.B
    /* JADX INFO: renamed from: C0 */
    public final C7.B A0(C7.I newAttributes) {
        kotlin.jvm.internal.m.e(newAttributes, "newAttributes");
        return this;
    }

    @Override // C7.AbstractC0191x
    public final p180v7.o N() {
        return this.j;
    }

    @Override // C7.AbstractC0191x
    public final java.util.List s0() {
        return this.f3243l;
    }

    @Override // C7.AbstractC0191x
    public final C7.I t0() {
        C7.I.f1547i.getClass();
        return C7.I.j;
    }

    @Override // C7.AbstractC0191x
    public final C7.M u0() {
        return this.f3241i;
    }

    @Override // C7.AbstractC0191x
    public final boolean v0() {
        return this.f3244m;
    }

    @Override // C7.AbstractC0191x
    /* JADX INFO: renamed from: w0 */
    public final C7.AbstractC0191x z0(D7.f kotlinTypeRefiner) {
        kotlin.jvm.internal.m.e(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // C7.a0
    public final C7.a0 z0(D7.f kotlinTypeRefiner) {
        kotlin.jvm.internal.m.e(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }
}
