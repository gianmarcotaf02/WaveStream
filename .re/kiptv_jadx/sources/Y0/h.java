package Y0;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Y0.h f11035c = new Y0.h(0.0f, new D6.d(0.0f, 0.0f));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f11036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D6.d f11037b;

    public h(float f9, D6.d dVar) {
        this.f11036a = f9;
        this.f11037b = dVar;
        if (java.lang.Float.isNaN(f9)) {
            throw new java.lang.IllegalArgumentException("current must not be NaN");
        }
    }

    public final D6.d a() {
        return this.f11037b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y0.h)) {
            return false;
        }
        Y0.h hVar = (Y0.h) obj;
        return this.f11036a == hVar.f11036a && this.f11037b.equals(hVar.f11037b);
    }

    public final int hashCode() {
        return (this.f11037b.hashCode() + (java.lang.Float.hashCode(this.f11036a) * 31)) * 31;
    }

    public final java.lang.String toString() {
        return "ProgressBarRangeInfo(current=" + this.f11036a + ", range=" + this.f11037b + ", steps=0)";
    }
}
