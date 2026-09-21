package p023c3;

import F4.d;
import V1.b;
import Z2.C0;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.internal.play_billing.V0;
import io.sentry.SentryEvent;
import io.sentry.protocol.Device;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import p033d3.a;
import p033d3.e;
import p033d3.f;
import p033d3.g;
import p033d3.j;
import p033d3.k;
import p033d3.l;
import p033d3.n;
import p033d3.o;
import p033d3.q;
import p033d3.r;
import p033d3.s;
import p033d3.t;
import p033d3.u;
import p033d3.v;
import p050f3.h;
import p121o0.p;
import p166t3.i;

public final class c implements h {

    public final i f18501a;

    public final ConnectivityManager f18502b;

    public final Context f18503c;

    public final URL f18504d;

    public final b f18505e;

    public final b f18506f;
    public final int g;

    public c(Context context, b bVar, b bVar2) {
        d dVar = new d();
        p033d3.c cVar = p033d3.c.f21173a;
        dVar.a(o.class, cVar);
        dVar.a(p033d3.i.class, cVar);
        f fVar = f.f21185a;
        dVar.a(s.class, fVar);
        dVar.a(l.class, fVar);
        p033d3.d dVar2 = p033d3.d.f21175a;
        dVar.a(q.class, dVar2);
        dVar.a(j.class, dVar2);
        p033d3.b bVar3 = p033d3.b.f21162a;
        dVar.a(a.class, bVar3);
        dVar.a(p033d3.h.class, bVar3);
        e eVar = e.f21178a;
        dVar.a(r.class, eVar);
        dVar.a(k.class, eVar);
        g gVar = g.f21192a;
        dVar.a(v.class, gVar);
        dVar.a(n.class, gVar);
        dVar.f3660d = true;
        this.f18501a = new i(10, dVar);
        this.f18503c = context;
        this.f18502b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f18504d = b(a.f18493c);
        this.f18505e = bVar2;
        this.f18506f = bVar;
        this.g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e6) {
            throw new IllegalArgumentException(p.C("Invalid url: ", str), e6);
        }
    }

    public final p041e3.h a(p041e3.h hVar) {
        int type;
        int subtype;
        HashMap map;
        NetworkInfo activeNetworkInfo = this.f18502b.getActiveNetworkInfo();
        C0 c0C = hVar.c();
        int i3 = Build.VERSION.SDK_INT;
        HashMap map2 = (HashMap) c0C.f12660f;
        if (map2 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map2.put("sdk-version", String.valueOf(i3));
        c0C.b(Device.JsonKeys.MODEL, Build.MODEL);
        c0C.b("hardware", Build.HARDWARE);
        c0C.b(Device.TYPE, Build.DEVICE);
        c0C.b("product", Build.PRODUCT);
        c0C.b("os-uild", Build.ID);
        c0C.b(Device.JsonKeys.MANUFACTURER, Build.MANUFACTURER);
        c0C.b(SentryEvent.JsonKeys.FINGERPRINT, Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        HashMap map3 = (HashMap) c0C.f12660f;
        if (map3 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map3.put("tz-offset", String.valueOf(offset));
        int i9 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = u.f21226h;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap map4 = (HashMap) c0C.f12660f;
        if (map4 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = t.f21224h;
                subtype = 100;
            } else if (((t) t.f21224h.get(subtype)) == null) {
            }
            map = (HashMap) c0C.f12660f;
            if (map != null) {
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            map.put("mobile-subtype", String.valueOf(subtype));
            c0C.b("country", Locale.getDefault().getCountry());
            c0C.b(Device.JsonKeys.LOCALE, Locale.getDefault().getLanguage());
            Context context = this.f18503c;
            c0C.b("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
            try {
                i9 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e6) {
                V0.r(e6, "CctTransportBackend", "Unable to find version code for package");
            }
            c0C.b("application_build", Integer.toString(i9));
            return c0C.d();
        }
        SparseArray sparseArray3 = t.f21224h;
        subtype = 0;
        map = (HashMap) c0C.f12660f;
        if (map != null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put("mobile-subtype", String.valueOf(subtype));
        c0C.b("country", Locale.getDefault().getCountry());
        c0C.b(Device.JsonKeys.LOCALE, Locale.getDefault().getLanguage());
        Context context2 = this.f18503c;
        c0C.b("mcc_mnc", ((TelephonyManager) context2.getSystemService("phone")).getSimOperator());
        i9 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode;
        c0C.b("application_build", Integer.toString(i9));
        return c0C.d();
    }
}
