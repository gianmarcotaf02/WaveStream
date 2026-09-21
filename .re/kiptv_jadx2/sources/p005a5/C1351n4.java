package p005a5;

import android.util.Log;
import com.google.common.util.concurrent.P;
import com.kiptv.core.model.I;
import com.kiptv.core.model.J;
import com.kiptv.core.repository.SkipIntroRepository$IntroDbResponse;
import com.kiptv.core.repository.SkipIntroRepository$RawSegment;
import com.kiptv.core.repository.SkipIntroRepository$TheIntroDbResponse;
import io.ktor.client.HttpClient;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestKt;
import io.ktor.client.request.UtilsKt;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpResponseKt;
import io.ktor.client.statement.HttpStatement;
import io.ktor.http.HttpMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.m;
import p070h6.n;
import p078i6.q;
import p078i6.w;
import p109m6.a;
import p117n6.c;
import p162s8.d;

public final class C1351n4 {
    private static final C1311j4 Companion = new C1311j4();

    public final HttpClient f14813a;

    public final d f14814b;

    public final C1451x5 f14815c;

    public final ConcurrentHashMap f14816d;

    public final ConcurrentHashMap f14817e;

    public C1351n4(HttpClient httpClient, d json, C1451x5 tmdbRepository) {
        m.e(httpClient, "httpClient");
        m.e(json, "json");
        m.e(tmdbRepository, "tmdbRepository");
        this.f14813a = httpClient;
        this.f14814b = json;
        this.f14815c = tmdbRepository;
        this.f14816d = new ConcurrentHashMap();
        this.f14817e = new ConcurrentHashMap();
    }

    public static List d(List list) {
        if (list == null) {
            return w.f23205h;
        }
        ArrayList arrayList = new ArrayList(q.I0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SkipIntroRepository$RawSegment skipIntroRepository$RawSegment = (SkipIntroRepository$RawSegment) it.next();
            arrayList.add(new J(skipIntroRepository$RawSegment.f20921a, skipIntroRepository$RawSegment.f20922b));
        }
        return arrayList;
    }

    public static List e(SkipIntroRepository$RawSegment skipIntroRepository$RawSegment) {
        if (skipIntroRepository$RawSegment != null) {
            Integer num = skipIntroRepository$RawSegment.f20922b;
            Integer num2 = skipIntroRepository$RawSegment.f20921a;
            if (num2 != null || num != null) {
                return P.i0(new J(num2, num));
            }
        }
        return w.f23205h;
    }

    public final Object a(int i3, int i9, String str, c cVar) {
        C1321k4 c1321k4;
        C1351n4 c1351n4;
        String str2;
        C1351n4 c1351n5;
        C1351n4 c1351n6;
        HttpResponse httpResponse;
        int value;
        Object obj;
        d dVar;
        Throwable thA;
        Object objT;
        if (cVar instanceof C1321k4) {
            c1321k4 = (C1321k4) cVar;
            int i10 = c1321k4.f14693n;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c1321k4.f14693n = i10 - Integer.MIN_VALUE;
            } else {
                c1321k4 = new C1321k4(this, cVar);
            }
        } else {
            c1321k4 = new C1321k4(this, cVar);
        }
        Object objBodyAsText$default = c1321k4.f14691l;
        a aVar = a.f25430h;
        int i11 = c1321k4.f14693n;
        Object obj2 = null;
        if (i11 == 0) {
            P.u0(objBodyAsText$default);
            String str3 = str + "-" + i3 + "-" + i9;
            C1301i4 c1301i4 = (C1301i4) this.f14817e.get(str3);
            if (c1301i4 != null) {
                return c1301i4.f14606a;
            }
            try {
                HttpClient httpClient = this.f14813a;
                HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
                HttpRequestKt.url(httpRequestBuilder, "https://api.introdb.app/segments");
                UtilsKt.header(httpRequestBuilder, "User-Agent", "KIPTV-AndroidTV (+https://kiptv.app)");
                UtilsKt.header(httpRequestBuilder, "Accept", "application/json");
                UtilsKt.parameter(httpRequestBuilder, "imdb_id", str);
                UtilsKt.parameter(httpRequestBuilder, "season", new Integer(i3));
                UtilsKt.parameter(httpRequestBuilder, "episode", new Integer(i9));
                httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
                HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
                c1321k4.f14688h = this;
                c1321k4.f14689i = str3;
                c1321k4.j = this;
                c1321k4.f14693n = 1;
                Object objExecute = httpStatement.execute(c1321k4);
                if (objExecute != aVar) {
                    c1351n5 = this;
                    c1351n6 = c1351n5;
                    str2 = str3;
                    objBodyAsText$default = objExecute;
                    httpResponse = (HttpResponse) objBodyAsText$default;
                    value = httpResponse.getStatus().getValue();
                    if (200 > value) {
                    }
                    Log.d("SkipIntroRepository", "IntroDB " + str2 + " → http " + httpResponse.getStatus().getValue());
                    obj = null;
                }
                return aVar;
            } catch (Throwable th) {
                th = th;
                c1351n4 = this;
                str2 = str3;
                objT = P.T(th);
                c1351n6 = c1351n4;
                obj = objT;
                thA = n.a(obj);
                if (thA == null) {
                    obj2 = obj;
                } else {
                    Log.d("SkipIntroRepository", "IntroDB fetch failed for " + str2 + ": " + thA.getMessage());
                }
                I i12 = (I) obj2;
                c1351n6.f14817e.put(str2, new C1301i4(i12));
                return i12;
            }
        }
        if (i11 == 1) {
            C1351n4 c1351n7 = c1321k4.j;
            str2 = c1321k4.f14689i;
            C1351n4 c1351n8 = c1321k4.f14688h;
            try {
                P.u0(objBodyAsText$default);
                c1351n6 = c1351n8;
                c1351n5 = c1351n7;
                try {
                    httpResponse = (HttpResponse) objBodyAsText$default;
                    value = httpResponse.getStatus().getValue();
                    if (200 > value && value < 300) {
                        dVar = c1351n5.f14814b;
                        c1321k4.f14688h = c1351n6;
                        c1321k4.f14689i = str2;
                        c1321k4.j = c1351n5;
                        c1321k4.f14690k = dVar;
                        c1321k4.f14693n = 2;
                        objBodyAsText$default = HttpResponseKt.bodyAsText$default(httpResponse, null, c1321k4, 1, null);
                        if (objBodyAsText$default != aVar) {
                            c1351n4 = c1351n6;
                            dVar.getClass();
                            SkipIntroRepository$IntroDbResponse skipIntroRepository$IntroDbResponse = (SkipIntroRepository$IntroDbResponse) dVar.b((String) objBodyAsText$default, SkipIntroRepository$IntroDbResponse.INSTANCE.serializer());
                            SkipIntroRepository$RawSegment skipIntroRepository$RawSegment = skipIntroRepository$IntroDbResponse.f20918a;
                            c1351n5.getClass();
                            I i13 = new I(8, e(skipIntroRepository$RawSegment), e(skipIntroRepository$IntroDbResponse.f20919b), e(skipIntroRepository$IntroDbResponse.f20920c));
                            Log.d("SkipIntroRepository", "IntroDB " + str2 + " → hit (empty=" + i13.a() + ")");
                            objT = i13;
                            c1351n6 = c1351n4;
                            obj = objT;
                        }
                        return aVar;
                    }
                    Log.d("SkipIntroRepository", "IntroDB " + str2 + " → http " + httpResponse.getStatus().getValue());
                    obj = null;
                } catch (Throwable th2) {
                    th = th2;
                    c1351n4 = c1351n6;
                    objT = P.T(th);
                }
            } catch (Throwable th3) {
                th = th3;
                c1351n4 = c1351n8;
                objT = P.T(th);
                c1351n6 = c1351n4;
                obj = objT;
                thA = n.a(obj);
                if (thA == null) {
                    obj2 = obj;
                } else {
                    Log.d("SkipIntroRepository", "IntroDB fetch failed for " + str2 + ": " + thA.getMessage());
                }
                I i14 = (I) obj2;
                c1351n6.f14817e.put(str2, new C1301i4(i14));
                return i14;
            }
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dVar = c1321k4.f14690k;
            c1351n5 = c1321k4.j;
            str2 = c1321k4.f14689i;
            c1351n4 = c1321k4.f14688h;
            try {
                P.u0(objBodyAsText$default);
                dVar.getClass();
                SkipIntroRepository$IntroDbResponse skipIntroRepository$IntroDbResponse2 = (SkipIntroRepository$IntroDbResponse) dVar.b((String) objBodyAsText$default, SkipIntroRepository$IntroDbResponse.INSTANCE.serializer());
                SkipIntroRepository$RawSegment skipIntroRepository$RawSegment2 = skipIntroRepository$IntroDbResponse2.f20918a;
                c1351n5.getClass();
                I i15 = new I(8, e(skipIntroRepository$RawSegment2), e(skipIntroRepository$IntroDbResponse2.f20919b), e(skipIntroRepository$IntroDbResponse2.f20920c));
                Log.d("SkipIntroRepository", "IntroDB " + str2 + " → hit (empty=" + i15.a() + ")");
                objT = i15;
            } catch (Throwable th4) {
                th = th4;
                objT = P.T(th);
            }
            c1351n6 = c1351n4;
            obj = objT;
        }
        thA = n.a(obj);
        if (thA == null) {
            obj2 = obj;
        } else {
            Log.d("SkipIntroRepository", "IntroDB fetch failed for " + str2 + ": " + thA.getMessage());
        }
        I i16 = (I) obj2;
        c1351n6.f14817e.put(str2, new C1301i4(i16));
        return i16;
    }

    public final Object b(int i3, Integer num, Integer num2, Integer num3, c cVar) {
        C1331l4 c1331l4;
        Throwable th;
        C1351n4 c1351n4;
        String str;
        C1351n4 c1351n5;
        String str2;
        C1351n4 c1351n6;
        Object obj;
        d dVar;
        Throwable thA;
        Object objT;
        if (cVar instanceof C1331l4) {
            c1331l4 = (C1331l4) cVar;
            int i9 = c1331l4.f14730n;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c1331l4.f14730n = i9 - Integer.MIN_VALUE;
            } else {
                c1331l4 = new C1331l4(this, cVar);
            }
        } else {
            c1331l4 = new C1331l4(this, cVar);
        }
        Object objExecute = c1331l4.f14728l;
        a aVar = a.f25430h;
        int i10 = c1331l4.f14730n;
        Object obj2 = null;
        try {
            if (i10 == 0) {
                P.u0(objExecute);
                String str3 = i3 + "-" + (num != null ? num.intValue() : -1) + "-" + (num2 != null ? num2.intValue() : -1);
                C1301i4 c1301i4 = (C1301i4) this.f14816d.get(str3);
                if (c1301i4 != null) {
                    return c1301i4.f14606a;
                }
                try {
                    HttpClient httpClient = this.f14813a;
                    HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
                    HttpRequestKt.url(httpRequestBuilder, "https://api.theintrodb.org/v3/media");
                    UtilsKt.header(httpRequestBuilder, "User-Agent", "KIPTV-AndroidTV (+https://kiptv.app)");
                    UtilsKt.header(httpRequestBuilder, "Accept", "application/json");
                    UtilsKt.parameter(httpRequestBuilder, "tmdb_id", new Integer(i3));
                    if (num != null) {
                        UtilsKt.parameter(httpRequestBuilder, "season", new Integer(num.intValue()));
                    }
                    if (num2 != null) {
                        UtilsKt.parameter(httpRequestBuilder, "episode", new Integer(num2.intValue()));
                    }
                    if (num3 != null) {
                        Integer num4 = num3.intValue() > 0 ? num3 : null;
                        if (num4 != null) {
                            UtilsKt.parameter(httpRequestBuilder, "duration_ms", new Integer(num4.intValue()));
                        }
                    }
                    httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
                    HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
                    c1331l4.f14725h = this;
                    c1331l4.f14726i = str3;
                    c1331l4.j = this;
                    c1331l4.f14730n = 1;
                    objExecute = httpStatement.execute(c1331l4);
                    if (objExecute != aVar) {
                        c1351n5 = this;
                        str2 = str3;
                        c1351n6 = c1351n5;
                    }
                    return aVar;
                } catch (Throwable th2) {
                    th = th2;
                    c1351n4 = this;
                    str = str3;
                    objT = P.T(th);
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dVar = c1331l4.f14727k;
                    c1351n5 = c1331l4.j;
                    str = c1331l4.f14726i;
                    c1351n4 = c1331l4.f14725h;
                    try {
                        P.u0(objExecute);
                        dVar.getClass();
                        SkipIntroRepository$TheIntroDbResponse skipIntroRepository$TheIntroDbResponse = (SkipIntroRepository$TheIntroDbResponse) dVar.b((String) objExecute, SkipIntroRepository$TheIntroDbResponse.INSTANCE.serializer());
                        List list = skipIntroRepository$TheIntroDbResponse.f20924a;
                        c1351n5.getClass();
                        I i11 = new I(d(list), d(skipIntroRepository$TheIntroDbResponse.f20925b), d(skipIntroRepository$TheIntroDbResponse.f20926c), d(skipIntroRepository$TheIntroDbResponse.f20927d));
                        Log.d("SkipIntroRepository", "TheIntroDB " + str + " → hit (empty=" + i11.a() + ")");
                        objT = i11;
                    } catch (Throwable th3) {
                        th = th3;
                        objT = P.T(th);
                    }
                    c1351n6 = c1351n4;
                    str2 = str;
                    obj = objT;
                    thA = n.a(obj);
                    if (thA == null) {
                        obj2 = obj;
                    } else {
                        Log.d("SkipIntroRepository", "TheIntroDB fetch failed for " + str2 + ": " + thA.getMessage());
                    }
                    I i12 = (I) obj2;
                    c1351n6.f14816d.put(str2, new C1301i4(i12));
                    return i12;
                }
                C1351n4 c1351n7 = c1331l4.j;
                String str4 = c1331l4.f14726i;
                c1351n6 = c1331l4.f14725h;
                try {
                    P.u0(objExecute);
                    c1351n5 = c1351n7;
                    str2 = str4;
                } catch (Throwable th4) {
                    th = th4;
                    str = str4;
                    c1351n4 = c1351n6;
                    objT = P.T(th);
                    c1351n6 = c1351n4;
                    str2 = str;
                    obj = objT;
                    thA = n.a(obj);
                    if (thA == null) {
                        obj2 = obj;
                    } else {
                        Log.d("SkipIntroRepository", "TheIntroDB fetch failed for " + str2 + ": " + thA.getMessage());
                    }
                    I i13 = (I) obj2;
                    c1351n6.f14816d.put(str2, new C1301i4(i13));
                    return i13;
                }
            }
            HttpResponse httpResponse = (HttpResponse) objExecute;
            int value = httpResponse.getStatus().getValue();
            if (200 <= value && value < 300) {
                d dVar2 = c1351n5.f14814b;
                c1331l4.f14725h = c1351n6;
                c1331l4.f14726i = str2;
                c1331l4.j = c1351n5;
                c1331l4.f14727k = dVar2;
                c1331l4.f14730n = 2;
                objExecute = HttpResponseKt.bodyAsText$default(httpResponse, null, c1331l4, 1, null);
                if (objExecute != aVar) {
                    str = str2;
                    c1351n4 = c1351n6;
                    dVar = dVar2;
                    dVar.getClass();
                    SkipIntroRepository$TheIntroDbResponse skipIntroRepository$TheIntroDbResponse2 = (SkipIntroRepository$TheIntroDbResponse) dVar.b((String) objExecute, SkipIntroRepository$TheIntroDbResponse.INSTANCE.serializer());
                    List list2 = skipIntroRepository$TheIntroDbResponse2.f20924a;
                    c1351n5.getClass();
                    I i14 = new I(d(list2), d(skipIntroRepository$TheIntroDbResponse2.f20925b), d(skipIntroRepository$TheIntroDbResponse2.f20926c), d(skipIntroRepository$TheIntroDbResponse2.f20927d));
                    Log.d("SkipIntroRepository", "TheIntroDB " + str + " → hit (empty=" + i14.a() + ")");
                    objT = i14;
                    c1351n6 = c1351n4;
                    str2 = str;
                    obj = objT;
                }
                return aVar;
            }
            Log.d("SkipIntroRepository", "TheIntroDB " + str2 + " → http " + httpResponse.getStatus().getValue());
            obj = null;
        } catch (Throwable th5) {
            str = str2;
            th = th5;
            c1351n4 = c1351n6;
            objT = P.T(th);
        }
        thA = n.a(obj);
        if (thA == null) {
            obj2 = obj;
        } else {
            Log.d("SkipIntroRepository", "TheIntroDB fetch failed for " + str2 + ": " + thA.getMessage());
        }
        I i15 = (I) obj2;
        c1351n6.f14816d.put(str2, new C1301i4(i15));
        return i15;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object c(java.util.List r22, java.lang.Integer r23, java.lang.Integer r24, java.lang.Integer r25, p117n6.c r26) {
        /*
            Method dump skipped, instruction units count: 803
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p005a5.C1351n4.c(java.util.List, java.lang.Integer, java.lang.Integer, java.lang.Integer, n6.c):java.lang.Object");
    }
}
