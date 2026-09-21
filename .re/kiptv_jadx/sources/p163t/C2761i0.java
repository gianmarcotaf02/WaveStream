package p163t;

/* JADX INFO: renamed from: t.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2761i0 implements p163t.A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f27616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f27617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Object f27618c;

    public C2761i0(float f9, float f10, java.lang.Object obj) {
        this.f27616a = f9;
        this.f27617b = f10;
        this.f27618c = obj;
    }

    @Override // p163t.InterfaceC2766l
    public final p163t.G0 a(p163t.E0 e6) {
        java.lang.Object obj = this.f27618c;
        return new p008a8.c(this.f27616a, this.f27617b, obj == null ? null : (p163t.r) e6.f27453a.invoke(obj));
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p163t.C2761i0) {
            p163t.C2761i0 c2761i0 = (p163t.C2761i0) obj;
            if (c2761i0.f27616a == this.f27616a && c2761i0.f27617b == this.f27617b && kotlin.jvm.internal.m.a(c2761i0.f27618c, this.f27618c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Object obj = this.f27618c;
        return java.lang.Float.hashCode(this.f27617b) + p121o0.p.c(this.f27616a, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }

    public /* synthetic */ C2761i0(java.lang.Object obj) {
        this(1.0f, 1500.0f, obj);
    }
}
