package p137q0;

/* JADX INFO: loaded from: classes.dex */
public abstract class o implements Q0.InterfaceC0775i {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public X7.c f26476i;
    public int j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p137q0.o f26478l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p137q0.o f26479m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Q0.k0 f26480n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public androidx.compose.ui.node.NodeCoordinator f26481o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f26482p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f26483q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f26484r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f26485s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public K0.C0656d f26486t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f26487u;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p137q0.o f26475h = this;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f26477k = -1;

    public final S7.A B0() {
        X7.c cVar = this.f26476i;
        if (cVar != null) {
            return cVar;
        }
        X7.c cVarC = S7.C.c(Q0.AbstractC0777k.u(this).getCoroutineContext().plus(new S7.j0((S7.InterfaceC0891h0) Q0.AbstractC0777k.u(this).getCoroutineContext().get(S7.C0889g0.f9584h))));
        this.f26476i = cVarC;
        return cVarC;
    }

    public boolean C0() {
        return !(this instanceof v.C2902w);
    }

    public void D0() {
        if (this.f26487u) {
            N0.a.b("node attached multiple times");
        }
        if (this.f26481o == null) {
            N0.a.b("attach invoked on a node without a coordinator");
        }
        this.f26487u = true;
        this.f26484r = true;
    }

    public void E0() {
        if (!this.f26487u) {
            N0.a.b("Cannot detach a node that is not attached");
        }
        if (this.f26484r) {
            N0.a.b("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.f26485s) {
            N0.a.b("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.f26487u = false;
        X7.c cVar = this.f26476i;
        if (cVar != null) {
            S7.C.i(cVar, new K0.A("The Modifier.Node was detached", 1));
            this.f26476i = null;
        }
    }

    public void I0() {
        if (!this.f26487u) {
            N0.a.b("reset() called on an unattached node");
        }
        H0();
    }

    public void J0() {
        if (!this.f26487u) {
            N0.a.b("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.f26484r) {
            N0.a.b("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.f26484r = false;
        F0();
        this.f26485s = true;
    }

    public void K0() {
        if (!this.f26487u) {
            N0.a.b("node detached multiple times");
        }
        if (this.f26481o == null) {
            N0.a.b("detach invoked on a node without a coordinator");
        }
        if (!this.f26485s) {
            N0.a.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.f26485s = false;
        K0.C0656d c0656d = this.f26486t;
        if (c0656d != null) {
            c0656d.invoke();
        }
        G0();
    }

    public void L0(p137q0.o oVar) {
        this.f26475h = oVar;
    }

    public void M0(androidx.compose.ui.node.NodeCoordinator nodeCoordinator) {
        this.f26481o = nodeCoordinator;
    }

    public void F0() {
    }

    public void G0() {
    }

    public void H0() {
    }
}
