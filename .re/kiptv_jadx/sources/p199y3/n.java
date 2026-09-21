package p199y3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p199y3.c f31880b;

    public /* synthetic */ n(p199y3.c cVar, int i3) {
        this.f31879a = i3;
        this.f31880b = cVar;
    }

    public final void a(E3.k kVar) {
        p199y3.k kVar2 = (p199y3.k) kVar;
        switch (this.f31879a) {
            case 0:
                p199y3.c cVar = this.f31880b;
                cVar.getClass();
                com.google.android.gms.common.api.Status status = kVar2.getStatus();
                int i3 = status.f18690h;
                if (i3 != 0) {
                    java.lang.StringBuilder sbT = p121o0.p.t(i3, "Error fetching queue item ids, statusCode=", ", statusMessage=");
                    sbT.append(status.f18691i);
                    B3.C0089b c0089b = cVar.f31807a;
                    android.util.Log.w(c0089b.f617a, c0089b.d(sbT.toString(), new java.lang.Object[0]));
                }
                cVar.f31816l = null;
                if (!cVar.f31813h.isEmpty()) {
                    Z3.d dVar = cVar.f31814i;
                    p199y3.o oVar = cVar.j;
                    dVar.removeCallbacks(oVar);
                    dVar.postDelayed(oVar, 500L);
                }
                break;
            default:
                p199y3.c cVar2 = this.f31880b;
                cVar2.getClass();
                com.google.android.gms.common.api.Status status2 = kVar2.getStatus();
                int i9 = status2.f18690h;
                if (i9 != 0) {
                    java.lang.StringBuilder sbT2 = p121o0.p.t(i9, "Error fetching queue items, statusCode=", ", statusMessage=");
                    sbT2.append(status2.f18691i);
                    B3.C0089b c0089b2 = cVar2.f31807a;
                    android.util.Log.w(c0089b2.f617a, c0089b2.d(sbT2.toString(), new java.lang.Object[0]));
                }
                cVar2.f31815k = null;
                if (!cVar2.f31813h.isEmpty()) {
                    Z3.d dVar2 = cVar2.f31814i;
                    p199y3.o oVar2 = cVar2.j;
                    dVar2.removeCallbacks(oVar2);
                    dVar2.postDelayed(oVar2, 500L);
                }
                break;
        }
    }
}
