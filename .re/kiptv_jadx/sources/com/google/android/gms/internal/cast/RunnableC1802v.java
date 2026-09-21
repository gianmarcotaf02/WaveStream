package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1802v implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f19104h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f19105i;

    public /* synthetic */ RunnableC1802v(int i3, java.lang.Object obj) {
        this.f19104h = i3;
        this.f19105i = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19104h) {
            case 0:
                com.google.android.gms.internal.cast.C1806w.f19161d.b("get checkbox consent timed out", new java.lang.Object[0]);
                ((p059g4.d) this.f19105i).d(java.lang.Boolean.FALSE);
                return;
            case 1:
                java.util.List list = ((com.google.android.gms.internal.cast.C) this.f19105i).f18751e;
                if (list != null) {
                    list.isEmpty();
                }
                throw null;
            case 2:
                com.google.android.gms.internal.cast.C1791s0 c1791s0 = (com.google.android.gms.internal.cast.C1791s0) this.f19105i;
                com.google.android.gms.internal.cast.C1795t0 c1795t0 = c1791s0.g;
                if (c1795t0 != null) {
                    c1791s0.f19060a.a((com.google.android.gms.internal.cast.L0) c1791s0.f19062c.b(c1795t0).a(), 223);
                }
                c1791s0.e();
                return;
            default:
                com.google.android.gms.internal.cast.C1773n1 c1773n1 = (com.google.android.gms.internal.cast.C1773n1) this.f19105i;
                if (c1773n1.f19013f.isEmpty()) {
                    return;
                }
                java.util.HashSet hashSet = c1773n1.g;
                java.util.HashSet hashSet2 = c1773n1.f19013f;
                long j = true != hashSet.equals(hashSet2) ? 86400000L : 172800000L;
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                long j9 = c1773n1.f19014h;
                if (j9 == 0 || jCurrentTimeMillis - j9 >= j) {
                    com.google.android.gms.internal.cast.C1773n1.f19006i.b("Upload the feature usage report.", new java.lang.Object[0]);
                    com.google.android.gms.internal.cast.B0 b0N = com.google.android.gms.internal.cast.C0.n();
                    java.lang.String str = com.google.android.gms.internal.cast.C1773n1.j;
                    b0N.c();
                    com.google.android.gms.internal.cast.C0.p((com.google.android.gms.internal.cast.C0) b0N.f18766i, str);
                    b0N.c();
                    com.google.android.gms.internal.cast.C0.o((com.google.android.gms.internal.cast.C0) b0N.f18766i, c1773n1.f19010c);
                    com.google.android.gms.internal.cast.C0 c9 = (com.google.android.gms.internal.cast.C0) b0N.a();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.addAll(hashSet2);
                    com.google.android.gms.internal.cast.C1811x0 c1811x0N = com.google.android.gms.internal.cast.C1815y0.n();
                    c1811x0N.c();
                    com.google.android.gms.internal.cast.C1815y0.o((com.google.android.gms.internal.cast.C1815y0) c1811x0N.f18766i, arrayList);
                    c1811x0N.c();
                    com.google.android.gms.internal.cast.C1815y0.p((com.google.android.gms.internal.cast.C1815y0) c1811x0N.f18766i, c9);
                    com.google.android.gms.internal.cast.C1815y0 c1815y0 = (com.google.android.gms.internal.cast.C1815y0) c1811x0N.a();
                    com.google.android.gms.internal.cast.K0 k0O = com.google.android.gms.internal.cast.L0.o();
                    k0O.c();
                    com.google.android.gms.internal.cast.L0.r((com.google.android.gms.internal.cast.L0) k0O.f18766i, c1815y0);
                    c1773n1.f19008a.a((com.google.android.gms.internal.cast.L0) k0O.a(), 243);
                    android.content.SharedPreferences sharedPreferences = c1773n1.f19009b;
                    android.content.SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    if (!hashSet.equals(hashSet2)) {
                        hashSet.clear();
                        hashSet.addAll(hashSet2);
                        java.util.Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            java.lang.String string = java.lang.Integer.toString(((com.google.android.gms.internal.cast.EnumC1803v0) it.next()).f19159h);
                            java.lang.String strC = p121o0.p.C("feature_usage_timestamp_reported_feature_", string);
                            if (!sharedPreferences.contains(strC)) {
                                strC = p121o0.p.C("feature_usage_timestamp_detected_feature_", string);
                            }
                            java.lang.String strC2 = p121o0.p.C("feature_usage_timestamp_reported_feature_", string);
                            if (!android.text.TextUtils.equals(strC, strC2)) {
                                long j10 = sharedPreferences.getLong(strC, 0L);
                                editorEdit.remove(strC);
                                if (j10 != 0) {
                                    editorEdit.putLong(strC2, j10);
                                }
                            }
                        }
                    }
                    c1773n1.f19014h = jCurrentTimeMillis;
                    editorEdit.putLong("feature_usage_last_report_time", jCurrentTimeMillis).apply();
                    return;
                }
                return;
        }
    }
}
