package p005a5;

/* JADX INFO: renamed from: a5.o6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1363o6 extends p005a5.AbstractC1412t6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f14891a;

    public C1363o6(java.lang.String str) {
        this.f14891a = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p005a5.C1363o6) && kotlin.jvm.internal.m.a(this.f14891a, ((p005a5.C1363o6) obj).f14891a);
    }

    public final int hashCode() {
        return this.f14891a.hashCode();
    }

    public final java.lang.String toString() {
        return Y6.f.m(new java.lang.StringBuilder("Failed(messageKey="), this.f14891a, ")");
    }
}
