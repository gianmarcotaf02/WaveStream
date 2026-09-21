package p050f3;

import android.content.Context;
import p058g3.b;
import p061g6.a;
import p098l3.i;

public final class g implements b {

    public final int f21696a;

    public final b f21697b;

    public final a f21698c;

    public g(b bVar, a aVar, int i3) {
        this.f21696a = i3;
        this.f21697b = bVar;
        this.f21698c = aVar;
    }

    @Override
    public final Object get() {
        switch (this.f21696a) {
            case 0:
                return new f((Context) ((e) this.f21697b).f21692b, (d) ((e) this.f21698c).get());
            default:
                return new p098l3.g(new V1.b(24), new V1.b(23), p098l3.a.f24717f, (i) ((e) this.f21697b).get(), this.f21698c);
        }
    }
}
