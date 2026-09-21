package B3;

import java.util.concurrent.atomic.AtomicReference;
import p184w3.C2969d;

public final class B extends i {

    public final AtomicReference f591d;

    public final Z3.d f592e;

    public B(C c9) {
        this.f591d = new AtomicReference(c9);
        this.f592e = new Z3.d(c9.f18715k, 2);
    }

    @Override
    public final void B(C2969d c2969d, String str, String str2, boolean z6) {
        C c9 = (C) this.f591d.get();
        if (c9 == null) {
            return;
        }
        c9.f596G = c2969d;
        c9.V = c2969d.f29839h;
        c9.W = str2;
        c9.f602N = str;
        synchronized (C.f594a0) {
        }
    }

    @Override
    public final void N(f fVar) {
        C c9 = (C) this.f591d.get();
        if (c9 == null) {
            return;
        }
        C.f593Z.b("onDeviceStatusChanged", new Object[0]);
        this.f592e.post(new com.google.common.util.concurrent.C(c9, fVar, 3));
    }

    @Override
    public final void S(int i3) {
        if (((C) this.f591d.get()) == null) {
            return;
        }
        synchronized (C.f595b0) {
        }
    }

    @Override
    public final void T(int i3, long j) {
        C c9 = (C) this.f591d.get();
        if (c9 == null) {
            return;
        }
        C.y(c9, j, i3);
    }

    @Override
    public final void U(String str, byte[] bArr) {
        if (((C) this.f591d.get()) == null) {
            return;
        }
        C.f593Z.b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override
    public final void a(int i3) {
        C c9 = (C) this.f591d.get();
        if (c9 == null) {
            return;
        }
        c9.V = null;
        c9.W = null;
        synchronized (C.f595b0) {
        }
        if (c9.f597I != null) {
            this.f592e.post(new A1.a(c9, i3, 1));
        }
    }

    @Override
    public final void g(int i3) {
        if (((C) this.f591d.get()) == null) {
            return;
        }
        synchronized (C.f595b0) {
        }
    }

    @Override
    public final void h(C0090c c0090c) {
        C c9 = (C) this.f591d.get();
        if (c9 == null) {
            return;
        }
        C.f593Z.b("onApplicationStatusChanged", new Object[0]);
        this.f592e.post(new com.google.common.util.concurrent.C(c9, c0090c, 4));
    }

    @Override
    public final void o() {
        C.f593Z.b("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }

    @Override
    public final void t(int i3) {
        C c9 = null;
        C c10 = (C) this.f591d.getAndSet(null);
        if (c10 != null) {
            c10.f608T = -1;
            c10.f609U = -1;
            c10.f596G = null;
            c10.f602N = null;
            c10.f606R = 0.0d;
            c10.A();
            c10.f603O = false;
            c10.f607S = null;
            c9 = c10;
        }
        if (c9 == null) {
            return;
        }
        C.f593Z.b("ICastDeviceControllerListener.onDisconnected: %d", Integer.valueOf(i3));
        if (i3 != 0) {
            int i9 = c9.f18711D.get();
            H3.t tVar = c9.f18717m;
            tVar.sendMessage(tVar.obtainMessage(6, i9, 2));
        }
    }

    @Override
    public final void v(String str, String str2) {
        C c9 = (C) this.f591d.get();
        if (c9 == null) {
            return;
        }
        C.f593Z.b("Receive (type=text, ns=%s) %s", str, str2);
        this.f592e.post(new A1.n(c9, str, str2, 1));
    }

    @Override
    public final void y(int i3) {
        if (((C) this.f591d.get()) == null) {
            return;
        }
        synchronized (C.f594a0) {
        }
    }

    @Override
    public final void z(long j) {
        C c9 = (C) this.f591d.get();
        if (c9 == null) {
            return;
        }
        C.y(c9, j, 0);
    }

    @Override
    public final void I(int i3) {
    }

    @Override
    public final void P(int i3) {
    }
}
