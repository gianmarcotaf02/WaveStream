package B3;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import io.sentry.SentryBaseEvent;
import java.util.Locale;

public final class C0089b {

    public final String f617a;

    public final boolean f618b;

    public final String f619c;

    public C0089b(String str, String str2) {
        H3.q.f(str, "The log tag cannot be null or empty.");
        this.f617a = str;
        this.f619c = str2;
        this.f618b = str.length() <= 23;
    }

    public final void a(Exception exc, String str, Object... objArr) {
        if (Build.TYPE.equals(SentryBaseEvent.JsonKeys.USER) || !this.f618b) {
            return;
        }
        String str2 = this.f617a;
        if (Log.isLoggable(str2, 3)) {
            Log.d(str2, d(str, objArr), exc);
        }
    }

    public final void b(String str, Object... objArr) {
        if (Build.TYPE.equals(SentryBaseEvent.JsonKeys.USER) || !this.f618b) {
            return;
        }
        String str2 = this.f617a;
        if (Log.isLoggable(str2, 3)) {
            Log.d(str2, d(str, objArr));
        }
    }

    public final void c(Object... objArr) {
        Log.e(this.f617a, d("Bundle is null", objArr));
    }

    public final String d(String str, Object... objArr) {
        if (objArr.length != 0) {
            str = String.format(Locale.ROOT, str, objArr);
        }
        String str2 = this.f619c;
        String strH = TextUtils.isEmpty(str2) ? "" : Y6.f.h("[", str2, "] ");
        return !TextUtils.isEmpty(strH) ? strH.concat(String.valueOf(str)) : str;
    }
}
