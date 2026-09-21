package p154s;

/* JADX INFO: loaded from: classes.dex */
public final class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.internal.o f27105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p163t.A f27106b;

    /* JADX WARN: Multi-variable type inference failed */
    public Z(p194x6.j jVar, p163t.A a2) {
        this.f27105a = (kotlin.jvm.internal.o) jVar;
        this.f27106b = a2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p154s.Z)) {
            return false;
        }
        p154s.Z z6 = (p154s.Z) obj;
        return this.f27105a.equals(z6.f27105a) && this.f27106b.equals(z6.f27106b);
    }

    public final int hashCode() {
        return this.f27106b.hashCode() + (this.f27105a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "Slide(slideOffset=" + this.f27105a + ", animationSpec=" + this.f27106b + ')';
    }
}
