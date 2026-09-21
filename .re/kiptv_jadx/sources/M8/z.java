package M8;

/* JADX INFO: loaded from: classes4.dex */
public final class z extends p078i6.AbstractC2254e implements java.util.RandomAccess {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final M8.C0685m[] f7291h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f7292i;

    public z(M8.C0685m[] c0685mArr, int[] iArr) {
        this.f7291h = c0685mArr;
        this.f7292i = iArr;
    }

    @Override // p078i6.AbstractC2250a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(java.lang.Object obj) {
        if (obj instanceof M8.C0685m) {
            return super.contains((M8.C0685m) obj);
        }
        return false;
    }

    @Override // p078i6.AbstractC2250a
    public final int d() {
        return this.f7291h.length;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i3) {
        return this.f7291h[i3];
    }

    @Override // p078i6.AbstractC2254e, java.util.List
    public final /* bridge */ int indexOf(java.lang.Object obj) {
        if (obj instanceof M8.C0685m) {
            return super.indexOf((M8.C0685m) obj);
        }
        return -1;
    }

    @Override // p078i6.AbstractC2254e, java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object obj) {
        if (obj instanceof M8.C0685m) {
            return super.lastIndexOf((M8.C0685m) obj);
        }
        return -1;
    }
}
