package C5;

/* JADX INFO: renamed from: C5.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0110g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5.AbstractC0108f0 f1332a;

    public C0110g(C5.AbstractC0108f0 args) {
        kotlin.jvm.internal.m.e(args, "args");
        this.f1332a = args;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5.C0110g) && kotlin.jvm.internal.m.a(this.f1332a, ((C5.C0110g) obj).f1332a);
    }

    public final int hashCode() {
        return this.f1332a.hashCode();
    }

    public final java.lang.String toString() {
        return "OpenFullscreen(args=" + this.f1332a + ")";
    }
}
