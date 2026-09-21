package t5;

/* JADX INFO: renamed from: t5.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2809j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f28215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f28216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f28217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f28218d;

    public C2809j(float f9, float f10, float f11, float f12) {
        this.f28215a = f9;
        this.f28216b = f10;
        this.f28217c = f11;
        this.f28218d = f12;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t5.C2809j)) {
            return false;
        }
        t5.C2809j c2809j = (t5.C2809j) obj;
        return java.lang.Float.compare(this.f28215a, c2809j.f28215a) == 0 && java.lang.Float.compare(this.f28216b, c2809j.f28216b) == 0 && java.lang.Float.compare(this.f28217c, c2809j.f28217c) == 0 && java.lang.Float.compare(this.f28218d, c2809j.f28218d) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.f28218d) + p121o0.p.c(this.f28217c, p121o0.p.c(this.f28216b, java.lang.Float.hashCode(this.f28215a) * 31, 31), 31);
    }

    public final java.lang.String toString() {
        return "SliverSpec(base=" + this.f28215a + ", slide=" + this.f28216b + ", scaleY=" + this.f28217c + ", alpha=" + this.f28218d + ")";
    }
}
