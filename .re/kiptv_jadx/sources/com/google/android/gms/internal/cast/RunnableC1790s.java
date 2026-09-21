package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1790s implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f19058h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.cast.C1794t f19059i;

    public /* synthetic */ RunnableC1790s(com.google.android.gms.internal.cast.C1794t c1794t, int i3) {
        this.f19058h = i3;
        this.f19059i = c1794t;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19058h) {
            case 0:
                com.google.android.gms.internal.cast.C1794t c1794t = this.f19059i;
                java.lang.Object[] objArr = {java.lang.Integer.valueOf(c1794t.f19076e)};
                B3.C0089b c0089b = com.google.android.gms.internal.cast.C1794t.f19071i;
                android.util.Log.i(c0089b.f617a, c0089b.d("transfer with type = %d has timed out", objArr));
                c1794t.b(101);
                break;
            default:
                com.google.android.gms.internal.cast.C1794t c1794t2 = this.f19059i;
                com.google.android.gms.internal.cast.r rVar = new com.google.android.gms.internal.cast.r(c1794t2);
                p191x3.g gVar = c1794t2.f19077f;
                H3.q.g(gVar);
                gVar.a(rVar);
                break;
        }
    }
}
