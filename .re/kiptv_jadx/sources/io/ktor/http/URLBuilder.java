package io.ktor.http;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 R2\u00020\u0001:\u0001RBm\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u001fR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R*\u0010\u0007\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010+\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00101\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010\u001c\u001a\u0004\b2\u0010\u0014\"\u0004\b3\u0010\u001fR$\u00104\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010\u001c\u001a\u0004\b5\u0010\u0014\"\u0004\b6\u0010\u001fR\"\u00107\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010\u001c\u001a\u0004\b8\u0010\u0014\"\u0004\b9\u0010\u001fR(\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R*\u0010A\u001a\u00020@2\u0006\u0010%\u001a\u00020@8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010\r\u001a\u00020@2\u0006\u0010%\u001a\u00020@8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\r\u0010B\u001a\u0004\bG\u0010DR$\u0010\u0003\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bH\u0010.\"\u0004\bI\u00100R(\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010%\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bJ\u0010\u0014\"\u0004\bK\u0010\u001fR(\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010%\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bL\u0010\u0014\"\u0004\bM\u0010\u001fR$\u0010\u000e\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bN\u0010\u0014\"\u0004\bO\u0010\u001fR0\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bP\u0010=\"\u0004\bQ\u0010?¨\u0006S"}, d2 = {"Lio/ktor/http/URLBuilder;", "", "Lio/ktor/http/URLProtocol;", "protocol", "", com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker.HOST_KEY, "", "port", io.sentry.SentryBaseEvent.JsonKeys.USER, "password", "", "pathSegments", "Lio/ktor/http/Parameters;", "parameters", io.sentry.protocol.Request.JsonKeys.FRAGMENT, "", "trailingQuery", "<init>", "(Lio/ktor/http/URLProtocol;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/ktor/http/Parameters;Ljava/lang/String;Z)V", "buildString", "()Ljava/lang/String;", "toString", "Lio/ktor/http/Url;", io.sentry.protocol.OperatingSystem.JsonKeys.BUILD, "()Lio/ktor/http/Url;", "Lh6/A;", "applyOrigin", "()V", "Ljava/lang/String;", "getHost", "setHost", "(Ljava/lang/String;)V", "Z", "getTrailingQuery", "()Z", "setTrailingQuery", "(Z)V", "value", "I", "getPort", "()I", "setPort", "(I)V", "protocolOrNull", "Lio/ktor/http/URLProtocol;", "getProtocolOrNull", "()Lio/ktor/http/URLProtocol;", "setProtocolOrNull", "(Lio/ktor/http/URLProtocol;)V", "encodedUser", "getEncodedUser", "setEncodedUser", "encodedPassword", "getEncodedPassword", "setEncodedPassword", "encodedFragment", "getEncodedFragment", "setEncodedFragment", "encodedPathSegments", "Ljava/util/List;", "getEncodedPathSegments", "()Ljava/util/List;", "setEncodedPathSegments", "(Ljava/util/List;)V", "Lio/ktor/http/ParametersBuilder;", "encodedParameters", "Lio/ktor/http/ParametersBuilder;", "getEncodedParameters", "()Lio/ktor/http/ParametersBuilder;", "setEncodedParameters", "(Lio/ktor/http/ParametersBuilder;)V", "getParameters", "getProtocol", "setProtocol", "getUser", "setUser", "getPassword", "setPassword", "getFragment", "setFragment", "getPathSegments", "setPathSegments", "Companion", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class URLBuilder {
    private static final int INITIAL_CAPACITY = 256;
    private static final io.ktor.http.Url originUrl;
    private java.lang.String encodedFragment;
    private io.ktor.http.ParametersBuilder encodedParameters;
    private java.lang.String encodedPassword;
    private java.util.List<java.lang.String> encodedPathSegments;
    private java.lang.String encodedUser;
    private java.lang.String host;
    private io.ktor.http.ParametersBuilder parameters;
    private int port;
    private io.ktor.http.URLProtocol protocolOrNull;
    private boolean trailingQuery;

    static {
        io.ktor.http.URLBuilder.Companion companion = new io.ktor.http.URLBuilder.Companion(null);
        INSTANCE = companion;
        originUrl = io.ktor.http.URLUtilsKt.Url(io.ktor.http.URLBuilderJvmKt.getOrigin(companion));
    }

    public URLBuilder() {
        this(null, null, 0, null, null, null, null, null, false, 511, null);
    }

    private final void applyOrigin() {
        if (this.host.length() <= 0 && !kotlin.jvm.internal.m.a(getProtocol().getName(), "file")) {
            io.ktor.http.Url url = originUrl;
            this.host = url.getHost();
            if (this.protocolOrNull == null) {
                this.protocolOrNull = url.getProtocolOrNull();
            }
            if (this.port == 0) {
                setPort(url.getSpecifiedPort());
            }
        }
    }

    public final io.ktor.http.Url build() {
        applyOrigin();
        return new io.ktor.http.Url(this.protocolOrNull, this.host, this.port, getPathSegments(), this.parameters.build(), getFragment(), getUser(), getPassword(), this.trailingQuery, buildString());
    }

    public final java.lang.String buildString() {
        applyOrigin();
        java.lang.String string = ((java.lang.StringBuilder) io.ktor.http.URLBuilderKt.appendTo(this, new java.lang.StringBuilder(256))).toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }

    public final java.lang.String getEncodedFragment() {
        return this.encodedFragment;
    }

    public final io.ktor.http.ParametersBuilder getEncodedParameters() {
        return this.encodedParameters;
    }

    public final java.lang.String getEncodedPassword() {
        return this.encodedPassword;
    }

    public final java.util.List<java.lang.String> getEncodedPathSegments() {
        return this.encodedPathSegments;
    }

    public final java.lang.String getEncodedUser() {
        return this.encodedUser;
    }

    public final java.lang.String getFragment() {
        return io.ktor.http.CodecsKt.decodeURLQueryComponent$default(this.encodedFragment, 0, 0, false, null, 15, null);
    }

    public final java.lang.String getHost() {
        return this.host;
    }

    public final io.ktor.http.ParametersBuilder getParameters() {
        return this.parameters;
    }

    public final java.lang.String getPassword() {
        java.lang.String str = this.encodedPassword;
        if (str != null) {
            return io.ktor.http.CodecsKt.decodeURLPart$default(str, 0, 0, null, 7, null);
        }
        return null;
    }

    public final java.util.List<java.lang.String> getPathSegments() {
        java.util.List<java.lang.String> list = this.encodedPathSegments;
        java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(io.ktor.http.CodecsKt.decodeURLPart$default((java.lang.String) it.next(), 0, 0, null, 7, null));
        }
        return arrayList;
    }

    public final int getPort() {
        return this.port;
    }

    public final io.ktor.http.URLProtocol getProtocol() {
        io.ktor.http.URLProtocol uRLProtocol = this.protocolOrNull;
        return uRLProtocol == null ? io.ktor.http.URLProtocol.INSTANCE.getHTTP() : uRLProtocol;
    }

    public final io.ktor.http.URLProtocol getProtocolOrNull() {
        return this.protocolOrNull;
    }

    public final boolean getTrailingQuery() {
        return this.trailingQuery;
    }

    public final java.lang.String getUser() {
        java.lang.String str = this.encodedUser;
        if (str != null) {
            return io.ktor.http.CodecsKt.decodeURLPart$default(str, 0, 0, null, 7, null);
        }
        return null;
    }

    public final void setEncodedFragment(java.lang.String str) {
        kotlin.jvm.internal.m.e(str, "<set-?>");
        this.encodedFragment = str;
    }

    public final void setEncodedParameters(io.ktor.http.ParametersBuilder value) {
        kotlin.jvm.internal.m.e(value, "value");
        this.encodedParameters = value;
        this.parameters = new io.ktor.http.UrlDecodedParametersBuilder(value);
    }

    public final void setEncodedPassword(java.lang.String str) {
        this.encodedPassword = str;
    }

    public final void setEncodedPathSegments(java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.m.e(list, "<set-?>");
        this.encodedPathSegments = list;
    }

    public final void setEncodedUser(java.lang.String str) {
        this.encodedUser = str;
    }

    public final void setFragment(java.lang.String value) {
        kotlin.jvm.internal.m.e(value, "value");
        this.encodedFragment = io.ktor.http.CodecsKt.encodeURLQueryComponent$default(value, false, false, null, 7, null);
    }

    public final void setHost(java.lang.String str) {
        kotlin.jvm.internal.m.e(str, "<set-?>");
        this.host = str;
    }

    public final void setPassword(java.lang.String str) {
        this.encodedPassword = str != null ? io.ktor.http.CodecsKt.encodeURLParameter$default(str, false, 1, null) : null;
    }

    public final void setPathSegments(java.util.List<java.lang.String> value) {
        kotlin.jvm.internal.m.e(value, "value");
        java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(value, 10));
        java.util.Iterator<T> it = value.iterator();
        while (it.hasNext()) {
            arrayList.add(io.ktor.http.CodecsKt.encodeURLPathPart((java.lang.String) it.next()));
        }
        this.encodedPathSegments = arrayList;
    }

    public final void setPort(int i3) {
        if (i3 < 0 || i3 >= 65536) {
            throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.play_billing.M0.l(i3, "Port must be between 0 and 65535, or 0 if not set. Provided: ").toString());
        }
        this.port = i3;
    }

    public final void setProtocol(io.ktor.http.URLProtocol value) {
        kotlin.jvm.internal.m.e(value, "value");
        this.protocolOrNull = value;
    }

    public final void setProtocolOrNull(io.ktor.http.URLProtocol uRLProtocol) {
        this.protocolOrNull = uRLProtocol;
    }

    public final void setTrailingQuery(boolean z6) {
        this.trailingQuery = z6;
    }

    public final void setUser(java.lang.String str) {
        this.encodedUser = str != null ? io.ktor.http.CodecsKt.encodeURLParameter$default(str, false, 1, null) : null;
    }

    public java.lang.String toString() {
        java.lang.String string = ((java.lang.StringBuilder) io.ktor.http.URLBuilderKt.appendTo(this, new java.lang.StringBuilder(256))).toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }

    public URLBuilder(io.ktor.http.URLProtocol uRLProtocol, java.lang.String host, int i3, java.lang.String str, java.lang.String str2, java.util.List<java.lang.String> pathSegments, io.ktor.http.Parameters parameters, java.lang.String fragment, boolean z6) {
        kotlin.jvm.internal.m.e(host, "host");
        kotlin.jvm.internal.m.e(pathSegments, "pathSegments");
        kotlin.jvm.internal.m.e(parameters, "parameters");
        kotlin.jvm.internal.m.e(fragment, "fragment");
        this.host = host;
        this.trailingQuery = z6;
        this.port = i3;
        this.protocolOrNull = uRLProtocol;
        this.encodedUser = str != null ? io.ktor.http.CodecsKt.encodeURLParameter$default(str, false, 1, null) : null;
        this.encodedPassword = str2 != null ? io.ktor.http.CodecsKt.encodeURLParameter$default(str2, false, 1, null) : null;
        this.encodedFragment = io.ktor.http.CodecsKt.encodeURLQueryComponent$default(fragment, false, false, null, 7, null);
        java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(pathSegments, 10));
        java.util.Iterator<T> it = pathSegments.iterator();
        while (it.hasNext()) {
            arrayList.add(io.ktor.http.CodecsKt.encodeURLPathPart((java.lang.String) it.next()));
        }
        this.encodedPathSegments = arrayList;
        io.ktor.http.ParametersBuilder parametersBuilderEncodeParameters = io.ktor.http.UrlDecodedParametersBuilderKt.encodeParameters(parameters);
        this.encodedParameters = parametersBuilderEncodeParameters;
        this.parameters = new io.ktor.http.UrlDecodedParametersBuilder(parametersBuilderEncodeParameters);
    }

    public /* synthetic */ URLBuilder(io.ktor.http.URLProtocol uRLProtocol, java.lang.String str, int i3, java.lang.String str2, java.lang.String str3, java.util.List list, io.ktor.http.Parameters parameters, java.lang.String str4, boolean z6, int i9, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this((i9 & 1) != 0 ? null : uRLProtocol, (i9 & 2) != 0 ? "" : str, (i9 & 4) != 0 ? 0 : i3, (i9 & 8) != 0 ? null : str2, (i9 & 16) != 0 ? null : str3, (i9 & 32) != 0 ? p078i6.w.f23205h : list, (i9 & 64) != 0 ? io.ktor.http.Parameters.INSTANCE.getEmpty() : parameters, (i9 & 128) != 0 ? "" : str4, (i9 & 256) != 0 ? false : z6);
    }
}
