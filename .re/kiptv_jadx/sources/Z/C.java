package Z;

/* JADX INFO: loaded from: classes.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z.C1165p0 f12189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p089k0.e f12190b;

    public C(Z.C1165p0 c1165p0, p089k0.e eVar) {
        this.f12189a = c1165p0;
        this.f12190b = eVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z.C)) {
            return false;
        }
        Z.C c9 = (Z.C) obj;
        return kotlin.jvm.internal.m.a(this.f12189a, c9.f12189a) && this.f12190b.equals(c9.f12190b);
    }

    public final int hashCode() {
        Z.C1165p0 c1165p0 = this.f12189a;
        return this.f12190b.hashCode() + ((c1165p0 == null ? 0 : c1165p0.hashCode()) * 31);
    }

    public final java.lang.String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.f12189a + ", transition=" + this.f12190b + ')';
    }
}
