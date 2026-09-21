package A8;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements java.io.Closeable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final M8.E f425h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final M8.D f426i;
    public final /* synthetic */ A8.e j;

    public n(M8.E source, M8.D sink, A8.e eVar) {
        this.j = eVar;
        kotlin.jvm.internal.m.e(source, "source");
        kotlin.jvm.internal.m.e(sink, "sink");
        this.f425h = source;
        this.f426i = sink;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.j.a(true, true, null);
    }
}
