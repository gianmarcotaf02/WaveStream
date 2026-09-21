package com.google.common.util.concurrent;

import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import p076i4.AbstractC2186b0;
import p076i4.W;
import p076i4.Z;
import p076i4.j1;

public final class y extends v {

    public static final I f19461n = new I(y.class);

    public AbstractC2186b0 f19462l;

    public x f19463m;

    public y(AbstractC2186b0 abstractC2186b0, V3.b bVar) {
        int size = abstractC2186b0.size();
        Object obj = null;
        this.f19456h = null;
        this.f19457i = size;
        this.f19462l = abstractC2186b0;
        this.f19463m = new x(this, bVar);
        Objects.requireNonNull(this.f19462l);
        if (this.f19462l.isEmpty()) {
            x xVar = this.f19463m;
            if (xVar != null) {
                try {
                    xVar.j.getClass();
                    xVar.run();
                    return;
                } catch (RejectedExecutionException e6) {
                    xVar.f19458k.setException(e6);
                    return;
                }
            }
            return;
        }
        z zVar = z.f19464h;
        T7.d dVar = new T7.d(this, obj, 12);
        Z zListIterator = this.f19462l.listIterator(0);
        while (zListIterator.hasNext()) {
            J j = (J) zListIterator.next();
            if (j.isDone()) {
                j(null);
            } else {
                j.addListener(dVar, zVar);
            }
        }
    }

    @Override
    public final void afterDone() {
        super.afterDone();
        AbstractC2186b0 abstractC2186b0 = this.f19462l;
        this.f19462l = null;
        this.f19463m = null;
        if (isCancelled() && (abstractC2186b0 != null)) {
            boolean zWasInterrupted = wasInterrupted();
            Z zListIterator = abstractC2186b0.listIterator(0);
            while (zListIterator.hasNext()) {
                ((Future) zListIterator.next()).cancel(zWasInterrupted);
            }
        }
    }

    @Override
    public final void interruptTask() {
        x xVar = this.f19463m;
        if (xVar != null) {
            xVar.c();
        }
    }

    public final void j(W w6) {
        int iQ = v.j.q(this);
        AbstractC1864o0.Z(iQ >= 0, "Less than 0 remaining futures");
        if (iQ == 0) {
            if (w6 != null) {
                j1 it = w6.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        try {
                            U.s0(future);
                        } catch (ExecutionException e6) {
                            k(e6.getCause());
                        } catch (Throwable th) {
                            k(th);
                        }
                    }
                }
            }
            this.f19456h = null;
            x xVar = this.f19463m;
            if (xVar != null) {
                try {
                    xVar.j.getClass();
                    xVar.run();
                } catch (RejectedExecutionException e9) {
                    xVar.f19458k.setException(e9);
                }
            }
            this.f19462l = null;
        }
    }

    public final void k(Throwable th) {
        th.getClass();
        boolean z6 = th instanceof Error;
        if (z6) {
            f19461n.a().log(Level.SEVERE, z6 ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th);
        }
    }

    @Override
    public final String pendingToString() {
        AbstractC2186b0 abstractC2186b0 = this.f19462l;
        if (abstractC2186b0 == null) {
            return super.pendingToString();
        }
        return "futures=" + abstractC2186b0;
    }
}
