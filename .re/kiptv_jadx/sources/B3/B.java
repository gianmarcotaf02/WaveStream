package B3;

/* JADX INFO: loaded from: classes.dex */
public final class B extends B3.i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f591d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Z3.d f592e;

    public B(B3.C c9) {
        this.f591d = new java.util.concurrent.atomic.AtomicReference(c9);
        this.f592e = new Z3.d(c9.f18715k, 2);
    }

    @Override // B3.j
    public final void B(p184w3.C2969d c2969d, java.lang.String str, java.lang.String str2, boolean z6) {
        B3.C c9 = (B3.C) this.f591d.get();
        if (c9 == null) {
            return;
        }
        c9.f596G = c2969d;
        c9.V = c2969d.f29839h;
        c9.W = str2;
        c9.f602N = str;
        synchronized (B3.C.f594a0) {
        }
    }

    @Override // B3.j
    public final void N(B3.f fVar) {
        B3.C c9 = (B3.C) this.f591d.get();
        if (c9 == null) {
            return;
        }
        B3.C.f593Z.b("onDeviceStatusChanged", new java.lang.Object[0]);
        this.f592e.post(new com.google.common.util.concurrent.C(c9, fVar, 3));
    }

    @Override // B3.j
    public final void S(int i3) {
        if (((B3.C) this.f591d.get()) == null) {
            return;
        }
        synchronized (B3.C.f595b0) {
        }
    }

    @Override // B3.j
    public final void T(int i3, long j) {
        B3.C c9 = (B3.C) this.f591d.get();
        if (c9 == null) {
            return;
        }
        B3.C.y(c9, j, i3);
    }

    @Override // B3.j
    public final void U(java.lang.String str, byte[] bArr) {
        if (((B3.C) this.f591d.get()) == null) {
            return;
        }
        B3.C.f593Z.b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, java.lang.Integer.valueOf(bArr.length));
    }

    @Override // B3.j
    public final void a(int i3) {
        B3.C c9 = (B3.C) this.f591d.get();
        if (c9 == null) {
            return;
        }
        c9.V = null;
        c9.W = null;
        synchronized (B3.C.f595b0) {
        }
        if (c9.f597I != null) {
            this.f592e.post(new A1.a(c9, i3, 1));
        }
    }

    @Override // B3.j
    public final void g(int i3) {
        if (((B3.C) this.f591d.get()) == null) {
            return;
        }
        synchronized (B3.C.f595b0) {
        }
    }

    @Override // B3.j
    public final void h(B3.C0090c c0090c) {
        B3.C c9 = (B3.C) this.f591d.get();
        if (c9 == null) {
            return;
        }
        B3.C.f593Z.b("onApplicationStatusChanged", new java.lang.Object[0]);
        this.f592e.post(new com.google.common.util.concurrent.C(c9, c0090c, 4));
    }

    @Override // B3.j
    public final void o() {
        B3.C.f593Z.b("Deprecated callback: \"onStatusreceived\"", new java.lang.Object[0]);
    }

    @Override // B3.j
    public final void t(int i3) {
        B3.C c9 = null;
        B3.C c10 = (B3.C) this.f591d.getAndSet(null);
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
        B3.C.f593Z.b("ICastDeviceControllerListener.onDisconnected: %d", java.lang.Integer.valueOf(i3));
        if (i3 != 0) {
            int i9 = c9.f18711D.get();
            H3.t tVar = c9.f18717m;
            tVar.sendMessage(tVar.obtainMessage(6, i9, 2));
        }
    }

    @Override // B3.j
    public final void v(java.lang.String str, java.lang.String str2) {
        B3.C c9 = (B3.C) this.f591d.get();
        if (c9 == null) {
            return;
        }
        B3.C.f593Z.b("Receive (type=text, ns=%s) %s", str, str2);
        this.f592e.post(new A1.n(c9, str, str2, 1));
    }

    @Override // B3.j
    public final void y(int i3) {
        if (((B3.C) this.f591d.get()) == null) {
            return;
        }
        synchronized (B3.C.f594a0) {
        }
    }

    @Override // B3.j
    public final void z(long j) {
        B3.C c9 = (B3.C) this.f591d.get();
        if (c9 == null) {
            return;
        }
        B3.C.y(c9, j, 0);
    }

    @Override // B3.j
    public final void I(int i3) {
    }

    @Override // B3.j
    public final void P(int i3) {
    }
}
