package J5;

/* JADX INFO: renamed from: J5.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0609m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f6499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f6500b;

    public C0609m(float f9, float f10) {
        this.f6499a = f9;
        this.f6500b = f10;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J5.C0609m)) {
            return false;
        }
        J5.C0609m c0609m = (J5.C0609m) obj;
        return java.lang.Float.compare(this.f6499a, c0609m.f6499a) == 0 && java.lang.Float.compare(this.f6500b, c0609m.f6500b) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.f6500b) + (java.lang.Float.hashCode(this.f6499a) * 31);
    }

    public final java.lang.String toString() {
        return "PreviewOverflow(top=" + this.f6499a + ", bottom=" + this.f6500b + ")";
    }
}
