package p055f8;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements java.lang.Comparable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f21745h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f21746i;

    public a(int i3, int i9) {
        this.f21745h = i3;
        this.f21746i = i9;
        if (i9 < 0) {
            throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.play_billing.M0.l(i9, "Digits must be non-negative, but was ").toString());
        }
    }

    public final int a(int i3) {
        int i9 = this.f21745h;
        int i10 = this.f21746i;
        if (i3 == i10) {
            return i9;
        }
        int[] iArr = p055f8.b.f21747a;
        return i3 > i10 ? i9 * iArr[i3 - i10] : i9 / iArr[i10 - i3];
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object obj) {
        p055f8.a other = (p055f8.a) obj;
        kotlin.jvm.internal.m.e(other, "other");
        int iMax = java.lang.Math.max(this.f21746i, other.f21746i);
        return kotlin.jvm.internal.m.f(a(iMax), other.a(iMax));
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof p055f8.a)) {
            return false;
        }
        p055f8.a other = (p055f8.a) obj;
        kotlin.jvm.internal.m.e(other, "other");
        int iMax = java.lang.Math.max(this.f21746i, other.f21746i);
        return kotlin.jvm.internal.m.f(a(iMax), other.a(iMax)) == 0;
    }

    public final int hashCode() {
        throw new java.lang.UnsupportedOperationException("DecimalFraction is not supposed to be used as a hash key");
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i3 = p055f8.b.f21747a[this.f21746i];
        int i9 = this.f21745h;
        sb.append(i9 / i3);
        sb.append('.');
        sb.append(O7.q.V0(java.lang.String.valueOf((i9 % i3) + i3), androidx.media3.extractor.metadata.icy.IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE));
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }
}
