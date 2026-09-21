package C8;

import A8.o;
import A8.t;
import M8.C0682j;
import M8.E;
import M8.K;
import M8.M;
import M8.s;
import java.io.IOException;
import kotlin.jvm.internal.m;

public abstract class b implements K {

    public final s f1619h;

    public boolean f1620i;
    public final t j;

    public b(t tVar) {
        this.j = tVar;
        this.f1619h = new s(((E) tVar.f455e).f7217h.c());
    }

    public final void b() {
        t tVar = this.j;
        int i3 = tVar.f452b;
        if (i3 == 6) {
            return;
        }
        if (i3 != 5) {
            throw new IllegalStateException("state: " + tVar.f452b);
        }
        s sVar = this.f1619h;
        M m8 = sVar.f7278e;
        sVar.f7278e = M.f7231d;
        m8.a();
        m8.b();
        tVar.f452b = 6;
    }

    @Override
    public final M c() {
        return this.f1619h;
    }

    @Override
    public long m(long j, C0682j sink) throws IOException {
        t tVar = this.j;
        m.e(sink, "sink");
        try {
            return ((E) tVar.f455e).m(j, sink);
        } catch (IOException e6) {
            ((o) tVar.f454d).k();
            b();
            throw e6;
        }
    }
}
