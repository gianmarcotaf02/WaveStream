package p104m1;

/* JADX INFO: loaded from: classes.dex */
public final class b implements p104m1.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p188x0.M f25157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f25158b;

    public b(p188x0.M m8, float f9) {
        this.f25157a = m8;
        this.f25158b = f9;
    }

    @Override // p104m1.o
    public final float a() {
        return this.f25158b;
    }

    @Override // p104m1.o
    public final long b() {
        int i3 = p188x0.C3098s.f31128h;
        return p188x0.C3098s.g;
    }

    @Override // p104m1.o
    public final p188x0.AbstractC3095o c() {
        return this.f25157a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p104m1.b)) {
            return false;
        }
        p104m1.b bVar = (p104m1.b) obj;
        return kotlin.jvm.internal.m.a(this.f25157a, bVar.f25157a) && java.lang.Float.compare(this.f25158b, bVar.f25158b) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.f25158b) + (this.f25157a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BrushStyle(value=");
        sb.append(this.f25157a);
        sb.append(", alpha=");
        return p121o0.p.q(sb, this.f25158b, ')');
    }
}
