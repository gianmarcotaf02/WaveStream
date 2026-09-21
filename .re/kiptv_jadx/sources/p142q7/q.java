package p142q7;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends p142q7.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p142q7.f f26666a;

    public q(p142q7.f fVar) {
        this.f26666a = fVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p142q7.q) && kotlin.jvm.internal.m.a(this.f26666a, ((p142q7.q) obj).f26666a);
    }

    public final int hashCode() {
        return this.f26666a.hashCode();
    }

    public final java.lang.String toString() {
        return "NormalClass(value=" + this.f26666a + ')';
    }
}
