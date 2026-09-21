package Q0;

/* JADX INFO: renamed from: Q0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0778l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f8446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f8447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f8448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f8449d;

    public C0778l(float f9, float f10, float f11, float f12) {
        this.f8446a = f9;
        this.f8447b = f10;
        this.f8448c = f11;
        this.f8449d = f12;
        if (f9 < 0.0f) {
            N0.a.a("Left must be non-negative");
        }
        if (f10 < 0.0f) {
            N0.a.a("Top must be non-negative");
        }
        if (f11 < 0.0f) {
            N0.a.a("Right must be non-negative");
        }
        if (f12 >= 0.0f) {
            return;
        }
        N0.a.a("Bottom must be non-negative");
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q0.C0778l)) {
            return false;
        }
        Q0.C0778l c0778l = (Q0.C0778l) obj;
        return p113n1.f.c(this.f8446a, c0778l.f8446a) && p113n1.f.c(this.f8447b, c0778l.f8447b) && p113n1.f.c(this.f8448c, c0778l.f8448c) && p113n1.f.c(this.f8449d, c0778l.f8449d);
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(true) + p121o0.p.c(this.f8449d, p121o0.p.c(this.f8448c, p121o0.p.c(this.f8447b, java.lang.Float.hashCode(this.f8446a) * 31, 31), 31), 31);
    }

    public final java.lang.String toString() {
        return "DpTouchBoundsExpansion(start=" + ((java.lang.Object) p113n1.f.d(this.f8446a)) + ", top=" + ((java.lang.Object) p113n1.f.d(this.f8447b)) + ", end=" + ((java.lang.Object) p113n1.f.d(this.f8448c)) + ", bottom=" + ((java.lang.Object) p113n1.f.d(this.f8449d)) + ", isLayoutDirectionAware=true)";
    }
}
