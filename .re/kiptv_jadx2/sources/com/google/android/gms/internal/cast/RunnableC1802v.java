package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class RunnableC1802v implements Runnable {

    public final int f19104h;

    public final Object f19105i;

    public RunnableC1802v(int i3, Object obj) {
        this.f19104h = i3;
        this.f19105i = obj;
    }

    @Override
    public final void run() {
        switch (this.f19104h) {
            case 0:
                C1806w.f19161d.b("get checkbox consent timed out", new Object[0]);
                ((p059g4.d) this.f19105i).d(Boolean.FALSE);
                return;
            case 1:
                List list = ((C) this.f19105i).f18751e;
                if (list != null) {
                    list.isEmpty();
                }
                throw null;
            case 2:
                C1791s0 c1791s0 = (C1791s0) this.f19105i;
                C1795t0 c1795t0 = c1791s0.g;
                if (c1795t0 != null) {
                    c1791s0.f19060a.a((L0) c1791s0.f19062c.b(c1795t0).a(), 223);
                }
                c1791s0.e();
                return;
            default:
                C1773n1 c1773n1 = (C1773n1) this.f19105i;
                if (c1773n1.f19013f.isEmpty()) {
                    return;
                }
                HashSet hashSet = c1773n1.g;
                HashSet hashSet2 = c1773n1.f19013f;
                long j = true != hashSet.equals(hashSet2) ? 86400000L : 172800000L;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j9 = c1773n1.f19014h;
                if (j9 == 0 || jCurrentTimeMillis - j9 >= j) {
                    C1773n1.f19006i.b("Upload the feature usage report.", new Object[0]);
                    B0 b0N = C0.n();
                    String str = C1773n1.j;
                    b0N.c();
                    C0.p((C0) b0N.f18766i, str);
                    b0N.c();
                    C0.o((C0) b0N.f18766i, c1773n1.f19010c);
                    C0 c9 = (C0) b0N.a();
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(hashSet2);
                    C1811x0 c1811x0N = C1815y0.n();
                    c1811x0N.c();
                    C1815y0.o((C1815y0) c1811x0N.f18766i, arrayList);
                    c1811x0N.c();
                    C1815y0.p((C1815y0) c1811x0N.f18766i, c9);
                    C1815y0 c1815y0 = (C1815y0) c1811x0N.a();
                    K0 k0O = L0.o();
                    k0O.c();
                    L0.r((L0) k0O.f18766i, c1815y0);
                    c1773n1.f19008a.a((L0) k0O.a(), 243);
                    SharedPreferences sharedPreferences = c1773n1.f19009b;
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    if (!hashSet.equals(hashSet2)) {
                        hashSet.clear();
                        hashSet.addAll(hashSet2);
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            String string = Integer.toString(((EnumC1803v0) it.next()).f19159h);
                            String strC = p121o0.p.C("feature_usage_timestamp_reported_feature_", string);
                            if (!sharedPreferences.contains(strC)) {
                                strC = p121o0.p.C("feature_usage_timestamp_detected_feature_", string);
                            }
                            String strC2 = p121o0.p.C("feature_usage_timestamp_reported_feature_", string);
                            if (!TextUtils.equals(strC, strC2)) {
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
