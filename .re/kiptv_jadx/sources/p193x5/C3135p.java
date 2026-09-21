package p193x5;

/* JADX INFO: renamed from: x5.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3135p implements p193x5.InterfaceC3137q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f31570a;

    public C3135p(java.lang.String key) {
        kotlin.jvm.internal.m.e(key, "key");
        this.f31570a = key;
    }

    public final java.lang.String a() {
        return this.f31570a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p193x5.C3135p) && kotlin.jvm.internal.m.a(this.f31570a, ((p193x5.C3135p) obj).f31570a);
    }

    public final int hashCode() {
        return this.f31570a.hashCode();
    }

    public final java.lang.String toString() {
        return Y6.f.m(new java.lang.StringBuilder("Tag(key="), this.f31570a, ")");
    }
}
