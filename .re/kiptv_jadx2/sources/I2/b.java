package I2;

public final class b implements AutoCloseable {

    public final a f4581h;

    public boolean f4582i;
    public final e j;

    public b(e eVar, a aVar) {
        this.j = eVar;
        this.f4581h = aVar;
    }

    @Override
    public final void close() {
        if (this.f4582i) {
            return;
        }
        this.f4582i = true;
        e eVar = this.j;
        synchronized (eVar.f4590o) {
            a aVar = this.f4581h;
            int i3 = aVar.f4579h - 1;
            aVar.f4579h = i3;
            if (i3 == 0 && aVar.f4578f) {
                eVar.G(aVar);
            }
        }
    }
}
