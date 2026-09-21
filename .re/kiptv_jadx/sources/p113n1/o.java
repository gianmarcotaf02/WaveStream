package p113n1;

/* JADX INFO: loaded from: classes.dex */
public final class o implements p122o1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f25568a;

    public o(float f9) {
        this.f25568a = f9;
    }

    @Override // p122o1.a
    public final float a(float f9) {
        return f9 / this.f25568a;
    }

    @Override // p122o1.a
    public final float b(float f9) {
        return f9 * this.f25568a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p113n1.o) && java.lang.Float.compare(this.f25568a, ((p113n1.o) obj).f25568a) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.f25568a);
    }

    public final java.lang.String toString() {
        return p121o0.p.q(new java.lang.StringBuilder("LinearFontScaleConverter(fontScale="), this.f25568a, ')');
    }
}
