package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes.dex */
public final class J extends E3.f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f18778k = 1;

    public synchronized int d() {
        int i3;
        try {
            i3 = f18778k;
            if (i3 == 1) {
                android.content.Context context = this.f2829a;
                D3.e eVar = D3.e.f2106d;
                int iB = eVar.b(context, 12451000);
                if (iB == 0) {
                    i3 = 4;
                    f18778k = 4;
                } else if (eVar.a(context, iB, null) != null || P3.d.a(context, "com.google.android.gms.auth.api.fallback") == 0) {
                    i3 = 2;
                    f18778k = 2;
                } else {
                    i3 = 3;
                    f18778k = 3;
                }
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return i3;
    }
}
