package com.kiptv.core.service;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final p015b5.x Companion = new p015b5.x();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final java.util.Set f20984f = p078i6.m.F0(new java.lang.String[]{"ar", "bn", "da", "de", "el", "en", "es", "fi", "fr", "hi", "it", "ja", "ko", "nb", "nl", "pl", "pt", "ru", "sq", "sv", "tr", "ur", "zh"});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f20985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p162s8.d f20986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Object f20987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.LinkedHashMap f20988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.LinkedHashSet f20989e;

    public a(android.content.Context context, p162s8.d json) {
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(json, "json");
        this.f20985a = context;
        this.f20986b = json;
        this.f20987c = new java.lang.Object();
        this.f20988d = new java.util.LinkedHashMap();
        this.f20989e = new java.util.LinkedHashSet();
    }

    public static java.util.List b(java.util.List list) {
        if (list.isEmpty()) {
            return p078i6.w.f23205h;
        }
        if (20 >= list.size()) {
            java.util.List listP1 = p078i6.o.P1(list);
            java.util.Collections.shuffle(listP1);
            return listP1;
        }
        java.util.List listP2 = p078i6.o.P1(list);
        java.util.Collections.shuffle(listP2);
        return p078i6.o.J1(listP2, 20);
    }

    public final void a(java.lang.String str) {
        boolean zContains;
        Companion.getClass();
        java.lang.String strA = p015b5.x.a(str);
        synchronized (this.f20987c) {
            zContains = this.f20989e.contains(strA);
        }
        if (zContains) {
            return;
        }
        android.content.Context context = this.f20985a;
        int identifier = context.getResources().getIdentifier("trivia_".concat(strA), "raw", context.getPackageName());
        java.util.List list = null;
        if (identifier != 0) {
            try {
                java.io.InputStream inputStreamOpenRawResource = context.getResources().openRawResource(identifier);
                kotlin.jvm.internal.m.d(inputStreamOpenRawResource, "openRawResource(...)");
                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(inputStreamOpenRawResource, O7.a.f8024b), 8192);
                try {
                    java.lang.String strG = com.google.common.util.concurrent.D.G(bufferedReader);
                    bufferedReader.close();
                    list = ((com.kiptv.core.service.TriviaFile) this.f20986b.b(strG, com.kiptv.core.service.TriviaFile.INSTANCE.serializer())).f20980a;
                } catch (java.lang.Throwable th) {
                    try {
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        com.google.android.gms.internal.play_billing.AbstractC1833d1.l(bufferedReader, th);
                        throw th2;
                    }
                }
            } catch (java.lang.Exception e6) {
                android.util.Log.e("TriviaService", "Failed to load trivia for " + strA + ": " + e6.getMessage());
            }
        }
        synchronized (this.f20987c) {
            this.f20989e.add(strA);
            if (list != null) {
                this.f20988d.put(strA, list);
            }
        }
    }
}
