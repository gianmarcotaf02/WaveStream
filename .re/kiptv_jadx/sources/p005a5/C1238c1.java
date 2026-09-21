package p005a5;

/* JADX INFO: renamed from: a5.c1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1238c1 implements p005a5.InterfaceC1268f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f14289a;

    public C1238c1(java.lang.String message) {
        kotlin.jvm.internal.m.e(message, "message");
        this.f14289a = message;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p005a5.C1238c1) && kotlin.jvm.internal.m.a(this.f14289a, ((p005a5.C1238c1) obj).f14289a);
    }

    public final int hashCode() {
        return this.f14289a.hashCode();
    }

    public final java.lang.String toString() {
        return Y6.f.m(new java.lang.StringBuilder("Error(message="), this.f14289a, ")");
    }
}
