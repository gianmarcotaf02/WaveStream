package I2;

/* JADX INFO: loaded from: classes.dex */
public final class g implements java.lang.AutoCloseable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final I2.b f4601h;

    public g(I2.b bVar) {
        this.f4601h = bVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f4601h.close();
    }
}
