package p163t;

/* JADX INFO: loaded from: classes.dex */
public final class K0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p163t.r f27479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p163t.InterfaceC2780y f27480b;

    public K0(p163t.r rVar, p163t.InterfaceC2780y interfaceC2780y) {
        this.f27479a = rVar;
        this.f27480b = interfaceC2780y;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p163t.K0)) {
            return false;
        }
        p163t.K0 k1 = (p163t.K0) obj;
        return kotlin.jvm.internal.m.a(this.f27479a, k1.f27479a) && kotlin.jvm.internal.m.a(this.f27480b, k1.f27480b);
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(0) + ((this.f27480b.hashCode() + (this.f27479a.hashCode() * 31)) * 31);
    }

    public final java.lang.String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.f27479a + ", easing=" + this.f27480b + ", arcMode=ArcMode(value=0))";
    }
}
