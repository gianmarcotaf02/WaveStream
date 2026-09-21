package p044e7;

/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f21469a;

    public o(java.lang.String str) {
        this.f21469a = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p044e7.o) && kotlin.jvm.internal.m.a(this.f21469a, ((p044e7.o) obj).f21469a);
    }

    public final int hashCode() {
        return this.f21469a.hashCode();
    }

    public final java.lang.String toString() {
        return Y6.f.l(new java.lang.StringBuilder("MemberSignature(signature="), this.f21469a, ')');
    }
}
