package v;

/* JADX INFO: loaded from: classes.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f28803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p188x0.S f28804b;

    public C(float f9, p188x0.S s9) {
        this.f28803a = f9;
        this.f28804b = s9;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v.C)) {
            return false;
        }
        v.C c9 = (v.C) obj;
        return p113n1.f.c(this.f28803a, c9.f28803a) && this.f28804b.equals(c9.f28804b);
    }

    public final int hashCode() {
        return this.f28804b.hashCode() + (java.lang.Float.hashCode(this.f28803a) * 31);
    }

    public final java.lang.String toString() {
        return "BorderStroke(width=" + ((java.lang.Object) p113n1.f.d(this.f28803a)) + ", brush=" + this.f28804b + ')';
    }
}
