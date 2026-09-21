package p193x5;

/* JADX INFO: renamed from: x5.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3129m implements p193x5.InterfaceC3137q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f31538a;

    public C3129m(java.lang.String id) {
        kotlin.jvm.internal.m.e(id, "id");
        this.f31538a = id;
    }

    public final java.lang.String a() {
        return this.f31538a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p193x5.C3129m) && kotlin.jvm.internal.m.a(this.f31538a, ((p193x5.C3129m) obj).f31538a);
    }

    public final int hashCode() {
        return this.f31538a.hashCode();
    }

    public final java.lang.String toString() {
        return Y6.f.m(new java.lang.StringBuilder("Category(id="), this.f31538a, ")");
    }
}
