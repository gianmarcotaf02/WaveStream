package I2;

/* JADX INFO: loaded from: classes.dex */
public final class b implements java.lang.AutoCloseable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final I2.a f4581h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f4582i;
    public final /* synthetic */ I2.e j;

    public b(I2.e eVar, I2.a aVar) {
        this.j = eVar;
        this.f4581h = aVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f4582i) {
            return;
        }
        this.f4582i = true;
        I2.e eVar = this.j;
        synchronized (eVar.f4590o) {
            I2.a aVar = this.f4581h;
            int i3 = aVar.f4579h - 1;
            aVar.f4579h = i3;
            if (i3 == 0 && aVar.f4578f) {
                eVar.G(aVar);
            }
        }
    }
}
