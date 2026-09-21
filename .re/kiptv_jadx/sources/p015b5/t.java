package p015b5;

/* JADX INFO: loaded from: classes.dex */
public final class t {
    public static final p015b5.p Companion = new p015b5.p();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final java.util.List f17991i = p078i6.p.B0("ar", "bn", "da", "de", "el", "en-GB", "en-US", "es-419", "es-ES", "fi", "fr", "hi", "it", "ja", "ko", "nb", "nl", "pl", "pt-BR", "pt-PT", "ru", "sq", "sv", "tr", "ur", "zh-Hans", "zh-Hant");
    public static final S1.e j = E6.G.Q("kip_language");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final S1.e f17992k = E6.G.Q("kip_language_preference");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final java.util.Set f17993l = p078i6.m.F0(new java.lang.String[]{"ar", "ur"});

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static volatile p015b5.t f17994m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f17995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p162s8.d f17996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final V7.n0 f17997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final V7.W f17998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile kotlinx.serialization.json.c f17999e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile kotlinx.serialization.json.c f18000f;
    public final V7.a0 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final V7.V f18001h;

    public t(android.content.Context context, p162s8.d json) {
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(json, "json");
        this.f17995a = context;
        this.f17996b = json;
        S7.y0 y0VarE = S7.C.e();
        Z7.e eVar = S7.M.f9549a;
        S7.C.c(com.google.android.gms.internal.play_billing.AbstractC1833d1.H(y0VarE, Z7.d.f13044i));
        V7.n0 n0VarB = V7.r.b("en-US");
        this.f17997c = n0VarB;
        this.f17998d = new V7.W(n0VarB);
        p078i6.x xVar = p078i6.x.f23206h;
        this.f17999e = new kotlinx.serialization.json.c(xVar);
        this.f18000f = new kotlinx.serialization.json.c(xVar);
        V7.a0 a0VarA = V7.r.a(1, 5, null);
        this.g = a0VarA;
        this.f18001h = new V7.V(a0VarA);
        f17994m = this;
        java.lang.String str = (java.lang.String) S7.C.E(p100l6.i.f24820h, new p015b5.r(this, null));
        n0VarB.h(str);
        int identifier = context.getResources().getIdentifier("en_us", "raw", context.getPackageName());
        if (identifier == 0) {
            android.util.Log.e("LocalizationService", "Fallback translation file (en_us) not found");
        } else {
            try {
                java.io.InputStream inputStreamOpenRawResource = context.getResources().openRawResource(identifier);
                kotlin.jvm.internal.m.d(inputStreamOpenRawResource, "openRawResource(...)");
                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(inputStreamOpenRawResource, O7.a.f8024b), 8192);
                try {
                    java.lang.String strG = com.google.common.util.concurrent.D.G(bufferedReader);
                    bufferedReader.close();
                    this.f18000f = p162s8.l.i(json.e(strG));
                } catch (java.lang.Throwable th) {
                    try {
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        com.google.android.gms.internal.play_billing.AbstractC1833d1.l(bufferedReader, th);
                        throw th2;
                    }
                }
            } catch (java.lang.Exception e6) {
                android.util.Log.e("LocalizationService", "Failed to load fallback translations: " + e6.getMessage());
            }
        }
        b(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlinx.serialization.json.c] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v8, types: [kotlinx.serialization.json.b] */
    public static java.lang.String c(java.lang.String str, kotlinx.serialization.json.c cVar) {
        for (java.lang.String str2 : O7.q.b1(str, new java.lang.String[]{"."}, 0, 6)) {
            kotlinx.serialization.json.c cVar2 = cVar instanceof kotlinx.serialization.json.c ? (kotlinx.serialization.json.c) cVar : null;
            if (cVar2 == null || (cVar = (kotlinx.serialization.json.b) cVar2.get(str2)) == 0) {
                return null;
            }
        }
        kotlinx.serialization.json.d dVar = cVar instanceof kotlinx.serialization.json.d ? (kotlinx.serialization.json.d) cVar : null;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(java.lang.String str, p117n6.c cVar) {
        p015b5.q qVar;
        p015b5.t tVar;
        int i3;
        if (cVar instanceof p015b5.q) {
            qVar = (p015b5.q) cVar;
            int i9 = qVar.f17986l;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                qVar.f17986l = i9 - Integer.MIN_VALUE;
            } else {
                qVar = new p015b5.q(this, cVar);
            }
        } else {
            qVar = new p015b5.q(this, cVar);
        }
        java.lang.Object obj = qVar.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i10 = qVar.f17986l;
        p070h6.A a2 = p070h6.A.f22523a;
        if (i10 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            Companion.getClass();
            int i11 = !p015b5.p.c(str).equals(this.f17997c.getValue()) ? 1 : 0;
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
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(obj);
            return a2;
        }
        i3 = qVar.f17984i;
        tVar = qVar.f17983h;
        com.google.common.util.concurrent.P.u0(obj);
        if (i3 != 0) {
            V7.a0 a0Var = tVar.g;
            java.lang.Object value = tVar.f17997c.getValue();
            qVar.f17983h = null;
            qVar.f17986l = 2;
            if (a0Var.emit(value, qVar) == aVar) {
                return aVar;
            }
        }
        return a2;
    }

    public final void b(java.lang.String language) {
        Companion.getClass();
        kotlin.jvm.internal.m.e(language, "language");
        java.lang.String lowerCase = language.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
        java.lang.String strW0 = O7.x.w0(lowerCase, "-", "_");
        int identifier = this.f17995a.getResources().getIdentifier(strW0, "raw", this.f17995a.getPackageName());
        if (identifier == 0) {
            android.util.Log.e("LocalizationService", Y6.f.i("Translation file not found for language: ", language, " (resource: ", strW0, ")"));
            this.f17999e = this.f18000f;
            return;
        }
        try {
            java.io.InputStream inputStreamOpenRawResource = this.f17995a.getResources().openRawResource(identifier);
            kotlin.jvm.internal.m.d(inputStreamOpenRawResource, "openRawResource(...)");
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(inputStreamOpenRawResource, O7.a.f8024b), 8192);
            try {
                java.lang.String strG = com.google.common.util.concurrent.D.G(bufferedReader);
                bufferedReader.close();
                this.f17999e = p162s8.l.i(this.f17996b.e(strG));
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    com.google.android.gms.internal.play_billing.AbstractC1833d1.l(bufferedReader, th);
                    throw th2;
                }
            }
        } catch (java.lang.Exception e6) {
            android.util.Log.e("LocalizationService", "Failed to load translations for " + language + ": " + e6.getMessage());
            this.f17999e = this.f18000f;
        }
    }

    public final java.lang.Object d(java.lang.String str, p117n6.c cVar) {
        Companion.getClass();
        java.lang.String strC = p015b5.p.c(str);
        V7.n0 n0Var = this.f17997c;
        n0Var.getClass();
        n0Var.i(null, strC);
        b(strC);
        java.lang.Object objM = E8.d.M((O1.InterfaceC0744h) p015b5.u.f18003b.getValue(this.f17995a, p015b5.u.f18002a[0]), new p015b5.s(str, strC, null), cVar);
        return objM == p109m6.a.f25430h ? objM : p070h6.A.f22523a;
    }

    public final java.lang.String e(java.lang.String str, java.util.Map map) {
        java.lang.String strC = c(str, this.f17999e);
        if (strC != null || (strC = c(str, this.f18000f)) != null) {
            str = strC;
        }
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str2 = (java.lang.String) entry.getKey();
            str = O7.x.w0(str, "{{" + str2 + "}}", (java.lang.String) entry.getValue());
        }
        return str;
    }
}
