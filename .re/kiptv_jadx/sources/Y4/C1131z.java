package Y4;

/* JADX INFO: renamed from: Y4.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1131z {
    public static final Y4.r Companion = new Y4.r();
    public static final w8.q g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io.ktor.client.HttpClient f12164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p162s8.d f12165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p034d5.c f12166c = new p034d5.c(4, 1000);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.lang.String f12167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public java.lang.String f12168e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w8.s f12169f;

    static {
        java.util.regex.Pattern pattern = w8.q.f30591e;
        g = com.google.crypto.tink.shaded.protobuf.AbstractC1909d.S("application/json");
    }

    public C1131z(io.ktor.client.HttpClient httpClient, p162s8.d dVar, p132p5.a aVar) {
        this.f12164a = httpClient;
        this.f12165b = dVar;
        w8.r rVar = new w8.r();
        rVar.a(com.google.common.util.concurrent.P.i0(w8.t.HTTP_1_1));
        rVar.f30604h = false;
        this.f12169f = new w8.s(rVar);
    }

    public static java.lang.String f(java.lang.String str) {
        java.lang.String strT1 = O7.q.t1(O7.q.r1(str).toString(), '/');
        if (!O7.x.x0(strT1, "http://", false) && !O7.x.x0(strT1, "https://", false)) {
            strT1 = "https://".concat(strT1);
        }
        return O7.x.q0(strT1, "/api/v1", false) ? strT1 : strT1.concat("/api/v1");
    }

    public static /* synthetic */ java.lang.Object i(Y4.C1131z c1131z, java.lang.Integer num, java.lang.String str, java.lang.String str2, java.lang.Integer num2, java.lang.Integer num3, p005a5.Z0 z6, int i3) {
        if ((i3 & 1) != 0) {
            num = null;
        }
        if ((i3 & 2) != 0) {
            str = null;
        }
        return c1131z.h(num, str, str2, num2, num3, z6);
    }

    public final void a(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, boolean z6) {
        java.lang.String str;
        io.ktor.client.request.UtilsKt.header(httpRequestBuilder, "Accept", "*/*");
        io.ktor.client.request.UtilsKt.header(httpRequestBuilder, "Api-Key", "VdYVekly6FnPaioJkajUXsVYsSr4mcuU");
        io.ktor.client.request.UtilsKt.header(httpRequestBuilder, "User-Agent", "KIPTV TV v1.0");
        if (!z6 || (str = this.f12167d) == null) {
            return;
        }
        io.ktor.client.request.UtilsKt.header(httpRequestBuilder, "Authorization", "Bearer ".concat(str));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        if (r12 == r1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object b(int i3, p117n6.c cVar) throws java.lang.Throwable {
        Y4.C1113t c1113t;
        int i9;
        Y4.C1131z c1131z;
        java.lang.String lowerCase;
        if (cVar instanceof Y4.C1113t) {
            c1113t = (Y4.C1113t) cVar;
            int i10 = c1113t.f12083l;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c1113t.f12083l = i10 - Integer.MIN_VALUE;
            } else {
                c1113t = new Y4.C1113t(this, cVar);
            }
        } else {
            c1113t = new Y4.C1113t(this, cVar);
        }
        java.lang.Object objK = c1113t.j;
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
            Y4.C1131z c1131z2 = c1113t.f12080h;
            com.google.common.util.concurrent.P.u0(objK);
            i9 = i12;
            c1131z = c1131z2;
        } else {
            if (i11 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1131z = c1113t.f12080h;
            com.google.common.util.concurrent.P.u0(objK);
        }
        Y4.C1110s c1110s = (Y4.C1110s) objK;
        int i13 = c1110s.f12069a;
        java.lang.String str = c1110s.f12070b;
        if (200 > i13 || i13 >= 300) {
            java.lang.String str2 = c1110s.f12072d;
            if (str2 == null) {
                str2 = "none";
            }
            c1131z.getClass();
            java.util.regex.Pattern patternCompile = java.util.regex.Pattern.compile("\\s+");
            kotlin.jvm.internal.m.d(patternCompile, "compile(...)");
            java.lang.String strReplaceAll = patternCompile.matcher(str).replaceAll(io.ktor.sse.ServerSentEventKt.SPACE);
            kotlin.jvm.internal.m.d(strReplaceAll, "replaceAll(...)");
            java.lang.String strP1 = O7.q.p1(com.revenuecat.purchases.common.networking.RCHTTPStatusCodes.UNSUCCESSFUL, O7.q.r1(strReplaceAll).toString());
            java.lang.StringBuilder sbT = p121o0.p.t(i13, "Download endpoint HTTP ", " (");
            B2.a.x(sbT, c1110s.f12071c, ", location=", str2, "): ");
            sbT.append(strP1);
            android.util.Log.w("OpenSubtitlesApi", sbT.toString());
        }
        int i14 = c1110s.f12069a;
        if (200 <= i14 && i14 < 300) {
            return c1131z.f12165b.b(str, com.kiptv.core.model.OSDownloadResponse.INSTANCE.serializer());
        }
        if (i14 == 401) {
            throw com.kiptv.core.model.X.f20646h;
        }
        if (i14 == 403) {
            java.lang.String strG = c1131z.g(str);
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
                throw com.kiptv.core.model.C1934b0.f20741h;
            }
            if (500 > i14 || i14 >= 600) {
                throw new com.kiptv.core.model.C1936c0(i14);
            }
            throw new com.kiptv.core.model.C1936c0(i14);
        }
        java.lang.String strG2 = c1131z.g(str);
        if (strG2 != null) {
            lowerCase = strG2.toLowerCase(java.util.Locale.ROOT);
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
        com.kiptv.core.model.OSErrorResponse oSErrorResponseJ = c1131z.j(str);
        if (lowerCase.length() == 0) {
            lowerCase = "Quota exceeded";
        }
        throw new com.kiptv.core.model.C1932a0(lowerCase, oSErrorResponseJ != null ? oSErrorResponseJ.f19908e : null);
        c1113t.f12080h = c1131z;
        c1113t.f12083l = 2;
        c1131z.getClass();
        Z7.e eVar = S7.M.f9549a;
        objK = S7.C.K(Z7.d.f13044i, new Y4.C1116u(i9, c1131z, null), c1113t);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0098  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:61:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:64:0x0106  */
    /* JADX WARN: Code duplicated, block: B:66:0x0109  */
    /* JADX WARN: Code duplicated, block: B:68:0x010c  */
    /* JADX WARN: Code duplicated, block: B:70:0x0110  */
    /* JADX WARN: Code duplicated, block: B:72:0x0114  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:0x0128  */
    /* JADX WARN: Code duplicated, block: B:82:0x012b  */
    /* JADX WARN: Code duplicated, block: B:84:0x012e  */
    public final java.lang.Object c(p117n6.c cVar) throws com.kiptv.core.model.C1934b0, com.kiptv.core.model.C1936c0, com.kiptv.core.model.C1932a0, com.kiptv.core.model.V, com.kiptv.core.model.W, com.kiptv.core.model.X, com.kiptv.core.model.Y, com.kiptv.core.model.Z {
        Y4.C1119v c1119v;
        Y4.C1131z c1131z;
        int value;
        Y4.C1131z c1131z2;
        int i3;
        java.lang.String str;
        java.lang.String strG;
        java.lang.String lowerCase;
        java.lang.String strG2;
        if (cVar instanceof Y4.C1119v) {
            c1119v = (Y4.C1119v) cVar;
            int i9 = c1119v.f12114l;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c1119v.f12114l = i9 - Integer.MIN_VALUE;
            } else {
                c1119v = new Y4.C1119v(this, cVar);
            }
        } else {
            c1119v = new Y4.C1119v(this, cVar);
        }
        java.lang.Object objExecute = c1119v.j;
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
                io.ktor.client.statement.HttpResponse httpResponse = (io.ktor.client.statement.HttpResponse) objExecute;
                value = httpResponse.getStatus().getValue();
                c1119v.f12111h = c1131z;
                c1119v.f12112i = value;
                c1119v.f12114l = 3;
                objExecute = io.ktor.client.statement.HttpResponseKt.bodyAsText$default(httpResponse, null, c1119v, 1, null);
                if (objExecute != aVar) {
                    c1131z2 = c1131z;
                    i3 = value;
                }
                return aVar;
            }
            if (i10 != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = c1119v.f12112i;
            c1131z2 = c1119v.f12111h;
            com.google.common.util.concurrent.P.u0(objExecute);
        }
        str = (java.lang.String) objExecute;
        if (200 > i3 && i3 < 300) {
            return c1131z2.f12165b.b(str, com.kiptv.core.model.OSUserInfoResponse.INSTANCE.serializer());
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
                throw com.kiptv.core.model.C1934b0.f20741h;
            }
            if (500 <= i3 || i3 >= 600) {
                throw new com.kiptv.core.model.C1936c0(i3);
            }
            throw new com.kiptv.core.model.C1936c0(i3);
        }
        strG = c1131z2.g(str);
        if (strG != null) {
            lowerCase = strG.toLowerCase(java.util.Locale.ROOT);
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
        com.kiptv.core.model.OSErrorResponse oSErrorResponseJ = c1131z2.j(str);
        if (lowerCase.length() == 0) {
            lowerCase = "Quota exceeded";
        }
        throw new com.kiptv.core.model.C1932a0(lowerCase, oSErrorResponseJ != null ? oSErrorResponseJ.f19908e : null);
        io.ktor.client.HttpClient httpClient = c1131z.f12164a;
        java.lang.String str2 = c1131z.f12168e;
        if (str2 == null) {
            str2 = "https://api.opensubtitles.com/api/v1";
        }
        java.lang.String strConcat = str2.concat("/infos/user");
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, strConcat);
        c1131z.a(httpRequestBuilder, true);
        io.ktor.client.statement.HttpStatement httpStatementH = B2.a.h(io.ktor.http.HttpMethod.INSTANCE, httpRequestBuilder, httpRequestBuilder, httpClient);
        c1119v.f12111h = c1131z;
        c1119v.f12114l = 2;
        objExecute = httpStatementH.execute(c1119v);
        if (objExecute != aVar) {
            io.ktor.client.statement.HttpResponse httpResponse2 = (io.ktor.client.statement.HttpResponse) objExecute;
            value = httpResponse2.getStatus().getValue();
            c1119v.f12111h = c1131z;
            c1119v.f12112i = value;
            c1119v.f12114l = 3;
            objExecute = io.ktor.client.statement.HttpResponseKt.bodyAsText$default(httpResponse2, null, c1119v, 1, null);
            if (objExecute != aVar) {
                c1131z2 = c1131z;
                i3 = value;
                str = (java.lang.String) objExecute;
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
                        throw com.kiptv.core.model.C1934b0.f20741h;
                    }
                    if (500 <= i3) {
                    }
                    throw new com.kiptv.core.model.C1936c0(i3);
                }
                strG = c1131z2.g(str);
                if (strG != null) {
                    lowerCase = strG.toLowerCase(java.util.Locale.ROOT);
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
                com.kiptv.core.model.OSErrorResponse oSErrorResponseJ2 = c1131z2.j(str);
                if (lowerCase.length() == 0) {
                    lowerCase = "Quota exceeded";
                }
                throw new com.kiptv.core.model.C1932a0(lowerCase, oSErrorResponseJ2 != null ? oSErrorResponseJ2.f19908e : null);
            }
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:41:0x0112  */
    /* JADX WARN: Code duplicated, block: B:43:0x0116  */
    /* JADX WARN: Code duplicated, block: B:45:0x011c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0124  */
    /* JADX WARN: Code duplicated, block: B:50:0x0128  */
    /* JADX WARN: Code duplicated, block: B:52:0x012e  */
    /* JADX WARN: Code duplicated, block: B:53:0x013a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0144  */
    /* JADX WARN: Code duplicated, block: B:58:0x014c  */
    /* JADX WARN: Code duplicated, block: B:60:0x0156  */
    /* JADX WARN: Code duplicated, block: B:62:0x015a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0162  */
    /* JADX WARN: Code duplicated, block: B:67:0x0165  */
    /* JADX WARN: Code duplicated, block: B:69:0x0168  */
    /* JADX WARN: Code duplicated, block: B:71:0x016c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0170  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x0184  */
    /* JADX WARN: Code duplicated, block: B:83:0x0187  */
    /* JADX WARN: Code duplicated, block: B:85:0x018a  */
    public final java.lang.Object d(java.lang.String str, java.lang.String str2, p117n6.c cVar) throws com.kiptv.core.model.C1934b0, com.kiptv.core.model.C1936c0, com.kiptv.core.model.C1932a0, com.kiptv.core.model.V, com.kiptv.core.model.W, com.kiptv.core.model.X, com.kiptv.core.model.Y, com.kiptv.core.model.Z {
        Y4.C1122w c1122w;
        java.lang.String str3;
        java.lang.String str4;
        Y4.C1131z c1131z;
        Y4.C1131z c1131z2;
        int value;
        Y4.C1131z c1131z3;
        int i3;
        java.lang.String str5;
        java.lang.String strG;
        java.lang.String lowerCase;
        java.lang.String strG2;
        if (cVar instanceof Y4.C1122w) {
            c1122w = (Y4.C1122w) cVar;
            int i9 = c1122w.f12129n;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c1122w.f12129n = i9 - Integer.MIN_VALUE;
            } else {
                c1122w = new Y4.C1122w(this, cVar);
            }
        } else {
            c1122w = new Y4.C1122w(this, cVar);
        }
        java.lang.Object objExecute = c1122w.f12127l;
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
            java.lang.String str6 = (java.lang.String) c1122w.f12125i;
            c1131z = c1122w.f12124h;
            com.google.common.util.concurrent.P.u0(objExecute);
            str3 = str6;
        } else {
            if (i10 == 2) {
                c1131z2 = c1122w.f12124h;
                com.google.common.util.concurrent.P.u0(objExecute);
                io.ktor.client.statement.HttpResponse httpResponse = (io.ktor.client.statement.HttpResponse) objExecute;
                value = httpResponse.getStatus().getValue();
                c1122w.f12124h = c1131z2;
                c1122w.f12125i = c1131z2;
                c1122w.f12126k = value;
                c1122w.f12129n = 3;
                objExecute = io.ktor.client.statement.HttpResponseKt.bodyAsText$default(httpResponse, null, c1122w, 1, null);
                if (objExecute != aVar) {
                    c1131z3 = c1131z2;
                    i3 = value;
                }
                return aVar;
            }
            if (i10 != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = c1122w.f12126k;
            c1131z2 = (Y4.C1131z) c1122w.f12125i;
            c1131z3 = c1122w.f12124h;
            com.google.common.util.concurrent.P.u0(objExecute);
        }
        str5 = (java.lang.String) objExecute;
        if (200 > i3 && i3 < 300) {
            com.kiptv.core.model.OSLoginResponse oSLoginResponse = (com.kiptv.core.model.OSLoginResponse) c1131z2.f12165b.b(str5, com.kiptv.core.model.OSLoginResponse.INSTANCE.serializer());
            c1131z3.f12167d = oSLoginResponse.f19922c;
            java.lang.String str7 = oSLoginResponse.f19921b;
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
                throw com.kiptv.core.model.C1934b0.f20741h;
            }
            if (500 <= i3 || i3 >= 600) {
                throw new com.kiptv.core.model.C1936c0(i3);
            }
            throw new com.kiptv.core.model.C1936c0(i3);
        }
        strG = c1131z2.g(str5);
        if (strG != null) {
            lowerCase = strG.toLowerCase(java.util.Locale.ROOT);
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
        com.kiptv.core.model.OSErrorResponse oSErrorResponseJ = c1131z2.j(str5);
        if (lowerCase.length() == 0) {
            lowerCase = "Quota exceeded";
        }
        throw new com.kiptv.core.model.C1932a0(lowerCase, oSErrorResponseJ != null ? oSErrorResponseJ.f19908e : null);
        p162s8.v vVar = new p162s8.v();
        com.google.common.util.concurrent.P.m0(io.sentry.protocol.User.JsonKeys.USERNAME, str3, vVar);
        com.google.common.util.concurrent.P.m0("password", str4, vVar);
        kotlinx.serialization.json.c cVarA = vVar.a();
        io.ktor.client.HttpClient httpClient = c1131z.f12164a;
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, "https://api.opensubtitles.com/api/v1/login");
        c1131z.a(httpRequestBuilder, false);
        httpRequestBuilder.setBody(new io.ktor.http.content.TextContent(cVarA.toString(), io.ktor.http.ContentType.Application.INSTANCE.getJson(), null, 4, null));
        httpRequestBuilder.setBodyType(null);
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
        io.ktor.client.statement.HttpStatement httpStatement = new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
        c1122w.f12124h = c1131z;
        c1122w.f12125i = null;
        c1122w.j = null;
        c1122w.f12129n = 2;
        objExecute = httpStatement.execute(c1122w);
        if (objExecute != aVar) {
            c1131z2 = c1131z;
            io.ktor.client.statement.HttpResponse httpResponse2 = (io.ktor.client.statement.HttpResponse) objExecute;
            value = httpResponse2.getStatus().getValue();
            c1122w.f12124h = c1131z2;
            c1122w.f12125i = c1131z2;
            c1122w.f12126k = value;
            c1122w.f12129n = 3;
            objExecute = io.ktor.client.statement.HttpResponseKt.bodyAsText$default(httpResponse2, null, c1122w, 1, null);
            if (objExecute != aVar) {
                c1131z3 = c1131z2;
                i3 = value;
                str5 = (java.lang.String) objExecute;
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
                        throw com.kiptv.core.model.C1934b0.f20741h;
                    }
                    if (500 <= i3) {
                    }
                    throw new com.kiptv.core.model.C1936c0(i3);
                }
                strG = c1131z2.g(str5);
                if (strG != null) {
                    lowerCase = strG.toLowerCase(java.util.Locale.ROOT);
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
                com.kiptv.core.model.OSErrorResponse oSErrorResponseJ2 = c1131z2.j(str5);
                if (lowerCase.length() == 0) {
                    lowerCase = "Quota exceeded";
                }
                throw new com.kiptv.core.model.C1932a0(lowerCase, oSErrorResponseJ2 != null ? oSErrorResponseJ2.f19908e : null);
            }
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:35:0x0083  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final java.lang.Object e(p117n6.c cVar) {
        Y4.C1125x c1125x;
        Y4.C1131z c1131z;
        Y4.C1131z c1131z2;
        java.lang.String str;
        io.ktor.client.statement.HttpStatement httpStatement;
        if (cVar instanceof Y4.C1125x) {
            c1125x = (Y4.C1125x) cVar;
            int i3 = c1125x.f12140k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1125x.f12140k = i3 - Integer.MIN_VALUE;
            } else {
                c1125x = new Y4.C1125x(this, cVar);
            }
        } else {
            c1125x = new Y4.C1125x(this, cVar);
        }
        java.lang.Object obj = c1125x.f12139i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c1125x.f12140k;
        if (i9 != 0) {
            if (i9 == 1) {
                c1131z2 = c1125x.f12138h;
                try {
                    com.google.common.util.concurrent.P.u0(obj);
                    io.ktor.client.HttpClient httpClient = c1131z2.f12164a;
                    str = c1131z2.f12168e;
                    if (str == null) {
                        str = "https://api.opensubtitles.com/api/v1";
                    }
                    java.lang.String strConcat = str.concat("/logout");
                    io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
                    io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, strConcat);
                    c1131z2.a(httpRequestBuilder, true);
                    httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getDelete());
                    httpStatement = new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
                    c1125x.f12138h = c1131z2;
                    c1125x.f12140k = 2;
                    if (httpStatement.execute(c1125x) != aVar) {
                        c1131z = c1131z2;
                    }
                    return aVar;
                } catch (java.lang.Exception e6) {
                    e = e6;
                    c1131z = c1131z2;
                    android.util.Log.d("OpenSubtitlesApi", "Logout error: " + e.getMessage());
                }
            } else {
                if (i9 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c1131z = c1125x.f12138h;
                try {
                    com.google.common.util.concurrent.P.u0(obj);
                } catch (java.lang.Exception e9) {
                    e = e9;
                    android.util.Log.d("OpenSubtitlesApi", "Logout error: " + e.getMessage());
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
                io.ktor.client.HttpClient httpClient2 = c1131z2.f12164a;
                str = c1131z2.f12168e;
                if (str == null) {
                    str = "https://api.opensubtitles.com/api/v1";
                }
                java.lang.String strConcat2 = str.concat("/logout");
                io.ktor.client.request.HttpRequestBuilder httpRequestBuilder2 = new io.ktor.client.request.HttpRequestBuilder();
                io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder2, strConcat2);
                c1131z2.a(httpRequestBuilder2, true);
                httpRequestBuilder2.setMethod(io.ktor.http.HttpMethod.INSTANCE.getDelete());
                httpStatement = new io.ktor.client.statement.HttpStatement(httpRequestBuilder2, httpClient2);
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
        } catch (java.lang.Exception e10) {
            e = e10;
            c1131z = this;
            android.util.Log.d("OpenSubtitlesApi", "Logout error: " + e.getMessage());
        }
    }

    public final java.lang.String g(java.lang.String str) {
        try {
            p162s8.d dVar = this.f12165b;
            dVar.getClass();
            return ((com.kiptv.core.model.OSErrorResponse) dVar.b(str, com.kiptv.core.model.OSErrorResponse.INSTANCE.serializer())).f19904a;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0111  */
    /* JADX WARN: Code duplicated, block: B:51:0x012e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0132  */
    /* JADX WARN: Code duplicated, block: B:55:0x0138  */
    /* JADX WARN: Code duplicated, block: B:58:0x0140  */
    /* JADX WARN: Code duplicated, block: B:60:0x0144  */
    /* JADX WARN: Code duplicated, block: B:62:0x014a  */
    /* JADX WARN: Code duplicated, block: B:63:0x0156  */
    /* JADX WARN: Code duplicated, block: B:66:0x0160  */
    /* JADX WARN: Code duplicated, block: B:68:0x0168  */
    /* JADX WARN: Code duplicated, block: B:70:0x0172  */
    /* JADX WARN: Code duplicated, block: B:72:0x0176  */
    /* JADX WARN: Code duplicated, block: B:75:0x017e  */
    /* JADX WARN: Code duplicated, block: B:77:0x0181  */
    /* JADX WARN: Code duplicated, block: B:79:0x0184  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x0188  */
    /* JADX WARN: Code duplicated, block: B:83:0x018c  */
    /* JADX WARN: Code duplicated, block: B:91:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:93:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:95:0x01a6  */
    public final java.lang.Object h(java.lang.Integer num, java.lang.String str, java.lang.String str2, java.lang.Integer num2, java.lang.Integer num3, p117n6.c cVar) throws com.kiptv.core.model.C1934b0, com.kiptv.core.model.C1936c0, com.kiptv.core.model.C1932a0, com.kiptv.core.model.V, com.kiptv.core.model.W, com.kiptv.core.model.X, com.kiptv.core.model.Y, com.kiptv.core.model.Z {
        Y4.C1128y c1128y;
        java.lang.String str3;
        java.lang.Integer num4;
        java.lang.String str4;
        java.lang.Integer num5;
        Y4.C1131z c1131z;
        java.lang.Integer num6;
        int value;
        int i3;
        Y4.C1131z c1131z2;
        java.lang.String str5;
        java.lang.String strG;
        java.lang.String lowerCase;
        java.lang.String strG2;
        if (cVar instanceof Y4.C1128y) {
            c1128y = (Y4.C1128y) cVar;
            int i9 = c1128y.f12159q;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c1128y.f12159q = i9 - Integer.MIN_VALUE;
            } else {
                c1128y = new Y4.C1128y(this, cVar);
            }
        } else {
            c1128y = new Y4.C1128y(this, cVar);
        }
        java.lang.Object objExecute = c1128y.f12157o;
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
            java.lang.Integer num7 = c1128y.f12154l;
            java.lang.String str6 = c1128y.f12153k;
            str4 = c1128y.j;
            num6 = c1128y.f12152i;
            c1131z = c1128y.f12151h;
            com.google.common.util.concurrent.P.u0(objExecute);
            num4 = num7;
            str3 = str6;
        } else {
            if (i10 == 2) {
                Y4.C1131z c1131z3 = c1128y.f12151h;
                com.google.common.util.concurrent.P.u0(objExecute);
                c1131z = c1131z3;
                io.ktor.client.statement.HttpResponse httpResponse = (io.ktor.client.statement.HttpResponse) objExecute;
                value = httpResponse.getStatus().getValue();
                c1128y.f12151h = c1131z;
                c1128y.f12156n = value;
                c1128y.f12159q = 3;
                objExecute = io.ktor.client.statement.HttpResponseKt.bodyAsText$default(httpResponse, null, c1128y, 1, null);
                if (objExecute != aVar) {
                    i3 = value;
                    c1131z2 = c1131z;
                }
                return aVar;
            }
            if (i10 != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = c1128y.f12156n;
            c1131z2 = c1128y.f12151h;
            com.google.common.util.concurrent.P.u0(objExecute);
        }
        str5 = (java.lang.String) objExecute;
        if (200 > i3 && i3 < 300) {
            return c1131z2.f12165b.b(str5, com.kiptv.core.model.OSSearchResponse.INSTANCE.serializer());
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
                throw com.kiptv.core.model.C1934b0.f20741h;
            }
            if (500 <= i3 || i3 >= 600) {
                throw new com.kiptv.core.model.C1936c0(i3);
            }
            throw new com.kiptv.core.model.C1936c0(i3);
        }
        strG = c1131z2.g(str5);
        if (strG != null) {
            lowerCase = strG.toLowerCase(java.util.Locale.ROOT);
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
        com.kiptv.core.model.OSErrorResponse oSErrorResponseJ = c1131z2.j(str5);
        if (lowerCase.length() == 0) {
            lowerCase = "Quota exceeded";
        }
        throw new com.kiptv.core.model.C1932a0(lowerCase, oSErrorResponseJ != null ? oSErrorResponseJ.f19908e : null);
        io.ktor.client.HttpClient httpClient = c1131z.f12164a;
        java.lang.String str7 = c1131z.f12168e;
        if (str7 == null) {
            str7 = "https://api.opensubtitles.com/api/v1";
        }
        java.lang.String strConcat = str7.concat("/subtitles");
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, strConcat);
        c1131z.a(httpRequestBuilder, false);
        if (num6 != null) {
            io.ktor.client.request.UtilsKt.parameter(httpRequestBuilder, "tmdb_id", new java.lang.Integer(num6.intValue()));
        }
        if (str4 != null) {
            io.ktor.client.request.UtilsKt.parameter(httpRequestBuilder, "query", str4);
        }
        if (str3 != null) {
            io.ktor.client.request.UtilsKt.parameter(httpRequestBuilder, "type", str3);
        }
        if (num4 != null) {
            io.ktor.client.request.UtilsKt.parameter(httpRequestBuilder, "season_number", new java.lang.Integer(num4.intValue()));
        }
        if (num5 != null) {
            io.ktor.client.request.UtilsKt.parameter(httpRequestBuilder, "episode_number", new java.lang.Integer(num5.intValue()));
        }
        io.ktor.client.statement.HttpStatement httpStatementH = B2.a.h(io.ktor.http.HttpMethod.INSTANCE, httpRequestBuilder, httpRequestBuilder, httpClient);
        c1128y.f12151h = c1131z;
        c1128y.f12152i = null;
        c1128y.j = null;
        c1128y.f12153k = null;
        c1128y.f12154l = null;
        c1128y.f12155m = null;
        c1128y.f12159q = 2;
        objExecute = httpStatementH.execute(c1128y);
        if (objExecute != aVar) {
            io.ktor.client.statement.HttpResponse httpResponse2 = (io.ktor.client.statement.HttpResponse) objExecute;
            value = httpResponse2.getStatus().getValue();
            c1128y.f12151h = c1131z;
            c1128y.f12156n = value;
            c1128y.f12159q = 3;
            objExecute = io.ktor.client.statement.HttpResponseKt.bodyAsText$default(httpResponse2, null, c1128y, 1, null);
            if (objExecute != aVar) {
                i3 = value;
                c1131z2 = c1131z;
                str5 = (java.lang.String) objExecute;
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
                        throw com.kiptv.core.model.C1934b0.f20741h;
                    }
                    if (500 <= i3) {
                    }
                    throw new com.kiptv.core.model.C1936c0(i3);
                }
                strG = c1131z2.g(str5);
                if (strG != null) {
                    lowerCase = strG.toLowerCase(java.util.Locale.ROOT);
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
                com.kiptv.core.model.OSErrorResponse oSErrorResponseJ2 = c1131z2.j(str5);
                if (lowerCase.length() == 0) {
                    lowerCase = "Quota exceeded";
                }
                throw new com.kiptv.core.model.C1932a0(lowerCase, oSErrorResponseJ2 != null ? oSErrorResponseJ2.f19908e : null);
            }
        }
        return aVar;
    }

    public final com.kiptv.core.model.OSErrorResponse j(java.lang.String str) {
        try {
            p162s8.d dVar = this.f12165b;
            dVar.getClass();
            return (com.kiptv.core.model.OSErrorResponse) dVar.b(str, com.kiptv.core.model.OSErrorResponse.INSTANCE.serializer());
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
