package D0;

/* JADX INFO: renamed from: D0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0204e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f1865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f1866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f1869e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f1870f;
    public final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f1871h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f1872i;
    public final D0.C0203d j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f1873k;

    public C0204e(java.lang.String str, float f9, float f10, float f11, float f12, long j, int i3, boolean z6, int i9) {
        str = (i9 & 1) != 0 ? "" : str;
        long j9 = (i9 & 32) != 0 ? p188x0.C3098s.g : j;
        int i10 = (i9 & 64) != 0 ? 5 : i3;
        this.f1865a = str;
        this.f1866b = f9;
        this.f1867c = f10;
        this.f1868d = f11;
        this.f1869e = f12;
        this.f1870f = j9;
        this.g = i10;
        this.f1871h = z6;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f1872i = arrayList;
        D0.C0203d c0203d = new D0.C0203d(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_DRM_KEYS_LOADED);
        this.j = c0203d;
        arrayList.add(c0203d);
    }

    public static void a(D0.C0204e c0204e, java.util.ArrayList arrayList, p188x0.S s9) {
        if (c0204e.f1873k) {
            N0.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ((D0.C0203d) com.google.android.gms.internal.play_billing.M0.j(1, c0204e.f1872i)).j.add(new D0.K("", arrayList, 0, s9, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f));
    }

    public final D0.C0205f b() {
        if (this.f1873k) {
            N0.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (true) {
            java.util.ArrayList arrayList = this.f1872i;
            if (arrayList.size() <= 1) {
                D0.C0203d c0203d = this.j;
                D0.C0205f c0205f = new D0.C0205f(this.f1865a, this.f1866b, this.f1867c, this.f1868d, this.f1869e, new D0.H(c0203d.f1857a, c0203d.f1858b, c0203d.f1859c, c0203d.f1860d, c0203d.f1861e, c0203d.f1862f, c0203d.g, c0203d.f1863h, c0203d.f1864i, c0203d.j), this.f1870f, this.g, this.f1871h);
                this.f1873k = true;
                return c0205f;
            }
            if (this.f1873k) {
                N0.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            D0.C0203d c0203d2 = (D0.C0203d) arrayList.remove(arrayList.size() - 1);
            ((D0.C0203d) com.google.android.gms.internal.play_billing.M0.j(1, arrayList)).j.add(new D0.H(c0203d2.f1857a, c0203d2.f1858b, c0203d2.f1859c, c0203d2.f1860d, c0203d2.f1861e, c0203d2.f1862f, c0203d2.g, c0203d2.f1863h, c0203d2.f1864i, c0203d2.j));
        }
    }
}
