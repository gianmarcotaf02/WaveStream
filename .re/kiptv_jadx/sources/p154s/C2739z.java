package p154s;

/* JADX INFO: renamed from: s.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2739z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p137q0.d f27193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p194x6.j f27194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p163t.A f27195c;

    public C2739z(p137q0.d dVar, p194x6.j jVar, p163t.A a2) {
        this.f27193a = dVar;
        this.f27194b = jVar;
        this.f27195c = a2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p154s.C2739z)) {
            return false;
        }
        p154s.C2739z c2739z = (p154s.C2739z) obj;
        return kotlin.jvm.internal.m.a(this.f27193a, c2739z.f27193a) && kotlin.jvm.internal.m.a(this.f27194b, c2739z.f27194b) && kotlin.jvm.internal.m.a(this.f27195c, c2739z.f27195c);
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(true) + ((this.f27195c.hashCode() + ((this.f27194b.hashCode() + (this.f27193a.hashCode() * 31)) * 31)) * 31);
    }

    public final java.lang.String toString() {
        return "ChangeSize(alignment=" + this.f27193a + ", size=" + this.f27194b + ", animationSpec=" + this.f27195c + ", clip=true)";
    }
}
