package B3;

/* JADX INFO: loaded from: classes.dex */
public final class z implements A6.b, p080i8.f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f676h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f677i;

    public /* synthetic */ z(int i3, int i9) {
        this.f676h = i9;
        this.f677i = i3;
    }

    @Override // p080i8.f
    public java.lang.String a() {
        switch (this.f676h) {
            case 5:
                return Y6.f.k(new java.lang.StringBuilder("expected at least "), this.f677i, " digits");
            default:
                return Y6.f.k(new java.lang.StringBuilder("expected at most "), this.f677i, " digits");
        }
    }

    public boolean b(int i3) {
        return (this.f677i & i3) == i3;
    }

    public boolean c() {
        return !(!b(32) || b(64) || b(128)) || b(64);
    }

    @Override // A6.b
    public java.lang.Object getValue(java.lang.Object obj, E6.u property) {
        I7.d thisRef = (I7.d) obj;
        kotlin.jvm.internal.m.e(thisRef, "thisRef");
        kotlin.jvm.internal.m.e(property, "property");
        return thisRef.f5551h.get(this.f677i);
    }

    public z(p184w3.q qVar) {
        this.f676h = 4;
        this.f677i = qVar.f29907l;
    }
}
