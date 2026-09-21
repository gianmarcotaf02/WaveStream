package p005a5;

/* JADX INFO: renamed from: a5.a1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1218a1 {
    public static final p005a5.T0 Companion = new p005a5.T0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f14193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Y4.C1131z f14194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final W4.b f14195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final io.ktor.client.HttpClient f14196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final V7.n0 f14197e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final V7.W f14198f;
    public final java.util.LinkedHashMap g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p028c8.d f14199h;

    public C1218a1(android.content.Context context, Y4.C1131z api, W4.b secureStorage, io.ktor.client.HttpClient httpClient) {
        java.lang.Long lA0;
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(api, "api");
        kotlin.jvm.internal.m.e(secureStorage, "secureStorage");
        kotlin.jvm.internal.m.e(httpClient, "httpClient");
        this.f14193a = context;
        this.f14194b = api;
        this.f14195c = secureStorage;
        this.f14196d = httpClient;
        V7.n0 n0VarB = V7.r.b(p005a5.P0.f13756a);
        this.f14197e = n0VarB;
        this.f14198f = new V7.W(n0VarB);
        java.lang.String strB = secureStorage.b("os_jwt");
        if (strB != null) {
            java.lang.String strB2 = secureStorage.b("os_jwt_expiry_ms");
            long jLongValue = (strB2 == null || (lA0 = O7.x.A0(strB2)) == null) ? 0L : lA0.longValue();
            java.lang.String strB3 = secureStorage.b("os_username");
            if (strB3 != null) {
                if (java.lang.System.currentTimeMillis() >= jLongValue) {
                    b();
                } else {
                    java.lang.String strB4 = secureStorage.b("os_base_url");
                    api.f12167d = strB;
                    api.f12168e = strB4 != null ? Y4.C1131z.f(strB4) : null;
                    n0VarB.i(null, new p005a5.O0(strB3, null));
                    android.util.Log.i("OpenSubtitlesRepo", "Restored OpenSubtitles session for ".concat(strB3));
                }
            }
        }
        this.g = new java.util.LinkedHashMap();
        this.f14199h = new p028c8.d();
    }

    public static java.lang.String a(java.lang.Integer num, java.lang.String str, java.lang.Integer num2, java.lang.Integer num3) {
        int iIntValue = num != null ? num.intValue() : 0;
        if (num2 == null || num3 == null) {
            return iIntValue + "_" + str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(iIntValue);
        sb.append("_S");
        sb.append(num2);
        sb.append("E");
        sb.append(num3);
        return Y6.f.m(sb, "_", str);
    }

    public final void b() {
        Y4.C1131z c1131z = this.f14194b;
        c1131z.f12167d = null;
        c1131z.f12168e = null;
        W4.b bVar = this.f14195c;
        bVar.a("os_jwt");
        bVar.a("os_jwt_expiry_ms");
        bVar.a("os_username");
        bVar.a("os_base_url");
        p005a5.P0 p2 = p005a5.P0.f13756a;
        V7.n0 n0Var = this.f14197e;
        n0Var.getClass();
        n0Var.i(null, p2);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0258  */
    /* JADX WARN: Code duplicated, block: B:121:0x01f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x01dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0150  */
    /* JADX WARN: Code duplicated, block: B:48:0x0161  */
    /* JADX WARN: Code duplicated, block: B:53:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:54:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:56:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:59:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:60:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:63:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:67:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:73:0x0201  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x0216  */
    /* JADX WARN: Code duplicated, block: B:83:0x0224  */
    /* JADX WARN: Code duplicated, block: B:86:0x022d  */
    /* JADX WARN: Code duplicated, block: B:89:0x0240  */
    public final java.lang.Object c(int i3, java.lang.Integer num, java.lang.String str, java.lang.Integer num2, java.lang.Integer num3, p117n6.c cVar) throws java.lang.Throwable {
        p005a5.V0 v6;
        p005a5.C1218a1 c1218a1;
        java.io.File file;
        java.io.File file2;
        java.io.File file3;
        java.io.File file4;
        com.kiptv.core.model.OSDownloadResponse oSDownloadResponse;
        io.ktor.client.statement.HttpResponse httpResponse;
        java.io.File file5;
        java.io.File file6;
        p005a5.C1218a1 c1218a2;
        java.io.FileOutputStream fileOutputStream;
        java.lang.Object value;
        p005a5.O0 o8;
        java.io.File[] fileArrListFiles;
        java.util.List listE0;
        java.util.List list;
        long jCurrentTimeMillis;
        java.util.ArrayList arrayList;
        java.util.Iterator it;
        java.util.List listC0;
        java.util.Iterator it2;
        if (cVar instanceof p005a5.V0) {
            v6 = (p005a5.V0) cVar;
            int i9 = v6.f14015n;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                v6.f14015n = i9 - Integer.MIN_VALUE;
            } else {
                v6 = new p005a5.V0(this, cVar);
            }
        } else {
            v6 = new p005a5.V0(this, cVar);
        }
        java.lang.Object objBodyAsBytes = v6.f14013l;
        p109m6.a aVar = p109m6.a.f25430h;
        int i10 = v6.f14015n;
        long j = 7776000000L;
        if (i10 == 0) {
            com.google.common.util.concurrent.P.u0(objBodyAsBytes);
            android.util.Log.i("OpenSubtitlesRepo", "Subtitle download requested: fileId=" + i3 + ", language=" + str);
            java.io.File file7 = new java.io.File(this.f14193a.getCacheDir(), "subtitles");
            if (!file7.exists()) {
                file7.mkdirs();
            }
            java.io.File file8 = new java.io.File(file7, a(num, str, num2, num3) + "_" + i3 + ".srt");
            if (file8.exists() && java.lang.System.currentTimeMillis() - file8.lastModified() < 7776000000L) {
                android.util.Log.i("OpenSubtitlesRepo", "Subtitle cache hit: " + file8.getName() + " (" + file8.length() + " bytes)");
                return file8;
            }
            if (file8.exists()) {
                file8.delete();
            }
            try {
                Y4.C1131z c1131z = this.f14194b;
                v6.f14010h = this;
                v6.f14011i = file7;
                v6.j = file8;
                v6.f14015n = 1;
                java.lang.Object objB = c1131z.b(i3, v6);
                if (objB != aVar) {
                    c1218a1 = this;
                    file = file7;
                    objBodyAsBytes = objB;
                    file2 = file8;
                }
                return aVar;
            } catch (com.kiptv.core.model.Z e6) {
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
                com.google.common.util.concurrent.P.u0(objBodyAsBytes);
            } catch (com.kiptv.core.model.Z e9) {
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
                com.google.common.util.concurrent.P.u0(objBodyAsBytes);
                httpResponse = (io.ktor.client.statement.HttpResponse) objBodyAsBytes;
                if (io.ktor.http.HttpStatusCodeKt.isSuccess(httpResponse.getStatus())) {
                    throw com.kiptv.core.model.V.f20607h;
                }
                v6.f14010h = c1218a1;
                v6.f14011i = file3;
                v6.j = file4;
                v6.f14012k = oSDownloadResponse;
                v6.f14015n = 3;
                objBodyAsBytes = io.ktor.client.statement.HttpResponseKt.bodyAsBytes(httpResponse, v6);
                if (objBodyAsBytes != aVar) {
                    file5 = file4;
                    file6 = file3;
                    c1218a2 = c1218a1;
                }
                return aVar;
            }
            if (i10 != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oSDownloadResponse = v6.f14012k;
            file5 = v6.j;
            file6 = v6.f14011i;
            c1218a2 = v6.f14010h;
            com.google.common.util.concurrent.P.u0(objBodyAsBytes);
            j = 7776000000L;
        }
        byte[] array = (byte[]) objBodyAsBytes;
        kotlin.jvm.internal.m.e(file5, "<this>");
        kotlin.jvm.internal.m.e(array, "array");
        fileOutputStream = new java.io.FileOutputStream(file5);
        try {
            fileOutputStream.write(array);
            fileOutputStream.close();
            android.util.Log.i("OpenSubtitlesRepo", "Subtitle downloaded: " + file5.getName() + " (" + array.length + " bytes)");
            value = c1218a2.f14197e.getValue();
            if (value instanceof p005a5.O0) {
                o8 = (p005a5.O0) value;
            } else {
                o8 = null;
            }
            if (o8 != null) {
                p005a5.O0 o0A = p005a5.O0.a(o8, new java.lang.Integer(oSDownloadResponse.f19901d));
                V7.n0 n0Var = c1218a2.f14197e;
                n0Var.getClass();
                n0Var.i(null, o0A);
            }
            fileArrListFiles = file6.listFiles();
            if (fileArrListFiles != null) {
                listE0 = p078i6.m.E0(fileArrListFiles);
            } else {
                listE0 = null;
            }
            list = p078i6.w.f23205h;
            if (listE0 == null) {
                listE0 = list;
            }
            jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : listE0) {
                if (jCurrentTimeMillis - ((java.io.File) obj).lastModified() > j) {
                    arrayList.add(obj);
                }
            }
            it = arrayList.iterator();
            while (it.hasNext()) {
                try {
                    ((java.io.File) it.next()).delete();
                } catch (java.lang.Throwable th) {
                    com.google.common.util.concurrent.P.T(th);
                }
            }
            java.io.File[] fileArrListFiles2 = file6.listFiles();
            listC0 = fileArrListFiles2 != null ? p078i6.m.C0(fileArrListFiles2, new p005a5.B(9)) : null;
            if (listC0 != null) {
                list = listC0;
            }
            if (list.size() > 200) {
                it2 = p078i6.o.J1(list, list.size() - 200).iterator();
                while (it2.hasNext()) {
                    try {
                        ((java.io.File) it2.next()).delete();
                    } catch (java.lang.Throwable th2) {
                        com.google.common.util.concurrent.P.T(th2);
                    }
                }
            }
            return file5;
        } catch (java.lang.Throwable th3) {
            try {
                throw th3;
            } catch (java.lang.Throwable th4) {
                com.google.android.gms.internal.play_billing.AbstractC1833d1.l(fileOutputStream, th3);
                throw th4;
            }
        }
        com.kiptv.core.model.OSDownloadResponse oSDownloadResponse2 = (com.kiptv.core.model.OSDownloadResponse) objBodyAsBytes;
        io.ktor.client.HttpClient httpClient = c1218a1.f14196d;
        java.lang.String str2 = oSDownloadResponse2.f19898a;
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, str2);
        io.ktor.client.statement.HttpStatement httpStatementH = B2.a.h(io.ktor.http.HttpMethod.INSTANCE, httpRequestBuilder, httpRequestBuilder, httpClient);
        v6.f14010h = c1218a1;
        v6.f14011i = file;
        v6.j = file2;
        v6.f14012k = oSDownloadResponse2;
        v6.f14015n = 2;
        java.lang.Object objExecute = httpStatementH.execute(v6);
        if (objExecute != aVar) {
            file3 = file;
            file4 = file2;
            oSDownloadResponse = oSDownloadResponse2;
            objBodyAsBytes = objExecute;
            httpResponse = (io.ktor.client.statement.HttpResponse) objBodyAsBytes;
            if (io.ktor.http.HttpStatusCodeKt.isSuccess(httpResponse.getStatus())) {
                throw com.kiptv.core.model.V.f20607h;
            }
            v6.f14010h = c1218a1;
            v6.f14011i = file3;
            v6.j = file4;
            v6.f14012k = oSDownloadResponse;
            v6.f14015n = 3;
            objBodyAsBytes = io.ktor.client.statement.HttpResponseKt.bodyAsBytes(httpResponse, v6);
            if (objBodyAsBytes != aVar) {
                file5 = file4;
                file6 = file3;
                c1218a2 = c1218a1;
                byte[] array2 = (byte[]) objBodyAsBytes;
                kotlin.jvm.internal.m.e(file5, "<this>");
                kotlin.jvm.internal.m.e(array2, "array");
                fileOutputStream = new java.io.FileOutputStream(file5);
                fileOutputStream.write(array2);
                fileOutputStream.close();
                android.util.Log.i("OpenSubtitlesRepo", "Subtitle downloaded: " + file5.getName() + " (" + array2.length + " bytes)");
                value = c1218a2.f14197e.getValue();
                if (value instanceof p005a5.O0) {
                    o8 = (p005a5.O0) value;
                } else {
                    o8 = null;
                }
                if (o8 != null) {
                    p005a5.O0 o0A2 = p005a5.O0.a(o8, new java.lang.Integer(oSDownloadResponse.f19901d));
                    V7.n0 n0Var2 = c1218a2.f14197e;
                    n0Var2.getClass();
                    n0Var2.i(null, o0A2);
                }
                fileArrListFiles = file6.listFiles();
                if (fileArrListFiles != null) {
                    listE0 = p078i6.m.E0(fileArrListFiles);
                } else {
                    listE0 = null;
                }
                list = p078i6.w.f23205h;
                if (listE0 == null) {
                    listE0 = list;
                }
                jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                arrayList = new java.util.ArrayList();
                while (r0.hasNext()) {
                    if (jCurrentTimeMillis - ((java.io.File) obj).lastModified() > j) {
                        arrayList.add(obj);
                    }
                }
                it = arrayList.iterator();
                while (it.hasNext()) {
                    ((java.io.File) it.next()).delete();
                }
                java.io.File[] fileArrListFiles3 = file6.listFiles();
                if (fileArrListFiles3 != null) {
                }
                if (listC0 != null) {
                    list = listC0;
                }
                if (list.size() > 200) {
                    it2 = p078i6.o.J1(list, list.size() - 200).iterator();
                    while (it2.hasNext()) {
                        ((java.io.File) it2.next()).delete();
                    }
                }
                return file5;
            }
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009d, code lost:
    
        if (r10.f(r0) == r1) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object d(java.lang.String str, java.lang.String str2, p117n6.c cVar) throws com.kiptv.core.model.C1934b0, com.kiptv.core.model.C1936c0, com.kiptv.core.model.C1932a0, com.kiptv.core.model.V, com.kiptv.core.model.W, com.kiptv.core.model.X, com.kiptv.core.model.Y, com.kiptv.core.model.Z {
        p005a5.W0 w6;
        p005a5.C1218a1 c1218a1;
        if (cVar instanceof p005a5.W0) {
            w6 = (p005a5.W0) cVar;
            int i3 = w6.f14050l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                w6.f14050l = i3 - Integer.MIN_VALUE;
            } else {
                w6 = new p005a5.W0(this, cVar);
            }
        } else {
            w6 = new p005a5.W0(this, cVar);
        }
        java.lang.Object objD = w6.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = w6.f14050l;
        try {
            if (i9 != 0) {
                if (i9 == 1) {
                    str = w6.f14048i;
                    c1218a1 = w6.f14047h;
                    com.google.common.util.concurrent.P.u0(objD);
                } else {
                    if (i9 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.google.common.util.concurrent.P.u0(objD);
                }
                return p070h6.A.f22523a;
            }
            com.google.common.util.concurrent.P.u0(objD);
            w6.f14047h = this;
            w6.f14048i = str;
            w6.f14050l = 1;
            objD = this.f14194b.d(str, str2, w6);
            if (objD != aVar) {
                c1218a1 = this;
            }
            return aVar;
            com.kiptv.core.model.OSLoginResponse oSLoginResponse = (com.kiptv.core.model.OSLoginResponse) objD;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis() + 86400000;
            c1218a1.f14195c.c("os_jwt", oSLoginResponse.f19922c);
            java.lang.String strValueOf = java.lang.String.valueOf(jCurrentTimeMillis);
            W4.b bVar = c1218a1.f14195c;
            bVar.c("os_jwt_expiry_ms", strValueOf);
            bVar.c("os_username", str);
            java.lang.String str3 = oSLoginResponse.f19921b;
            if (str3 != null) {
                bVar.c("os_base_url", str3);
            }
            com.kiptv.core.model.OSUser oSUser = oSLoginResponse.f19920a;
            p005a5.O0 o8 = new p005a5.O0(str, oSUser != null ? oSUser.f19960f : null);
            V7.n0 n0Var = c1218a1.f14197e;
            n0Var.getClass();
            n0Var.i(null, o8);
            w6.f14047h = null;
            w6.f14048i = null;
            w6.f14050l = 2;
        } catch (java.lang.Throwable th) {
            com.google.common.util.concurrent.P.T(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(p117n6.c cVar) {
        p005a5.X0 x9;
        p005a5.C1218a1 c1218a1;
        if (cVar instanceof p005a5.X0) {
            x9 = (p005a5.X0) cVar;
            int i3 = x9.f14076k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                x9.f14076k = i3 - Integer.MIN_VALUE;
            } else {
                x9 = new p005a5.X0(this, cVar);
            }
        } else {
            x9 = new p005a5.X0(this, cVar);
        }
        java.lang.Object obj = x9.f14075i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = x9.f14076k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            try {
                Y4.C1131z c1131z = this.f14194b;
                x9.f14074h = this;
                x9.f14076k = 1;
                if (c1131z.e(x9) == aVar) {
                    return aVar;
                }
                c1218a1 = this;
            } catch (java.lang.Throwable th) {
                th = th;
                c1218a1 = this;
                com.google.common.util.concurrent.P.T(th);
            }
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1218a1 = x9.f14074h;
            try {
                com.google.common.util.concurrent.P.u0(obj);
            } catch (java.lang.Throwable th2) {
                th = th2;
                com.google.common.util.concurrent.P.T(th);
            }
        }
        c1218a1.b();
        return p070h6.A.f22523a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(p117n6.c cVar) throws com.kiptv.core.model.C1934b0, com.kiptv.core.model.C1936c0, com.kiptv.core.model.C1932a0, com.kiptv.core.model.V, com.kiptv.core.model.W, com.kiptv.core.model.X, com.kiptv.core.model.Y, com.kiptv.core.model.Z {
        p005a5.Y0 y9;
        p005a5.C1218a1 c1218a1;
        p005a5.O0 o8;
        if (cVar instanceof p005a5.Y0) {
            y9 = (p005a5.Y0) cVar;
            int i3 = y9.f14113l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                y9.f14113l = i3 - Integer.MIN_VALUE;
            } else {
                y9 = new p005a5.Y0(this, cVar);
            }
        } else {
            y9 = new p005a5.Y0(this, cVar);
        }
        java.lang.Object obj = y9.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = y9.f14113l;
        p070h6.A a2 = p070h6.A.f22523a;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            java.lang.Object value = this.f14197e.getValue();
            p005a5.O0 o9 = value instanceof p005a5.O0 ? (p005a5.O0) value : null;
            if (o9 == null) {
                return a2;
            }
            try {
                Y4.C1131z c1131z = this.f14194b;
                y9.f14110h = this;
                y9.f14111i = o9;
                y9.f14113l = 1;
                java.lang.Object objC = c1131z.c(y9);
                if (objC == aVar) {
                    return aVar;
                }
                o8 = o9;
                obj = objC;
                c1218a1 = this;
            } catch (com.kiptv.core.model.Z e6) {
                e = e6;
                c1218a1 = this;
                c1218a1.b();
                throw e;
            }
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o8 = y9.f14111i;
            c1218a1 = y9.f14110h;
            try {
                com.google.common.util.concurrent.P.u0(obj);
            } catch (com.kiptv.core.model.Z e9) {
                e = e9;
                c1218a1.b();
                throw e;
            }
        }
        V7.n0 n0Var = c1218a1.f14197e;
        p005a5.O0 o0A = p005a5.O0.a(o8, ((com.kiptv.core.model.OSUserInfoResponse) obj).f19966a.f19965e);
        n0Var.getClass();
        n0Var.i(null, o0A);
        return a2;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x011a  */
    /* JADX WARN: Code duplicated, block: B:67:0x0122  */
    /* JADX WARN: Code duplicated, block: B:71:0x0129  */
    /* JADX WARN: Code duplicated, block: B:75:0x0140  */
    /* JADX WARN: Code duplicated, block: B:81:0x0150  */
    /* JADX WARN: Code duplicated, block: B:84:0x0163 A[Catch: Z -> 0x014e, TryCatch #1 {Z -> 0x014e, blocks: (B:63:0x011b, B:72:0x012a, B:82:0x0151, B:84:0x0163, B:94:0x0173), top: B:115:0x0118 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0166  */
    /* JADX WARN: Code duplicated, block: B:89:0x016b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX WARN: Code duplicated, block: B:93:0x0172  */
    /* JADX WARN: Code duplicated, block: B:97:0x0189  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    public final java.lang.Object g(p005a5.R0 r9, p117n6.c cVar) throws com.kiptv.core.model.Z {
        p005a5.Z0 z6;
        java.lang.String string;
        p028c8.d dVar;
        p005a5.C1218a1 c1218a1;
        boolean z9;
        java.lang.Integer num;
        java.lang.String str;
        java.lang.String str2;
        java.lang.Integer num2;
        java.lang.Integer num3;
        Y4.C1131z c1131z;
        java.lang.String string2;
        java.lang.Integer num4;
        java.lang.Object objI;
        java.lang.String str3;
        p005a5.C1218a1 c1218a2;
        java.lang.Integer num5;
        java.lang.Object objI2;
        java.util.List list;
        p005a5.C1218a1 c1218a3;
        java.lang.String str4;
        p028c8.d dVar2;
        java.util.List list2;
        p005a5.R0 r10 = r9;
        if (cVar instanceof p005a5.Z0) {
            z6 = (p005a5.Z0) cVar;
            int i3 = z6.f14159n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                z6.f14159n = i3 - Integer.MIN_VALUE;
            } else {
                z6 = new p005a5.Z0(this, cVar);
            }
        } else {
            z6 = new p005a5.Z0(this, cVar);
        }
        p005a5.Z0 z10 = z6;
        java.lang.Object obj = z10.f14157l;
        p109m6.a aVar = p109m6.a.f25430h;
        p005a5.C1218a1 c1218a4 = z10.f14159n;
        try {
            try {
                try {
                    if (c1218a4 == 0) {
                        com.google.common.util.concurrent.P.u0(obj);
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        java.lang.Object obj2 = r10.f13836a;
                        if (obj2 == null) {
                            obj2 = "t0";
                        }
                        sb.append(obj2);
                        sb.append('|');
                        java.lang.String lowerCase = r10.f13837b.toLowerCase(java.util.Locale.ROOT);
                        kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
                        sb.append(lowerCase);
                        sb.append('|');
                        java.lang.Integer num6 = r10.f13839d;
                        sb.append(num6 != null ? num6.intValue() : -1);
                        sb.append('|');
                        java.lang.Integer num7 = r10.f13840e;
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
                        p028c8.d dVar3 = z10.f14156k;
                        java.lang.String str5 = (java.lang.String) z10.j;
                        p005a5.R0 r11 = (p005a5.R0) z10.f14155i;
                        p005a5.C1218a1 c1218a5 = z10.f14154h;
                        com.google.common.util.concurrent.P.u0(obj);
                        string = str5;
                        c1218a1 = c1218a5;
                        dVar = dVar3;
                        r10 = r11;
                    } else {
                        if (c1218a4 == 2) {
                            str3 = (java.lang.String) z10.f14155i;
                            c1218a2 = z10.f14154h;
                            com.google.common.util.concurrent.P.u0(obj);
                            list = ((com.kiptv.core.model.OSSearchResponse) obj).f19928d;
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
                            str3 = (java.lang.String) z10.f14155i;
                            c1218a2 = z10.f14154h;
                            com.google.common.util.concurrent.P.u0(obj);
                            list = ((com.kiptv.core.model.OSSearchResponse) obj).f19928d;
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
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        dVar2 = z10.f14156k;
                        list2 = (java.util.List) z10.j;
                        str4 = (java.lang.String) z10.f14155i;
                        c1218a3 = z10.f14154h;
                        com.google.common.util.concurrent.P.u0(obj);
                    }
                    p028c8.d dVar4 = dVar2;
                    try {
                        c1218a3.g.put(str4, new p005a5.U0(list2, java.lang.System.currentTimeMillis()));
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
                            Y4.C1131z c1131z2 = c1218a1.f14194b;
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
                            objI2 = Y4.C1131z.i(c1131z2, num, null, str, num3, num5, z10, 226);
                            if (objI2 != aVar) {
                                java.lang.String str6 = string;
                                obj = objI2;
                                str3 = str6;
                                c1218a2 = c1218a1;
                                list = ((com.kiptv.core.model.OSSearchResponse) obj).f19928d;
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
                                    p028c8.d dVar5 = dVar2;
                                    c1218a3.g.put(str4, new p005a5.U0(list2, java.lang.System.currentTimeMillis()));
                                    return list2;
                                }
                            }
                        } else {
                            c1131z = c1218a1.f14194b;
                            string2 = O7.q.r1(r10.f13837b).toString();
                            if (string2.length() == 0) {
                                return p078i6.w.f23205h;
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
                            objI = Y4.C1131z.i(c1131z, null, string2, str, num3, num4, z10, 225);
                            if (objI != aVar) {
                                java.lang.String str7 = string;
                                obj = objI;
                                str3 = str7;
                                c1218a2 = c1218a1;
                                list = ((com.kiptv.core.model.OSSearchResponse) obj).f19928d;
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
                                    p028c8.d dVar6 = dVar2;
                                    c1218a3.g.put(str4, new p005a5.U0(list2, java.lang.System.currentTimeMillis()));
                                    return list2;
                                }
                            }
                        }
                        return aVar;
                    }
                    str2 = "episode";
                    if (num != null) {
                        Y4.C1131z c1131z3 = c1218a1.f14194b;
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
                        objI2 = Y4.C1131z.i(c1131z3, num, null, str, num3, num5, z10, 226);
                        if (objI2 != aVar) {
                            java.lang.String str8 = string;
                            obj = objI2;
                            str3 = str8;
                            c1218a2 = c1218a1;
                            list = ((com.kiptv.core.model.OSSearchResponse) obj).f19928d;
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
                                p028c8.d dVar7 = dVar2;
                                c1218a3.g.put(str4, new p005a5.U0(list2, java.lang.System.currentTimeMillis()));
                                return list2;
                            }
                        }
                    } else {
                        c1131z = c1218a1.f14194b;
                        string2 = O7.q.r1(r10.f13837b).toString();
                        if (string2.length() == 0) {
                            return p078i6.w.f23205h;
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
                        objI = Y4.C1131z.i(c1131z, null, string2, str, num3, num4, z10, 225);
                        if (objI != aVar) {
                            java.lang.String str9 = string;
                            obj = objI;
                            str3 = str9;
                            c1218a2 = c1218a1;
                            list = ((com.kiptv.core.model.OSSearchResponse) obj).f19928d;
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
                                p028c8.d dVar8 = dVar2;
                                c1218a3.g.put(str4, new p005a5.U0(list2, java.lang.System.currentTimeMillis()));
                                return list2;
                            }
                        }
                    }
                    return aVar;
                } catch (com.kiptv.core.model.Z e6) {
                    e = e6;
                    c1218a4 = c1218a1;
                    c1218a4.b();
                    throw e;
                }
                p005a5.U0 u1 = (p005a5.U0) c1218a1.g.get(string);
                if (u1 != null) {
                    if (java.lang.System.currentTimeMillis() - u1.f13959b < 1800000) {
                        java.util.List list3 = u1.f13958a;
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
            } catch (java.lang.Throwable th) {
                dVar.g(null);
                throw th;
            }
        } catch (com.kiptv.core.model.Z e9) {
            e = e9;
        }
    }
}
