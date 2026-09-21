package com.kiptv.core.repository;

import O7.q;
import S7.C;
import S7.M;
import Y6.f;
import Z7.e;
import android.content.Context;
import android.util.Log;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.common.util.concurrent.P;
import com.kiptv.core.model.TraktExternalRatings;
import io.ktor.client.HttpClient;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestKt;
import io.ktor.client.request.UtilsKt;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpResponseKt;
import io.ktor.client.statement.HttpStatement;
import io.ktor.http.HttpMethod;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.m;
import p005a5.J6;
import p005a5.K6;
import p005a5.L6;
import p005a5.M6;
import p005a5.N6;
import p005a5.O6;
import p005a5.P6;
import p005a5.Q6;
import p034d5.c;
import p070h6.k;
import p078i6.D;
import p078i6.o;
import p121o0.p;
import p162s8.d;
import p162s8.l;

public final class b {
    public static final K6 Companion = new K6();

    public final Context f20967a;

    public final HttpClient f20968b;

    public final d f20969c;

    public final p132p5.a f20970d;

    public final HashMap f20971e;

    public final p028c8.d f20972f;
    public final c g;

    public b(Context context, HttpClient httpClient, d json, p132p5.a appConfig) {
        m.e(context, "context");
        m.e(httpClient, "httpClient");
        m.e(json, "json");
        m.e(appConfig, "appConfig");
        this.f20967a = context;
        this.f20968b = httpClient;
        this.f20969c = json;
        this.f20970d = appConfig;
        this.f20971e = new HashMap();
        this.f20972f = new p028c8.d();
        this.g = new c(60, 60000L);
    }

    public static final Object a(b bVar, L6 l9, String str, p117n6.c cVar) {
        M6 m8;
        if (cVar instanceof M6) {
            m8 = (M6) cVar;
            int i3 = m8.f13673m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                m8.f13673m = i3 - Integer.MIN_VALUE;
            } else {
                m8 = new M6(bVar, cVar);
            }
        } else {
            m8 = new M6(bVar, cVar);
        }
        Object objC = m8.f13671k;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = m8.f13673m;
        if (i9 == 0) {
            P.u0(objC);
            String strI = f.i("/", l9.f13626h, "/", str, "/ratings");
            Map mapJ0 = D.J0(new k("extended", TtmlNode.COMBINE_ALL));
            m8.f13669h = bVar;
            m8.f13670i = l9;
            m8.j = str;
            m8.f13673m = 1;
            objC = bVar.c(strI, mapJ0, m8);
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = m8.j;
            l9 = m8.f13670i;
            bVar = m8.f13669h;
            P.u0(objC);
        }
        String str2 = (String) objC;
        if (str2 == null) {
            return null;
        }
        try {
            return (TraktExternalRatings) bVar.f20969c.b(str2, TraktExternalRatings.INSTANCE.serializer());
        } catch (Exception e6) {
            String str3 = l9.f13626h;
            String message = e6.getMessage();
            StringBuilder sbO = f.o("ratings decode failed for ", str3, "/", str, ": ");
            sbO.append(message);
            Log.w("TraktRatings", sbO.toString());
            return null;
        }
    }

    public static final Object b(b bVar, L6 l9, String str, Integer num, p117n6.c cVar) {
        Q6 q9;
        kotlinx.serialization.json.b bVar2;
        kotlinx.serialization.json.c cVarI;
        String strD;
        if (cVar instanceof Q6) {
            q9 = (Q6) cVar;
            int i3 = q9.f13830k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                q9.f13830k = i3 - Integer.MIN_VALUE;
            } else {
                q9 = new Q6(bVar, cVar);
            }
        } else {
            q9 = new Q6(bVar, cVar);
        }
        Object objC = q9.f13829i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = q9.f13830k;
        if (i9 == 0) {
            P.u0(objC);
            if (str != null && !q.N0(str)) {
                return str;
            }
            if (num != null && num.intValue() > 0) {
                Map mapJ0 = D.J0(new k("type", l9.f13627i));
                q9.f13828h = bVar;
                q9.f13830k = 1;
                objC = bVar.c("/search/tmdb/" + num, mapJ0, q9);
                if (objC == aVar) {
                    return aVar;
                }
            }
            return null;
        }
        if (i9 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bVar = q9.f13828h;
        P.u0(objC);
        String str2 = (String) objC;
        if (str2 != null) {
            try {
                kotlinx.serialization.json.b bVarE = bVar.f20969c.e(str2);
                kotlinx.serialization.json.a aVar2 = bVarE instanceof kotlinx.serialization.json.a ? (kotlinx.serialization.json.a) bVarE : null;
                if (aVar2 != null && (bVar2 = (kotlinx.serialization.json.b) o.j1(aVar2)) != null) {
                    kotlinx.serialization.json.c cVarI2 = l.i(bVar2);
                    kotlinx.serialization.json.b bVar3 = (kotlinx.serialization.json.b) cVarI2.get("movie");
                    if (bVar3 != null) {
                        cVarI = l.i(bVar3);
                    } else {
                        kotlinx.serialization.json.b bVar4 = (kotlinx.serialization.json.b) cVarI2.get("show");
                        if (bVar4 != null) {
                            cVarI = l.i(bVar4);
                        }
                    }
                    kotlinx.serialization.json.b bVar5 = (kotlinx.serialization.json.b) cVarI.get("ids");
                    if (bVar5 != null) {
                        kotlinx.serialization.json.c cVarI3 = l.i(bVar5);
                        kotlinx.serialization.json.b bVar6 = (kotlinx.serialization.json.b) cVarI3.get("imdb");
                        if (bVar6 != null && (strD = l.j(bVar6).d()) != null) {
                            if (q.N0(strD) || strD.equals("null")) {
                                strD = null;
                            }
                            if (strD != null) {
                                return strD;
                            }
                        }
                        kotlinx.serialization.json.b bVar7 = (kotlinx.serialization.json.b) cVarI3.get("trakt");
                        if (bVar7 != null) {
                            return l.j(bVar7).d();
                        }
                    }
                }
            } catch (Exception e6) {
                B2.a.v("search decode failed: ", e6.getMessage(), "TraktRatings");
            }
        }
        return null;
    }

    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, Map map, p117n6.c cVar) {
        N6 n9;
        String string;
        b bVar;
        HttpResponse httpResponse;
        String str2 = str;
        if (cVar instanceof N6) {
            n9 = (N6) cVar;
            int i3 = n9.f13704m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                n9.f13704m = i3 - Integer.MIN_VALUE;
            } else {
                n9 = new N6(this, cVar);
            }
        } else {
            n9 = new N6(this, cVar);
        }
        Object objExecute = n9.f13702k;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = n9.f13704m;
        try {
            if (i9 == 0) {
                P.u0(objExecute);
                StringBuilder sb = new StringBuilder("https://api.trakt.tv");
                sb.append(str2);
                if (!map.isEmpty()) {
                    sb.append('?');
                    sb.append(o.o1(map.entrySet(), "&", null, null, new J6(0), 30));
                }
                string = sb.toString();
                n9.f13700h = this;
                n9.f13701i = str2;
                n9.j = string;
                n9.f13704m = 1;
                if (this.g.a(n9) != aVar) {
                    bVar = this;
                }
                return aVar;
            }
            if (i9 == 1) {
                String str3 = n9.j;
                String str4 = n9.f13701i;
                bVar = (b) n9.f13700h;
                P.u0(objExecute);
                string = str3;
                str2 = str4;
            } else if (i9 == 2) {
                str2 = (String) n9.f13700h;
                P.u0(objExecute);
                httpResponse = (HttpResponse) objExecute;
                if (httpResponse.getStatus().getValue() != 200) {
                    Log.w("TraktRatings", "HTTP " + httpResponse.getStatus().getValue() + " for " + str2);
                    return null;
                }
                n9.f13700h = null;
                n9.f13704m = 3;
                objExecute = HttpResponseKt.bodyAsText$default(httpResponse, null, n9, 1, null);
            } else {
                if (i9 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                P.u0(objExecute);
            }
            return (String) objExecute;
            HttpClient httpClient = bVar.f20968b;
            p132p5.a aVar2 = bVar.f20970d;
            HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
            HttpRequestKt.url(httpRequestBuilder, string);
            httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
            UtilsKt.header(httpRequestBuilder, "Content-Type", "application/json");
            UtilsKt.header(httpRequestBuilder, "trakt-api-version", "2");
            aVar2.getClass();
            UtilsKt.header(httpRequestBuilder, "trakt-api-key", "AStyUJy7MpiGCCRlcKySyBRnwJhyb8nWBrEnqebMnVc");
            UtilsKt.header(httpRequestBuilder, "User-Agent", "KIPTV/3.0 (Android TV)");
            HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
            n9.f13700h = str2;
            n9.f13701i = null;
            n9.j = null;
            n9.f13704m = 2;
            objExecute = httpStatement.execute(n9);
            if (objExecute != aVar) {
                httpResponse = (HttpResponse) objExecute;
                if (httpResponse.getStatus().getValue() != 200) {
                    Log.w("TraktRatings", "HTTP " + httpResponse.getStatus().getValue() + " for " + str2);
                    return null;
                }
                n9.f13700h = null;
                n9.f13704m = 3;
                objExecute = HttpResponseKt.bodyAsText$default(httpResponse, null, n9, 1, null);
            }
            return aVar;
        } catch (Exception e6) {
            B2.a.v("network: ", e6.getMessage(), "TraktRatings");
            return null;
        }
    }

    public final Object d(L6 l9, String str, Integer num, p117n6.c cVar) throws Throwable {
        O6 o8;
        String strP;
        String str2;
        p028c8.d dVar;
        L6 l10;
        b bVar;
        String str3;
        Integer num2;
        long j;
        String str4;
        if (cVar instanceof O6) {
            o8 = (O6) cVar;
            int i3 = o8.f13747q;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                o8.f13747q = i3 - Integer.MIN_VALUE;
            } else {
                o8 = new O6(this, cVar);
            }
        } else {
            o8 = new O6(this, cVar);
        }
        Object obj = o8.f13745o;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = o8.f13747q;
        try {
            if (i9 == 0) {
                P.u0(obj);
                this.f20970d.getClass();
                if (!q.N0("AStyUJy7MpiGCCRlcKySyBRnwJhyb8nWBrEnqebMnVc")) {
                    if (str != null && !q.N0(str)) {
                        strP = p.p(l9.f13626h, "_", str);
                    } else if (num != null && num.intValue() > 0) {
                        strP = l9.f13626h + "_tmdb_" + num;
                    }
                    str2 = strP;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    o8.f13739h = this;
                    o8.f13740i = l9;
                    o8.j = str;
                    o8.f13741k = num;
                    o8.f13742l = str2;
                    dVar = this.f20972f;
                    o8.f13743m = dVar;
                    o8.f13744n = jCurrentTimeMillis;
                    o8.f13747q = 1;
                    if (dVar.e(o8) != aVar) {
                        l10 = l9;
                        bVar = this;
                        str3 = str;
                        num2 = num;
                        j = jCurrentTimeMillis;
                    }
                }
                return null;
            }
            if (i9 != 1) {
                if (i9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                P.u0(obj);
                return obj;
            }
            long j9 = o8.f13744n;
            p028c8.d dVar2 = o8.f13743m;
            str2 = o8.f13742l;
            Integer num3 = o8.f13741k;
            String str5 = o8.j;
            L6 l11 = o8.f13740i;
            b bVar2 = o8.f13739h;
            P.u0(obj);
            dVar = dVar2;
            j = j9;
            num2 = num3;
            str3 = str5;
            l10 = l11;
            bVar = bVar2;
            k kVar = (k) bVar.f20971e.get(str4);
            dVar.g(null);
            if (kVar != null) {
                TraktExternalRatings traktExternalRatings = (TraktExternalRatings) kVar.f22539h;
                if (j - ((Number) kVar.f22540i).longValue() < 86400000) {
                    return traktExternalRatings;
                }
            }
            e eVar = M.f9549a;
            Z7.d dVar3 = Z7.d.f13044i;
            P6 p9 = new P6(bVar, str4, l10, str3, num2, j, null);
            o8.f13739h = null;
            o8.f13740i = null;
            o8.j = null;
            o8.f13741k = null;
            o8.f13742l = null;
            o8.f13743m = null;
            o8.f13747q = 2;
            Object objK = C.K(dVar3, p9, o8);
            return objK == aVar ? aVar : objK;
        } catch (Throwable th) {
            dVar.g(null);
            throw th;
        }
        str4 = str2;
    }
}
