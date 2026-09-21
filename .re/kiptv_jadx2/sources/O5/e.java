package O5;

import S7.C;
import S7.M;
import S7.w0;
import S7.y0;
import V7.W;
import V7.n0;
import V7.r;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Build;
import androidx.media3.common.util.Log;
import com.google.android.gms.internal.play_billing.AbstractC1833d1;
import com.google.common.util.concurrent.D;
import com.google.common.util.concurrent.P;
import io.ktor.client.utils.CacheControl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.m;
import p070h6.p;
import p162s8.q;

public final class e {

    public final Context f7955a;

    public final p132p5.a f7956b;

    public final X7.c f7957c;

    public final p f7958d;

    public final n0 f7959e;

    public final W f7960f;
    public final n0 g;

    public final W f7961h;

    public final n0 f7962i;
    public final W j;

    public final n0 f7963k;

    public final W f7964l;

    public w0 f7965m;

    public e(Context context, p132p5.a appConfig) {
        m.e(context, "context");
        m.e(appConfig, "appConfig");
        this.f7955a = context;
        this.f7956b = appConfig;
        y0 y0VarE = C.e();
        Z7.e eVar = M.f9549a;
        this.f7957c = C.c(AbstractC1833d1.H(y0VarE, Z7.d.f13044i));
        this.f7958d = D.B(new M5.b(this, 1));
        n0 n0VarB = r.b(b.f7952a);
        this.f7959e = n0VarB;
        this.f7960f = new W(n0VarB);
        n0 n0VarB2 = r.b(null);
        this.g = n0VarB2;
        this.f7961h = new W(n0VarB2);
        Boolean bool = Boolean.FALSE;
        n0 n0VarB3 = r.b(bool);
        this.f7962i = n0VarB3;
        this.j = new W(n0VarB3);
        n0 n0VarB4 = r.b(bool);
        this.f7963k = n0VarB4;
        this.f7964l = new W(n0VarB4);
    }

    public static final String a(e eVar) throws IOException {
        eVar.getClass();
        URLConnection uRLConnectionOpenConnection = new URL("https://kiptv.app/play/latest.json").openConnection();
        m.c(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        httpURLConnection.setConnectTimeout(10000);
        httpURLConnection.setReadTimeout(10000);
        httpURLConnection.setInstanceFollowRedirects(true);
        httpURLConnection.setRequestProperty("Accept", "application/json");
        httpURLConnection.setRequestProperty("Cache-Control", CacheControl.NO_CACHE);
        try {
            int responseCode = httpURLConnection.getResponseCode();
            if (200 > responseCode || responseCode >= 300) {
                throw new IllegalStateException("HTTP " + httpURLConnection.getResponseCode());
            }
            InputStream inputStream = httpURLConnection.getInputStream();
            m.d(inputStream, "getInputStream(...)");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, O7.a.f8024b), 8192);
            try {
                String strG = D.G(bufferedReader);
                bufferedReader.close();
                httpURLConnection.disconnect();
                return strG;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC1833d1.l(bufferedReader, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            httpURLConnection.disconnect();
            throw th3;
        }
    }

    public static final int b(e eVar) {
        Object objT;
        Context context = eVar.f7955a;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            objT = Integer.valueOf(Build.VERSION.SDK_INT >= 28 ? (int) packageInfo.getLongVersionCode() : packageInfo.versionCode);
        } catch (Throwable th) {
            objT = P.T(th);
        }
        Object objValueOf = Integer.valueOf(Log.LOG_LEVEL_OFF);
        if (objT instanceof p070h6.m) {
            objT = objValueOf;
        }
        return ((Number) objT).intValue();
    }

    public final void c(boolean z6) {
        w0 w0Var = this.f7965m;
        if (w0Var == null || !w0Var.isActive()) {
            this.f7965m = C.A(this.f7957c, null, new d(this, z6, null), 3);
        }
    }

    public final void d() {
        this.f7956b.getClass();
        q qVar = com.kiptv.tv.update.a.f21031a;
        long j = f().getLong("last_check_at", 0L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (j <= 0 || jCurrentTimeMillis - j >= 21600000 || jCurrentTimeMillis < j) {
            c(false);
        }
    }

    public final void e() {
        n0 n0Var = this.f7959e;
        Object value = n0Var.getValue();
        a aVar = value instanceof a ? (a) value : null;
        if (aVar != null) {
            f().edit().putInt("snoozed_version_code", aVar.f7951a.f21023a).apply();
        }
        b bVar = b.f7952a;
        n0Var.getClass();
        n0Var.i(null, bVar);
    }

    public final SharedPreferences f() {
        Object value = this.f7958d.getValue();
        m.d(value, "getValue(...)");
        return (SharedPreferences) value;
    }
}
