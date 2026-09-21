package C7;

/* JADX INFO: renamed from: C7.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0184p extends C7.T {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C7.T f1597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C7.T f1598c;

    public C0184p(C7.T t9, C7.T t10) {
        this.f1597b = t9;
        this.f1598c = t10;
    }

    @Override // C7.T
    public final boolean a() {
        return this.f1597b.a() || this.f1598c.a();
    }

    @Override // C7.T
    public final boolean b() {
        return this.f1597b.b() || this.f1598c.b();
    }

    @Override // C7.T
    public final O6.h c(O6.h annotations) {
        kotlin.jvm.internal.m.e(annotations, "annotations");
        return this.f1598c.c(this.f1597b.c(annotations));
    }

    @Override // C7.T
    public final C7.P d(C7.AbstractC0191x abstractC0191x) {
        C7.P pD = this.f1597b.d(abstractC0191x);
        return pD == null ? this.f1598c.d(abstractC0191x) : pD;
    }

    @Override // C7.T
    public final C7.AbstractC0191x f(C7.AbstractC0191x topLevelType, C7.b0 position) {
        kotlin.jvm.internal.m.e(topLevelType, "topLevelType");
        kotlin.jvm.internal.m.e(position, "position");
        return this.f1598c.f(this.f1597b.f(topLevelType, position), position);
    }
}
