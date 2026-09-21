package p041e3;

/* JADX INFO: loaded from: classes.dex */
public final class p implements p058g3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p058g3.b f21414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p061g6.a f21415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p058g3.b f21416d;

    public /* synthetic */ p(p058g3.b bVar, p061g6.a aVar, p058g3.b bVar2, int i3) {
        this.f21413a = i3;
        this.f21414b = bVar;
        this.f21415c = aVar;
        this.f21416d = bVar2;
    }

    @Override // p061g6.a
    public final java.lang.Object get() {
        switch (this.f21413a) {
            case 0:
                return new p041e3.o(new V1.b(24), new V1.b(23), (p083j3.c) ((p083j3.b) this.f21414b).get(), (k3.i) ((k3.j) this.f21415c).get(), (k3.k) ((k3.l) this.f21416d).get());
            default:
                return new k3.c((android.content.Context) ((p050f3.e) this.f21414b).f21692b, (p098l3.d) this.f21415c.get(), (k3.a) ((p041e3.m) this.f21416d).get());
        }
    }
}
