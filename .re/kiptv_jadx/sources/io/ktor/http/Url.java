package io.ktor.http;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b:\b\u0007\u0018\u0000 P2\u00060\u0001j\u0002`\u0002:\u0001PBe\b\u0000\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u001cR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b&\u0010\u0016R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b'\u0010\u0016R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b(\u0010\u0016R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010\u0012\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001fR&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010,\u0012\u0004\b/\u00100\u001a\u0004\b-\u0010.R\u001d\u00101\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b2\u0010.R!\u00106\u001a\b\u0012\u0004\u0012\u00020\u00050\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010.R\u0019\u00107\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u00108\u001a\u0004\b;\u0010:R\u001b\u0010>\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b<\u00104\u001a\u0004\b=\u0010\u0016R\u001b\u0010A\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b?\u00104\u001a\u0004\b@\u0010\u0016R\u001b\u0010D\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bB\u00104\u001a\u0004\bC\u0010\u0016R\u001d\u0010G\u001a\u0004\u0018\u00010\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bE\u00104\u001a\u0004\bF\u0010\u0016R\u001d\u0010J\u001a\u0004\u0018\u00010\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bH\u00104\u001a\u0004\bI\u0010\u0016R\u001b\u0010M\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bK\u00104\u001a\u0004\bL\u0010\u0016R\u0011\u0010O\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bN\u0010\u001c¨\u0006Q"}, d2 = {"Lio/ktor/http/Url;", "Ljava/io/Serializable;", "Lio/ktor/utils/io/JvmSerializable;", "Lio/ktor/http/URLProtocol;", "protocol", "", com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker.HOST_KEY, "", "specifiedPort", "", "pathSegments", "Lio/ktor/http/Parameters;", "parameters", io.sentry.protocol.Request.JsonKeys.FRAGMENT, io.sentry.SentryBaseEvent.JsonKeys.USER, "password", "", "trailingQuery", "urlString", "<init>", "(Lio/ktor/http/URLProtocol;Ljava/lang/String;ILjava/util/List;Lio/ktor/http/Parameters;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", io.sentry.protocol.Request.JsonKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "writeReplace", "()Ljava/lang/Object;", "Ljava/lang/String;", "getHost", "I", "getSpecifiedPort", "Lio/ktor/http/Parameters;", "getParameters", "()Lio/ktor/http/Parameters;", "getFragment", "getUser", "getPassword", "Z", "getTrailingQuery", "()Z", "Ljava/util/List;", "getPathSegments", "()Ljava/util/List;", "getPathSegments$annotations", "()V", "rawSegments", "getRawSegments", "segments$delegate", "Lh6/h;", "getSegments", "segments", "protocolOrNull", "Lio/ktor/http/URLProtocol;", "getProtocolOrNull", "()Lio/ktor/http/URLProtocol;", "getProtocol", "encodedPath$delegate", "getEncodedPath", "encodedPath", "encodedQuery$delegate", "getEncodedQuery", "encodedQuery", "encodedPathAndQuery$delegate", "getEncodedPathAndQuery", "encodedPathAndQuery", "encodedUser$delegate", "getEncodedUser", "encodedUser", "encodedPassword$delegate", "getEncodedPassword", "encodedPassword", "encodedFragment$delegate", "getEncodedFragment", "encodedFragment", "getPort", "port", "Companion", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i(with = io.ktor.http.UrlSerializer.class)
public final class Url implements java.io.Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final io.ktor.http.Url.Companion INSTANCE = new io.ktor.http.Url.Companion(null);

    /* JADX INFO: renamed from: encodedFragment$delegate, reason: from kotlin metadata */
    private final p070h6.h encodedFragment;

    /* JADX INFO: renamed from: encodedPassword$delegate, reason: from kotlin metadata */
    private final p070h6.h encodedPassword;

    /* JADX INFO: renamed from: encodedPath$delegate, reason: from kotlin metadata */
    private final p070h6.h encodedPath;

    /* JADX INFO: renamed from: encodedPathAndQuery$delegate, reason: from kotlin metadata */
    private final p070h6.h encodedPathAndQuery;

    /* JADX INFO: renamed from: encodedQuery$delegate, reason: from kotlin metadata */
    private final p070h6.h encodedQuery;

    /* JADX INFO: renamed from: encodedUser$delegate, reason: from kotlin metadata */
    private final p070h6.h encodedUser;
    private final java.lang.String fragment;
    private final java.lang.String host;
    private final io.ktor.http.Parameters parameters;
    private final java.lang.String password;
    private final java.util.List<java.lang.String> pathSegments;
    private final io.ktor.http.URLProtocol protocol;
    private final io.ktor.http.URLProtocol protocolOrNull;
    private final java.util.List<java.lang.String> rawSegments;

    /* JADX INFO: renamed from: segments$delegate, reason: from kotlin metadata */
    private final p070h6.h segments;
    private final int specifiedPort;
    private final boolean trailingQuery;
    private final java.lang.String urlString;
    private final java.lang.String user;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/ktor/http/Url$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lio/ktor/http/Url;", "serializer", "()Lkotlinx/serialization/KSerializer;", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return io.ktor.http.UrlSerializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Url(io.ktor.http.URLProtocol uRLProtocol, java.lang.String host, int i3, java.util.List<java.lang.String> pathSegments, io.ktor.http.Parameters parameters, java.lang.String fragment, java.lang.String str, java.lang.String str2, boolean z6, java.lang.String urlString) {
        kotlin.jvm.internal.m.e(host, "host");
        kotlin.jvm.internal.m.e(pathSegments, "pathSegments");
        kotlin.jvm.internal.m.e(parameters, "parameters");
        kotlin.jvm.internal.m.e(fragment, "fragment");
        kotlin.jvm.internal.m.e(urlString, "urlString");
        this.host = host;
        this.specifiedPort = i3;
        this.parameters = parameters;
        this.fragment = fragment;
        this.user = str;
        this.password = str2;
        this.trailingQuery = z6;
        this.urlString = urlString;
        if (i3 < 0 || i3 >= 65536) {
            throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.play_billing.M0.l(i3, "Port must be between 0 and 65535, or 0 if not set. Provided: ").toString());
        }
        this.pathSegments = pathSegments;
        this.rawSegments = pathSegments;
        this.segments = com.google.common.util.concurrent.D.B(new io.ktor.http.c(0, pathSegments));
        this.protocolOrNull = uRLProtocol;
        this.protocol = uRLProtocol == null ? io.ktor.http.URLProtocol.INSTANCE.getHTTP() : uRLProtocol;
        final int i9 = 0;
        this.encodedPath = com.google.common.util.concurrent.D.B(new io.ktor.http.d(pathSegments, this, i9));
        this.encodedQuery = com.google.common.util.concurrent.D.B(new kotlin.jvm.functions.Function0(this) { // from class: io.ktor.http.e

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ io.ktor.http.Url f23398i;

            {
                this.f23398i = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                switch (i9) {
                    case 0:
                        return io.ktor.http.Url.encodedQuery_delegate$lambda$4(this.f23398i);
                    case 1:
                        return io.ktor.http.Url.encodedPathAndQuery_delegate$lambda$5(this.f23398i);
                    case 2:
                        return io.ktor.http.Url.encodedUser_delegate$lambda$6(this.f23398i);
                    case 3:
                        return io.ktor.http.Url.encodedPassword_delegate$lambda$7(this.f23398i);
                    default:
                        return io.ktor.http.Url.encodedFragment_delegate$lambda$8(this.f23398i);
                }
            }
        });
        final int i10 = 1;
        this.encodedPathAndQuery = com.google.common.util.concurrent.D.B(new kotlin.jvm.functions.Function0(this) { // from class: io.ktor.http.e

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ io.ktor.http.Url f23398i;

            {
                this.f23398i = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                switch (i10) {
                    case 0:
                        return io.ktor.http.Url.encodedQuery_delegate$lambda$4(this.f23398i);
                    case 1:
                        return io.ktor.http.Url.encodedPathAndQuery_delegate$lambda$5(this.f23398i);
                    case 2:
                        return io.ktor.http.Url.encodedUser_delegate$lambda$6(this.f23398i);
                    case 3:
                        return io.ktor.http.Url.encodedPassword_delegate$lambda$7(this.f23398i);
                    default:
                        return io.ktor.http.Url.encodedFragment_delegate$lambda$8(this.f23398i);
                }
            }
        });
        final int i11 = 2;
        this.encodedUser = com.google.common.util.concurrent.D.B(new kotlin.jvm.functions.Function0(this) { // from class: io.ktor.http.e

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ io.ktor.http.Url f23398i;

            {
                this.f23398i = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                switch (i11) {
                    case 0:
                        return io.ktor.http.Url.encodedQuery_delegate$lambda$4(this.f23398i);
                    case 1:
                        return io.ktor.http.Url.encodedPathAndQuery_delegate$lambda$5(this.f23398i);
                    case 2:
                        return io.ktor.http.Url.encodedUser_delegate$lambda$6(this.f23398i);
                    case 3:
                        return io.ktor.http.Url.encodedPassword_delegate$lambda$7(this.f23398i);
                    default:
                        return io.ktor.http.Url.encodedFragment_delegate$lambda$8(this.f23398i);
                }
            }
        });
        final int i12 = 3;
        this.encodedPassword = com.google.common.util.concurrent.D.B(new kotlin.jvm.functions.Function0(this) { // from class: io.ktor.http.e

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ io.ktor.http.Url f23398i;

            {
                this.f23398i = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                switch (i12) {
                    case 0:
                        return io.ktor.http.Url.encodedQuery_delegate$lambda$4(this.f23398i);
                    case 1:
                        return io.ktor.http.Url.encodedPathAndQuery_delegate$lambda$5(this.f23398i);
                    case 2:
                        return io.ktor.http.Url.encodedUser_delegate$lambda$6(this.f23398i);
                    case 3:
                        return io.ktor.http.Url.encodedPassword_delegate$lambda$7(this.f23398i);
                    default:
                        return io.ktor.http.Url.encodedFragment_delegate$lambda$8(this.f23398i);
                }
            }
        });
        final int i13 = 4;
        this.encodedFragment = com.google.common.util.concurrent.D.B(new kotlin.jvm.functions.Function0(this) { // from class: io.ktor.http.e

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ io.ktor.http.Url f23398i;

            {
                this.f23398i = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                switch (i13) {
                    case 0:
                        return io.ktor.http.Url.encodedQuery_delegate$lambda$4(this.f23398i);
                    case 1:
                        return io.ktor.http.Url.encodedPathAndQuery_delegate$lambda$5(this.f23398i);
                    case 2:
                        return io.ktor.http.Url.encodedUser_delegate$lambda$6(this.f23398i);
                    case 3:
                        return io.ktor.http.Url.encodedPassword_delegate$lambda$7(this.f23398i);
                    default:
                        return io.ktor.http.Url.encodedFragment_delegate$lambda$8(this.f23398i);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String encodedFragment_delegate$lambda$8(io.ktor.http.Url url) {
        int iK0 = O7.q.K0(url.urlString, '#', 0, 6) + 1;
        if (iK0 == 0) {
            return "";
        }
        java.lang.String strSubstring = url.urlString.substring(iK0);
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String encodedPassword_delegate$lambda$7(io.ktor.http.Url url) {
        java.lang.String str = url.password;
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return "";
        }
        java.lang.String strSubstring = url.urlString.substring(O7.q.K0(url.urlString, ':', url.protocol.getName().length() + 3, 4) + 1, O7.q.K0(url.urlString, '@', 0, 6));
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String encodedPathAndQuery_delegate$lambda$5(io.ktor.http.Url url) {
        int iK0 = O7.q.K0(url.urlString, '/', url.protocol.getName().length() + 3, 4);
        if (iK0 == -1) {
            return "";
        }
        int iK1 = O7.q.K0(url.urlString, '#', iK0, 4);
        if (iK1 == -1) {
            java.lang.String strSubstring = url.urlString.substring(iK0);
            kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
            return strSubstring;
        }
        java.lang.String strSubstring2 = url.urlString.substring(iK0, iK1);
        kotlin.jvm.internal.m.d(strSubstring2, "substring(...)");
        return strSubstring2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String encodedPath_delegate$lambda$3(java.util.List list, io.ktor.http.Url url) {
        int iK0;
        if (list.isEmpty() || (iK0 = O7.q.K0(url.urlString, '/', url.protocol.getName().length() + 3, 4)) == -1) {
            return "";
        }
        int iM0 = O7.q.M0(url.urlString, new char[]{'?', '#'}, iK0, false);
        if (iM0 == -1) {
            java.lang.String strSubstring = url.urlString.substring(iK0);
            kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
            return strSubstring;
        }
        java.lang.String strSubstring2 = url.urlString.substring(iK0, iM0);
        kotlin.jvm.internal.m.d(strSubstring2, "substring(...)");
        return strSubstring2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String encodedQuery_delegate$lambda$4(io.ktor.http.Url url) {
        int iK0 = O7.q.K0(url.urlString, '?', 0, 6) + 1;
        if (iK0 == 0) {
            return "";
        }
        int iK1 = O7.q.K0(url.urlString, '#', iK0, 4);
        if (iK1 == -1) {
            java.lang.String strSubstring = url.urlString.substring(iK0);
            kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
            return strSubstring;
        }
        java.lang.String strSubstring2 = url.urlString.substring(iK0, iK1);
        kotlin.jvm.internal.m.d(strSubstring2, "substring(...)");
        return strSubstring2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String encodedUser_delegate$lambda$6(io.ktor.http.Url url) {
        java.lang.String str = url.user;
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return "";
        }
        int length = url.protocol.getName().length() + 3;
        java.lang.String strSubstring = url.urlString.substring(length, O7.q.M0(url.urlString, new char[]{':', '@'}, length, false));
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    @p070h6.c
    public static /* synthetic */ void getPathSegments$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List segments_delegate$lambda$1(java.util.List list) {
        if (list.isEmpty()) {
            return p078i6.w.f23205h;
        }
        return list.subList((((java.lang.CharSequence) p078i6.o.h1(list)).length() != 0 || list.size() <= 1) ? 0 : 1, ((java.lang.CharSequence) p078i6.o.q1(list)).length() == 0 ? p078i6.p.A0(list) : 1 + p078i6.p.A0(list));
    }

    private final java.lang.Object writeReplace() {
        return io.ktor.utils.io.JvmSerializable_jvmKt.JvmSerializerReplacement(io.ktor.http.UrlJvmSerializer.INSTANCE, this);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || io.ktor.http.Url.class != other.getClass()) {
            return false;
        }
        return kotlin.jvm.internal.m.a(this.urlString, ((io.ktor.http.Url) other).urlString);
    }

    public final java.lang.String getEncodedFragment() {
        return (java.lang.String) this.encodedFragment.getValue();
    }

    public final java.lang.String getEncodedPassword() {
        return (java.lang.String) this.encodedPassword.getValue();
    }

    public final java.lang.String getEncodedPath() {
        return (java.lang.String) this.encodedPath.getValue();
    }

    public final java.lang.String getEncodedPathAndQuery() {
        return (java.lang.String) this.encodedPathAndQuery.getValue();
    }

    public final java.lang.String getEncodedQuery() {
        return (java.lang.String) this.encodedQuery.getValue();
    }

    public final java.lang.String getEncodedUser() {
        return (java.lang.String) this.encodedUser.getValue();
    }

    public final java.lang.String getFragment() {
        return this.fragment;
    }

    public final java.lang.String getHost() {
        return this.host;
    }

    public final io.ktor.http.Parameters getParameters() {
        return this.parameters;
    }

    public final java.lang.String getPassword() {
        return this.password;
    }

    public final java.util.List<java.lang.String> getPathSegments() {
        return this.pathSegments;
    }

    public final int getPort() {
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(this.specifiedPort);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : this.protocol.getDefaultPort();
    }

    public final io.ktor.http.URLProtocol getProtocol() {
        return this.protocol;
    }

    public final io.ktor.http.URLProtocol getProtocolOrNull() {
        return this.protocolOrNull;
    }

    public final java.util.List<java.lang.String> getRawSegments() {
        return this.rawSegments;
    }

    public final java.util.List<java.lang.String> getSegments() {
        return (java.util.List) this.segments.getValue();
    }

    public final int getSpecifiedPort() {
        return this.specifiedPort;
    }

    public final boolean getTrailingQuery() {
        return this.trailingQuery;
    }

    public final java.lang.String getUser() {
        return this.user;
    }

    public int hashCode() {
        return this.urlString.hashCode();
    }

    /* JADX INFO: renamed from: toString, reason: from getter */
    public java.lang.String getUrlString() {
        return this.urlString;
    }
}
