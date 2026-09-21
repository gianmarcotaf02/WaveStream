package p041e3;

import android.content.Context;
import k3.i;
import k3.j;
import k3.k;
import k3.l;
import p050f3.e;
import p058g3.b;
import p061g6.a;
import p083j3.c;
import p098l3.d;

public final class p implements b {

    public final int f21413a;

    public final b f21414b;

    public final a f21415c;

    public final b f21416d;

    public p(b bVar, a aVar, b bVar2, int i3) {
        this.f21413a = i3;
        this.f21414b = bVar;
        this.f21415c = aVar;
        this.f21416d = bVar2;
    }

    @Override
    public final Object get() {
        switch (this.f21413a) {
            case 0:
                return new o(new V1.b(24), new V1.b(23), (c) ((p083j3.b) this.f21414b).get(), (i) ((j) this.f21415c).get(), (k) ((l) this.f21416d).get());
            default:
                return new k3.c((Context) ((e) this.f21414b).f21692b, (d) this.f21415c.get(), (k3.a) ((m) this.f21416d).get());
        }
    }
}
