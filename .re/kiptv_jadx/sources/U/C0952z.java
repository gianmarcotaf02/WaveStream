package U;

/* JADX INFO: renamed from: U.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0952z implements U.InterfaceC0934g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final U.C0952z f10098b = new U.C0952z(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final U.C0952z f10099c = new U.C0952z(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final D1.C0223h f10100d = new D1.C0223h(3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final D1.C0223h f10101e = new D1.C0223h(4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final D1.C0223h f10102f = new D1.C0223h(5);
    public static final D1.C0223h g = new D1.C0223h(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10103a;

    public /* synthetic */ C0952z(int i3) {
        this.f10103a = i3;
    }

    @Override // U.InterfaceC0934g
    public long a(int i3, U.C0948v c0948v) {
        switch (this.f10103a) {
            case 0:
                java.lang.String str = ((p011b1.J) c0948v.f10089e).f17772a.f17764a.f17809i;
                return p011b1.D.b(J.AbstractC0549n.o(str, i3), J.AbstractC0549n.n(str, i3));
            default:
                return ((p011b1.J) c0948v.f10089e).j(i3);
        }
    }
}
