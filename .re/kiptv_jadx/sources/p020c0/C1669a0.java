package p020c0;

/* JADX INFO: renamed from: c0.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1669a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f18216a;

    public C1669a0(java.lang.String str) {
        this.f18216a = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p020c0.C1669a0) && kotlin.jvm.internal.m.a(this.f18216a, ((p020c0.C1669a0) obj).f18216a);
    }

    public final int hashCode() {
        return this.f18216a.hashCode();
    }

    public final java.lang.String toString() {
        return Y6.f.l(new java.lang.StringBuilder("OpaqueKey(key="), this.f18216a, ')');
    }
}
