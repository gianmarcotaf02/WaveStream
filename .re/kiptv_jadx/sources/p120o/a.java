package p120o;

/* JADX INFO: loaded from: classes.dex */
public final class a extends p120o.f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.util.HashMap f25951l = new java.util.HashMap();

    @Override // p120o.f
    public final p120o.c d(java.lang.Object obj) {
        return (p120o.c) this.f25951l.get(obj);
    }

    @Override // p120o.f
    public final java.lang.Object e(java.lang.Object obj) {
        java.lang.Object objE = super.e(obj);
        this.f25951l.remove(obj);
        return objE;
    }
}
