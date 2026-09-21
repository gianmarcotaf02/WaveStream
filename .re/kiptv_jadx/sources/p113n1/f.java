package p113n1;

/* JADX INFO: loaded from: classes.dex */
public final class f implements java.lang.Comparable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f25552h;

    public /* synthetic */ f(float f9) {
        this.f25552h = f9;
    }

    public static final /* synthetic */ p113n1.f a(float f9) {
        return new p113n1.f(f9);
    }

    public static int b(float f9, float f10) {
        if (java.lang.Float.isNaN(f9) || java.lang.Float.isNaN(f10)) {
            return 0;
        }
        return java.lang.Float.compare(f9, f10);
    }

    public static final boolean c(float f9, float f10) {
        return java.lang.Float.compare(f9, f10) == 0;
    }

    public static java.lang.String d(float f9) {
        if (java.lang.Float.isNaN(f9)) {
            return "Dp.Unspecified";
        }
        return f9 + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object obj) {
        return b(this.f25552h, ((p113n1.f) obj).f25552h);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p113n1.f) {
            return java.lang.Float.compare(this.f25552h, ((p113n1.f) obj).f25552h) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.f25552h);
    }

    public final java.lang.String toString() {
        return d(this.f25552h);
    }
}
