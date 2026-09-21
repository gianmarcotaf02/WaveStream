package k3;

/* JADX INFO: loaded from: classes.dex */
public final class l implements p058g3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p061g6.a f24477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p061g6.a f24478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p041e3.p f24479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p061g6.a f24480d;

    public l(p061g6.a aVar, p061g6.a aVar2, p041e3.p pVar, p061g6.a aVar3) {
        this.f24477a = aVar;
        this.f24478b = aVar2;
        this.f24479c = pVar;
        this.f24480d = aVar3;
    }

    @Override // p061g6.a
    public final java.lang.Object get() {
        return new k3.k((java.util.concurrent.Executor) this.f24477a.get(), (p098l3.d) this.f24478b.get(), (k3.c) this.f24479c.get(), (p106m3.c) this.f24480d.get());
    }
}
