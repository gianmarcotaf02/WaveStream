package K8;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements w8.H {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final java.util.List f6987w = com.google.common.util.concurrent.P.i0(w8.t.HTTP_1_1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w8.I f6988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.Random f6989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f6990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public K8.h f6991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f6992e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f6993f;
    public A8.j g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public K8.e f6994h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public K8.i f6995i;
    public K8.j j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final z8.b f6996k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public java.lang.String f6997l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public A8.n f6998m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final java.util.ArrayDeque f6999n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final java.util.ArrayDeque f7000o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f7001p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f7002q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f7003r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public java.lang.String f7004s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f7005t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f7006u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f7007v;

    public g(z8.c taskRunner, w8.v vVar, w8.I i3, java.util.Random random, long j, long j9) {
        kotlin.jvm.internal.m.e(taskRunner, "taskRunner");
        this.f6988a = i3;
        this.f6989b = random;
        this.f6990c = j;
        this.f6991d = null;
        this.f6992e = j9;
        this.f6996k = taskRunner.e();
        this.f6999n = new java.util.ArrayDeque();
        this.f7000o = new java.util.ArrayDeque();
        this.f7003r = -1;
        java.lang.String str = vVar.f30660b;
        if (!"GET".equals(str)) {
            throw new java.lang.IllegalArgumentException(p121o0.p.C("Request must be GET: ", str).toString());
        }
        M8.C0685m c0685m = M8.C0685m.f7261k;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        this.f6993f = B3.o.q(bArr, -1234567890).a();
    }

    public final void a(w8.B b9, A8.e eVar) {
        int i3 = b9.f30488k;
        if (i3 != 101) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected HTTP 101 response but was '");
            sb.append(i3);
            sb.append(' ');
            throw new java.net.ProtocolException(Y6.f.l(sb, b9.j, '\''));
        }
        java.lang.String strB = w8.B.b("Connection", b9);
        if (!"Upgrade".equalsIgnoreCase(strB)) {
            throw new java.net.ProtocolException(B2.a.i('\'', "Expected 'Connection' header value 'Upgrade' but was '", strB));
        }
        java.lang.String strB2 = w8.B.b("Upgrade", b9);
        if (!"websocket".equalsIgnoreCase(strB2)) {
            throw new java.net.ProtocolException(B2.a.i('\'', "Expected 'Upgrade' header value 'websocket' but was '", strB2));
        }
        java.lang.String strB3 = w8.B.b("Sec-WebSocket-Accept", b9);
        M8.C0685m c0685m = M8.C0685m.f7261k;
        java.lang.String strA = B3.o.j(this.f6993f + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").c("SHA-1").a();
        if (kotlin.jvm.internal.m.a(strA, strB3)) {
            if (eVar == null) {
                throw new java.net.ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new java.net.ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strA + "' but was '" + strB3 + '\'');
    }

    public final boolean b(int i3, java.lang.String str) {
        java.lang.String str2;
        synchronized (this) {
            M8.C0685m c0685mJ = null;
            try {
                if (i3 < 1000 || i3 >= 5000) {
                    str2 = "Code must be in range [1000,5000): " + i3;
                } else if ((1004 > i3 || i3 >= 1007) && (1015 > i3 || i3 >= 3000)) {
                    str2 = null;
                } else {
                    str2 = "Code " + i3 + " is reserved and may not be used.";
                }
                if (str2 != null) {
                    throw new java.lang.IllegalArgumentException(str2.toString());
                }
                if (str != null) {
                    M8.C0685m c0685m = M8.C0685m.f7261k;
                    c0685mJ = B3.o.j(str);
                    if (c0685mJ.f7262h.length > 123) {
                        throw new java.lang.IllegalArgumentException("reason.size() > 123: ".concat(str).toString());
                    }
                }
                if (!this.f7005t && !this.f7002q) {
                    this.f7002q = true;
                    this.f7000o.add(new K8.c(i3, c0685mJ));
                    f();
                    return true;
                }
                return false;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void c(java.lang.Exception exc, w8.B b9) {
        synchronized (this) {
            if (this.f7005t) {
                return;
            }
            this.f7005t = true;
            A8.n nVar = this.f6998m;
            this.f6998m = null;
            K8.i iVar = this.f6995i;
            this.f6995i = null;
            K8.j jVar = this.j;
            this.j = null;
            this.f6996k.e();
            try {
                this.f6988a.onFailure(this, exc, b9);
            } finally {
                if (nVar != null) {
                    x8.b.c(nVar);
                }
                if (iVar != null) {
                    x8.b.c(iVar);
                }
                if (jVar != null) {
                    x8.b.c(jVar);
                }
            }
        }
    }

    public final void d(java.lang.String name, A8.n nVar) {
        kotlin.jvm.internal.m.e(name, "name");
        K8.h hVar = this.f6991d;
        kotlin.jvm.internal.m.b(hVar);
        synchronized (this) {
            try {
                this.f6997l = name;
                this.f6998m = nVar;
                this.j = new K8.j(nVar.f426i, this.f6989b, hVar.f7008a, hVar.f7010c, this.f6992e);
                this.f6994h = new K8.e(this);
                long j = this.f6990c;
                if (j != 0) {
                    long nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(j);
                    this.f6996k.c(new K8.f(name.concat(" ping"), this, nanos), nanos);
                }
                if (!this.f7000o.isEmpty()) {
                    f();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        this.f6995i = new K8.i(nVar.f425h, this, hVar.f7008a, hVar.f7012e);
    }

    public final void e() {
        while (this.f7003r == -1) {
            K8.i iVar = this.f6995i;
            kotlin.jvm.internal.m.b(iVar);
            iVar.e();
            if (iVar.f7021p) {
                iVar.b();
            } else {
                int i3 = iVar.f7018m;
                if (i3 != 1 && i3 != 2) {
                    byte[] bArr = x8.b.f31716a;
                    java.lang.String hexString = java.lang.Integer.toHexString(i3);
                    kotlin.jvm.internal.m.d(hexString, "toHexString(this)");
                    throw new java.net.ProtocolException("Unknown opcode: ".concat(hexString));
                }
                while (true) {
                    if (!iVar.f7017l) {
                        long j = iVar.f7019n;
                        M8.C0682j c0682j = iVar.f7024s;
                        if (j > 0) {
                            iVar.f7014h.F(j, c0682j);
                        }
                        if (iVar.f7020o) {
                            if (iVar.f7022q) {
                                K8.a aVar = iVar.f7025t;
                                if (aVar == null) {
                                    aVar = new K8.a(iVar.f7016k, 1);
                                    iVar.f7025t = aVar;
                                }
                                M8.C0682j c0682j2 = aVar.j;
                                if (c0682j2.f7260i != 0) {
                                    throw new java.lang.IllegalArgumentException("Failed requirement.");
                                }
                                java.util.zip.Inflater inflater = (java.util.zip.Inflater) aVar.f6976k;
                                if (aVar.f6975i) {
                                    inflater.reset();
                                }
                                c0682j2.M(c0682j);
                                c0682j2.n(io.ktor.network.sockets.DatagramKt.MAX_DATAGRAM_SIZE);
                                long bytesRead = inflater.getBytesRead() + c0682j2.f7260i;
                                do {
                                    ((M8.u) aVar.f6977l).b(Long.MAX_VALUE, c0682j);
                                } while (inflater.getBytesRead() < bytesRead);
                            }
                            K8.g gVar = iVar.f7015i;
                            w8.I i9 = gVar.f6988a;
                            if (i3 != 1) {
                                M8.C0685m bytes = c0682j.z(c0682j.f7260i);
                                kotlin.jvm.internal.m.e(bytes, "bytes");
                                i9.onMessage(gVar, bytes);
                                break;
                            }
                            i9.onMessage(gVar, c0682j.T());
                            break;
                        }
                        while (!iVar.f7017l) {
                            iVar.e();
                            if (!iVar.f7021p) {
                                break;
                            } else {
                                iVar.b();
                            }
                        }
                        if (iVar.f7018m != 0) {
                            int i10 = iVar.f7018m;
                            byte[] bArr2 = x8.b.f31716a;
                            java.lang.String hexString2 = java.lang.Integer.toHexString(i10);
                            kotlin.jvm.internal.m.d(hexString2, "toHexString(this)");
                            throw new java.net.ProtocolException("Expected continuation opcode. Got: ".concat(hexString2));
                        }
                    } else {
                        throw new java.io.IOException("closed");
                    }
                }
            }
        }
    }

    public final void f() {
        byte[] bArr = x8.b.f31716a;
        K8.e eVar = this.f6994h;
        if (eVar != null) {
            this.f6996k.c(eVar, 0L);
        }
    }

    public final synchronized boolean g(int i3, M8.C0685m c0685m) {
        if (!this.f7005t && !this.f7002q) {
            long j = this.f7001p;
            byte[] bArr = c0685m.f7262h;
            if (((long) bArr.length) + j > 16777216) {
                b(1001, null);
                return false;
            }
            this.f7001p = j + ((long) bArr.length);
            this.f7000o.add(new K8.d(i3, c0685m));
            f();
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007a A[Catch: all -> 0x0086, TRY_ENTER, TryCatch #0 {all -> 0x0086, blocks: (B:28:0x007a, B:31:0x0089, B:33:0x008d, B:34:0x0099, B:36:0x00a5, B:39:0x00a9, B:40:0x00aa, B:41:0x00ab, B:43:0x00af, B:73:0x0121, B:75:0x0125, B:84:0x013e, B:85:0x0140, B:61:0x00da, B:65:0x00ff, B:66:0x0108, B:62:0x00ee, B:67:0x0109, B:69:0x0113, B:70:0x0116, B:86:0x0141, B:87:0x0146, B:35:0x009a, B:72:0x011e), top: B:97:0x0078, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0089 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:28:0x007a, B:31:0x0089, B:33:0x008d, B:34:0x0099, B:36:0x00a5, B:39:0x00a9, B:40:0x00aa, B:41:0x00ab, B:43:0x00af, B:73:0x0121, B:75:0x0125, B:84:0x013e, B:85:0x0140, B:61:0x00da, B:65:0x00ff, B:66:0x0108, B:62:0x00ee, B:67:0x0109, B:69:0x0113, B:70:0x0116, B:86:0x0141, B:87:0x0146, B:35:0x009a, B:72:0x011e), top: B:97:0x0078, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x008d A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:28:0x007a, B:31:0x0089, B:33:0x008d, B:34:0x0099, B:36:0x00a5, B:39:0x00a9, B:40:0x00aa, B:41:0x00ab, B:43:0x00af, B:73:0x0121, B:75:0x0125, B:84:0x013e, B:85:0x0140, B:61:0x00da, B:65:0x00ff, B:66:0x0108, B:62:0x00ee, B:67:0x0109, B:69:0x0113, B:70:0x0116, B:86:0x0141, B:87:0x0146, B:35:0x009a, B:72:0x011e), top: B:97:0x0078, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ab A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:28:0x007a, B:31:0x0089, B:33:0x008d, B:34:0x0099, B:36:0x00a5, B:39:0x00a9, B:40:0x00aa, B:41:0x00ab, B:43:0x00af, B:73:0x0121, B:75:0x0125, B:84:0x013e, B:85:0x0140, B:61:0x00da, B:65:0x00ff, B:66:0x0108, B:62:0x00ee, B:67:0x0109, B:69:0x0113, B:70:0x0116, B:86:0x0141, B:87:0x0146, B:35:0x009a, B:72:0x011e), top: B:97:0x0078, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00af A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:28:0x007a, B:31:0x0089, B:33:0x008d, B:34:0x0099, B:36:0x00a5, B:39:0x00a9, B:40:0x00aa, B:41:0x00ab, B:43:0x00af, B:73:0x0121, B:75:0x0125, B:84:0x013e, B:85:0x0140, B:61:0x00da, B:65:0x00ff, B:66:0x0108, B:62:0x00ee, B:67:0x0109, B:69:0x0113, B:70:0x0116, B:86:0x0141, B:87:0x0146, B:35:0x009a, B:72:0x011e), top: B:97:0x0078, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00be  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ee A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:28:0x007a, B:31:0x0089, B:33:0x008d, B:34:0x0099, B:36:0x00a5, B:39:0x00a9, B:40:0x00aa, B:41:0x00ab, B:43:0x00af, B:73:0x0121, B:75:0x0125, B:84:0x013e, B:85:0x0140, B:61:0x00da, B:65:0x00ff, B:66:0x0108, B:62:0x00ee, B:67:0x0109, B:69:0x0113, B:70:0x0116, B:86:0x0141, B:87:0x0146, B:35:0x009a, B:72:0x011e), top: B:97:0x0078, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ff A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:28:0x007a, B:31:0x0089, B:33:0x008d, B:34:0x0099, B:36:0x00a5, B:39:0x00a9, B:40:0x00aa, B:41:0x00ab, B:43:0x00af, B:73:0x0121, B:75:0x0125, B:84:0x013e, B:85:0x0140, B:61:0x00da, B:65:0x00ff, B:66:0x0108, B:62:0x00ee, B:67:0x0109, B:69:0x0113, B:70:0x0116, B:86:0x0141, B:87:0x0146, B:35:0x009a, B:72:0x011e), top: B:97:0x0078, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0113 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:28:0x007a, B:31:0x0089, B:33:0x008d, B:34:0x0099, B:36:0x00a5, B:39:0x00a9, B:40:0x00aa, B:41:0x00ab, B:43:0x00af, B:73:0x0121, B:75:0x0125, B:84:0x013e, B:85:0x0140, B:61:0x00da, B:65:0x00ff, B:66:0x0108, B:62:0x00ee, B:67:0x0109, B:69:0x0113, B:70:0x0116, B:86:0x0141, B:87:0x0146, B:35:0x009a, B:72:0x011e), top: B:97:0x0078, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0125 A[Catch: all -> 0x0086, TRY_LEAVE, TryCatch #0 {all -> 0x0086, blocks: (B:28:0x007a, B:31:0x0089, B:33:0x008d, B:34:0x0099, B:36:0x00a5, B:39:0x00a9, B:40:0x00aa, B:41:0x00ab, B:43:0x00af, B:73:0x0121, B:75:0x0125, B:84:0x013e, B:85:0x0140, B:61:0x00da, B:65:0x00ff, B:66:0x0108, B:62:0x00ee, B:67:0x0109, B:69:0x0113, B:70:0x0116, B:86:0x0141, B:87:0x0146, B:35:0x009a, B:72:0x011e), top: B:97:0x0078, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x012f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0134  */
    /* JADX WARN: Code duplicated, block: B:81:0x0139  */
    /* JADX WARN: Code duplicated, block: B:86:0x0141 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:28:0x007a, B:31:0x0089, B:33:0x008d, B:34:0x0099, B:36:0x00a5, B:39:0x00a9, B:40:0x00aa, B:41:0x00ab, B:43:0x00af, B:73:0x0121, B:75:0x0125, B:84:0x013e, B:85:0x0140, B:61:0x00da, B:65:0x00ff, B:66:0x0108, B:62:0x00ee, B:67:0x0109, B:69:0x0113, B:70:0x0116, B:86:0x0141, B:87:0x0146, B:35:0x009a, B:72:0x011e), top: B:97:0x0078, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x009a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:62:0x00ee, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final boolean h() {
        java.lang.Object objPoll;
        java.lang.String str;
        int i3;
        ?? r9;
        ?? r10;
        ?? r11;
        int i9;
        M8.C0685m c0685m;
        M8.C0685m c0685mZ;
        M8.C0682j c0682j;
        K8.d dVar;
        synchronized (this) {
            try {
                if (this.f7005t) {
                    return false;
                }
                K8.j jVar = this.j;
                java.lang.Object objPoll2 = this.f6999n.poll();
                java.lang.String str2 = null;
                try {
                    if (objPoll2 == null) {
                        objPoll = this.f7000o.poll();
                        if (objPoll instanceof K8.c) {
                            i3 = this.f7003r;
                            str = this.f7004s;
                            if (i3 != -1) {
                                A8.n nVar = this.f6998m;
                                this.f6998m = null;
                                K8.i iVar = this.f6995i;
                                this.f6995i = null;
                                K8.j jVar2 = this.j;
                                this.j = null;
                                this.f6996k.e();
                                r9 = nVar;
                                r11 = iVar;
                                r10 = jVar2;
                            } else {
                                ((K8.c) objPoll).getClass();
                                this.f6996k.c(new K8.e(this.f6997l + " cancel", this), java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(60000L));
                                r9 = 0;
                                r11 = 0;
                                r10 = 0;
                            }
                        } else {
                            if (objPoll == null) {
                                return false;
                            }
                            str = null;
                        }
                        if (objPoll2 != null) {
                            kotlin.jvm.internal.m.b(jVar);
                            jVar.b(10, (M8.C0685m) objPoll2);
                        } else if (objPoll instanceof K8.d) {
                            dVar = (K8.d) objPoll;
                            kotlin.jvm.internal.m.b(jVar);
                            jVar.e(dVar.f6981a, dVar.f6982b);
                            synchronized (this) {
                                this.f7001p -= (long) dVar.f6982b.f7262h.length;
                            }
                        } else {
                            if (objPoll instanceof K8.c) {
                                throw new java.lang.AssertionError();
                            }
                            K8.c cVar = (K8.c) objPoll;
                            kotlin.jvm.internal.m.b(jVar);
                            i9 = cVar.f6979a;
                            c0685m = cVar.f6980b;
                            c0685mZ = M8.C0685m.f7261k;
                            if (i9 == 0 || c0685m != null) {
                                if (i9 != 0) {
                                    if (i9 >= 1000 || i9 >= 5000) {
                                        str2 = "Code must be in range [1000,5000): " + i9;
                                    } else if ((1004 <= i9 && i9 < 1007) || (1015 <= i9 && i9 < 3000)) {
                                        str2 = "Code " + i9 + " is reserved and may not be used.";
                                    }
                                    if (str2 != null) {
                                        throw new java.lang.IllegalArgumentException(str2.toString());
                                    }
                                }
                                c0682j = new M8.C0682j();
                                c0682j.b0(i9);
                                if (c0685m != null) {
                                    c0682j.X(c0685m);
                                }
                                c0685mZ = c0682j.z(c0682j.f7260i);
                            }
                            try {
                                jVar.b(8, c0685mZ);
                                jVar.f7033o = true;
                                if (r9 != 0) {
                                    w8.I i10 = this.f6988a;
                                    kotlin.jvm.internal.m.b(str);
                                    i10.onClosed(this, i3, str);
                                }
                            } catch (java.lang.Throwable th) {
                                jVar.f7033o = true;
                                throw th;
                            }
                        }
                        if (r9 != 0) {
                            x8.b.c(r9);
                        }
                        if (r11 != 0) {
                            x8.b.c(r11);
                        }
                        if (r10 != 0) {
                            x8.b.c(r10);
                        }
                        return true;
                    }
                    objPoll = null;
                    str = null;
                    if (objPoll2 != null) {
                        kotlin.jvm.internal.m.b(jVar);
                        jVar.b(10, (M8.C0685m) objPoll2);
                    } else if (objPoll instanceof K8.d) {
                        dVar = (K8.d) objPoll;
                        kotlin.jvm.internal.m.b(jVar);
                        jVar.e(dVar.f6981a, dVar.f6982b);
                        synchronized (this) {
                            this.f7001p -= (long) dVar.f6982b.f7262h.length;
                        }
                    } else {
                        if (objPoll instanceof K8.c) {
                            throw new java.lang.AssertionError();
                        }
                        K8.c cVar2 = (K8.c) objPoll;
                        kotlin.jvm.internal.m.b(jVar);
                        i9 = cVar2.f6979a;
                        c0685m = cVar2.f6980b;
                        c0685mZ = M8.C0685m.f7261k;
                        if (i9 == 0) {
                            if (i9 != 0) {
                                if (i9 >= 1000) {
                                    str2 = "Code must be in range [1000,5000): " + i9;
                                } else {
                                    str2 = "Code must be in range [1000,5000): " + i9;
                                }
                                if (str2 != null) {
                                    throw new java.lang.IllegalArgumentException(str2.toString());
                                }
                            }
                            c0682j = new M8.C0682j();
                            c0682j.b0(i9);
                            if (c0685m != null) {
                                c0682j.X(c0685m);
                            }
                            c0685mZ = c0682j.z(c0682j.f7260i);
                        } else {
                            if (i9 != 0) {
                                if (i9 >= 1000) {
                                    str2 = "Code must be in range [1000,5000): " + i9;
                                } else {
                                    str2 = "Code must be in range [1000,5000): " + i9;
                                }
                                if (str2 != null) {
                                    throw new java.lang.IllegalArgumentException(str2.toString());
                                }
                            }
                            c0682j = new M8.C0682j();
                            c0682j.b0(i9);
                            if (c0685m != null) {
                                c0682j.X(c0685m);
                            }
                            c0685mZ = c0682j.z(c0682j.f7260i);
                        }
                        jVar.b(8, c0685mZ);
                        jVar.f7033o = true;
                        if (r9 != 0) {
                            w8.I i11 = this.f6988a;
                            kotlin.jvm.internal.m.b(str);
                            i11.onClosed(this, i3, str);
                        }
                    }
                    if (r9 != 0) {
                        x8.b.c(r9);
                    }
                    if (r11 != 0) {
                        x8.b.c(r11);
                    }
                    if (r10 != 0) {
                        x8.b.c(r10);
                    }
                    return true;
                } catch (java.lang.Throwable th2) {
                    if (r9 != 0) {
                        x8.b.c(r9);
                    }
                    if (r11 != 0) {
                        x8.b.c(r11);
                    }
                    if (r10 != 0) {
                        x8.b.c(r10);
                    }
                    throw th2;
                }
                java.lang.String str3 = str;
                java.lang.String str4 = str3;
                i3 = -1;
                r9 = str4;
                r11 = str3;
                r10 = str4;
            } catch (java.lang.Throwable th3) {
                throw th3;
            }
        }
    }
}
