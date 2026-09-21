package B3;

/* JADX INFO: renamed from: B3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0089b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f619c;

    public C0089b(java.lang.String str, java.lang.String str2) {
        H3.q.f(str, "The log tag cannot be null or empty.");
        this.f617a = str;
        this.f619c = str2;
        this.f618b = str.length() <= 23;
    }

    public final void a(java.lang.Exception exc, java.lang.String str, java.lang.Object... objArr) {
        if (android.os.Build.TYPE.equals(io.sentry.SentryBaseEvent.JsonKeys.USER) || !this.f618b) {
            return;
        }
        java.lang.String str2 = this.f617a;
        if (android.util.Log.isLoggable(str2, 3)) {
            android.util.Log.d(str2, d(str, objArr), exc);
        }
    }

    public final void b(java.lang.String str, java.lang.Object... objArr) {
        if (android.os.Build.TYPE.equals(io.sentry.SentryBaseEvent.JsonKeys.USER) || !this.f618b) {
            return;
        }
        java.lang.String str2 = this.f617a;
        if (android.util.Log.isLoggable(str2, 3)) {
            android.util.Log.d(str2, d(str, objArr));
        }
    }

    public final void c(java.lang.Object... objArr) {
        android.util.Log.e(this.f617a, d("Bundle is null", objArr));
    }

    public final java.lang.String d(java.lang.String str, java.lang.Object... objArr) {
        if (objArr.length != 0) {
            str = java.lang.String.format(java.util.Locale.ROOT, str, objArr);
        }
        java.lang.String str2 = this.f619c;
        java.lang.String strH = android.text.TextUtils.isEmpty(str2) ? "" : Y6.f.h("[", str2, "] ");
        return !android.text.TextUtils.isEmpty(strH) ? strH.concat(java.lang.String.valueOf(str)) : str;
    }
}
