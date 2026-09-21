package g1;

/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p011b1.C1650g f21786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g1.q f21787b;

    public D(p011b1.C1650g c1650g, g1.q qVar) {
        this.f21786a = c1650g;
        this.f21787b = qVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1.D)) {
            return false;
        }
        g1.D d4 = (g1.D) obj;
        return kotlin.jvm.internal.m.a(this.f21786a, d4.f21786a) && kotlin.jvm.internal.m.a(this.f21787b, d4.f21787b);
    }

    public final int hashCode() {
        return this.f21787b.hashCode() + (this.f21786a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "TransformedText(text=" + ((java.lang.Object) this.f21786a) + ", offsetMapping=" + this.f21787b + ')';
    }
}
