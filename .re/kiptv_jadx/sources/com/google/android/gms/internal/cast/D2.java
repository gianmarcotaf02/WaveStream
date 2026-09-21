package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes.dex */
public abstract class D2 implements java.lang.Cloneable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.google.android.gms.internal.cast.E2 f18765h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.google.android.gms.internal.cast.E2 f18766i;

    public D2(com.google.android.gms.internal.cast.E2 e6) {
        this.f18765h = e6;
        if (e6.i()) {
            throw new java.lang.IllegalArgumentException("Default instance must be immutable.");
        }
        this.f18766i = (com.google.android.gms.internal.cast.E2) e6.j(4, null);
    }

    public final com.google.android.gms.internal.cast.E2 a() {
        com.google.android.gms.internal.cast.E2 e2B = b();
        if (com.google.android.gms.internal.cast.E2.h(e2B, true)) {
            return e2B;
        }
        throw new I3.b("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final com.google.android.gms.internal.cast.E2 b() {
        if (!this.f18766i.i()) {
            return this.f18766i;
        }
        com.google.android.gms.internal.cast.E2 e6 = this.f18766i;
        e6.getClass();
        com.google.android.gms.internal.cast.U2.f18826c.a(e6.getClass()).a(e6);
        e6.e();
        return this.f18766i;
    }

    public final void c() {
        if (this.f18766i.i()) {
            return;
        }
        com.google.android.gms.internal.cast.E2 e6 = (com.google.android.gms.internal.cast.E2) this.f18765h.j(4, null);
        com.google.android.gms.internal.cast.U2.f18826c.a(e6.getClass()).c(e6, this.f18766i);
        this.f18766i = e6;
    }

    public final java.lang.Object clone() {
        com.google.android.gms.internal.cast.D2 d4 = (com.google.android.gms.internal.cast.D2) this.f18765h.j(5, null);
        d4.f18766i = b();
        return d4;
    }
}
