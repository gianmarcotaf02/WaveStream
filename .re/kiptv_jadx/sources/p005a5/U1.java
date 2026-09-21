package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class U1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f13960a;

    public U1(java.lang.String str) {
        this.f13960a = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p005a5.U1) && kotlin.jvm.internal.m.a(this.f13960a, ((p005a5.U1) obj).f13960a);
    }

    public final int hashCode() {
        java.lang.String str = this.f13960a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final java.lang.String toString() {
        return Y6.f.m(new java.lang.StringBuilder("Optional(url="), this.f13960a, ")");
    }
}
