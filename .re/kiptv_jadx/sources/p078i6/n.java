package p078i6;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends p078i6.AbstractC2254e implements java.util.RandomAccess {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int[] f23203h;

    public n(int[] iArr) {
        this.f23203h = iArr;
    }

    @Override // p078i6.AbstractC2250a, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Integer)) {
            return false;
        }
        return p078i6.m.V(this.f23203h, ((java.lang.Number) obj).intValue());
    }

    @Override // p078i6.AbstractC2250a
    public final int d() {
        return this.f23203h.length;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i3) {
        return java.lang.Integer.valueOf(this.f23203h[i3]);
    }

    @Override // p078i6.AbstractC2254e, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Integer)) {
            return -1;
        }
        int iIntValue = ((java.lang.Number) obj).intValue();
        int[] iArr = this.f23203h;
        kotlin.jvm.internal.m.e(iArr, "<this>");
        int length = iArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (iIntValue == iArr[i3]) {
                return i3;
            }
        }
        return -1;
    }

    @Override // p078i6.AbstractC2250a, java.util.Collection
    public final boolean isEmpty() {
        return this.f23203h.length == 0;
    }

    @Override // p078i6.AbstractC2254e, java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Integer)) {
            return -1;
        }
        int iIntValue = ((java.lang.Number) obj).intValue();
        int[] iArr = this.f23203h;
        kotlin.jvm.internal.m.e(iArr, "<this>");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i3 = length - 1;
                if (iIntValue == iArr[length]) {
                    return length;
                }
                if (i3 >= 0) {
                    length = i3;
                }
            }
        }
        return -1;
    }
}
