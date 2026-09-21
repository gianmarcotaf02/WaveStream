package D2;

import android.util.Log;

public final class f extends e {

    public final b f2085a = new b();

    @Override
    public final void a(i iVar, String str, String str2, Throwable th) {
        try {
            if (th == null) {
                int iOrdinal = iVar.ordinal();
                if (iOrdinal == 0) {
                    Log.v(str2, str);
                    return;
                }
                if (iOrdinal == 1) {
                    Log.d(str2, str);
                    return;
                }
                if (iOrdinal == 2) {
                    Log.i(str2, str);
                    return;
                }
                if (iOrdinal == 3) {
                    Log.w(str2, str);
                    return;
                } else if (iOrdinal == 4) {
                    Log.e(str2, str);
                    return;
                } else {
                    if (iOrdinal != 5) {
                        throw new I3.b();
                    }
                    Log.wtf(str2, str);
                    return;
                }
            }
            int iOrdinal2 = iVar.ordinal();
            if (iOrdinal2 == 0) {
                Log.v(str2, str, th);
                return;
            }
            if (iOrdinal2 == 1) {
                Log.d(str2, str, th);
                return;
            }
            if (iOrdinal2 == 2) {
                Log.i(str2, str, th);
                return;
            }
            if (iOrdinal2 == 3) {
                Log.w(str2, str, th);
            } else if (iOrdinal2 == 4) {
                Log.e(str2, str, th);
            } else {
                if (iOrdinal2 != 5) {
                    throw new I3.b();
                }
                Log.wtf(str2, str, th);
            }
        } catch (Exception unused) {
            this.f2085a.a(iVar, str, str2, th);
        }
    }
}
