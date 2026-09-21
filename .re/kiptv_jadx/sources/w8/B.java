package w8;

/* JADX INFO: loaded from: classes4.dex */
public final class B implements java.io.Closeable, java.lang.AutoCloseable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w8.v f30486h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w8.t f30487i;
    public final java.lang.String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f30488k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w8.l f30489l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final w8.m f30490m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final w8.D f30491n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final w8.B f30492o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w8.B f30493p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final w8.B f30494q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f30495r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f30496s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final A8.e f30497t;

    public B(w8.v request, w8.t protocol, java.lang.String message, int i3, w8.l lVar, w8.m mVar, w8.D d4, w8.B b9, w8.B b10, w8.B b11, long j, long j9, A8.e eVar) {
        kotlin.jvm.internal.m.e(request, "request");
        kotlin.jvm.internal.m.e(protocol, "protocol");
        kotlin.jvm.internal.m.e(message, "message");
        this.f30486h = request;
        this.f30487i = protocol;
        this.j = message;
        this.f30488k = i3;
        this.f30489l = lVar;
        this.f30490m = mVar;
        this.f30491n = d4;
        this.f30492o = b9;
        this.f30493p = b10;
        this.f30494q = b11;
        this.f30495r = j;
        this.f30496s = j9;
        this.f30497t = eVar;
    }

    public static java.lang.String b(java.lang.String str, w8.B b9) {
        b9.getClass();
        java.lang.String strD = b9.f30490m.d(str);
        if (strD == null) {
            return null;
        }
        return strD;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        w8.D d4 = this.f30491n;
        if (d4 == null) {
            throw new java.lang.IllegalStateException("response is not eligible for a body and must not be closed");
        }
        d4.close();
    }

    public final w8.A e() {
        w8.A a2 = new w8.A();
        a2.f30475a = this.f30486h;
        a2.f30476b = this.f30487i;
        a2.f30477c = this.f30488k;
        a2.f30478d = this.j;
        a2.f30479e = this.f30489l;
        a2.f30480f = this.f30490m.n();
        a2.g = this.f30491n;
        a2.f30481h = this.f30492o;
        a2.f30482i = this.f30493p;
        a2.j = this.f30494q;
        a2.f30483k = this.f30495r;
        a2.f30484l = this.f30496s;
        a2.f30485m = this.f30497t;
        return a2;
    }

    public final java.lang.String toString() {
        return "Response{protocol=" + this.f30487i + ", code=" + this.f30488k + ", message=" + this.j + ", url=" + this.f30486h.f30659a + '}';
    }
}
