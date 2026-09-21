package B;

/* JADX INFO: loaded from: classes.dex */
public final class D extends p137q0.o implements Q0.r0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public p137q0.f f464v;

    @Override // Q0.r0
    public final java.lang.Object z0(java.lang.Object obj) {
        B.W w6 = obj instanceof B.W ? (B.W) obj : null;
        if (w6 == null) {
            w6 = new B.W();
        }
        w6.f502c = new B.C0087z(this.f464v);
        return w6;
    }
}
