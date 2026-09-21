package p137q0;

import K0.C0656d;
import N0.a;
import Q0.AbstractC0777k;
import Q0.InterfaceC0775i;
import Q0.k0;
import S7.A;
import S7.C;
import S7.C0889g0;
import S7.InterfaceC0891h0;
import S7.j0;
import X7.c;
import androidx.compose.ui.node.NodeCoordinator;
import v.C2902w;

public abstract class o implements InterfaceC0775i {

    public c f26476i;
    public int j;

    public o f26478l;

    public o f26479m;

    public k0 f26480n;

    public NodeCoordinator f26481o;

    public boolean f26482p;

    public boolean f26483q;

    public boolean f26484r;

    public boolean f26485s;

    public C0656d f26486t;

    public boolean f26487u;

    public o f26475h = this;

    public int f26477k = -1;

    public final A B0() {
        c cVar = this.f26476i;
        if (cVar != null) {
            return cVar;
        }
        c cVarC = C.c(AbstractC0777k.u(this).getCoroutineContext().plus(new j0((InterfaceC0891h0) AbstractC0777k.u(this).getCoroutineContext().get(C0889g0.f9584h))));
        this.f26476i = cVarC;
        return cVarC;
    }

    public boolean C0() {
        return !(this instanceof C2902w);
    }

    public void D0() {
        if (this.f26487u) {
            a.b("node attached multiple times");
        }
        if (this.f26481o == null) {
            a.b("attach invoked on a node without a coordinator");
        }
        this.f26487u = true;
        this.f26484r = true;
    }

    public void E0() {
        if (!this.f26487u) {
            a.b("Cannot detach a node that is not attached");
        }
        if (this.f26484r) {
            a.b("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.f26485s) {
            a.b("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.f26487u = false;
        c cVar = this.f26476i;
        if (cVar != null) {
            C.i(cVar, new K0.A("The Modifier.Node was detached", 1));
            this.f26476i = null;
        }
    }

    public void I0() {
        if (!this.f26487u) {
            a.b("reset() called on an unattached node");
        }
        H0();
    }

    public void J0() {
        if (!this.f26487u) {
            a.b("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.f26484r) {
            a.b("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.f26484r = false;
        F0();
        this.f26485s = true;
    }

    public void K0() {
        if (!this.f26487u) {
            a.b("node detached multiple times");
        }
        if (this.f26481o == null) {
            a.b("detach invoked on a node without a coordinator");
        }
        if (!this.f26485s) {
            a.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.f26485s = false;
        C0656d c0656d = this.f26486t;
        if (c0656d != null) {
            c0656d.invoke();
        }
        G0();
    }

    public void L0(o oVar) {
        this.f26475h = oVar;
    }

    public void M0(NodeCoordinator nodeCoordinator) {
        this.f26481o = nodeCoordinator;
    }

    public void F0() {
    }

    public void G0() {
    }

    public void H0() {
    }
}
