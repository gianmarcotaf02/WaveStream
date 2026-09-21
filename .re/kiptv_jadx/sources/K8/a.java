package K8;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements java.io.Closeable, java.lang.AutoCloseable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6974h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f6975i;
    public final M8.C0682j j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.Object f6976k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.io.Closeable f6977l;

    public a(boolean z6, int i3) {
        this.f6974h = i3;
        switch (i3) {
            case 1:
                this.f6975i = z6;
                M8.C0682j c0682j = new M8.C0682j();
                this.j = c0682j;
                java.util.zip.Inflater inflater = new java.util.zip.Inflater(true);
                this.f6976k = inflater;
                this.f6977l = new M8.u(M8.AbstractC0674b.c(c0682j), inflater);
                break;
            default:
                this.f6975i = z6;
                M8.C0682j c0682j2 = new M8.C0682j();
                this.j = c0682j2;
                java.util.zip.Deflater deflater = new java.util.zip.Deflater(-1, true);
                this.f6976k = deflater;
                this.f6977l = new C8.f(c0682j2, deflater);
                break;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.lang.Throwable {
        switch (this.f6974h) {
            case 0:
                ((C8.f) this.f6977l).close();
                break;
            default:
                ((M8.u) this.f6977l).close();
                break;
        }
    }
}
