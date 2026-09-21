package v;

/* JADX INFO: loaded from: classes.dex */
public final class B0 extends v.z0 {
    @Override // v.z0, v.x0
    public final void a(long j, long j9) {
        if (!java.lang.Float.isNaN(Float.NaN)) {
            this.f29044a.setZoom(Float.NaN);
        }
        if ((9223372034707292159L & j9) != 9205357640488583168L) {
            this.f29044a.show(java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (j & 4294967295L)), java.lang.Float.intBitsToFloat((int) (j9 >> 32)), java.lang.Float.intBitsToFloat((int) (j9 & 4294967295L)));
        } else {
            this.f29044a.show(java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }
}
