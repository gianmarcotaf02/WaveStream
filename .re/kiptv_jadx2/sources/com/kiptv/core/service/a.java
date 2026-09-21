package com.kiptv.core.service;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.play_billing.AbstractC1833d1;
import com.google.common.util.concurrent.D;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p015b5.x;
import p078i6.m;
import p078i6.o;
import p078i6.w;
import p162s8.d;

public final class a {
    public static final x Companion = new x();

    public static final Set f20984f = m.F0(new String[]{"ar", "bn", "da", "de", "el", "en", "es", "fi", "fr", "hi", "it", "ja", "ko", "nb", "nl", "pl", "pt", "ru", "sq", "sv", "tr", "ur", "zh"});

    public final Context f20985a;

    public final d f20986b;

    public final Object f20987c;

    public final LinkedHashMap f20988d;

    public final LinkedHashSet f20989e;

    public a(Context context, d json) {
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(json, "json");
        this.f20985a = context;
        this.f20986b = json;
        this.f20987c = new Object();
        this.f20988d = new LinkedHashMap();
        this.f20989e = new LinkedHashSet();
    }

    public static List b(List list) {
        if (list.isEmpty()) {
            return w.f23205h;
        }
        if (20 >= list.size()) {
            List listP1 = o.P1(list);
            Collections.shuffle(listP1);
            return listP1;
        }
        List listP2 = o.P1(list);
        Collections.shuffle(listP2);
        return o.J1(listP2, 20);
    }

    public final void a(String str) {
        boolean zContains;
        Companion.getClass();
        String strA = x.a(str);
        synchronized (this.f20987c) {
            zContains = this.f20989e.contains(strA);
        }
        if (zContains) {
            return;
        }
        Context context = this.f20985a;
        int identifier = context.getResources().getIdentifier("trivia_".concat(strA), "raw", context.getPackageName());
        List list = null;
        if (identifier != 0) {
            try {
                InputStream inputStreamOpenRawResource = context.getResources().openRawResource(identifier);
                kotlin.jvm.internal.m.d(inputStreamOpenRawResource, "openRawResource(...)");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, O7.a.f8024b), 8192);
                try {
                    String strG = D.G(bufferedReader);
                    bufferedReader.close();
                    list = ((TriviaFile) this.f20986b.b(strG, TriviaFile.INSTANCE.serializer())).f20980a;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC1833d1.l(bufferedReader, th);
                        throw th2;
                    }
                }
            } catch (Exception e6) {
                Log.e("TriviaService", "Failed to load trivia for " + strA + ": " + e6.getMessage());
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
