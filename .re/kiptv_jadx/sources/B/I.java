package B;

/* JADX INFO: loaded from: classes.dex */
public final class I extends p137q0.o implements Q0.r0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f471v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f472w;

    @Override // Q0.r0
    public final java.lang.Object z0(java.lang.Object obj) {
        B.W w6 = obj instanceof B.W ? (B.W) obj : null;
        if (w6 == null) {
            w6 = new B.W();
        }
        w6.f500a = this.f471v;
        w6.f501b = this.f472w;
        return w6;
    }
}
