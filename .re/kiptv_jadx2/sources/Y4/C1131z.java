package Y4;

import android.util.Log;
import com.google.crypto.tink.shaded.protobuf.AbstractC1909d;
import com.kiptv.core.model.C1932a0;
import com.kiptv.core.model.C1934b0;
import com.kiptv.core.model.C1936c0;
import com.kiptv.core.model.OSDownloadResponse;
import com.kiptv.core.model.OSErrorResponse;
import com.kiptv.core.model.OSLoginResponse;
import com.kiptv.core.model.OSSearchResponse;
import com.kiptv.core.model.OSUserInfoResponse;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import io.ktor.client.HttpClient;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestKt;
import io.ktor.client.request.UtilsKt;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpResponseKt;
import io.ktor.client.statement.HttpStatement;
import io.ktor.http.ContentType;
import io.ktor.http.HttpMethod;
import io.ktor.http.content.TextContent;
import io.ktor.sse.ServerSentEventKt;
import io.sentry.protocol.User;
import java.util.Locale;
import java.util.regex.Pattern;

public final class C1131z {
    public static final r Companion = new r();
    public static final w8.q g;

    public final HttpClient f12164a;

    public final p162s8.d f12165b;

    public final p034d5.c f12166c = new p034d5.c(4, 1000);

    public String f12167d;

    public String f12168e;

    public final w8.s f12169f;

    static {
        Pattern pattern = w8.q.f30591e;
        g = AbstractC1909d.S("application/json");
    }

    public C1131z(HttpClient httpClient, p162s8.d dVar, p132p5.a aVar) {
        this.f12164a = httpClient;
        this.f12165b = dVar;
        w8.r rVar = new w8.r();
        rVar.a(com.google.common.util.concurrent.P.i0(w8.t.HTTP_1_1));
        rVar.f30604h = false;
        this.f12169f = new w8.s(rVar);
    }

    public static String f(String str) {
        String strT1 = O7.q.t1(O7.q.r1(str).toString(), '/');
        if (!O7.x.x0(strT1, "http://", false) && !O7.x.x0(strT1, "https://", false)) {
            strT1 = "https://".concat(strT1);
        }
        return O7.x.q0(strT1, "/api/v1", false) ? strT1 : strT1.concat("/api/v1");
    }

    public static Object i(C1131z c1131z, Integer num, String str, String str2, Integer num2, Integer num3, p005a5.Z0 z6, int i3) {
        if ((i3 & 1) != 0) {
            num = null;
        }
        if ((i3 & 2) != 0) {
            str = null;
        }
        return c1131z.h(num, str, str2, num2, num3, z6);
    }

    public final void a(HttpRequestBuilder httpRequestBuilder, boolean z6) {
        String str;
        UtilsKt.header(httpRequestBuilder, "Accept", "*/*");
        UtilsKt.header(httpRequestBuilder, "Api-Key", "VdYVekly6FnPaioJkajUXsVYsSr4mcuU");
        UtilsKt.header(httpRequestBuilder, "User-Agent", "KIPTV TV v1.0");
        if (!z6 || (str = this.f12167d) == null) {
            return;
        }
        UtilsKt.header(httpRequestBuilder, "Authorization", "Bearer ".concat(str));
    }

    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(int i3, p117n6.c cVar) throws Throwable {
        C1113t c1113t;
        int i9;
        C1131z c1131z;
        String lowerCase;
        if (cVar instanceof C1113t) {
            c1113t = (C1113t) cVar;
            int i10 = c1113t.f12083l;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c1113t.f12083l = i10 - Integer.MIN_VALUE;
            } else {
                c1113t = new C1113t(this, cVar);
            }
        } else {
            c1113t = new C1113t(this, cVar);
        }
        Object objK = c1113t.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i11 = c1113t.f12083l;
        if (i11 == 0) {
            com.google.common.util.concurrent.P.u0(objK);
            c1113t.f12080h = this;
            c1113t.f12081i = i3;
            c1113t.f12083l = 1;
            if (this.f12166c.a(c1113t) != aVar) {
                i9 = i3;
                c1131z = this;
            }
            return aVar;
        }
        if (i11 == 1) {
            int i12 = c1113t.f12081i;
            C1131z c1131z2 = c1113t.f12080h;
            com.google.common.util.concurrent.P.u0(objK);
            i9 = i12;
            c1131z = c1131z2;
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1131z = c1113t.f12080h;
            com.google.common.util.concurrent.P.u0(objK);
        }
        C1110s c1110s = (C1110s) objK;
        int i13 = c1110s.f12069a;
        String str = c1110s.f12070b;
        if (200 > i13 || i13 >= 300) {
            String str2 = c1110s.f12072d;
            if (str2 == null) {
                str2 = "none";
            }
            c1131z.getClass();
            Pattern patternCompile = Pattern.compile("\\s+");
            kotlin.jvm.internal.m.d(patternCompile, "compile(...)");
            String strReplaceAll = patternCompile.matcher(str).replaceAll(ServerSentEventKt.SPACE);
            kotlin.jvm.internal.m.d(strReplaceAll, "replaceAll(...)");
            String strP1 = O7.q.p1(RCHTTPStatusCodes.UNSUCCESSFUL, O7.q.r1(strReplaceAll).toString());
            StringBuilder sbT = p121o0.p.t(i13, "Download endpoint HTTP ", " (");
            B2.a.x(sbT, c1110s.f12071c, ", location=", str2, "): ");
            sbT.append(strP1);
            Log.w("OpenSubtitlesApi", sbT.toString());
        }
        int i14 = c1110s.f12069a;
        if (200 <= i14 && i14 < 300) {
            return c1131z.f12165b.b(str, OSDownloadResponse.INSTANCE.serializer());
        }
        if (i14 == 401) {
            throw com.kiptv.core.model.X.f20646h;
        }
        if (i14 == 403) {
            String strG = c1131z.g(str);
            if (strG == null) {
                strG = "Forbidden";
            }
            throw new com.kiptv.core.model.W(strG);
        }
        if (i14 != 406) {
            if (i14 == 410) {
                throw com.kiptv.core.model.V.f20607h;
            }
            if (i14 == 429) {
                throw C1934b0.f20741h;
            }
            if (500 > i14 || i14 >= 600) {
                throw new C1936c0(i14);
            }
            throw new C1936c0(i14);
        }
        String strG2 = c1131z.g(str);
        if (strG2 != null) {
            lowerCase = strG2.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = "";
        }
        if (O7.q.B0(lowerCase, "invalid token", false)) {
            throw com.kiptv.core.model.Z.f20735h;
        }
        if (O7.q.B0(lowerCase, "invalid file", false)) {
            throw com.kiptv.core.model.Y.f20734h;
        }
        OSErrorResponse oSErrorResponseJ = c1131z.j(str);
        if (lowerCase.length() == 0) {
            lowerCase = "Quota exceeded";
        }
        throw new C1932a0(lowerCase, oSErrorResponseJ != null ? oSErrorResponseJ.f19908e : null);
        c1113t.f12080h = c1131z;
        c1113t.f12083l = 2;
        c1131z.getClass();
        Z7.e eVar = S7.M.f9549a;
        objK = S7.C.K(Z7.d.f13044i, new C1116u(i9, c1131z, null), c1113t);
    }

    public final Object c(p117n6.c cVar) throws C1934b0, C1936c0, C1932a0, com.kiptv.core.model.V, com.kiptv.core.model.W, com.kiptv.core.model.X, com.kiptv.core.model.Y, com.kiptv.core.model.Z {
        C1119v c1119v;
        C1131z c1131z;
        int value;
        C1131z c1131z2;
        int i3;
        String str;
        String strG;
        String lowerCase;
        String strG2;
        if (cVar instanceof C1119v) {
            c1119v = (C1119v) cVar;
            int i9 = c1119v.f12114l;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c1119v.f12114l = i9 - Integer.MIN_VALUE;
            } else {
                c1119v = new C1119v(this, cVar);
            }
        } else {
            c1119v = new C1119v(this, cVar);
        }
        Object objExecute = c1119v.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i10 = c1119v.f12114l;
        if (i10 == 0) {
            com.google.common.util.concurrent.P.u0(objExecute);
            c1119v.f12111h = this;
            c1119v.f12114l = 1;
            if (this.f12166c.a(c1119v) != aVar) {
                c1131z = this;
            }
            return aVar;
        }
        if (i10 == 1) {
            c1131z = c1119v.f12111h;
            com.google.common.util.concurrent.P.u0(objExecute);
        } else {
            if (i10 == 2) {
                c1131z = c1119v.f12111h;
                com.google.common.util.concurrent.P.u0(objExecute);
                HttpResponse httpResponse = (HttpResponse) objExecute;
                value = httpResponse.getStatus().getValue();
                c1119v.f12111h = c1131z;
                c1119v.f12112i = value;
                c1119v.f12114l = 3;
                objExecute = HttpResponseKt.bodyAsText$default(httpResponse, null, c1119v, 1, null);
                if (objExecute != aVar) {
                    c1131z2 = c1131z;
                    i3 = value;
                }
                return aVar;
            }
            if (i10 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = c1119v.f12112i;
            c1131z2 = c1119v.f12111h;
            com.google.common.util.concurrent.P.u0(objExecute);
        }
        str = (String) objExecute;
        if (200 > i3 && i3 < 300) {
            return c1131z2.f12165b.b(str, OSUserInfoResponse.INSTANCE.serializer());
        }
        if (i3 != 401) {
            throw com.kiptv.core.model.X.f20646h;
        }
        if (i3 == 403) {
            strG2 = c1131z2.g(str);
            if (strG2 == null) {
                strG2 = "Forbidden";
            }
            throw new com.kiptv.core.model.W(strG2);
        }
        if (i3 == 406) {
            if (i3 != 410) {
                throw com.kiptv.core.model.V.f20607h;
            }
            if (i3 != 429) {
                throw C1934b0.f20741h;
            }
            if (500 <= i3 || i3 >= 600) {
                throw new C1936c0(i3);
            }
            throw new C1936c0(i3);
        }
        strG = c1131z2.g(str);
        if (strG != null) {
            lowerCase = strG.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = "";
        }
        if (!O7.q.B0(lowerCase, "invalid token", false)) {
            throw com.kiptv.core.model.Z.f20735h;
        }
        if (!O7.q.B0(lowerCase, "invalid file", false)) {
            throw com.kiptv.core.model.Y.f20734h;
        }
        OSErrorResponse oSErrorResponseJ = c1131z2.j(str);
        if (lowerCase.length() == 0) {
            lowerCase = "Quota exceeded";
        }
        throw new C1932a0(lowerCase, oSErrorResponseJ != null ? oSErrorResponseJ.f19908e : null);
        HttpClient httpClient = c1131z.f12164a;
        String str2 = c1131z.f12168e;
        if (str2 == null) {
            str2 = "https://api.opensubtitles.com/api/v1";
        }
        String strConcat = str2.concat("/infos/user");
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpRequestKt.url(httpRequestBuilder, strConcat);
        c1131z.a(httpRequestBuilder, true);
        HttpStatement httpStatementH = B2.a.h(HttpMethod.INSTANCE, httpRequestBuilder, httpRequestBuilder, httpClient);
        c1119v.f12111h = c1131z;
        c1119v.f12114l = 2;
        objExecute = httpStatementH.execute(c1119v);
        if (objExecute != aVar) {
            HttpResponse httpResponse2 = (HttpResponse) objExecute;
            value = httpResponse2.getStatus().getValue();
            c1119v.f12111h = c1131z;
            c1119v.f12112i = value;
            c1119v.f12114l = 3;
            objExecute = HttpResponseKt.bodyAsText$default(httpResponse2, null, c1119v, 1, null);
            if (objExecute != aVar) {
                c1131z2 = c1131z;
                i3 = value;
                str = (String) objExecute;
                if (200 > i3) {
                }
                if (i3 != 401) {
                    throw com.kiptv.core.model.X.f20646h;
                }
                if (i3 == 403) {
                    strG2 = c1131z2.g(str);
                    if (strG2 == null) {
                        strG2 = "Forbidden";
                    }
                    throw new com.kiptv.core.model.W(strG2);
                }
                if (i3 == 406) {
                    if (i3 != 410) {
                        throw com.kiptv.core.model.V.f20607h;
                    }
                    if (i3 != 429) {
                        throw C1934b0.f20741h;
                    }
                    if (500 <= i3) {
                    }
                    throw new C1936c0(i3);
                }
                strG = c1131z2.g(str);
                if (strG != null) {
                    lowerCase = strG.toLowerCase(Locale.ROOT);
                    kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
                } else {
                    lowerCase = "";
                }
                if (!O7.q.B0(lowerCase, "invalid token", false)) {
                    throw com.kiptv.core.model.Z.f20735h;
                }
                if (!O7.q.B0(lowerCase, "invalid file", false)) {
                    throw com.kiptv.core.model.Y.f20734h;
                }
                OSErrorResponse oSErrorResponseJ2 = c1131z2.j(str);
                if (lowerCase.length() == 0) {
                    lowerCase = "Quota exceeded";
                }
                throw new C1932a0(lowerCase, oSErrorResponseJ2 != null ? oSErrorResponseJ2.f19908e : null);
            }
        }
        return aVar;
    }

    public final Object d(String str, String str2, p117n6.c cVar) throws C1934b0, C1936c0, C1932a0, com.kiptv.core.model.V, com.kiptv.core.model.W, com.kiptv.core.model.X, com.kiptv.core.model.Y, com.kiptv.core.model.Z {
        C1122w c1122w;
        String str3;
        String str4;
        C1131z c1131z;
        C1131z c1131z2;
        int value;
        C1131z c1131z3;
        int i3;
        String str5;
        String strG;
        String lowerCase;
        String strG2;
        if (cVar instanceof C1122w) {
            c1122w = (C1122w) cVar;
            int i9 = c1122w.f12129n;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c1122w.f12129n = i9 - Integer.MIN_VALUE;
            } else {
                c1122w = new C1122w(this, cVar);
            }
        } else {
            c1122w = new C1122w(this, cVar);
        }
        Object objExecute = c1122w.f12127l;
        p109m6.a aVar = p109m6.a.f25430h;
        int i10 = c1122w.f12129n;
        if (i10 == 0) {
            com.google.common.util.concurrent.P.u0(objExecute);
            c1122w.f12124h = this;
            str3 = str;
            c1122w.f12125i = str3;
            str4 = str2;
            c1122w.j = str4;
            c1122w.f12129n = 1;
            if (this.f12166c.a(c1122w) != aVar) {
                c1131z = this;
            }
            return aVar;
        }
        if (i10 == 1) {
            str4 = c1122w.j;
            String str6 = (String) c1122w.f12125i;
            c1131z = c1122w.f12124h;
            com.google.common.util.concurrent.P.u0(objExecute);
            str3 = str6;
        } else {
            if (i10 == 2) {
                c1131z2 = c1122w.f12124h;
                com.google.common.util.concurrent.P.u0(objExecute);
                HttpResponse httpResponse = (HttpResponse) objExecute;
                value = httpResponse.getStatus().getValue();
                c1122w.f12124h = c1131z2;
                c1122w.f12125i = c1131z2;
                c1122w.f12126k = value;
                c1122w.f12129n = 3;
                objExecute = HttpResponseKt.bodyAsText$default(httpResponse, null, c1122w, 1, null);
                if (objExecute != aVar) {
                    c1131z3 = c1131z2;
                    i3 = value;
                }
                return aVar;
            }
            if (i10 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = c1122w.f12126k;
            c1131z2 = (C1131z) c1122w.f12125i;
            c1131z3 = c1122w.f12124h;
            com.google.common.util.concurrent.P.u0(objExecute);
        }
        str5 = (String) objExecute;
        if (200 > i3 && i3 < 300) {
            OSLoginResponse oSLoginResponse = (OSLoginResponse) c1131z2.f12165b.b(str5, OSLoginResponse.INSTANCE.serializer());
            c1131z3.f12167d = oSLoginResponse.f19922c;
            String str7 = oSLoginResponse.f19921b;
            c1131z3.f12168e = str7 != null ? f(str7) : null;
            return oSLoginResponse;
        }
        if (i3 != 401) {
            throw com.kiptv.core.model.X.f20646h;
        }
        if (i3 == 403) {
            strG2 = c1131z2.g(str5);
            if (strG2 == null) {
                strG2 = "Forbidden";
            }
            throw new com.kiptv.core.model.W(strG2);
        }
        if (i3 == 406) {
            if (i3 != 410) {
                throw com.kiptv.core.model.V.f20607h;
            }
            if (i3 != 429) {
                throw C1934b0.f20741h;
            }
            if (500 <= i3 || i3 >= 600) {
                throw new C1936c0(i3);
            }
            throw new C1936c0(i3);
        }
        strG = c1131z2.g(str5);
        if (strG != null) {
            lowerCase = strG.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = "";
        }
        if (!O7.q.B0(lowerCase, "invalid token", false)) {
            throw com.kiptv.core.model.Z.f20735h;
        }
        if (!O7.q.B0(lowerCase, "invalid file", false)) {
            throw com.kiptv.core.model.Y.f20734h;
        }
        OSErrorResponse oSErrorResponseJ = c1131z2.j(str5);
        if (lowerCase.length() == 0) {
            lowerCase = "Quota exceeded";
        }
        throw new C1932a0(lowerCase, oSErrorResponseJ != null ? oSErrorResponseJ.f19908e : null);
        p162s8.v vVar = new p162s8.v();
        com.google.common.util.concurrent.P.m0(User.JsonKeys.USERNAME, str3, vVar);
        com.google.common.util.concurrent.P.m0("password", str4, vVar);
        kotlinx.serialization.json.c cVarA = vVar.a();
        HttpClient httpClient = c1131z.f12164a;
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpRequestKt.url(httpRequestBuilder, "https://api.opensubtitles.com/api/v1/login");
        c1131z.a(httpRequestBuilder, false);
        httpRequestBuilder.setBody(new TextContent(cVarA.toString(), ContentType.Application.INSTANCE.getJson(), null, 4, null));
        httpRequestBuilder.setBodyType(null);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
        HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
        c1122w.f12124h = c1131z;
        c1122w.f12125i = null;
        c1122w.j = null;
        c1122w.f12129n = 2;
        objExecute = httpStatement.execute(c1122w);
        if (objExecute != aVar) {
            c1131z2 = c1131z;
            HttpResponse httpResponse2 = (HttpResponse) objExecute;
            value = httpResponse2.getStatus().getValue();
            c1122w.f12124h = c1131z2;
            c1122w.f12125i = c1131z2;
            c1122w.f12126k = value;
            c1122w.f12129n = 3;
            objExecute = HttpResponseKt.bodyAsText$default(httpResponse2, null, c1122w, 1, null);
            if (objExecute != aVar) {
                c1131z3 = c1131z2;
                i3 = value;
                str5 = (String) objExecute;
                if (200 > i3) {
                }
                if (i3 != 401) {
                    throw com.kiptv.core.model.X.f20646h;
                }
                if (i3 == 403) {
                    strG2 = c1131z2.g(str5);
                    if (strG2 == null) {
                        strG2 = "Forbidden";
                    }
                    throw new com.kiptv.core.model.W(strG2);
                }
                if (i3 == 406) {
                    if (i3 != 410) {
                        throw com.kiptv.core.model.V.f20607h;
                    }
                    if (i3 != 429) {
                        throw C1934b0.f20741h;
                    }
                    if (500 <= i3) {
                    }
                    throw new C1936c0(i3);
                }
                strG = c1131z2.g(str5);
                if (strG != null) {
                    lowerCase = strG.toLowerCase(Locale.ROOT);
                    kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
                } else {
                    lowerCase = "";
                }
                if (!O7.q.B0(lowerCase, "invalid token", false)) {
                    throw com.kiptv.core.model.Z.f20735h;
                }
                if (!O7.q.B0(lowerCase, "invalid file", false)) {
                    throw com.kiptv.core.model.Y.f20734h;
                }
                OSErrorResponse oSErrorResponseJ2 = c1131z2.j(str5);
                if (lowerCase.length() == 0) {
                    lowerCase = "Quota exceeded";
                }
                throw new C1932a0(lowerCase, oSErrorResponseJ2 != null ? oSErrorResponseJ2.f19908e : null);
            }
        }
        return aVar;
    }

    public final Object e(p117n6.c cVar) {
        C1125x c1125x;
        C1131z c1131z;
        C1131z c1131z2;
        String str;
        HttpStatement httpStatement;
        if (cVar instanceof C1125x) {
            c1125x = (C1125x) cVar;
            int i3 = c1125x.f12140k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1125x.f12140k = i3 - Integer.MIN_VALUE;
            } else {
                c1125x = new C1125x(this, cVar);
            }
        } else {
            c1125x = new C1125x(this, cVar);
        }
        Object obj = c1125x.f12139i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c1125x.f12140k;
        if (i9 != 0) {
            if (i9 == 1) {
                c1131z2 = c1125x.f12138h;
                try {
                    com.google.common.util.concurrent.P.u0(obj);
                    HttpClient httpClient = c1131z2.f12164a;
                    str = c1131z2.f12168e;
                    if (str == null) {
                        str = "https://api.opensubtitles.com/api/v1";
                    }
                    String strConcat = str.concat("/logout");
                    HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
                    HttpRequestKt.url(httpRequestBuilder, strConcat);
                    c1131z2.a(httpRequestBuilder, true);
                    httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getDelete());
                    httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
                    c1125x.f12138h = c1131z2;
                    c1125x.f12140k = 2;
                    if (httpStatement.execute(c1125x) != aVar) {
                        c1131z = c1131z2;
                    }
                    return aVar;
                } catch (Exception e6) {
                    e = e6;
                    c1131z = c1131z2;
                    Log.d("OpenSubtitlesApi", "Logout error: " + e.getMessage());
                }
            } else {
                if (i9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c1131z = c1125x.f12138h;
                try {
                    com.google.common.util.concurrent.P.u0(obj);
                } catch (Exception e9) {
                    e = e9;
                    Log.d("OpenSubtitlesApi", "Logout error: " + e.getMessage());
                }
            }
            c1131z.f12167d = null;
            c1131z.f12168e = null;
            return p070h6.A.f22523a;
        }
        com.google.common.util.concurrent.P.u0(obj);
        try {
            p034d5.c cVar2 = this.f12166c;
            c1125x.f12138h = this;
            c1125x.f12140k = 1;
            if (cVar2.a(c1125x) != aVar) {
                c1131z2 = this;
                HttpClient httpClient2 = c1131z2.f12164a;
                str = c1131z2.f12168e;
                if (str == null) {
                    str = "https://api.opensubtitles.com/api/v1";
                }
                String strConcat2 = str.concat("/logout");
                HttpRequestBuilder httpRequestBuilder2 = new HttpRequestBuilder();
                HttpRequestKt.url(httpRequestBuilder2, strConcat2);
                c1131z2.a(httpRequestBuilder2, true);
                httpRequestBuilder2.setMethod(HttpMethod.INSTANCE.getDelete());
                httpStatement = new HttpStatement(httpRequestBuilder2, httpClient2);
                c1125x.f12138h = c1131z2;
                c1125x.f12140k = 2;
                if (httpStatement.execute(c1125x) != aVar) {
                    c1131z = c1131z2;
                    c1131z.f12167d = null;
                    c1131z.f12168e = null;
                    return p070h6.A.f22523a;
                }
            }
            return aVar;
        } catch (Exception e10) {
            e = e10;
            c1131z = this;
            Log.d("OpenSubtitlesApi", "Logout error: " + e.getMessage());
        }
    }

    public final String g(String str) {
        try {
            p162s8.d dVar = this.f12165b;
            dVar.getClass();
            return ((OSErrorResponse) dVar.b(str, OSErrorResponse.INSTANCE.serializer())).f19904a;
        } catch (Exception unused) {
            return null;
        }
    }

    public final Object h(Integer num, String str, String str2, Integer num2, Integer num3, p117n6.c cVar) throws C1934b0, C1936c0, C1932a0, com.kiptv.core.model.V, com.kiptv.core.model.W, com.kiptv.core.model.X, com.kiptv.core.model.Y, com.kiptv.core.model.Z {
        C1128y c1128y;
        String str3;
        Integer num4;
        String str4;
        Integer num5;
        C1131z c1131z;
        Integer num6;
        int value;
        int i3;
        C1131z c1131z2;
        String str5;
        String strG;
        String lowerCase;
        String strG2;
        if (cVar instanceof C1128y) {
            c1128y = (C1128y) cVar;
            int i9 = c1128y.f12159q;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c1128y.f12159q = i9 - Integer.MIN_VALUE;
            } else {
                c1128y = new C1128y(this, cVar);
            }
        } else {
            c1128y = new C1128y(this, cVar);
        }
        Object objExecute = c1128y.f12157o;
        p109m6.a aVar = p109m6.a.f25430h;
        int i10 = c1128y.f12159q;
        if (i10 == 0) {
            com.google.common.util.concurrent.P.u0(objExecute);
            c1128y.f12151h = this;
            c1128y.f12152i = num;
            c1128y.j = str;
            str3 = str2;
            c1128y.f12153k = str3;
            num4 = num2;
            c1128y.f12154l = num4;
            c1128y.f12155m = num3;
            c1128y.f12159q = 1;
            if (this.f12166c.a(c1128y) != aVar) {
                str4 = str;
                num5 = num3;
                c1131z = this;
                num6 = num;
            }
            return aVar;
        }
        if (i10 == 1) {
            num5 = c1128y.f12155m;
            Integer num7 = c1128y.f12154l;
            String str6 = c1128y.f12153k;
            str4 = c1128y.j;
            num6 = c1128y.f12152i;
            c1131z = c1128y.f12151h;
            com.google.common.util.concurrent.P.u0(objExecute);
            num4 = num7;
            str3 = str6;
        } else {
            if (i10 == 2) {
                C1131z c1131z3 = c1128y.f12151h;
                com.google.common.util.concurrent.P.u0(objExecute);
                c1131z = c1131z3;
                HttpResponse httpResponse = (HttpResponse) objExecute;
                value = httpResponse.getStatus().getValue();
                c1128y.f12151h = c1131z;
                c1128y.f12156n = value;
                c1128y.f12159q = 3;
                objExecute = HttpResponseKt.bodyAsText$default(httpResponse, null, c1128y, 1, null);
                if (objExecute != aVar) {
                    i3 = value;
                    c1131z2 = c1131z;
                }
                return aVar;
            }
            if (i10 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = c1128y.f12156n;
            c1131z2 = c1128y.f12151h;
            com.google.common.util.concurrent.P.u0(objExecute);
        }
        str5 = (String) objExecute;
        if (200 > i3 && i3 < 300) {
            return c1131z2.f12165b.b(str5, OSSearchResponse.INSTANCE.serializer());
        }
        if (i3 != 401) {
            throw com.kiptv.core.model.X.f20646h;
        }
        if (i3 == 403) {
            strG2 = c1131z2.g(str5);
            if (strG2 == null) {
                strG2 = "Forbidden";
            }
            throw new com.kiptv.core.model.W(strG2);
        }
        if (i3 == 406) {
            if (i3 != 410) {
                throw com.kiptv.core.model.V.f20607h;
            }
            if (i3 != 429) {
                throw C1934b0.f20741h;
            }
            if (500 <= i3 || i3 >= 600) {
                throw new C1936c0(i3);
            }
            throw new C1936c0(i3);
        }
        strG = c1131z2.g(str5);
        if (strG != null) {
            lowerCase = strG.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = "";
        }
        if (!O7.q.B0(lowerCase, "invalid token", false)) {
            throw com.kiptv.core.model.Z.f20735h;
        }
        if (!O7.q.B0(lowerCase, "invalid file", false)) {
            throw com.kiptv.core.model.Y.f20734h;
        }
        OSErrorResponse oSErrorResponseJ = c1131z2.j(str5);
        if (lowerCase.length() == 0) {
            lowerCase = "Quota exceeded";
        }
        throw new C1932a0(lowerCase, oSErrorResponseJ != null ? oSErrorResponseJ.f19908e : null);
        HttpClient httpClient = c1131z.f12164a;
        String str7 = c1131z.f12168e;
        if (str7 == null) {
            str7 = "https://api.opensubtitles.com/api/v1";
        }
        String strConcat = str7.concat("/subtitles");
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpRequestKt.url(httpRequestBuilder, strConcat);
        c1131z.a(httpRequestBuilder, false);
        if (num6 != null) {
            UtilsKt.parameter(httpRequestBuilder, "tmdb_id", new Integer(num6.intValue()));
        }
        if (str4 != null) {
            UtilsKt.parameter(httpRequestBuilder, "query", str4);
        }
        if (str3 != null) {
            UtilsKt.parameter(httpRequestBuilder, "type", str3);
        }
        if (num4 != null) {
            UtilsKt.parameter(httpRequestBuilder, "season_number", new Integer(num4.intValue()));
        }
        if (num5 != null) {
            UtilsKt.parameter(httpRequestBuilder, "episode_number", new Integer(num5.intValue()));
        }
        HttpStatement httpStatementH = B2.a.h(HttpMethod.INSTANCE, httpRequestBuilder, httpRequestBuilder, httpClient);
        c1128y.f12151h = c1131z;
        c1128y.f12152i = null;
        c1128y.j = null;
        c1128y.f12153k = null;
        c1128y.f12154l = null;
        c1128y.f12155m = null;
        c1128y.f12159q = 2;
        objExecute = httpStatementH.execute(c1128y);
        if (objExecute != aVar) {
            HttpResponse httpResponse2 = (HttpResponse) objExecute;
            value = httpResponse2.getStatus().getValue();
            c1128y.f12151h = c1131z;
            c1128y.f12156n = value;
            c1128y.f12159q = 3;
            objExecute = HttpResponseKt.bodyAsText$default(httpResponse2, null, c1128y, 1, null);
            if (objExecute != aVar) {
                i3 = value;
                c1131z2 = c1131z;
                str5 = (String) objExecute;
                if (200 > i3) {
                }
                if (i3 != 401) {
                    throw com.kiptv.core.model.X.f20646h;
                }
                if (i3 == 403) {
                    strG2 = c1131z2.g(str5);
                    if (strG2 == null) {
                        strG2 = "Forbidden";
                    }
                    throw new com.kiptv.core.model.W(strG2);
                }
                if (i3 == 406) {
                    if (i3 != 410) {
                        throw com.kiptv.core.model.V.f20607h;
                    }
                    if (i3 != 429) {
                        throw C1934b0.f20741h;
                    }
                    if (500 <= i3) {
                    }
                    throw new C1936c0(i3);
                }
                strG = c1131z2.g(str5);
                if (strG != null) {
                    lowerCase = strG.toLowerCase(Locale.ROOT);
                    kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
                } else {
                    lowerCase = "";
                }
                if (!O7.q.B0(lowerCase, "invalid token", false)) {
                    throw com.kiptv.core.model.Z.f20735h;
                }
                if (!O7.q.B0(lowerCase, "invalid file", false)) {
                    throw com.kiptv.core.model.Y.f20734h;
                }
                OSErrorResponse oSErrorResponseJ2 = c1131z2.j(str5);
                if (lowerCase.length() == 0) {
                    lowerCase = "Quota exceeded";
                }
                throw new C1932a0(lowerCase, oSErrorResponseJ2 != null ? oSErrorResponseJ2.f19908e : null);
            }
        }
        return aVar;
    }

    public final OSErrorResponse j(String str) {
        try {
            p162s8.d dVar = this.f12165b;
            dVar.getClass();
            return (OSErrorResponse) dVar.b(str, OSErrorResponse.INSTANCE.serializer());
        } catch (Exception unused) {
            return null;
        }
    }
}
