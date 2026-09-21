package p064h0;

/* JADX INFO: loaded from: classes.dex */
public class c extends p078i6.AbstractC2256g {
    public static final p064h0.c j = new p064h0.c(p064h0.k.f22446e, 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p064h0.k f22432h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f22433i;

    public c(p064h0.k kVar, int i3) {
        this.f22432h = kVar;
        this.f22433i = i3;
    }

    public final p064h0.c a(java.lang.Object obj, p073i0.a aVar) {
        Y2.L lU = this.f22432h.u(obj, obj != null ? obj.hashCode() : 0, aVar, 0);
        return lU == null ? this : new p064h0.c((p064h0.k) lU.j, this.f22433i + lU.f11389i);
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        return this.f22432h.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public java.lang.Object get(java.lang.Object obj) {
        return this.f22432h.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }
}
