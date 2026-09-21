package p050f3;

/* JADX INFO: loaded from: classes.dex */
public final class g implements p058g3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p058g3.b f21697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p061g6.a f21698c;

    public /* synthetic */ g(p058g3.b bVar, p061g6.a aVar, int i3) {
        this.f21696a = i3;
        this.f21697b = bVar;
        this.f21698c = aVar;
    }

    @Override // p061g6.a
    public final java.lang.Object get() {
        switch (this.f21696a) {
            case 0:
                return new p050f3.f((android.content.Context) ((p050f3.e) this.f21697b).f21692b, (p050f3.d) ((p050f3.e) this.f21698c).get());
            default:
                return new p098l3.g(new V1.b(24), new V1.b(23), p098l3.a.f24717f, (p098l3.i) ((p050f3.e) this.f21697b).get(), this.f21698c);
        }
    }
}
