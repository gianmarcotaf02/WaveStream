package p008a8;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f15523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kotlin.jvm.internal.j f15524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p194x6.n f15525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final N6.A f15526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p117n6.i f15527e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public java.lang.Object f15528f;
    public int g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p008a8.g f15529h;

    /* JADX WARN: Multi-variable type inference failed */
    public e(p008a8.g gVar, java.lang.Object obj, p194x6.n nVar, p194x6.n nVar2, N6.A a2, p117n6.i iVar, U7.AbstractC0956d abstractC0956d) {
        this.f15529h = gVar;
        this.f15523a = obj;
        this.f15524b = (kotlin.jvm.internal.j) nVar;
        this.f15525c = nVar2;
        this.f15526d = a2;
        this.f15527e = iVar;
    }

    public final void a() {
        java.lang.Object obj = this.f15528f;
        if (obj instanceof X7.q) {
            ((X7.q) obj).h(this.g, this.f15529h.f15534h);
            return;
        }
        S7.O o8 = obj instanceof S7.O ? (S7.O) obj : null;
        if (o8 != null) {
            o8.dispose();
        }
    }
}
