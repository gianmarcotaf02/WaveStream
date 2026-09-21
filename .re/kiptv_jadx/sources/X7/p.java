package X7;

/* JADX INFO: loaded from: classes4.dex */
public class p extends S7.AbstractC0876a implements p117n6.d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p100l6.c f10932k;

    public p(p100l6.c cVar, p100l6.h hVar) {
        super(hVar, true, true);
        this.f10932k = cVar;
    }

    @Override // S7.p0
    public final boolean I() {
        return true;
    }

    @Override // S7.p0
    public void f(java.lang.Object obj) throws S7.J {
        X7.a.h(S7.C.C(obj), com.google.common.util.concurrent.P.h0(this.f10932k));
    }

    @Override // p117n6.d
    public final p117n6.d getCallerFrame() {
        p100l6.c cVar = this.f10932k;
        if (cVar instanceof p117n6.d) {
            return (p117n6.d) cVar;
        }
        return null;
    }

    @Override // S7.p0
    public void h(java.lang.Object obj) {
        this.f10932k.resumeWith(S7.C.C(obj));
    }

    public void c0() {
    }
}
