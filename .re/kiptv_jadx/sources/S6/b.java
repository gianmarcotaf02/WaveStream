package S6;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Class f9510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A8.t f9511b;

    public b(java.lang.Class cls, A8.t tVar) {
        this.f9510a = cls;
        this.f9511b = tVar;
    }

    public final java.lang.String a() {
        return O7.x.v0(this.f9510a.getName(), '.', '/').concat(".class");
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof S6.b) {
            return kotlin.jvm.internal.m.a(this.f9510a, ((S6.b) obj).f9510a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9510a.hashCode();
    }

    public final java.lang.String toString() {
        return S6.b.class.getName() + ": " + this.f9510a;
    }
}
