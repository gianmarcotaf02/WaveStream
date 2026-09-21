package I;

/* JADX INFO: loaded from: classes.dex */
public final class b implements I.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f4524a;

    public b(float f9) {
        this.f4524a = f9;
    }

    @Override // I.a
    public final float a(long j, p113n1.c cVar) {
        return cVar.Y(this.f4524a);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof I.b) && p113n1.f.c(this.f4524a, ((I.b) obj).f4524a);
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.f4524a);
    }

    public final java.lang.String toString() {
        return "CornerSize(size = " + this.f4524a + ".dp)";
    }
}
