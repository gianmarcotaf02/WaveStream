package Y4;

/* JADX INFO: renamed from: Y4.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1105q {
    public static final Y4.C1084j Companion = new Y4.C1084j();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final O7.o f12039e = new O7.o("^/(live|movie|series)/([^/]+)/([^/]+)/(\\d+)\\.\\w+$");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final O7.o f12040f = new O7.o("^/([^/]+)/([^/]+)/(\\d+)$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io.ktor.client.HttpClient f12041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.Set f12042b = p078i6.m.F0(new java.lang.String[]{io.sentry.rrweb.RRWebVideoEvent.REPLAY_CONTAINER, "mkv", "avi", "mov", "wmv", "webm", "m4v", "mpg", "mpeg", "3gp", "ogv"});

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.List f12043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.LinkedHashSet f12044d;

    public C1105q(io.ktor.client.HttpClient httpClient, p162s8.d dVar) {
        this.f12041a = httpClient;
        O7.p[] pVarArr = O7.p.f8061h;
        this.f12043c = p078i6.p.B0(new O7.o("S(\\d{1,2})\\s?E(\\d{1,4})", 0), new O7.o("Season\\s*(\\d{1,2}).*?Episode\\s*(\\d{1,4})", 0), new O7.o("Stagione\\s*(\\d{1,2}).*?Episodio\\s*(\\d{1,4})", 0), new O7.o("Staffel\\s*(\\d{1,2}).*?Folge\\s*(\\d{1,4})", 0), new O7.o("Temporada\\s*(\\d{1,2}).*?Episodio\\s*(\\d{1,4})", 0), new O7.o("Saison\\s*(\\d{1,2}).*?Episode\\s*(\\d{1,4})", 0));
        this.f12044d = new java.util.LinkedHashSet();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
    
        if (r7 == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(Y4.C1105q c1105q, java.lang.String str, p117n6.c cVar) throws com.kiptv.core.model.O, com.kiptv.core.model.P {
        Y4.C1096n c1096n;
        c1105q.getClass();
        if (cVar instanceof Y4.C1096n) {
            c1096n = (Y4.C1096n) cVar;
            int i3 = c1096n.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1096n.j = i3 - Integer.MIN_VALUE;
            } else {
                c1096n = new Y4.C1096n(c1105q, cVar);
            }
        } else {
            c1096n = new Y4.C1096n(c1105q, cVar);
        }
        java.lang.Object objExecute = c1096n.f11997h;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c1096n.j;
        if (i9 != 0) {
            if (i9 == 1) {
                com.google.common.util.concurrent.P.u0(objExecute);
            } else {
                if (i9 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.common.util.concurrent.P.u0(objExecute);
            }
            java.lang.String str2 = (java.lang.String) objExecute;
            if (O7.q.N0(str2)) {
                throw com.kiptv.core.model.P.f20013h;
            }
            return str2;
        }
        com.google.common.util.concurrent.P.u0(objExecute);
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, str);
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getGet());
        io.ktor.client.statement.HttpStatement httpStatement = new io.ktor.client.statement.HttpStatement(httpRequestBuilder, c1105q.f12041a);
        c1096n.j = 1;
        objExecute = httpStatement.execute(c1096n);
        if (objExecute != aVar) {
        }
        return aVar;
        io.ktor.client.statement.HttpResponse httpResponse = (io.ktor.client.statement.HttpResponse) objExecute;
        int value = httpResponse.getStatus().getValue();
        if (value >= 400) {
            throw new com.kiptv.core.model.O(value);
        }
        c1096n.j = 2;
        objExecute = io.ktor.client.statement.HttpResponseKt.bodyAsText$default(httpResponse, null, c1096n, 1, null);
    }

    public static java.lang.String b(java.lang.String input, java.lang.String str) {
        java.lang.String pattern = str.concat("=\"([^\"]*)\"");
        O7.p[] pVarArr = O7.p.f8061h;
        kotlin.jvm.internal.m.e(pattern, "pattern");
        java.util.regex.Pattern patternCompile = java.util.regex.Pattern.compile(pattern, 66);
        kotlin.jvm.internal.m.d(patternCompile, "compile(...)");
        kotlin.jvm.internal.m.e(input, "input");
        java.util.regex.Matcher matcher = patternCompile.matcher(input);
        kotlin.jvm.internal.m.d(matcher, "matcher(...)");
        O7.m mVarG = p199y3.e.g(matcher, 0, input);
        if (mVarG != null) {
            java.lang.String str2 = (java.lang.String) ((O7.k) mVarG.a()).get(1);
            if (str2.length() != 0) {
                return str2;
            }
        }
        return null;
    }

    public static p070h6.k e(java.lang.String str) {
        int iK0 = O7.q.K0(str, ':', 0, 6);
        if (iK0 < 0 || iK0 == str.length() - 1) {
            return null;
        }
        java.lang.String strSubstring = str.substring(iK0 + 1);
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        java.lang.String string = O7.q.r1(strSubstring).toString();
        int iK1 = O7.q.K0(string, '=', 0, 6);
        if (iK1 <= 0 || iK1 == string.length() - 1) {
            return null;
        }
        java.lang.String strSubstring2 = string.substring(0, iK1);
        kotlin.jvm.internal.m.d(strSubstring2, "substring(...)");
        java.lang.String lowerCase = O7.q.r1(strSubstring2).toString().toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
        java.lang.String strSubstring3 = string.substring(iK1 + 1);
        kotlin.jvm.internal.m.d(strSubstring3, "substring(...)");
        java.lang.String strS1 = O7.q.s1(O7.q.r1(strSubstring3).toString(), '\"');
        if (lowerCase.length() == 0 || strS1.length() == 0) {
            return null;
        }
        return new p070h6.k(lowerCase, strS1);
    }

    public static java.lang.String f(java.lang.String str) {
        return java.lang.String.valueOf(Y4.C1084j.a(Companion, "cat_".concat(str)));
    }

    public final p070h6.k c(java.lang.String str) {
        java.lang.Integer numZ0;
        java.lang.Integer numZ1;
        java.util.Iterator it = this.f12043c.iterator();
        while (it.hasNext()) {
            O7.m mVarA = ((O7.o) it.next()).a(str);
            if (mVarA != null && (numZ0 = O7.x.z0((java.lang.String) ((O7.k) mVarA.a()).get(1))) != null && (numZ1 = O7.x.z0((java.lang.String) ((O7.k) mVarA.a()).get(2))) != null) {
                return new p070h6.k(numZ0, numZ1);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0209  */
    /* JADX WARN: Code duplicated, block: B:146:0x02c3 A[PHI: r0
  0x02c3: PHI (r0v22 java.lang.String) = (r0v21 java.lang.String), (r0v24 java.lang.String) binds: [B:150:0x02e1, B:144:0x02be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:155:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:156:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:158:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:159:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:165:0x0304  */
    /* JADX WARN: Code duplicated, block: B:166:0x0309  */
    /* JADX WARN: Code duplicated, block: B:169:0x031a  */
    /* JADX WARN: Code duplicated, block: B:171:0x032c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:174:0x0335  */
    /* JADX WARN: Code duplicated, block: B:177:0x01c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x00de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x01bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x021b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:38:0x010f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0114  */
    /* JADX WARN: Code duplicated, block: B:46:0x0121  */
    /* JADX WARN: Code duplicated, block: B:50:0x012b  */
    /* JADX WARN: Code duplicated, block: B:53:0x0132  */
    /* JADX WARN: Code duplicated, block: B:54:0x0134  */
    /* JADX WARN: Code duplicated, block: B:56:0x0140  */
    /* JADX WARN: Code duplicated, block: B:58:0x014b  */
    /* JADX WARN: Code duplicated, block: B:60:0x0154  */
    /* JADX WARN: Code duplicated, block: B:63:0x0164  */
    /* JADX WARN: Code duplicated, block: B:66:0x016d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0176  */
    /* JADX WARN: Code duplicated, block: B:72:0x017d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0184  */
    /* JADX WARN: Code duplicated, block: B:76:0x0187  */
    /* JADX WARN: Code duplicated, block: B:79:0x018e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x0190  */
    /* JADX WARN: Code duplicated, block: B:82:0x0199  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:87:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:95:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:96:0x01db  */
    /* JADX WARN: Code duplicated, block: B:98:0x01df  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1, types: [int] */
    /* JADX WARN: Type inference failed for: r18v30 */
    /* JADX WARN: Type inference failed for: r18v31 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v56 */
    /* JADX WARN: Type inference failed for: r4v57 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:170:0x032a -> B:172:0x032d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:174:0x0335 -> B:173:0x032f). Please report as a decompilation issue!!! */
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

    public final int g(java.lang.String str) {
        int iA = Y4.C1084j.a(Companion, str);
        while (true) {
            java.util.LinkedHashSet linkedHashSet = this.f12044d;
            if (!linkedHashSet.contains(java.lang.Integer.valueOf(iA))) {
                linkedHashSet.add(java.lang.Integer.valueOf(iA));
                return iA;
            }
            iA++;
        }
    }
}
