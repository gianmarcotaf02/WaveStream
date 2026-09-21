package B;

/* JADX INFO: renamed from: B.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0078p implements O0.S {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final B.C0078p f552b = new B.C0078p(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final B.C0078p f553c = new B.C0078p(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f554a;

    public /* synthetic */ C0078p(int i3) {
        this.f554a = i3;
    }

    @Override // O0.S
    public final O0.T g(O0.U u6, java.util.List list, long j) {
        switch (this.f554a) {
            case 0:
                return u6.q0(p113n1.a.j(j), p113n1.a.i(j), p078i6.x.f23206h, new p163t.F0(24));
            default:
                return u6.q0(p113n1.a.f(j) ? p113n1.a.h(j) : 0, p113n1.a.e(j) ? p113n1.a.g(j) : 0, p078i6.x.f23206h, new p163t.F0(24));
        }
    }
}
