package w8;

/* JADX INFO: loaded from: classes4.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w8.v f30475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w8.t f30476b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.lang.String f30478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w8.l f30479e;
    public w8.D g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public w8.B f30481h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public w8.B f30482i;
    public w8.B j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f30483k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f30484l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public A8.e f30485m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f30477c = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Z2.C1202m f30480f = new Z2.C1202m(2);

    public static void b(java.lang.String str, w8.B b9) {
        if (b9 != null) {
            if (b9.f30491n != null) {
                throw new java.lang.IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (b9.f30492o != null) {
                throw new java.lang.IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (b9.f30493p != null) {
                throw new java.lang.IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (b9.f30494q != null) {
                throw new java.lang.IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final w8.B a() {
        int i3 = this.f30477c;
        if (i3 < 0) {
            throw new java.lang.IllegalStateException(("code < 0: " + this.f30477c).toString());
        }
        w8.v vVar = this.f30475a;
        if (vVar == null) {
            throw new java.lang.IllegalStateException("request == null");
        }
        w8.t tVar = this.f30476b;
        if (tVar == null) {
            throw new java.lang.IllegalStateException("protocol == null");
        }
        java.lang.String str = this.f30478d;
        if (str != null) {
            return new w8.B(vVar, tVar, str, i3, this.f30479e, this.f30480f.e(), this.g, this.f30481h, this.f30482i, this.j, this.f30483k, this.f30484l, this.f30485m);
        }
        throw new java.lang.IllegalStateException("message == null");
    }
}
