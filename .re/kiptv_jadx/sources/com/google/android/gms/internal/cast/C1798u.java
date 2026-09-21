package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1798u implements p059g4.c, p059g4.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p059g4.d f19095h;

    public /* synthetic */ C1798u(p059g4.d dVar) {
        this.f19095h = dVar;
    }

    @Override // p059g4.b
    public void onFailure(java.lang.Exception exc) {
        com.google.android.gms.internal.cast.C1806w.f19161d.a(exc, "get checkbox consent failed", new java.lang.Object[0]);
        this.f19095h.d(java.lang.Boolean.FALSE);
    }

    @Override // p059g4.c
    public void onSuccess(java.lang.Object obj) {
        com.google.android.gms.internal.cast.K k9 = (com.google.android.gms.internal.cast.K) obj;
        B3.C0089b c0089b = com.google.android.gms.internal.cast.C1806w.f19161d;
        boolean z6 = false;
        if (k9 != null) {
            com.google.android.gms.internal.cast.N n3 = k9.f18781a.f18805h;
            H3.q.g(n3);
            if (n3.f18797h == 1) {
                z6 = true;
            }
        }
        this.f19095h.d(java.lang.Boolean.valueOf(z6));
    }
}
