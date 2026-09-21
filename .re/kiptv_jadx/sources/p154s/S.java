package p154s;

/* JADX INFO: loaded from: classes.dex */
public final class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p163t.A f27096a;

    public S(p163t.A a2) {
        this.f27096a = a2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p154s.S)) {
            return false;
        }
        p154s.S s9 = (p154s.S) obj;
        s9.getClass();
        return java.lang.Float.compare(0.0f, 0.0f) == 0 && kotlin.jvm.internal.m.a(this.f27096a, s9.f27096a);
    }

    public final int hashCode() {
        return this.f27096a.hashCode() + (java.lang.Float.hashCode(0.0f) * 31);
    }

    public final java.lang.String toString() {
        return "Fade(alpha=0.0, animationSpec=" + this.f27096a + ')';
    }
}
