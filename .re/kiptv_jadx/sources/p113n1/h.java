package p113n1;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f25554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f25555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f25556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f25557d;

    public h(float f9, float f10, float f11, float f12) {
        this.f25554a = f9;
        this.f25555b = f10;
        this.f25556c = f11;
        this.f25557d = f12;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p113n1.h)) {
            return false;
        }
        p113n1.h hVar = (p113n1.h) obj;
        return p113n1.f.c(this.f25554a, hVar.f25554a) && p113n1.f.c(this.f25555b, hVar.f25555b) && p113n1.f.c(this.f25556c, hVar.f25556c) && p113n1.f.c(this.f25557d, hVar.f25557d);
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.f25557d) + p121o0.p.c(this.f25556c, p121o0.p.c(this.f25555b, java.lang.Float.hashCode(this.f25554a) * 31, 31), 31);
    }

    public final java.lang.String toString() {
        return "DpRect(left=" + ((java.lang.Object) p113n1.f.d(this.f25554a)) + ", top=" + ((java.lang.Object) p113n1.f.d(this.f25555b)) + ", right=" + ((java.lang.Object) p113n1.f.d(this.f25556c)) + ", bottom=" + ((java.lang.Object) p113n1.f.d(this.f25557d)) + ')';
    }
}
