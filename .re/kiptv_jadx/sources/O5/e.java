package O5;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f7955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p132p5.a f7956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X7.c f7957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p070h6.p f7958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final V7.n0 f7959e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final V7.W f7960f;
    public final V7.n0 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final V7.W f7961h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final V7.n0 f7962i;
    public final V7.W j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final V7.n0 f7963k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final V7.W f7964l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public S7.w0 f7965m;

    public e(android.content.Context context, p132p5.a appConfig) {
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(appConfig, "appConfig");
        this.f7955a = context;
        this.f7956b = appConfig;
        S7.y0 y0VarE = S7.C.e();
        Z7.e eVar = S7.M.f9549a;
        this.f7957c = S7.C.c(com.google.android.gms.internal.play_billing.AbstractC1833d1.H(y0VarE, Z7.d.f13044i));
        this.f7958d = com.google.common.util.concurrent.D.B(new M5.b(this, 1));
        V7.n0 n0VarB = V7.r.b(O5.b.f7952a);
        this.f7959e = n0VarB;
        this.f7960f = new V7.W(n0VarB);
        V7.n0 n0VarB2 = V7.r.b(null);
        this.g = n0VarB2;
        this.f7961h = new V7.W(n0VarB2);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        V7.n0 n0VarB3 = V7.r.b(bool);
        this.f7962i = n0VarB3;
        this.j = new V7.W(n0VarB3);
        V7.n0 n0VarB4 = V7.r.b(bool);
        this.f7963k = n0VarB4;
        this.f7964l = new V7.W(n0VarB4);
    }

    public static final java.lang.String a(O5.e eVar) throws java.io.IOException {
        eVar.getClass();
        java.net.URLConnection uRLConnectionOpenConnection = new java.net.URL("https://kiptv.app/play/latest.json").openConnection();
        kotlin.jvm.internal.m.c(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) uRLConnectionOpenConnection;
        httpURLConnection.setConnectTimeout(10000);
        httpURLConnection.setReadTimeout(10000);
        httpURLConnection.setInstanceFollowRedirects(true);
        httpURLConnection.setRequestProperty("Accept", "application/json");
        httpURLConnection.setRequestProperty("Cache-Control", io.ktor.client.utils.CacheControl.NO_CACHE);
        try {
            int responseCode = httpURLConnection.getResponseCode();
            if (200 > responseCode || responseCode >= 300) {
                throw new java.lang.IllegalStateException("HTTP " + httpURLConnection.getResponseCode());
            }
            java.io.InputStream inputStream = httpURLConnection.getInputStream();
            kotlin.jvm.internal.m.d(inputStream, "getInputStream(...)");
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream, O7.a.f8024b), 8192);
            try {
                java.lang.String strG = com.google.common.util.concurrent.D.G(bufferedReader);
                bufferedReader.close();
                httpURLConnection.disconnect();
                return strG;
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    com.google.android.gms.internal.play_billing.AbstractC1833d1.l(bufferedReader, th);
                    throw th2;
                }
            }
        } catch (java.lang.Throwable th3) {
            httpURLConnection.disconnect();
            throw th3;
        }
    }

    public static final int b(O5.e eVar) {
        java.lang.Object objT;
        android.content.Context context = eVar.f7955a;
        try {
            android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            objT = java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT >= 28 ? (int) packageInfo.getLongVersionCode() : packageInfo.versionCode);
        } catch (java.lang.Throwable th) {
            objT = com.google.common.util.concurrent.P.T(th);
        }
        java.lang.Object objValueOf = java.lang.Integer.valueOf(androidx.media3.common.util.Log.LOG_LEVEL_OFF);
        if (objT instanceof p070h6.m) {
            objT = objValueOf;
        }
        return ((java.lang.Number) objT).intValue();
    }

    public final void c(boolean z6) {
        S7.w0 w0Var = this.f7965m;
        if (w0Var == null || !w0Var.isActive()) {
            this.f7965m = S7.C.A(this.f7957c, null, new O5.d(this, z6, null), 3);
        }
    }

    public final void d() {
        this.f7956b.getClass();
        p162s8.q qVar = com.kiptv.tv.update.a.f21031a;
        long j = f().getLong("last_check_at", 0L);
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        if (j <= 0 || jCurrentTimeMillis - j >= 21600000 || jCurrentTimeMillis < j) {
            c(false);
        }
    }

    public final void e() {
        V7.n0 n0Var = this.f7959e;
        java.lang.Object value = n0Var.getValue();
        O5.a aVar = value instanceof O5.a ? (O5.a) value : null;
        if (aVar != null) {
            f().edit().putInt("snoozed_version_code", aVar.f7951a.f21023a).apply();
        }
        O5.b bVar = O5.b.f7952a;
        n0Var.getClass();
        n0Var.i(null, bVar);
    }

    public final android.content.SharedPreferences f() {
        java.lang.Object value = this.f7958d.getValue();
        kotlin.jvm.internal.m.d(value, "getValue(...)");
        return (android.content.SharedPreferences) value;
    }
}
