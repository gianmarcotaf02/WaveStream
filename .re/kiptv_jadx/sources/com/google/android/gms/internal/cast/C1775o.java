package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1775o implements p059g4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object f19015h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.Object f19016i;

    public C1775o(android.content.Context context) {
        this.f19015h = context;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003b  */
    @Override // p059g4.a
    public void p(A0.a aVar) {
        boolean z6;
        p191x3.C3101b c3101b;
        com.google.android.gms.internal.cast.BinderC1783q binderC1783q = (com.google.android.gms.internal.cast.BinderC1783q) this.f19015h;
        binderC1783q.getClass();
        boolean zH = aVar.h();
        B3.C0089b c0089b = com.google.android.gms.internal.cast.BinderC1783q.j;
        boolean z9 = false;
        if (zH) {
            android.os.Bundle bundle = (android.os.Bundle) aVar.f();
            boolean z10 = bundle != null && bundle.containsKey("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
            c0089b.b("The module-to-client output switcher flag %s", true != z10 ? "not existed" : "existed");
            if (z10) {
                z6 = bundle.getBoolean("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
            } else {
                z6 = true;
            }
        } else {
            z6 = true;
        }
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z6);
        p191x3.C3101b c3101b2 = (p191x3.C3101b) this.f19016i;
        android.util.Log.i(c0089b.f617a, c0089b.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", boolValueOf, java.lang.Boolean.valueOf(c3101b2.f31179t)));
        boolean z11 = z6 && c3101b2.f31179t;
        if (binderC1783q.f19022e == null || (c3101b = binderC1783q.f19023f) == null) {
            return;
        }
        p105m2.O o8 = new p105m2.O();
        int i3 = android.os.Build.VERSION.SDK_INT;
        o8.f25223a = i3 >= 30;
        if (i3 >= 30) {
            o8.f25223a = z11;
        }
        boolean z12 = c3101b.f31177r;
        if (i3 >= 30) {
            o8.f25225c = z12;
        }
        boolean z13 = c3101b.f31176q;
        if (i3 >= 30) {
            o8.f25224b = z13;
        }
        p105m2.P p2 = new p105m2.P(o8);
        p105m2.C.b();
        p105m2.C2608f c2608fC = p105m2.C.c();
        p105m2.P p9 = c2608fC.f25301p;
        c2608fC.f25301p = p2;
        boolean zF = c2608fC.f();
        p105m2.HandlerC2605c handlerC2605c = c2608fC.f25298m;
        if (zF) {
            if (c2608fC.f25292e == null) {
                p105m2.C2615m c2615m = new p105m2.C2615m(c2608fC.f25288a, new p008a8.c(13, c2608fC));
                c2608fC.f25292e = c2615m;
                c2608fC.a(c2615m, true);
                c2608fC.k();
                p105m2.a0 a0Var = c2608fC.f25290c;
                ((android.os.Handler) a0Var.f25267d).post((B3.r) a0Var.f25270h);
            }
            if (p9 != null && p9.f25228c) {
                z9 = true;
            }
            if (z9 != p2.f25228c) {
                p105m2.C2615m c2615m2 = c2608fC.f25292e;
                c2615m2.f25366l = c2608fC.y;
                if (!c2615m2.f25367m) {
                    c2615m2.f25367m = true;
                    c2615m2.j.sendEmptyMessage(2);
                }
            }
        } else {
            p105m2.C2615m c2615m3 = c2608fC.f25292e;
            if (c2615m3 != null) {
                p105m2.C2627z c2627zD = c2608fC.d(c2615m3);
                if (c2627zD != null) {
                    p105m2.C.b();
                    c2615m3.f25365k = null;
                    c2615m3.h(null);
                    c2608fC.m(c2627zD, null);
                    handlerC2605c.b(org.videolan.libvlc.interfaces.IMediaList.Event.ItemDeleted, c2627zD);
                    c2608fC.f25295i.remove(c2627zD);
                }
                c2608fC.f25292e = null;
                p105m2.a0 a0Var2 = c2608fC.f25290c;
                ((android.os.Handler) a0Var2.f25267d).post((B3.r) a0Var2.f25270h);
            }
        }
        handlerC2605c.b(769, p2);
        android.util.Log.i(c0089b.f617a, c0089b.d("media transfer = %b, session transfer = %b, transfer to local = %b, in-app output switcher = %b", java.lang.Boolean.valueOf(binderC1783q.f19025i), java.lang.Boolean.valueOf(z11), java.lang.Boolean.valueOf(z12), java.lang.Boolean.valueOf(z13)));
        if (z12) {
            com.google.android.gms.internal.cast.C1794t c1794t = binderC1783q.f19024h;
            H3.q.g(c1794t);
            com.google.android.gms.internal.cast.C1771n c1771n = new com.google.android.gms.internal.cast.C1771n(c1794t);
            p105m2.C.b();
            p105m2.C.c().f25284A = c1771n;
            com.google.android.gms.internal.cast.C1773n1.a(com.google.android.gms.internal.cast.EnumC1803v0.CAST_TRANSFER_TO_LOCAL_ENABLED);
        }
    }

    public /* synthetic */ C1775o(com.google.android.gms.internal.cast.BinderC1783q binderC1783q, p191x3.C3101b c3101b) {
        this.f19015h = binderC1783q;
        this.f19016i = c3101b;
    }
}
