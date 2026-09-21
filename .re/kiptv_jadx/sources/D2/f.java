package D2;

/* JADX INFO: loaded from: classes.dex */
public final class f extends D2.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D2.b f2085a = new D2.b();

    @Override // D2.e
    public final void a(D2.i iVar, java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        try {
            if (th == null) {
                int iOrdinal = iVar.ordinal();
                if (iOrdinal == 0) {
                    android.util.Log.v(str2, str);
                    return;
                }
                if (iOrdinal == 1) {
                    android.util.Log.d(str2, str);
                    return;
                }
                if (iOrdinal == 2) {
                    android.util.Log.i(str2, str);
                    return;
                }
                if (iOrdinal == 3) {
                    android.util.Log.w(str2, str);
                    return;
                } else if (iOrdinal == 4) {
                    android.util.Log.e(str2, str);
                    return;
                } else {
                    if (iOrdinal != 5) {
                        throw new I3.b();
                    }
                    android.util.Log.wtf(str2, str);
                    return;
                }
            }
            int iOrdinal2 = iVar.ordinal();
            if (iOrdinal2 == 0) {
                android.util.Log.v(str2, str, th);
                return;
            }
            if (iOrdinal2 == 1) {
                android.util.Log.d(str2, str, th);
                return;
            }
            if (iOrdinal2 == 2) {
                android.util.Log.i(str2, str, th);
                return;
            }
            if (iOrdinal2 == 3) {
                android.util.Log.w(str2, str, th);
            } else if (iOrdinal2 == 4) {
                android.util.Log.e(str2, str, th);
            } else {
                if (iOrdinal2 != 5) {
                    throw new I3.b();
                }
                android.util.Log.wtf(str2, str, th);
            }
        } catch (java.lang.Exception unused) {
            this.f2085a.a(iVar, str, str2, th);
        }
    }
}
