package p188x0;

/* JADX INFO: loaded from: classes.dex */
public final class D extends p188x0.M {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.List f31043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f31044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f31045e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f31046f;

    public D(java.util.List list, java.util.ArrayList arrayList, long j, long j9) {
        this.f31043c = list;
        this.f31044d = arrayList;
        this.f31045e = j;
        this.f31046f = j9;
    }

    @Override // p188x0.M
    public final android.graphics.Shader b(long j) {
        long j9 = this.f31045e;
        int i3 = (int) (j9 >> 32);
        if (java.lang.Float.intBitsToFloat(i3) == Float.POSITIVE_INFINITY) {
            i3 = (int) (j >> 32);
        }
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat(i3);
        int i9 = (int) (j9 & 4294967295L);
        if (java.lang.Float.intBitsToFloat(i9) == Float.POSITIVE_INFINITY) {
            i9 = (int) (j & 4294967295L);
        }
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat(i9);
        long j10 = this.f31046f;
        int i10 = (int) (j10 >> 32);
        if (java.lang.Float.intBitsToFloat(i10) == Float.POSITIVE_INFINITY) {
            i10 = (int) (j >> 32);
        }
        float fIntBitsToFloat3 = java.lang.Float.intBitsToFloat(i10);
        int i11 = (int) (j10 & 4294967295L);
        if (java.lang.Float.intBitsToFloat(i11) == Float.POSITIVE_INFINITY) {
            i11 = (int) (j & 4294967295L);
        }
        float fIntBitsToFloat4 = java.lang.Float.intBitsToFloat(i11);
        long jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
        long jFloatToRawIntBits2 = (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L);
        java.util.List list = this.f31043c;
        java.util.ArrayList arrayList = this.f31044d;
        p188x0.z.N(arrayList, list);
        int iL = p188x0.z.l(list);
        return new android.graphics.LinearGradient(java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)), java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32)), java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L)), p188x0.z.z(iL, list), p188x0.z.A(arrayList, list, iL), android.graphics.Shader.TileMode.CLAMP);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p188x0.D)) {
            return false;
        }
        p188x0.D d4 = (p188x0.D) obj;
        return this.f31043c.equals(d4.f31043c) && kotlin.jvm.internal.m.a(this.f31044d, d4.f31044d) && p181w0.a.b(this.f31045e, d4.f31045e) && p181w0.a.b(this.f31046f, d4.f31046f);
    }

    public final int hashCode() {
        int iHashCode = this.f31043c.hashCode() * 31;
        java.util.ArrayList arrayList = this.f31044d;
        return java.lang.Integer.hashCode(0) + p121o0.p.e(p121o0.p.e((iHashCode + (arrayList != null ? arrayList.hashCode() : 0)) * 31, 31, this.f31045e), 31, this.f31046f);
    }

    public final java.lang.String toString() {
        java.lang.String str;
        long j = this.f31045e;
        java.lang.String str2 = "";
        if (((((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str = "start=" + ((java.lang.Object) p181w0.a.i(j)) + ", ";
        } else {
            str = "";
        }
        long j9 = this.f31046f;
        if (((((j9 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((java.lang.Object) p181w0.a.i(j9)) + ", ";
        }
        return "LinearGradient(colors=" + this.f31043c + ", stops=" + this.f31044d + ", " + str + str2 + "tileMode=Clamp)";
    }
}
