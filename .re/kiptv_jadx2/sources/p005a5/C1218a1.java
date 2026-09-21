package p005a5;

import O7.q;
import O7.x;
import V7.W;
import V7.n0;
import V7.r;
import W4.b;
import Y4.C1131z;
import Y6.f;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.play_billing.AbstractC1833d1;
import com.google.common.util.concurrent.P;
import com.kiptv.core.model.C1932a0;
import com.kiptv.core.model.C1934b0;
import com.kiptv.core.model.C1936c0;
import com.kiptv.core.model.OSDownloadResponse;
import com.kiptv.core.model.OSLoginResponse;
import com.kiptv.core.model.OSSearchResponse;
import com.kiptv.core.model.OSUser;
import com.kiptv.core.model.OSUserInfoResponse;
import com.kiptv.core.model.V;
import com.kiptv.core.model.X;
import com.kiptv.core.model.Y;
import com.kiptv.core.model.Z;
import io.ktor.client.HttpClient;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestKt;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpResponseKt;
import io.ktor.client.statement.HttpStatement;
import io.ktor.http.HttpMethod;
import io.ktor.http.HttpStatusCodeKt;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.m;
import p028c8.d;
import p070h6.A;
import p078i6.o;
import p078i6.w;
import p109m6.a;
import p117n6.c;

public final class C1218a1 {
    public static final T0 Companion = new T0();

    public final Context f14193a;

    public final C1131z f14194b;

    public final b f14195c;

    public final HttpClient f14196d;

    public final n0 f14197e;

    public final W f14198f;
    public final LinkedHashMap g;

    public final d f14199h;

    public C1218a1(Context context, C1131z api, b secureStorage, HttpClient httpClient) {
        Long lA0;
        m.e(context, "context");
        m.e(api, "api");
        m.e(secureStorage, "secureStorage");
        m.e(httpClient, "httpClient");
        this.f14193a = context;
        this.f14194b = api;
        this.f14195c = secureStorage;
        this.f14196d = httpClient;
        n0 n0VarB = r.b(P0.f13756a);
        this.f14197e = n0VarB;
        this.f14198f = new W(n0VarB);
        String strB = secureStorage.b("os_jwt");
        if (strB != null) {
            String strB2 = secureStorage.b("os_jwt_expiry_ms");
            long jLongValue = (strB2 == null || (lA0 = x.A0(strB2)) == null) ? 0L : lA0.longValue();
            String strB3 = secureStorage.b("os_username");
            if (strB3 != null) {
                if (System.currentTimeMillis() >= jLongValue) {
                    b();
                } else {
                    String strB4 = secureStorage.b("os_base_url");
                    api.f12167d = strB;
                    api.f12168e = strB4 != null ? C1131z.f(strB4) : null;
                    n0VarB.i(null, new O0(strB3, null));
                    Log.i("OpenSubtitlesRepo", "Restored OpenSubtitles session for ".concat(strB3));
                }
            }
        }
        this.g = new LinkedHashMap();
        this.f14199h = new d();
    }

    public static String a(Integer num, String str, Integer num2, Integer num3) {
        int iIntValue = num != null ? num.intValue() : 0;
        if (num2 == null || num3 == null) {
            return iIntValue + "_" + str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(iIntValue);
        sb.append("_S");
        sb.append(num2);
        sb.append("E");
        sb.append(num3);
        return f.m(sb, "_", str);
    }

    public final void b() {
        C1131z c1131z = this.f14194b;
        c1131z.f12167d = null;
        c1131z.f12168e = null;
        b bVar = this.f14195c;
        bVar.a("os_jwt");
        bVar.a("os_jwt_expiry_ms");
        bVar.a("os_username");
        bVar.a("os_base_url");
        P0 p2 = P0.f13756a;
        n0 n0Var = this.f14197e;
        n0Var.getClass();
        n0Var.i(null, p2);
    }

    public final Object c(int i3, Integer num, String str, Integer num2, Integer num3, c cVar) throws C1934b0, C1936c0, C1932a0, V, IOException, com.kiptv.core.model.W, X, Y, Z {
        V0 v6;
        C1218a1 c1218a1;
        File file;
        File file2;
        File file3;
        File file4;
        OSDownloadResponse oSDownloadResponse;
        HttpResponse httpResponse;
        File file5;
        File file6;
        C1218a1 c1218a2;
        FileOutputStream fileOutputStream;
        Object value;
        O0 o8;
        File[] fileArrListFiles;
        List listE0;
        List list;
        long jCurrentTimeMillis;
        ArrayList arrayList;
        Iterator it;
        List listC0;
        Iterator it2;
        if (cVar instanceof V0) {
            v6 = (V0) cVar;
            int i9 = v6.f14015n;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                v6.f14015n = i9 - Integer.MIN_VALUE;
            } else {
                v6 = new V0(this, cVar);
            }
        } else {
            v6 = new V0(this, cVar);
        }
        Object objBodyAsBytes = v6.f14013l;
        a aVar = a.f25430h;
        int i10 = v6.f14015n;
        long j = 7776000000L;
        if (i10 == 0) {
            P.u0(objBodyAsBytes);
            Log.i("OpenSubtitlesRepo", "Subtitle download requested: fileId=" + i3 + ", language=" + str);
            File file7 = new File(this.f14193a.getCacheDir(), "subtitles");
            if (!file7.exists()) {
                file7.mkdirs();
            }
            File file8 = new File(file7, a(num, str, num2, num3) + "_" + i3 + ".srt");
            if (file8.exists() && System.currentTimeMillis() - file8.lastModified() < 7776000000L) {
                Log.i("OpenSubtitlesRepo", "Subtitle cache hit: " + file8.getName() + " (" + file8.length() + " bytes)");
                return file8;
            }
            if (file8.exists()) {
                file8.delete();
            }
            try {
                C1131z c1131z = this.f14194b;
                v6.f14010h = this;
                v6.f14011i = file7;
                v6.j = file8;
                v6.f14015n = 1;
                Object objB = c1131z.b(i3, v6);
                if (objB != aVar) {
                    c1218a1 = this;
                    file = file7;
                    objBodyAsBytes = objB;
                    file2 = file8;
                }
                return aVar;
            } catch (Z e6) {
                e = e6;
                c1218a1 = this;
                c1218a1.b();
                throw e;
            }
        }
        if (i10 == 1) {
            file2 = v6.j;
            file = v6.f14011i;
            c1218a1 = v6.f14010h;
            try {
                P.u0(objBodyAsBytes);
            } catch (Z e9) {
                e = e9;
                c1218a1.b();
                throw e;
            }
        } else {
            if (i10 == 2) {
                oSDownloadResponse = v6.f14012k;
                file4 = v6.j;
                file3 = v6.f14011i;
                c1218a1 = v6.f14010h;
                P.u0(objBodyAsBytes);
                httpResponse = (HttpResponse) objBodyAsBytes;
                if (HttpStatusCodeKt.isSuccess(httpResponse.getStatus())) {
                    throw V.f20607h;
                }
                v6.f14010h = c1218a1;
                v6.f14011i = file3;
                v6.j = file4;
                v6.f14012k = oSDownloadResponse;
                v6.f14015n = 3;
                objBodyAsBytes = HttpResponseKt.bodyAsBytes(httpResponse, v6);
                if (objBodyAsBytes != aVar) {
                    file5 = file4;
                    file6 = file3;
                    c1218a2 = c1218a1;
                }
                return aVar;
            }
            if (i10 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oSDownloadResponse = v6.f14012k;
            file5 = v6.j;
            file6 = v6.f14011i;
            c1218a2 = v6.f14010h;
            P.u0(objBodyAsBytes);
            j = 7776000000L;
        }
        byte[] array = (byte[]) objBodyAsBytes;
        m.e(file5, "<this>");
        m.e(array, "array");
        fileOutputStream = new FileOutputStream(file5);
        try {
            fileOutputStream.write(array);
            fileOutputStream.close();
            Log.i("OpenSubtitlesRepo", "Subtitle downloaded: " + file5.getName() + " (" + array.length + " bytes)");
            value = c1218a2.f14197e.getValue();
            if (value instanceof O0) {
                o8 = (O0) value;
            } else {
                o8 = null;
            }
            if (o8 != null) {
                O0 o0A = O0.a(o8, new Integer(oSDownloadResponse.f19901d));
                n0 n0Var = c1218a2.f14197e;
                n0Var.getClass();
                n0Var.i(null, o0A);
            }
            fileArrListFiles = file6.listFiles();
            if (fileArrListFiles != null) {
                listE0 = p078i6.m.E0(fileArrListFiles);
            } else {
                listE0 = null;
            }
            list = w.f23205h;
            if (listE0 == null) {
                listE0 = list;
            }
            jCurrentTimeMillis = System.currentTimeMillis();
            arrayList = new ArrayList();
            for (Object obj : listE0) {
                if (jCurrentTimeMillis - ((File) obj).lastModified() > j) {
                    arrayList.add(obj);
                }
            }
            it = arrayList.iterator();
            while (it.hasNext()) {
                try {
                    ((File) it.next()).delete();
                } catch (Throwable th) {
                    P.T(th);
                }
            }
            File[] fileArrListFiles2 = file6.listFiles();
            listC0 = fileArrListFiles2 != null ? p078i6.m.C0(fileArrListFiles2, new B(9)) : null;
            if (listC0 != null) {
                list = listC0;
            }
            if (list.size() > 200) {
                it2 = o.J1(list, list.size() - 200).iterator();
                while (it2.hasNext()) {
                    try {
                        ((File) it2.next()).delete();
                    } catch (Throwable th2) {
                        P.T(th2);
                    }
                }
            }
            return file5;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC1833d1.l(fileOutputStream, th3);
                throw th4;
            }
        }
        OSDownloadResponse oSDownloadResponse2 = (OSDownloadResponse) objBodyAsBytes;
        HttpClient httpClient = c1218a1.f14196d;
        String str2 = oSDownloadResponse2.f19898a;
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpRequestKt.url(httpRequestBuilder, str2);
        HttpStatement httpStatementH = B2.a.h(HttpMethod.INSTANCE, httpRequestBuilder, httpRequestBuilder, httpClient);
        v6.f14010h = c1218a1;
        v6.f14011i = file;
        v6.j = file2;
        v6.f14012k = oSDownloadResponse2;
        v6.f14015n = 2;
        Object objExecute = httpStatementH.execute(v6);
        if (objExecute != aVar) {
            file3 = file;
            file4 = file2;
            oSDownloadResponse = oSDownloadResponse2;
            objBodyAsBytes = objExecute;
            httpResponse = (HttpResponse) objBodyAsBytes;
            if (HttpStatusCodeKt.isSuccess(httpResponse.getStatus())) {
                throw V.f20607h;
            }
            v6.f14010h = c1218a1;
            v6.f14011i = file3;
            v6.j = file4;
            v6.f14012k = oSDownloadResponse;
            v6.f14015n = 3;
            objBodyAsBytes = HttpResponseKt.bodyAsBytes(httpResponse, v6);
            if (objBodyAsBytes != aVar) {
                file5 = file4;
                file6 = file3;
                c1218a2 = c1218a1;
                byte[] array2 = (byte[]) objBodyAsBytes;
                m.e(file5, "<this>");
                m.e(array2, "array");
                fileOutputStream = new FileOutputStream(file5);
                fileOutputStream.write(array2);
                fileOutputStream.close();
                Log.i("OpenSubtitlesRepo", "Subtitle downloaded: " + file5.getName() + " (" + array2.length + " bytes)");
                value = c1218a2.f14197e.getValue();
                if (value instanceof O0) {
                    o8 = (O0) value;
                } else {
                    o8 = null;
                }
                if (o8 != null) {
                    O0 o0A2 = O0.a(o8, new Integer(oSDownloadResponse.f19901d));
                    n0 n0Var2 = c1218a2.f14197e;
                    n0Var2.getClass();
                    n0Var2.i(null, o0A2);
                }
                fileArrListFiles = file6.listFiles();
                if (fileArrListFiles != null) {
                    listE0 = p078i6.m.E0(fileArrListFiles);
                } else {
                    listE0 = null;
                }
                list = w.f23205h;
                if (listE0 == null) {
                    listE0 = list;
                }
                jCurrentTimeMillis = System.currentTimeMillis();
                arrayList = new ArrayList();
                while (r0.hasNext()) {
                    if (jCurrentTimeMillis - ((File) obj).lastModified() > j) {
                        arrayList.add(obj);
                    }
                }
                it = arrayList.iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
                File[] fileArrListFiles3 = file6.listFiles();
                if (fileArrListFiles3 != null) {
                }
                if (listC0 != null) {
                    list = listC0;
                }
                if (list.size() > 200) {
                    it2 = o.J1(list, list.size() - 200).iterator();
                    while (it2.hasNext()) {
                        ((File) it2.next()).delete();
                    }
                }
                return file5;
            }
        }
        return aVar;
    }

    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, String str2, c cVar) throws C1934b0, C1936c0, C1932a0, V, com.kiptv.core.model.W, X, Y, Z {
        W0 w6;
        C1218a1 c1218a1;
        if (cVar instanceof W0) {
            w6 = (W0) cVar;
            int i3 = w6.f14050l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                w6.f14050l = i3 - Integer.MIN_VALUE;
            } else {
                w6 = new W0(this, cVar);
            }
        } else {
            w6 = new W0(this, cVar);
        }
        Object objD = w6.j;
        a aVar = a.f25430h;
        int i9 = w6.f14050l;
        try {
            if (i9 != 0) {
                if (i9 == 1) {
                    str = w6.f14048i;
                    c1218a1 = w6.f14047h;
                    P.u0(objD);
                } else {
                    if (i9 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    P.u0(objD);
                }
                return A.f22523a;
            }
            P.u0(objD);
            w6.f14047h = this;
            w6.f14048i = str;
            w6.f14050l = 1;
            objD = this.f14194b.d(str, str2, w6);
            if (objD != aVar) {
                c1218a1 = this;
            }
            return aVar;
            OSLoginResponse oSLoginResponse = (OSLoginResponse) objD;
            long jCurrentTimeMillis = System.currentTimeMillis() + 86400000;
            c1218a1.f14195c.c("os_jwt", oSLoginResponse.f19922c);
            String strValueOf = String.valueOf(jCurrentTimeMillis);
            b bVar = c1218a1.f14195c;
            bVar.c("os_jwt_expiry_ms", strValueOf);
            bVar.c("os_username", str);
            String str3 = oSLoginResponse.f19921b;
            if (str3 != null) {
                bVar.c("os_base_url", str3);
            }
            OSUser oSUser = oSLoginResponse.f19920a;
            O0 o8 = new O0(str, oSUser != null ? oSUser.f19960f : null);
            n0 n0Var = c1218a1.f14197e;
            n0Var.getClass();
            n0Var.i(null, o8);
            w6.f14047h = null;
            w6.f14048i = null;
            w6.f14050l = 2;
        } catch (Throwable th) {
            P.T(th);
        }
    }

    public final Object e(c cVar) {
        X0 x9;
        C1218a1 c1218a1;
        if (cVar instanceof X0) {
            x9 = (X0) cVar;
            int i3 = x9.f14076k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                x9.f14076k = i3 - Integer.MIN_VALUE;
            } else {
                x9 = new X0(this, cVar);
            }
        } else {
            x9 = new X0(this, cVar);
        }
        Object obj = x9.f14075i;
        a aVar = a.f25430h;
        int i9 = x9.f14076k;
        if (i9 == 0) {
            P.u0(obj);
            try {
                C1131z c1131z = this.f14194b;
                x9.f14074h = this;
                x9.f14076k = 1;
                if (c1131z.e(x9) == aVar) {
                    return aVar;
                }
                c1218a1 = this;
            } catch (Throwable th) {
                th = th;
                c1218a1 = this;
                P.T(th);
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1218a1 = x9.f14074h;
            try {
                P.u0(obj);
            } catch (Throwable th2) {
                th = th2;
                P.T(th);
            }
        }
        c1218a1.b();
        return A.f22523a;
    }

    public final Object f(c cVar) throws C1934b0, C1936c0, C1932a0, V, com.kiptv.core.model.W, X, Y, Z {
        Y0 y9;
        C1218a1 c1218a1;
        O0 o8;
        if (cVar instanceof Y0) {
            y9 = (Y0) cVar;
            int i3 = y9.f14113l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                y9.f14113l = i3 - Integer.MIN_VALUE;
            } else {
                y9 = new Y0(this, cVar);
            }
        } else {
            y9 = new Y0(this, cVar);
        }
        Object obj = y9.j;
        a aVar = a.f25430h;
        int i9 = y9.f14113l;
        A a2 = A.f22523a;
        if (i9 == 0) {
            P.u0(obj);
            Object value = this.f14197e.getValue();
            O0 o9 = value instanceof O0 ? (O0) value : null;
            if (o9 == null) {
                return a2;
            }
            try {
                C1131z c1131z = this.f14194b;
                y9.f14110h = this;
                y9.f14111i = o9;
                y9.f14113l = 1;
                Object objC = c1131z.c(y9);
                if (objC == aVar) {
                    return aVar;
                }
                o8 = o9;
                obj = objC;
                c1218a1 = this;
            } catch (Z e6) {
                e = e6;
                c1218a1 = this;
                c1218a1.b();
                throw e;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o8 = y9.f14111i;
            c1218a1 = y9.f14110h;
            try {
                P.u0(obj);
            } catch (Z e9) {
                e = e9;
                c1218a1.b();
                throw e;
            }
        }
        n0 n0Var = c1218a1.f14197e;
        O0 o0A = O0.a(o8, ((OSUserInfoResponse) obj).f19966a.f19965e);
        n0Var.getClass();
        n0Var.i(null, o0A);
        return a2;
    }

    public final Object g(R0 r9, c cVar) throws Z {
        Z0 z6;
        String string;
        d dVar;
        C1218a1 c1218a1;
        boolean z9;
        Integer num;
        String str;
        String str2;
        Integer num2;
        Integer num3;
        C1131z c1131z;
        String string2;
        Integer num4;
        Object objI;
        String str3;
        C1218a1 c1218a2;
        Integer num5;
        Object objI2;
        List list;
        C1218a1 c1218a3;
        String str4;
        d dVar2;
        List list2;
        R0 r10 = r9;
        if (cVar instanceof Z0) {
            z6 = (Z0) cVar;
            int i3 = z6.f14159n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                z6.f14159n = i3 - Integer.MIN_VALUE;
            } else {
                z6 = new Z0(this, cVar);
            }
        } else {
            z6 = new Z0(this, cVar);
        }
        Z0 z10 = z6;
        Object obj = z10.f14157l;
        a aVar = a.f25430h;
        C1218a1 c1218a4 = z10.f14159n;
        try {
            try {
                try {
                    if (c1218a4 == 0) {
                        P.u0(obj);
                        StringBuilder sb = new StringBuilder();
                        Object obj2 = r10.f13836a;
                        if (obj2 == null) {
                            obj2 = "t0";
                        }
                        sb.append(obj2);
                        sb.append('|');
                        String lowerCase = r10.f13837b.toLowerCase(Locale.ROOT);
                        m.d(lowerCase, "toLowerCase(...)");
                        sb.append(lowerCase);
                        sb.append('|');
                        Integer num6 = r10.f13839d;
                        sb.append(num6 != null ? num6.intValue() : -1);
                        sb.append('|');
                        Integer num7 = r10.f13840e;
                        sb.append(num7 != null ? num7.intValue() : -1);
                        string = sb.toString();
                        z10.f14154h = this;
                        z10.f14155i = r10;
                        z10.j = string;
                        dVar = this.f14199h;
                        z10.f14156k = dVar;
                        z10.f14159n = 1;
                        if (dVar.e(z10) != aVar) {
                            c1218a1 = this;
                        }
                        return aVar;
                    }
                    if (c1218a4 == 1) {
                        d dVar3 = z10.f14156k;
                        String str5 = (String) z10.j;
                        R0 r11 = (R0) z10.f14155i;
                        C1218a1 c1218a5 = z10.f14154h;
                        P.u0(obj);
                        string = str5;
                        c1218a1 = c1218a5;
                        dVar = dVar3;
                        r10 = r11;
                    } else {
                        if (c1218a4 == 2) {
                            str3 = (String) z10.f14155i;
                            c1218a2 = z10.f14154h;
                            P.u0(obj);
                            list = ((OSSearchResponse) obj).f19928d;
                            c1218a3 = c1218a2;
                            str4 = str3;
                            dVar2 = c1218a3.f14199h;
                            z10.f14154h = c1218a3;
                            z10.f14155i = str4;
                            z10.j = list;
                            z10.f14156k = dVar2;
                            z10.f14159n = 4;
                            if (dVar2.e(z10) != aVar) {
                                list2 = list;
                            }
                            return aVar;
                        }
                        if (c1218a4 == 3) {
                            str3 = (String) z10.f14155i;
                            c1218a2 = z10.f14154h;
                            P.u0(obj);
                            list = ((OSSearchResponse) obj).f19928d;
                            c1218a3 = c1218a2;
                            str4 = str3;
                            dVar2 = c1218a3.f14199h;
                            z10.f14154h = c1218a3;
                            z10.f14155i = str4;
                            z10.j = list;
                            z10.f14156k = dVar2;
                            z10.f14159n = 4;
                            if (dVar2.e(z10) != aVar) {
                                list2 = list;
                            }
                            return aVar;
                        }
                        if (c1218a4 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        dVar2 = z10.f14156k;
                        list2 = (List) z10.j;
                        str4 = (String) z10.f14155i;
                        c1218a3 = z10.f14154h;
                        P.u0(obj);
                    }
                    d dVar4 = dVar2;
                    try {
                        c1218a3.g.put(str4, new U0(list2, System.currentTimeMillis()));
                        return list2;
                    } finally {
                        dVar4.g(null);
                    }
                    if (!z9) {
                        if (num != null) {
                            str2 = "movie";
                        } else {
                            str = null;
                        }
                        num2 = r10.f13840e;
                        num3 = r10.f13839d;
                        if (num != null) {
                            C1131z c1131z2 = c1218a1.f14194b;
                            if (num3 != null || !z9) {
                                num3 = null;
                            }
                            if (num2 == null && z9) {
                                num5 = num2;
                            } else {
                                num5 = null;
                            }
                            z10.f14154h = c1218a1;
                            z10.f14155i = string;
                            z10.j = null;
                            z10.f14156k = null;
                            z10.f14159n = 2;
                            objI2 = C1131z.i(c1131z2, num, null, str, num3, num5, z10, 226);
                            if (objI2 != aVar) {
                                String str6 = string;
                                obj = objI2;
                                str3 = str6;
                                c1218a2 = c1218a1;
                                list = ((OSSearchResponse) obj).f19928d;
                                c1218a3 = c1218a2;
                                str4 = str3;
                                dVar2 = c1218a3.f14199h;
                                z10.f14154h = c1218a3;
                                z10.f14155i = str4;
                                z10.j = list;
                                z10.f14156k = dVar2;
                                z10.f14159n = 4;
                                if (dVar2.e(z10) != aVar) {
                                    list2 = list;
                                    d dVar5 = dVar2;
                                    c1218a3.g.put(str4, new U0(list2, System.currentTimeMillis()));
                                    return list2;
                                }
                            }
                        } else {
                            c1131z = c1218a1.f14194b;
                            string2 = q.r1(r10.f13837b).toString();
                            if (string2.length() == 0) {
                                return w.f23205h;
                            }
                            if (num3 != null || !z9) {
                                num3 = null;
                            }
                            if (num2 == null && z9) {
                                num4 = num2;
                            } else {
                                num4 = null;
                            }
                            z10.f14154h = c1218a1;
                            z10.f14155i = string;
                            z10.j = null;
                            z10.f14156k = null;
                            z10.f14159n = 3;
                            objI = C1131z.i(c1131z, null, string2, str, num3, num4, z10, 225);
                            if (objI != aVar) {
                                String str7 = string;
                                obj = objI;
                                str3 = str7;
                                c1218a2 = c1218a1;
                                list = ((OSSearchResponse) obj).f19928d;
                                c1218a3 = c1218a2;
                                str4 = str3;
                                dVar2 = c1218a3.f14199h;
                                z10.f14154h = c1218a3;
                                z10.f14155i = str4;
                                z10.j = list;
                                z10.f14156k = dVar2;
                                z10.f14159n = 4;
                                if (dVar2.e(z10) != aVar) {
                                    list2 = list;
                                    d dVar6 = dVar2;
                                    c1218a3.g.put(str4, new U0(list2, System.currentTimeMillis()));
                                    return list2;
                                }
                            }
                        }
                        return aVar;
                    }
                    str2 = "episode";
                    if (num != null) {
                        C1131z c1131z3 = c1218a1.f14194b;
                        if (num3 != null) {
                            num3 = null;
                        } else {
                            num3 = null;
                        }
                        if (num2 == null) {
                            num5 = null;
                        } else {
                            num5 = null;
                        }
                        z10.f14154h = c1218a1;
                        z10.f14155i = string;
                        z10.j = null;
                        z10.f14156k = null;
                        z10.f14159n = 2;
                        objI2 = C1131z.i(c1131z3, num, null, str, num3, num5, z10, 226);
                        if (objI2 != aVar) {
                            String str8 = string;
                            obj = objI2;
                            str3 = str8;
                            c1218a2 = c1218a1;
                            list = ((OSSearchResponse) obj).f19928d;
                            c1218a3 = c1218a2;
                            str4 = str3;
                            dVar2 = c1218a3.f14199h;
                            z10.f14154h = c1218a3;
                            z10.f14155i = str4;
                            z10.j = list;
                            z10.f14156k = dVar2;
                            z10.f14159n = 4;
                            if (dVar2.e(z10) != aVar) {
                                list2 = list;
                                d dVar7 = dVar2;
                                c1218a3.g.put(str4, new U0(list2, System.currentTimeMillis()));
                                return list2;
                            }
                        }
                    } else {
                        c1131z = c1218a1.f14194b;
                        string2 = q.r1(r10.f13837b).toString();
                        if (string2.length() == 0) {
                            return w.f23205h;
                        }
                        if (num3 != null) {
                            num3 = null;
                        } else {
                            num3 = null;
                        }
                        if (num2 == null) {
                            num4 = null;
                        } else {
                            num4 = null;
                        }
                        z10.f14154h = c1218a1;
                        z10.f14155i = string;
                        z10.j = null;
                        z10.f14156k = null;
                        z10.f14159n = 3;
                        objI = C1131z.i(c1131z, null, string2, str, num3, num4, z10, 225);
                        if (objI != aVar) {
                            String str9 = string;
                            obj = objI;
                            str3 = str9;
                            c1218a2 = c1218a1;
                            list = ((OSSearchResponse) obj).f19928d;
                            c1218a3 = c1218a2;
                            str4 = str3;
                            dVar2 = c1218a3.f14199h;
                            z10.f14154h = c1218a3;
                            z10.f14155i = str4;
                            z10.j = list;
                            z10.f14156k = dVar2;
                            z10.f14159n = 4;
                            if (dVar2.e(z10) != aVar) {
                                list2 = list;
                                d dVar8 = dVar2;
                                c1218a3.g.put(str4, new U0(list2, System.currentTimeMillis()));
                                return list2;
                            }
                        }
                    }
                    return aVar;
                } catch (Z e6) {
                    e = e6;
                    c1218a4 = c1218a1;
                    c1218a4.b();
                    throw e;
                }
                U0 u1 = (U0) c1218a1.g.get(string);
                if (u1 != null) {
                    if (System.currentTimeMillis() - u1.f13959b < 1800000) {
                        List list3 = u1.f13958a;
                        dVar.g(null);
                        return list3;
                    }
                }
                dVar.g(null);
                z9 = r10.f13838c;
                num = r10.f13836a;
                str = str2;
                num2 = r10.f13840e;
                num3 = r10.f13839d;
            } catch (Throwable th) {
                dVar.g(null);
                throw th;
            }
        } catch (Z e9) {
            e = e9;
        }
    }
}
