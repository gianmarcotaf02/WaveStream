package io.ktor.http;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u0000 M2\u00060\u0001j\u0002`\u0002:\u0002NMB}\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u0089\u0001\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0011\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0013\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\"\u0010\u001aJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b#\u0010\u001aJ\u0010\u0010$\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b&\u0010%J\u001e\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0011HÆ\u0003¢\u0006\u0004\b'\u0010(J\u008a\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0011HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b+\u0010\u001aJ\u0010\u0010,\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020\u000e2\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020.H\u0002¢\u0006\u0004\b2\u00103J'\u0010<\u001a\u0002092\u0006\u00104\u001a\u00020\u00002\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0001¢\u0006\u0004\b:\u0010;R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010=\u001a\u0004\b>\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010=\u001a\u0004\b?\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010@\u001a\u0004\bA\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8G¢\u0006\f\n\u0004\b\t\u0010B\u001a\u0004\bC\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010D\u001a\u0004\bE\u0010!R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010=\u001a\u0004\bF\u0010\u001aR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\bG\u0010\u001aR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010H\u001a\u0004\bI\u0010%R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010H\u001a\u0004\bJ\u0010%R%\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010K\u001a\u0004\bL\u0010(¨\u0006O"}, d2 = {"Lio/ktor/http/Cookie;", "Ljava/io/Serializable;", "Lio/ktor/utils/io/JvmSerializable;", "", "name", "value", "Lio/ktor/http/CookieEncoding;", io.sentry.rrweb.RRWebVideoEvent.JsonKeys.ENCODING, "", "maxAge", "Lio/ktor/util/date/GMTDate;", "expires", "domain", "path", "", "secure", "httpOnly", "", "extensions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lio/ktor/http/CookieEncoding;Ljava/lang/Integer;Lio/ktor/util/date/GMTDate;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/Map;)V", "seen0", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lio/ktor/http/CookieEncoding;Ljava/lang/Integer;Lio/ktor/util/date/GMTDate;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/Map;Lr8/k0;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lio/ktor/http/CookieEncoding;", "component4", "()Ljava/lang/Integer;", "component5", "()Lio/ktor/util/date/GMTDate;", "component6", "component7", "component8", "()Z", "component9", "component10", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lio/ktor/http/CookieEncoding;Ljava/lang/Integer;Lio/ktor/util/date/GMTDate;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/Map;)Lio/ktor/http/Cookie;", "toString", "hashCode", "()I", "", io.sentry.protocol.Request.JsonKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "writeReplace", "()Ljava/lang/Object;", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$ktor_http", "(Lio/ktor/http/Cookie;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getName", "getValue", "Lio/ktor/http/CookieEncoding;", "getEncoding", "Ljava/lang/Integer;", "getMaxAgeInt", "Lio/ktor/util/date/GMTDate;", "getExpires", "getDomain", "getPath", "Z", "getSecure", "getHttpOnly", "Ljava/util/Map;", "getExtensions", "Companion", "$serializer", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class Cookie implements java.io.Serializable {
    private static final kotlinx.serialization.KSerializer[] $childSerializers;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final io.ktor.http.Cookie.Companion INSTANCE = new io.ktor.http.Cookie.Companion(null);
    private final java.lang.String domain;
    private final io.ktor.http.CookieEncoding encoding;
    private final io.ktor.util.date.GMTDate expires;
    private final java.util.Map<java.lang.String, java.lang.String> extensions;
    private final boolean httpOnly;
    private final java.lang.Integer maxAge;
    private final java.lang.String name;
    private final java.lang.String path;
    private final boolean secure;
    private final java.lang.String value;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/ktor/http/Cookie$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lio/ktor/http/Cookie;", "serializer", "()Lkotlinx/serialization/KSerializer;", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return io.ktor.http.Cookie$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }
    }

    static {
        p153r8.C2714z c2714zF = p153r8.AbstractC2686a0.f("io.ktor.http.CookieEncoding", io.ktor.http.CookieEncoding.values());
        p153r8.p0 p0Var = p153r8.p0.f26988a;
        $childSerializers = new kotlinx.serialization.KSerializer[]{null, null, c2714zF, null, null, null, null, null, null, new p153r8.F(p0Var, com.google.android.gms.internal.play_billing.V0.s(p0Var), 1)};
    }

    public /* synthetic */ Cookie(int i3, java.lang.String str, java.lang.String str2, io.ktor.http.CookieEncoding cookieEncoding, java.lang.Integer num, io.ktor.util.date.GMTDate gMTDate, java.lang.String str3, java.lang.String str4, boolean z6, boolean z9, java.util.Map map, p153r8.k0 k0Var) {
        if (3 != (i3 & 3)) {
            p153r8.AbstractC2686a0.l(i3, 3, io.ktor.http.Cookie$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.name = str;
        this.value = str2;
        if ((i3 & 4) == 0) {
            this.encoding = io.ktor.http.CookieEncoding.URI_ENCODING;
        } else {
            this.encoding = cookieEncoding;
        }
        if ((i3 & 8) == 0) {
            this.maxAge = null;
        } else {
            this.maxAge = num;
        }
        if ((i3 & 16) == 0) {
            this.expires = null;
        } else {
            this.expires = gMTDate;
        }
        if ((i3 & 32) == 0) {
            this.domain = null;
        } else {
            this.domain = str3;
        }
        if ((i3 & 64) == 0) {
            this.path = null;
        } else {
            this.path = str4;
        }
        if ((i3 & 128) == 0) {
            this.secure = false;
        } else {
            this.secure = z6;
        }
        if ((i3 & 256) == 0) {
            this.httpOnly = false;
        } else {
            this.httpOnly = z9;
        }
        if ((i3 & 512) == 0) {
            this.extensions = p078i6.x.f23206h;
        } else {
            this.extensions = map;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ io.ktor.http.Cookie copy$default(io.ktor.http.Cookie cookie, java.lang.String str, java.lang.String str2, io.ktor.http.CookieEncoding cookieEncoding, java.lang.Integer num, io.ktor.util.date.GMTDate gMTDate, java.lang.String str3, java.lang.String str4, boolean z6, boolean z9, java.util.Map map, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = cookie.name;
        }
        if ((i3 & 2) != 0) {
            str2 = cookie.value;
        }
        if ((i3 & 4) != 0) {
            cookieEncoding = cookie.encoding;
        }
        if ((i3 & 8) != 0) {
            num = cookie.maxAge;
        }
        if ((i3 & 16) != 0) {
            gMTDate = cookie.expires;
        }
        if ((i3 & 32) != 0) {
            str3 = cookie.domain;
        }
        if ((i3 & 64) != 0) {
            str4 = cookie.path;
        }
        if ((i3 & 128) != 0) {
            z6 = cookie.secure;
        }
        if ((i3 & 256) != 0) {
            z9 = cookie.httpOnly;
        }
        if ((i3 & 512) != 0) {
            map = cookie.extensions;
        }
        boolean z10 = z9;
        java.util.Map map2 = map;
        java.lang.String str5 = str4;
        boolean z11 = z6;
        io.ktor.util.date.GMTDate gMTDate2 = gMTDate;
        java.lang.String str6 = str3;
        return cookie.copy(str, str2, cookieEncoding, num, gMTDate2, str6, str5, z11, z10, map2);
    }

    public static final /* synthetic */ void write$Self$ktor_http(io.ktor.http.Cookie self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlinx.serialization.KSerializer[] kSerializerArr = $childSerializers;
        output.s(serialDesc, 0, self.name);
        output.s(serialDesc, 1, self.value);
        if (output.E(serialDesc) || self.encoding != io.ktor.http.CookieEncoding.URI_ENCODING) {
            output.h(serialDesc, 2, kSerializerArr[2], self.encoding);
        }
        if (output.E(serialDesc) || self.maxAge != null) {
            output.t(serialDesc, 3, p153r8.K.f26915a, self.maxAge);
        }
        if (output.E(serialDesc) || self.expires != null) {
            output.t(serialDesc, 4, io.ktor.util.date.GMTDate$$serializer.INSTANCE, self.expires);
        }
        if (output.E(serialDesc) || self.domain != null) {
            output.t(serialDesc, 5, p153r8.p0.f26988a, self.domain);
        }
        if (output.E(serialDesc) || self.path != null) {
            output.t(serialDesc, 6, p153r8.p0.f26988a, self.path);
        }
        if (output.E(serialDesc) || self.secure) {
            output.q(serialDesc, 7, self.secure);
        }
        if (output.E(serialDesc) || self.httpOnly) {
            output.q(serialDesc, 8, self.httpOnly);
        }
        if (!output.E(serialDesc) && kotlin.jvm.internal.m.a(self.extensions, p078i6.x.f23206h)) {
            return;
        }
        output.h(serialDesc, 9, kSerializerArr[9], self.extensions);
    }

    private final java.lang.Object writeReplace() {
        return io.ktor.utils.io.JvmSerializable_jvmKt.JvmSerializerReplacement(io.ktor.http.CookieJvmSerializer.INSTANCE, this);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    public final java.util.Map<java.lang.String, java.lang.String> component10() {
        return this.extensions;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final io.ktor.http.CookieEncoding getEncoding() {
        return this.encoding;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final java.lang.Integer getMaxAge() {
        return this.maxAge;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final io.ktor.util.date.GMTDate getExpires() {
        return this.expires;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final java.lang.String getDomain() {
        return this.domain;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final java.lang.String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getSecure() {
        return this.secure;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getHttpOnly() {
        return this.httpOnly;
    }

    public final io.ktor.http.Cookie copy(java.lang.String name, java.lang.String value, io.ktor.http.CookieEncoding encoding, java.lang.Integer maxAge, io.ktor.util.date.GMTDate expires, java.lang.String domain, java.lang.String path, boolean secure, boolean httpOnly, java.util.Map<java.lang.String, java.lang.String> extensions) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(value, "value");
        kotlin.jvm.internal.m.e(encoding, "encoding");
        kotlin.jvm.internal.m.e(extensions, "extensions");
        return new io.ktor.http.Cookie(name, value, encoding, maxAge, expires, domain, path, secure, httpOnly, extensions);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof io.ktor.http.Cookie)) {
            return false;
        }
        io.ktor.http.Cookie cookie = (io.ktor.http.Cookie) other;
        return kotlin.jvm.internal.m.a(this.name, cookie.name) && kotlin.jvm.internal.m.a(this.value, cookie.value) && this.encoding == cookie.encoding && kotlin.jvm.internal.m.a(this.maxAge, cookie.maxAge) && kotlin.jvm.internal.m.a(this.expires, cookie.expires) && kotlin.jvm.internal.m.a(this.domain, cookie.domain) && kotlin.jvm.internal.m.a(this.path, cookie.path) && this.secure == cookie.secure && this.httpOnly == cookie.httpOnly && kotlin.jvm.internal.m.a(this.extensions, cookie.extensions);
    }

    public final java.lang.String getDomain() {
        return this.domain;
    }

    public final io.ktor.http.CookieEncoding getEncoding() {
        return this.encoding;
    }

    public final io.ktor.util.date.GMTDate getExpires() {
        return this.expires;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getExtensions() {
        return this.extensions;
    }

    public final boolean getHttpOnly() {
        return this.httpOnly;
    }

    public final java.lang.Integer getMaxAgeInt() {
        return this.maxAge;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String getPath() {
        return this.path;
    }

    public final boolean getSecure() {
        return this.secure;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = (this.encoding.hashCode() + B2.a.a(this.name.hashCode() * 31, 31, this.value)) * 31;
        java.lang.Integer num = this.maxAge;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        io.ktor.util.date.GMTDate gMTDate = this.expires;
        int iHashCode3 = (iHashCode2 + (gMTDate == null ? 0 : gMTDate.hashCode())) * 31;
        java.lang.String str = this.domain;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.path;
        return this.extensions.hashCode() + p121o0.p.f(p121o0.p.f((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.secure), 31, this.httpOnly);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Cookie(name=");
        sb.append(this.name);
        sb.append(", value=");
        sb.append(this.value);
        sb.append(", encoding=");
        sb.append(this.encoding);
        sb.append(", maxAge=");
        sb.append(this.maxAge);
        sb.append(", expires=");
        sb.append(this.expires);
        sb.append(", domain=");
        sb.append(this.domain);
        sb.append(", path=");
        sb.append(this.path);
        sb.append(", secure=");
        sb.append(this.secure);
        sb.append(", httpOnly=");
        sb.append(this.httpOnly);
        sb.append(", extensions=");
        return p121o0.p.r(sb, this.extensions, ')');
    }

    public Cookie(java.lang.String name, java.lang.String value, io.ktor.http.CookieEncoding encoding, java.lang.Integer num, io.ktor.util.date.GMTDate gMTDate, java.lang.String str, java.lang.String str2, boolean z6, boolean z9, java.util.Map<java.lang.String, java.lang.String> extensions) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(value, "value");
        kotlin.jvm.internal.m.e(encoding, "encoding");
        kotlin.jvm.internal.m.e(extensions, "extensions");
        this.name = name;
        this.value = value;
        this.encoding = encoding;
        this.maxAge = num;
        this.expires = gMTDate;
        this.domain = str;
        this.path = str2;
        this.secure = z6;
        this.httpOnly = z9;
        this.extensions = extensions;
    }

    public /* synthetic */ Cookie(java.lang.String str, java.lang.String str2, io.ktor.http.CookieEncoding cookieEncoding, java.lang.Integer num, io.ktor.util.date.GMTDate gMTDate, java.lang.String str3, java.lang.String str4, boolean z6, boolean z9, java.util.Map map, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(str, str2, (i3 & 4) != 0 ? io.ktor.http.CookieEncoding.URI_ENCODING : cookieEncoding, (i3 & 8) != 0 ? null : num, (i3 & 16) != 0 ? null : gMTDate, (i3 & 32) != 0 ? null : str3, (i3 & 64) != 0 ? null : str4, (i3 & 128) != 0 ? false : z6, (i3 & 256) != 0 ? false : z9, (i3 & 512) != 0 ? p078i6.x.f23206h : map);
    }
}
