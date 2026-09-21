package S4;

/* JADX INFO: loaded from: classes.dex */
public final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f9352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9353b;

    public L(java.lang.String str, boolean z6) {
        this.f9352a = str;
        this.f9353b = z6;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S4.L)) {
            return false;
        }
        S4.L l2 = (S4.L) obj;
        return kotlin.jvm.internal.m.a(this.f9352a, l2.f9352a) && this.f9353b == l2.f9353b;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.f9353b) + (this.f9352a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "ClassifiedTerm(text=" + this.f9352a + ", isCompleted=" + this.f9353b + ")";
    }
}
