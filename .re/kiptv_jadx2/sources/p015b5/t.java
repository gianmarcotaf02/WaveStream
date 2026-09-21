package p015b5;

import E6.G;
import O1.InterfaceC0744h;
import O7.a;
import O7.q;
import S1.e;
import S7.C;
import S7.M;
import S7.y0;
import V7.V;
import V7.W;
import V7.a0;
import V7.n0;
import V7.r;
import Y6.f;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.play_billing.AbstractC1833d1;
import com.google.common.util.concurrent.D;
import com.google.common.util.concurrent.P;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import p070h6.A;
import p078i6.m;
import p078i6.p;
import p078i6.x;
import p100l6.i;
import p162s8.d;
import p162s8.l;

public final class t {
    public static final p Companion = new p();

    public static final List f17991i = p.B0("ar", "bn", "da", "de", "el", "en-GB", "en-US", "es-419", "es-ES", "fi", "fr", "hi", "it", "ja", "ko", "nb", "nl", "pl", "pt-BR", "pt-PT", "ru", "sq", "sv", "tr", "ur", "zh-Hans", "zh-Hant");
    public static final e j = G.Q("kip_language");

    public static final e f17992k = G.Q("kip_language_preference");

    public static final Set f17993l = m.F0(new String[]{"ar", "ur"});

    public static volatile t f17994m;

    public final Context f17995a;

    public final d f17996b;

    public final n0 f17997c;

    public final W f17998d;

    public volatile c f17999e;

    public volatile c f18000f;
    public final a0 g;

    public final V f18001h;

    public t(Context context, d json) {
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(json, "json");
        this.f17995a = context;
        this.f17996b = json;
        y0 y0VarE = C.e();
        Z7.e eVar = M.f9549a;
        C.c(AbstractC1833d1.H(y0VarE, Z7.d.f13044i));
        n0 n0VarB = r.b("en-US");
        this.f17997c = n0VarB;
        this.f17998d = new W(n0VarB);
        x xVar = x.f23206h;
        this.f17999e = new c(xVar);
        this.f18000f = new c(xVar);
        a0 a0VarA = r.a(1, 5, null);
        this.g = a0VarA;
        this.f18001h = new V(a0VarA);
        f17994m = this;
        String str = (String) C.E(i.f24820h, new r(this, null));
        n0VarB.h(str);
        int identifier = context.getResources().getIdentifier("en_us", "raw", context.getPackageName());
        if (identifier == 0) {
            Log.e("LocalizationService", "Fallback translation file (en_us) not found");
        } else {
            try {
                InputStream inputStreamOpenRawResource = context.getResources().openRawResource(identifier);
                kotlin.jvm.internal.m.d(inputStreamOpenRawResource, "openRawResource(...)");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, a.f8024b), 8192);
                try {
                    String strG = D.G(bufferedReader);
                    bufferedReader.close();
                    this.f18000f = l.i(json.e(strG));
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC1833d1.l(bufferedReader, th);
                        throw th2;
                    }
                }
            } catch (Exception e6) {
                Log.e("LocalizationService", "Failed to load fallback translations: " + e6.getMessage());
            }
        }
        b(str);
    }

    public static String c(String str, c cVar) {
        for (String str2 : q.b1(str, new String[]{"."}, 0, 6)) {
            c cVar2 = cVar instanceof c ? (c) cVar : null;
            if (cVar2 == null || (cVar = (b) cVar2.get(str2)) == 0) {
                return null;
            }
        }
        kotlinx.serialization.json.d dVar = cVar instanceof kotlinx.serialization.json.d ? (kotlinx.serialization.json.d) cVar : null;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    public final Object a(String str, p117n6.c cVar) {
        q qVar;
        t tVar;
        int i3;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i9 = qVar.f17986l;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                qVar.f17986l = i9 - Integer.MIN_VALUE;
            } else {
                qVar = new q(this, cVar);
            }
        } else {
            qVar = new q(this, cVar);
        }
        Object obj = qVar.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i10 = qVar.f17986l;
        A a2 = A.f22523a;
        if (i10 == 0) {
            P.u0(obj);
            Companion.getClass();
            int i11 = !p.c(str).equals(this.f17997c.getValue()) ? 1 : 0;
            qVar.f17983h = this;
            qVar.f17984i = i11;
            qVar.f17986l = 1;
            if (d(str, qVar) != aVar) {
                tVar = this;
                i3 = i11;
            }
            return aVar;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P.u0(obj);
            return a2;
        }
        i3 = qVar.f17984i;
        tVar = qVar.f17983h;
        P.u0(obj);
        if (i3 != 0) {
            a0 a0Var = tVar.g;
            Object value = tVar.f17997c.getValue();
            qVar.f17983h = null;
            qVar.f17986l = 2;
            if (a0Var.emit(value, qVar) == aVar) {
                return aVar;
            }
        }
        return a2;
    }

    public final void b(String language) {
        Companion.getClass();
        kotlin.jvm.internal.m.e(language, "language");
        String lowerCase = language.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
        String strW0 = O7.x.w0(lowerCase, "-", "_");
        int identifier = this.f17995a.getResources().getIdentifier(strW0, "raw", this.f17995a.getPackageName());
        if (identifier == 0) {
            Log.e("LocalizationService", f.i("Translation file not found for language: ", language, " (resource: ", strW0, ")"));
            this.f17999e = this.f18000f;
            return;
        }
        try {
            InputStream inputStreamOpenRawResource = this.f17995a.getResources().openRawResource(identifier);
            kotlin.jvm.internal.m.d(inputStreamOpenRawResource, "openRawResource(...)");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, a.f8024b), 8192);
            try {
                String strG = D.G(bufferedReader);
                bufferedReader.close();
                this.f17999e = l.i(this.f17996b.e(strG));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC1833d1.l(bufferedReader, th);
                    throw th2;
                }
            }
        } catch (Exception e6) {
            Log.e("LocalizationService", "Failed to load translations for " + language + ": " + e6.getMessage());
            this.f17999e = this.f18000f;
        }
    }

    public final Object d(String str, p117n6.c cVar) {
        Companion.getClass();
        String strC = p.c(str);
        n0 n0Var = this.f17997c;
        n0Var.getClass();
        n0Var.i(null, strC);
        b(strC);
        Object objM = E8.d.M((InterfaceC0744h) u.f18003b.getValue(this.f17995a, u.f18002a[0]), new s(str, strC, null), cVar);
        return objM == p109m6.a.f25430h ? objM : A.f22523a;
    }

    public final String e(String str, Map map) {
        String strC = c(str, this.f17999e);
        if (strC != null || (strC = c(str, this.f18000f)) != null) {
            str = strC;
        }
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            str = O7.x.w0(str, "{{" + str2 + "}}", (String) entry.getValue());
        }
        return str;
    }
}
