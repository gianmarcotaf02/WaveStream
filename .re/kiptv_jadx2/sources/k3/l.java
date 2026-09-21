package k3;

import java.util.concurrent.Executor;
import p041e3.p;

public final class l implements p058g3.b {

    public final p061g6.a f24477a;

    public final p061g6.a f24478b;

    public final p f24479c;

    public final p061g6.a f24480d;

    public l(p061g6.a aVar, p061g6.a aVar2, p pVar, p061g6.a aVar3) {
        this.f24477a = aVar;
        this.f24478b = aVar2;
        this.f24479c = pVar;
        this.f24480d = aVar3;
    }

    @Override
    public final Object get() {
        return new k((Executor) this.f24477a.get(), (p098l3.d) this.f24478b.get(), (c) this.f24479c.get(), (p106m3.c) this.f24480d.get());
    }
}
