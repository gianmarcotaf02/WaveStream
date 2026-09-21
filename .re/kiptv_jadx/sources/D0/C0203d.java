package D0;

/* JADX INFO: renamed from: D0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0203d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f1857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f1858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f1861e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f1862f;
    public final float g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f1863h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.List f1864i;
    public final java.util.ArrayList j;

    public C0203d(java.lang.String str, float f9, float f10, float f11, float f12, float f13, float f14, float f15, java.util.List list, int i3) {
        str = (i3 & 1) != 0 ? "" : str;
        f9 = (i3 & 2) != 0 ? 0.0f : f9;
        f10 = (i3 & 4) != 0 ? 0.0f : f10;
        f11 = (i3 & 8) != 0 ? 0.0f : f11;
        f12 = (i3 & 16) != 0 ? 1.0f : f12;
        f13 = (i3 & 32) != 0 ? 1.0f : f13;
        f14 = (i3 & 64) != 0 ? 0.0f : f14;
        f15 = (i3 & 128) != 0 ? 0.0f : f15;
        if ((i3 & 256) != 0) {
            int i9 = D0.I.f1820a;
            list = p078i6.w.f23205h;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f1857a = str;
        this.f1858b = f9;
        this.f1859c = f10;
        this.f1860d = f11;
        this.f1861e = f12;
        this.f1862f = f13;
        this.g = f14;
        this.f1863h = f15;
        this.f1864i = list;
        this.j = arrayList;
    }
}
