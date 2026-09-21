package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1875u0 implements java.lang.Cloneable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.google.android.gms.internal.play_billing.AbstractC1877v0 f19392h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.google.android.gms.internal.play_billing.AbstractC1877v0 f19393i;

    public AbstractC1875u0(com.google.android.gms.internal.play_billing.AbstractC1877v0 abstractC1877v0) {
        this.f19392h = abstractC1877v0;
        if (abstractC1877v0.h()) {
            throw new java.lang.IllegalArgumentException("Default instance must be immutable.");
        }
        this.f19393i = abstractC1877v0.n();
    }

    public final com.google.android.gms.internal.play_billing.AbstractC1877v0 a() {
        com.google.android.gms.internal.play_billing.AbstractC1877v0 abstractC1877v0B = b();
        abstractC1877v0B.getClass();
        if (com.google.android.gms.internal.play_billing.AbstractC1877v0.i(abstractC1877v0B, true)) {
            return abstractC1877v0B;
        }
        throw new com.google.android.gms.internal.play_billing.W0();
    }

    public final com.google.android.gms.internal.play_billing.AbstractC1877v0 b() {
        if (!this.f19393i.h()) {
            return this.f19393i;
        }
        com.google.android.gms.internal.play_billing.AbstractC1877v0 abstractC1877v0 = this.f19393i;
        abstractC1877v0.getClass();
        com.google.android.gms.internal.play_billing.Q0.f19276c.a(abstractC1877v0.getClass()).a(abstractC1877v0);
        abstractC1877v0.e();
        return this.f19393i;
    }

    public final void c() {
        if (this.f19393i.h()) {
            return;
        }
        com.google.android.gms.internal.play_billing.AbstractC1877v0 abstractC1877v0N = this.f19392h.n();
        com.google.android.gms.internal.play_billing.Q0.f19276c.a(abstractC1877v0N.getClass()).g(abstractC1877v0N, this.f19393i);
        this.f19393i = abstractC1877v0N;
    }

    public final java.lang.Object clone() {
        com.google.android.gms.internal.play_billing.AbstractC1875u0 abstractC1875u0 = (com.google.android.gms.internal.play_billing.AbstractC1875u0) this.f19392h.j(5);
        abstractC1875u0.f19393i = b();
        return abstractC1875u0;
    }
}
