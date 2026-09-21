package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC1783q extends com.google.android.gms.internal.cast.AbstractBinderC1743g {
    public static final B3.C0089b j = new B3.C0089b("MediaRouterProxy", null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p105m2.C f19022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p191x3.C3101b f19023f;
    public final java.util.HashMap g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.google.android.gms.internal.cast.C1794t f19024h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f19025i;

    public BinderC1783q(android.content.Context context, p105m2.C c9, p191x3.C3101b c3101b, B3.x xVar) {
        super("com.google.android.gms.cast.framework.internal.IMediaRouter", 0);
        this.g = new java.util.HashMap();
        this.f19022e = c9;
        this.f19023f = c3101b;
        int i3 = android.os.Build.VERSION.SDK_INT;
        B3.C0089b c0089b = j;
        if (i3 <= 32) {
            android.util.Log.i(c0089b.f617a, c0089b.d("Don't need to set MediaRouterParams for Android S v2 or below", new java.lang.Object[0]));
            return;
        }
        c0089b.b("Set up MediaRouterParams based on module flag and CastOptions for Android T or above", new java.lang.Object[0]);
        this.f19024h = new com.google.android.gms.internal.cast.C1794t(c3101b);
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) p105m2.Q.class);
        intent.setPackage(context.getPackageName());
        boolean zIsEmpty = context.getPackageManager().queryBroadcastReceivers(intent, 0).isEmpty();
        this.f19025i = !zIsEmpty;
        if (!zIsEmpty) {
            com.google.android.gms.internal.cast.C1773n1.a(com.google.android.gms.internal.cast.EnumC1803v0.CAST_OUTPUT_SWITCHER_ENABLED);
        }
        xVar.d(new java.lang.String[]{"com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED"}).a(new com.google.android.gms.internal.cast.C1775o(this, c3101b));
    }

    public final void d0(android.support.v4.media.session.q qVar) {
        j1.l lVar;
        this.f19022e.getClass();
        p105m2.C.b();
        p105m2.C2608f c2608fC = p105m2.C.c();
        if (qVar != null) {
            c2608fC.getClass();
            lVar = new j1.l(c2608fC, qVar);
        } else {
            lVar = null;
        }
        j1.l lVar2 = c2608fC.f25286C;
        if (lVar2 != null) {
            lVar2.g();
        }
        c2608fC.f25286C = lVar;
        if (lVar != null) {
            c2608fC.l();
        }
    }

    public final void e0(p105m2.C2623v c2623v, int i3) {
        java.util.Set set = (java.util.Set) this.g.get(c2623v);
        if (set == null) {
            return;
        }
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            this.f19022e.a(c2623v, (p105m2.AbstractC2624w) it.next(), i3);
        }
    }

    public final void f0(p105m2.C2623v c2623v) {
        java.util.Set set = (java.util.Set) this.g.get(c2623v);
        if (set == null) {
            return;
        }
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            this.f19022e.e((p105m2.AbstractC2624w) it.next());
        }
    }
}
