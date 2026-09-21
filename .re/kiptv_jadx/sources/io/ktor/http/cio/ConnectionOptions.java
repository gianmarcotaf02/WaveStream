package io.ktor.http.cio;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\f\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lio/ktor/http/cio/ConnectionOptions;", "", "", "close", "keepAlive", "upgrade", "", "", "extraOptions", "<init>", "(ZZZLjava/util/List;)V", "toString", "()Ljava/lang/String;", "buildToString", io.sentry.protocol.Request.JsonKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Z", "getClose", "()Z", "getKeepAlive", "getUpgrade", "Ljava/util/List;", "getExtraOptions", "()Ljava/util/List;", "Companion", "ktor-http-cio"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ConnectionOptions {
    private static final io.ktor.http.cio.ConnectionOptions Close;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final io.ktor.http.cio.ConnectionOptions.Companion INSTANCE = new io.ktor.http.cio.ConnectionOptions.Companion(null);
    private static final io.ktor.http.cio.ConnectionOptions KeepAlive;
    private static final io.ktor.http.cio.ConnectionOptions Upgrade;
    private static final io.ktor.http.cio.internals.AsciiCharTree<p070h6.k> knownTypes;
    private final boolean close;
    private final java.util.List<java.lang.String> extraOptions;
    private final boolean keepAlive;
    private final boolean upgrade;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\bR\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0010\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR&\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00060\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lio/ktor/http/cio/ConnectionOptions$Companion;", "", "<init>", "()V", "", "connection", "Lio/ktor/http/cio/ConnectionOptions;", "parseSlow", "(Ljava/lang/CharSequence;)Lio/ktor/http/cio/ConnectionOptions;", "parse", "Close", "Lio/ktor/http/cio/ConnectionOptions;", "getClose", "()Lio/ktor/http/cio/ConnectionOptions;", "KeepAlive", "getKeepAlive", "Upgrade", "getUpgrade", "Lio/ktor/http/cio/internals/AsciiCharTree;", "Lh6/k;", "", "knownTypes", "Lio/ktor/http/cio/internals/AsciiCharTree;", "ktor-http-cio"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean parse$lambda$0(char c9, int i3) {
            return false;
        }

        private final io.ktor.http.cio.ConnectionOptions parseSlow(java.lang.CharSequence connection) {
            int length = connection.length();
            io.ktor.http.cio.ConnectionOptions keepAlive = null;
            java.util.ArrayList arrayList = null;
            int i3 = 0;
            int i9 = 0;
            while (i3 < length) {
                while (true) {
                    char cCharAt = connection.charAt(i3);
                    if (cCharAt != ' ' && cCharAt != ',') {
                        i9 = i3;
                        i3 = i9;
                        break;
                    }
                    i3++;
                    if (i3 >= length) {
                        i3 = i3;
                        break;
                    }
                }
                while (i3 < length) {
                    char cCharAt2 = connection.charAt(i3);
                    if (cCharAt2 == ' ' || cCharAt2 == ',') {
                        break;
                    }
                    i3++;
                }
                p070h6.k kVar = (p070h6.k) p078i6.o.F1(io.ktor.http.cio.ConnectionOptions.knownTypes.search(connection, i9, i3, true, new p011b1.y(15)));
                if (kVar == null) {
                    if (arrayList == null) {
                        arrayList = new java.util.ArrayList();
                    }
                    arrayList.add(connection.subSequence(i9, i3).toString());
                } else {
                    java.lang.Object obj = kVar.f22540i;
                    if (keepAlive == null) {
                        keepAlive = (io.ktor.http.cio.ConnectionOptions) obj;
                    } else {
                        boolean z6 = true;
                        boolean z9 = keepAlive.getClose() || ((io.ktor.http.cio.ConnectionOptions) obj).getClose();
                        boolean z10 = keepAlive.getKeepAlive() || ((io.ktor.http.cio.ConnectionOptions) obj).getKeepAlive();
                        if (!keepAlive.getUpgrade() && !((io.ktor.http.cio.ConnectionOptions) obj).getUpgrade()) {
                            z6 = false;
                        }
                        keepAlive = new io.ktor.http.cio.ConnectionOptions(z9, z10, z6, p078i6.w.f23205h);
                    }
                }
            }
            if (keepAlive == null) {
                keepAlive = getKeepAlive();
            }
            return arrayList == null ? keepAlive : new io.ktor.http.cio.ConnectionOptions(keepAlive.getClose(), keepAlive.getKeepAlive(), keepAlive.getUpgrade(), arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean parseSlow$lambda$1(char c9, int i3) {
            return false;
        }

        public final io.ktor.http.cio.ConnectionOptions getClose() {
            return io.ktor.http.cio.ConnectionOptions.Close;
        }

        public final io.ktor.http.cio.ConnectionOptions getKeepAlive() {
            return io.ktor.http.cio.ConnectionOptions.KeepAlive;
        }

        public final io.ktor.http.cio.ConnectionOptions getUpgrade() {
            return io.ktor.http.cio.ConnectionOptions.Upgrade;
        }

        public final io.ktor.http.cio.ConnectionOptions parse(java.lang.CharSequence connection) {
            if (connection == null) {
                return null;
            }
            java.util.List listSearch$default = io.ktor.http.cio.internals.AsciiCharTree.search$default(io.ktor.http.cio.ConnectionOptions.knownTypes, connection, 0, 0, true, new p011b1.y(16), 6, null);
            return listSearch$default.size() == 1 ? (io.ktor.http.cio.ConnectionOptions) ((p070h6.k) listSearch$default.get(0)).f22540i : parseSlow(connection);
        }

        private Companion() {
        }
    }

    static {
        boolean z6 = false;
        io.ktor.http.cio.ConnectionOptions connectionOptions = new io.ktor.http.cio.ConnectionOptions(true, z6, false, null, 14, null);
        Close = connectionOptions;
        boolean z9 = false;
        io.ktor.http.cio.ConnectionOptions connectionOptions2 = new io.ktor.http.cio.ConnectionOptions(z6, true, z9, null, 13, null);
        KeepAlive = connectionOptions2;
        io.ktor.http.cio.ConnectionOptions connectionOptions3 = new io.ktor.http.cio.ConnectionOptions(false, z9, true, null, 11, null);
        Upgrade = connectionOptions3;
        knownTypes = io.ktor.http.cio.internals.AsciiCharTree.INSTANCE.build(p078i6.p.B0(new p070h6.k("close", connectionOptions), new p070h6.k("keep-alive", connectionOptions2), new p070h6.k("upgrade", connectionOptions3)), new io.ktor.http.b(5), new p011b1.y(14));
    }

    public ConnectionOptions() {
        this(false, false, false, null, 15, null);
    }

    private final java.lang.String buildToString() throws java.io.IOException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.ArrayList arrayList = new java.util.ArrayList(this.extraOptions.size() + 3);
        if (this.close) {
            arrayList.add("close");
        }
        if (this.keepAlive) {
            arrayList.add("keep-alive");
        }
        if (this.upgrade) {
            arrayList.add("Upgrade");
        }
        if (!this.extraOptions.isEmpty()) {
            arrayList.addAll(this.extraOptions);
        }
        p078i6.o.n1(arrayList, sb, null, null, null, null, 126);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int knownTypes$lambda$1(p070h6.k it) {
        kotlin.jvm.internal.m.e(it, "it");
        return ((java.lang.String) it.f22539h).length();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final char knownTypes$lambda$2(p070h6.k t9, int i3) {
        kotlin.jvm.internal.m.e(t9, "t");
        return ((java.lang.String) t9.f22539h).charAt(i3);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || io.ktor.http.cio.ConnectionOptions.class != other.getClass()) {
            return false;
        }
        io.ktor.http.cio.ConnectionOptions connectionOptions = (io.ktor.http.cio.ConnectionOptions) other;
        return this.close == connectionOptions.close && this.keepAlive == connectionOptions.keepAlive && this.upgrade == connectionOptions.upgrade && kotlin.jvm.internal.m.a(this.extraOptions, connectionOptions.extraOptions);
    }

    public final boolean getClose() {
        return this.close;
    }

    public final java.util.List<java.lang.String> getExtraOptions() {
        return this.extraOptions;
    }

    public final boolean getKeepAlive() {
        return this.keepAlive;
    }

    public final boolean getUpgrade() {
        return this.upgrade;
    }

    public int hashCode() {
        return this.extraOptions.hashCode() + p121o0.p.f(p121o0.p.f(java.lang.Boolean.hashCode(this.close) * 31, 31, this.keepAlive), 31, this.upgrade);
    }

    public java.lang.String toString() {
        if (!this.extraOptions.isEmpty()) {
            return buildToString();
        }
        boolean z6 = this.close;
        if (z6 && !this.keepAlive && !this.upgrade) {
            return "close";
        }
        if (z6 || !this.keepAlive || this.upgrade) {
            return (!z6 && this.keepAlive && this.upgrade) ? "keep-alive, Upgrade" : buildToString();
        }
        return "keep-alive";
    }

    public ConnectionOptions(boolean z6, boolean z9, boolean z10, java.util.List<java.lang.String> extraOptions) {
        kotlin.jvm.internal.m.e(extraOptions, "extraOptions");
        this.close = z6;
        this.keepAlive = z9;
        this.upgrade = z10;
        this.extraOptions = extraOptions;
    }

    public /* synthetic */ ConnectionOptions(boolean z6, boolean z9, boolean z10, java.util.List list, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this((i3 & 1) != 0 ? false : z6, (i3 & 2) != 0 ? false : z9, (i3 & 4) != 0 ? false : z10, (i3 & 8) != 0 ? p078i6.w.f23205h : list);
    }
}
