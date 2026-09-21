package D6;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f2456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f2457b;

    public d(float f9, float f10) {
        this.f2456a = f9;
        this.f2457b = f10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean d(java.lang.Comparable comparable, java.lang.Comparable comparable2) {
        return ((java.lang.Number) comparable).floatValue() <= ((java.lang.Number) comparable2).floatValue();
    }

    public final java.lang.Comparable a() {
        return java.lang.Float.valueOf(this.f2457b);
    }

    public final java.lang.Comparable b() {
        return java.lang.Float.valueOf(this.f2456a);
    }

    public final boolean c() {
        return this.f2456a > this.f2457b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof D6.d)) {
            return false;
        }
        if (c() && ((D6.d) obj).c()) {
            return true;
        }
        D6.d dVar = (D6.d) obj;
        return this.f2456a == dVar.f2456a && this.f2457b == dVar.f2457b;
    }

    public final int hashCode() {
        if (c()) {
            return -1;
        }
        return java.lang.Float.hashCode(this.f2457b) + (java.lang.Float.hashCode(this.f2456a) * 31);
    }

    public final java.lang.String toString() {
        return this.f2456a + ".." + this.f2457b;
    }
}
