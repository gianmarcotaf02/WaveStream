package p142q7;

/* JADX INFO: loaded from: classes4.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f26656a;

    public g(java.lang.Object obj) {
        this.f26656a = obj;
    }

    public abstract C7.AbstractC0191x a(N6.B b9);

    public java.lang.Object b() {
        return this.f26656a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        java.lang.Object objB = b();
        p142q7.g gVar = obj instanceof p142q7.g ? (p142q7.g) obj : null;
        return kotlin.jvm.internal.m.a(objB, gVar != null ? gVar.b() : null);
    }

    public final int hashCode() {
        java.lang.Object objB = b();
        if (objB != null) {
            return objB.hashCode();
        }
        return 0;
    }

    public java.lang.String toString() {
        return java.lang.String.valueOf(b());
    }
}
