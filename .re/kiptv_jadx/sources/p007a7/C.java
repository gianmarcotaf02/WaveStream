package p007a7;

/* JADX INFO: loaded from: classes4.dex */
public final class C extends L7.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p007a7.i f15426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f15427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p194x6.j f15428d;

    public C(p007a7.i iVar, java.util.Set set, p194x6.j jVar) {
        this.f15426b = iVar;
        this.f15427c = set;
        this.f15428d = jVar;
    }

    @Override // L7.k
    public final boolean c(java.lang.Object obj) {
        N6.InterfaceC0691e current = (N6.InterfaceC0691e) obj;
        kotlin.jvm.internal.m.e(current, "current");
        if (current == this.f15426b) {
            return true;
        }
        p180v7.o oVarJ = current.J();
        kotlin.jvm.internal.m.d(oVarJ, "getStaticScope(...)");
        if (!(oVarJ instanceof p007a7.E)) {
            return true;
        }
        this.f15427c.addAll((java.util.Collection) this.f15428d.invoke(oVarJ));
        return false;
    }

    @Override // L7.k
    public final /* bridge */ /* synthetic */ java.lang.Object i() {
        return p070h6.A.f22523a;
    }
}
