package S4;

/* JADX INFO: renamed from: S4.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0870i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f9399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f9400b;

    public C0870i(double d4, java.lang.String text) {
        kotlin.jvm.internal.m.e(text, "text");
        this.f9399a = d4;
        this.f9400b = text;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S4.C0870i)) {
            return false;
        }
        S4.C0870i c0870i = (S4.C0870i) obj;
        return java.lang.Double.compare(this.f9399a, c0870i.f9399a) == 0 && kotlin.jvm.internal.m.a(this.f9400b, c0870i.f9400b);
    }

    public final int hashCode() {
        return this.f9400b.hashCode() + (java.lang.Double.hashCode(this.f9399a) * 31);
    }

    public final java.lang.String toString() {
        return "ContentVariantProgress(fraction=" + this.f9399a + ", text=" + this.f9400b + ")";
    }
}
