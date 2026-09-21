package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1755j implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f18929h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.cast.C1767m f18930i;

    public /* synthetic */ RunnableC1755j(com.google.android.gms.internal.cast.C1767m c1767m, int i3) {
        this.f18929h = i3;
        this.f18930i = c1767m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18929h) {
            case 0:
                com.google.android.gms.internal.cast.C1767m c1767m = this.f18930i;
                com.google.android.gms.internal.cast.C1775o c1775o = c1767m.f18981e;
                if (((p105m2.C) c1775o.f19016i) == null) {
                    c1775o.f19016i = p105m2.C.d((android.content.Context) c1775o.f19015h);
                }
                p105m2.C c9 = (p105m2.C) c1775o.f19016i;
                if (c9 != null) {
                    c9.e(c1767m);
                }
                break;
            default:
                this.f18930i.g();
                break;
        }
    }
}
