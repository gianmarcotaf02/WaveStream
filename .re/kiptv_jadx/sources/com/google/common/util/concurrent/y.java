package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes.dex */
public final class y extends com.google.common.util.concurrent.v {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final com.google.common.util.concurrent.I f19461n = new com.google.common.util.concurrent.I(com.google.common.util.concurrent.y.class);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p076i4.AbstractC2186b0 f19462l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public com.google.common.util.concurrent.x f19463m;

    public y(p076i4.AbstractC2186b0 abstractC2186b0, V3.b bVar) {
        int size = abstractC2186b0.size();
        java.lang.Object obj = null;
        this.f19456h = null;
        this.f19457i = size;
        this.f19462l = abstractC2186b0;
        this.f19463m = new com.google.common.util.concurrent.x(this, bVar);
        java.util.Objects.requireNonNull(this.f19462l);
        if (this.f19462l.isEmpty()) {
            com.google.common.util.concurrent.x xVar = this.f19463m;
            if (xVar != null) {
                try {
                    xVar.j.getClass();
                    xVar.run();
                    return;
                } catch (java.util.concurrent.RejectedExecutionException e6) {
                    xVar.f19458k.setException(e6);
                    return;
                }
            }
            return;
        }
        com.google.common.util.concurrent.z zVar = com.google.common.util.concurrent.z.f19464h;
        T7.d dVar = new T7.d(this, obj, 12);
        p076i4.Z zListIterator = this.f19462l.listIterator(0);
        while (zListIterator.hasNext()) {
            com.google.common.util.concurrent.J j = (com.google.common.util.concurrent.J) zListIterator.next();
            if (j.isDone()) {
                j(null);
            } else {
                j.addListener(dVar, zVar);
            }
        }
    }

    @Override // com.google.common.util.concurrent.AbstractC1902q
    public final void afterDone() {
        super.afterDone();
        p076i4.AbstractC2186b0 abstractC2186b0 = this.f19462l;
        this.f19462l = null;
        this.f19463m = null;
        if (isCancelled() && (abstractC2186b0 != null)) {
            boolean zWasInterrupted = wasInterrupted();
            p076i4.Z zListIterator = abstractC2186b0.listIterator(0);
            while (zListIterator.hasNext()) {
                ((java.util.concurrent.Future) zListIterator.next()).cancel(zWasInterrupted);
            }
        }
    }

    @Override // com.google.common.util.concurrent.AbstractC1902q
    public final void interruptTask() {
        com.google.common.util.concurrent.x xVar = this.f19463m;
        if (xVar != null) {
            xVar.c();
        }
    }

    public final void j(p076i4.W w6) {
        int iQ = com.google.common.util.concurrent.v.j.q(this);
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Z(iQ >= 0, "Less than 0 remaining futures");
        if (iQ == 0) {
            if (w6 != null) {
                p076i4.j1 it = w6.iterator();
                while (it.hasNext()) {
                    java.util.concurrent.Future future = (java.util.concurrent.Future) it.next();
                    if (!future.isCancelled()) {
                        try {
                            com.google.common.util.concurrent.U.s0(future);
                        } catch (java.util.concurrent.ExecutionException e6) {
                            k(e6.getCause());
                        } catch (java.lang.Throwable th) {
                            k(th);
                        }
                    }
                }
            }
            this.f19456h = null;
            com.google.common.util.concurrent.x xVar = this.f19463m;
            if (xVar != null) {
                try {
                    xVar.j.getClass();
                    xVar.run();
                } catch (java.util.concurrent.RejectedExecutionException e9) {
                    xVar.f19458k.setException(e9);
                }
            }
            this.f19462l = null;
        }
    }

    public final void k(java.lang.Throwable th) {
        th.getClass();
        boolean z6 = th instanceof java.lang.Error;
        if (z6) {
            f19461n.a().log(java.util.logging.Level.SEVERE, z6 ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th);
        }
    }

    @Override // com.google.common.util.concurrent.AbstractC1902q
    public final java.lang.String pendingToString() {
        p076i4.AbstractC2186b0 abstractC2186b0 = this.f19462l;
        if (abstractC2186b0 == null) {
            return super.pendingToString();
        }
        return "futures=" + abstractC2186b0;
    }
}
