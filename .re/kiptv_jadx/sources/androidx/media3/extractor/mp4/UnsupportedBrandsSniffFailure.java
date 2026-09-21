package androidx.media3.extractor.mp4;

/* JADX INFO: loaded from: classes.dex */
public final class UnsupportedBrandsSniffFailure implements androidx.media3.extractor.SniffFailure {
    public final p107m4.a compatibleBrands;
    public final int majorBrand;

    public UnsupportedBrandsSniffFailure(int i3, int[] iArr) {
        p107m4.a aVar;
        this.majorBrand = i3;
        if (iArr != null) {
            p107m4.a aVar2 = p107m4.a.j;
            aVar = iArr.length == 0 ? p107m4.a.j : new p107m4.a(java.util.Arrays.copyOf(iArr, iArr.length));
        } else {
            aVar = p107m4.a.j;
        }
        this.compatibleBrands = aVar;
    }

    public java.lang.String toString() {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.compatibleBrands.f25392i);
        int i3 = 0;
        while (true) {
            p107m4.a aVar = this.compatibleBrands;
            if (i3 >= aVar.f25392i) {
                return "UnsupportedBrands{major=" + androidx.media3.common.util.Util.toFourccString(this.majorBrand) + ", compatible=" + arrayList + "}";
            }
            arrayList.add(androidx.media3.common.util.Util.toFourccString(aVar.b(i3)));
            i3++;
        }
    }
}
