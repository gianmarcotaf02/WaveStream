package Y4;

import io.ktor.client.HttpClient;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestKt;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpResponseKt;
import io.ktor.client.statement.HttpStatement;
import io.ktor.http.HttpMethod;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class C1105q {
    public static final C1084j Companion = new C1084j();

    public static final O7.o f12039e = new O7.o("^/(live|movie|series)/([^/]+)/([^/]+)/(\\d+)\\.\\w+$");

    public static final O7.o f12040f = new O7.o("^/([^/]+)/([^/]+)/(\\d+)$");

    public final HttpClient f12041a;

    public final Set f12042b = p078i6.m.F0(new String[]{RRWebVideoEvent.REPLAY_CONTAINER, "mkv", "avi", "mov", "wmv", "webm", "m4v", "mpg", "mpeg", "3gp", "ogv"});

    public final List f12043c;

    public final LinkedHashSet f12044d;

    public C1105q(HttpClient httpClient, p162s8.d dVar) {
        this.f12041a = httpClient;
        O7.p[] pVarArr = O7.p.f8061h;
        this.f12043c = p078i6.p.B0(new O7.o("S(\\d{1,2})\\s?E(\\d{1,4})", 0), new O7.o("Season\\s*(\\d{1,2}).*?Episode\\s*(\\d{1,4})", 0), new O7.o("Stagione\\s*(\\d{1,2}).*?Episodio\\s*(\\d{1,4})", 0), new O7.o("Staffel\\s*(\\d{1,2}).*?Folge\\s*(\\d{1,4})", 0), new O7.o("Temporada\\s*(\\d{1,2}).*?Episodio\\s*(\\d{1,4})", 0), new O7.o("Saison\\s*(\\d{1,2}).*?Episode\\s*(\\d{1,4})", 0));
        this.f12044d = new LinkedHashSet();
    }

    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(C1105q c1105q, String str, p117n6.c cVar) throws com.kiptv.core.model.O, com.kiptv.core.model.P {
        C1096n c1096n;
        c1105q.getClass();
        if (cVar instanceof C1096n) {
            c1096n = (C1096n) cVar;
            int i3 = c1096n.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1096n.j = i3 - Integer.MIN_VALUE;
            } else {
                c1096n = new C1096n(c1105q, cVar);
            }
        } else {
            c1096n = new C1096n(c1105q, cVar);
        }
        Object objExecute = c1096n.f11997h;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c1096n.j;
        if (i9 != 0) {
            if (i9 == 1) {
                com.google.common.util.concurrent.P.u0(objExecute);
            } else {
                if (i9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.common.util.concurrent.P.u0(objExecute);
            }
            String str2 = (String) objExecute;
            if (O7.q.N0(str2)) {
                throw com.kiptv.core.model.P.f20013h;
            }
            return str2;
        }
        com.google.common.util.concurrent.P.u0(objExecute);
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpRequestKt.url(httpRequestBuilder, str);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
        HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, c1105q.f12041a);
        c1096n.j = 1;
        objExecute = httpStatement.execute(c1096n);
        if (objExecute != aVar) {
        }
        return aVar;
        HttpResponse httpResponse = (HttpResponse) objExecute;
        int value = httpResponse.getStatus().getValue();
        if (value >= 400) {
            throw new com.kiptv.core.model.O(value);
        }
        c1096n.j = 2;
        objExecute = HttpResponseKt.bodyAsText$default(httpResponse, null, c1096n, 1, null);
    }

    public static String b(String input, String str) {
        String pattern = str.concat("=\"([^\"]*)\"");
        O7.p[] pVarArr = O7.p.f8061h;
        kotlin.jvm.internal.m.e(pattern, "pattern");
        Pattern patternCompile = Pattern.compile(pattern, 66);
        kotlin.jvm.internal.m.d(patternCompile, "compile(...)");
        kotlin.jvm.internal.m.e(input, "input");
        Matcher matcher = patternCompile.matcher(input);
        kotlin.jvm.internal.m.d(matcher, "matcher(...)");
        O7.m mVarG = p199y3.e.g(matcher, 0, input);
        if (mVarG != null) {
            String str2 = (String) ((O7.k) mVarG.a()).get(1);
            if (str2.length() != 0) {
                return str2;
            }
        }
        return null;
    }

    public static p070h6.k e(String str) {
        int iK0 = O7.q.K0(str, ':', 0, 6);
        if (iK0 < 0 || iK0 == str.length() - 1) {
            return null;
        }
        String strSubstring = str.substring(iK0 + 1);
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        String string = O7.q.r1(strSubstring).toString();
        int iK1 = O7.q.K0(string, '=', 0, 6);
        if (iK1 <= 0 || iK1 == string.length() - 1) {
            return null;
        }
        String strSubstring2 = string.substring(0, iK1);
        kotlin.jvm.internal.m.d(strSubstring2, "substring(...)");
        String lowerCase = O7.q.r1(strSubstring2).toString().toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
        String strSubstring3 = string.substring(iK1 + 1);
        kotlin.jvm.internal.m.d(strSubstring3, "substring(...)");
        String strS1 = O7.q.s1(O7.q.r1(strSubstring3).toString(), '\"');
        if (lowerCase.length() == 0 || strS1.length() == 0) {
            return null;
        }
        return new p070h6.k(lowerCase, strS1);
    }

    public static String f(String str) {
        return String.valueOf(C1084j.a(Companion, "cat_".concat(str)));
    }

    public final p070h6.k c(String str) {
        Integer numZ0;
        Integer numZ1;
        Iterator it = this.f12043c.iterator();
        while (it.hasNext()) {
            O7.m mVarA = ((O7.o) it.next()).a(str);
            if (mVarA != null && (numZ0 = O7.x.z0((String) ((O7.k) mVarA.a()).get(1))) != null && (numZ1 = O7.x.z0((String) ((O7.k) mVarA.a()).get(2))) != null) {
                return new p070h6.k(numZ0, numZ1);
            }
        }
        return null;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:46:0x0121
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.io.Serializable d(java.lang.String r35, p117n6.c r36) {
        /*
            Method dump skipped, instruction units count: 854
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y4.C1105q.d(java.lang.String, n6.c):java.io.Serializable");
    }

    public final int g(String str) {
        int iA = C1084j.a(Companion, str);
        while (true) {
            LinkedHashSet linkedHashSet = this.f12044d;
            if (!linkedHashSet.contains(Integer.valueOf(iA))) {
                linkedHashSet.add(Integer.valueOf(iA));
                return iA;
            }
            iA++;
        }
    }
}
