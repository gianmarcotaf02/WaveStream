package io.ktor.http;

import androidx.media3.container.NalUnitUtil;
import com.google.android.gms.internal.play_billing.V0;
import io.ktor.util.date.GMTDate;
import io.ktor.util.date.GMTDate$$serializer;
import io.ktor.utils.io.JvmSerializable_jvmKt;
import io.sentry.protocol.Request;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p078i6.x;
import p119n8.i;
import p121o0.p;
import p153r8.AbstractC2686a0;
import p153r8.C2714z;
import p153r8.F;
import p153r8.K;
import p153r8.k0;
import p153r8.p0;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u0000 M2\u00060\u0001j\u0002`\u0002:\u0002NMB}\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u0089\u0001\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0011\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0013\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\"\u0010\u001aJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b#\u0010\u001aJ\u0010\u0010$\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b&\u0010%J\u001e\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0011HÆ\u0003¢\u0006\u0004\b'\u0010(J\u008a\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0011HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b+\u0010\u001aJ\u0010\u0010,\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020\u000e2\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020.H\u0002¢\u0006\u0004\b2\u00103J'\u0010<\u001a\u0002092\u0006\u00104\u001a\u00020\u00002\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0001¢\u0006\u0004\b:\u0010;R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010=\u001a\u0004\b>\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010=\u001a\u0004\b?\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010@\u001a\u0004\bA\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8G¢\u0006\f\n\u0004\b\t\u0010B\u001a\u0004\bC\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010D\u001a\u0004\bE\u0010!R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010=\u001a\u0004\bF\u0010\u001aR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\bG\u0010\u001aR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010H\u001a\u0004\bI\u0010%R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010H\u001a\u0004\bJ\u0010%R%\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010K\u001a\u0004\bL\u0010(¨\u0006O"}, d2 = {"Lio/ktor/http/Cookie;", "Ljava/io/Serializable;", "Lio/ktor/utils/io/JvmSerializable;", "", "name", "value", "Lio/ktor/http/CookieEncoding;", RRWebVideoEvent.JsonKeys.ENCODING, "", "maxAge", "Lio/ktor/util/date/GMTDate;", "expires", "domain", "path", "", "secure", "httpOnly", "", "extensions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lio/ktor/http/CookieEncoding;Ljava/lang/Integer;Lio/ktor/util/date/GMTDate;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/Map;)V", "seen0", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lio/ktor/http/CookieEncoding;Ljava/lang/Integer;Lio/ktor/util/date/GMTDate;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/Map;Lr8/k0;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lio/ktor/http/CookieEncoding;", "component4", "()Ljava/lang/Integer;", "component5", "()Lio/ktor/util/date/GMTDate;", "component6", "component7", "component8", "()Z", "component9", "component10", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lio/ktor/http/CookieEncoding;Ljava/lang/Integer;Lio/ktor/util/date/GMTDate;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/Map;)Lio/ktor/http/Cookie;", "toString", "hashCode", "()I", "", Request.JsonKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "writeReplace", "()Ljava/lang/Object;", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$ktor_http", "(Lio/ktor/http/Cookie;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getName", "getValue", "Lio/ktor/http/CookieEncoding;", "getEncoding", "Ljava/lang/Integer;", "getMaxAgeInt", "Lio/ktor/util/date/GMTDate;", "getExpires", "getDomain", "getPath", "Z", "getSecure", "getHttpOnly", "Ljava/util/Map;", "getExtensions", "Companion", "$serializer", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@i
public final class Cookie implements Serializable {
    private static final KSerializer[] $childSerializers;

    public static final Companion INSTANCE = new Companion(null);
    private final String domain;
    private final CookieEncoding encoding;
    private final GMTDate expires;
    private final Map<String, String> extensions;
    private final boolean httpOnly;
    private final Integer maxAge;
    private final String name;
    private final String path;
    private final boolean secure;
    private final String value;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/ktor/http/Cookie$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lio/ktor/http/Cookie;", "serializer", "()Lkotlinx/serialization/KSerializer;", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer serializer() {
            return Cookie$$serializer.INSTANCE;
        }

        public Companion(AbstractC2541f abstractC2541f) {
            this();
        }
    }

    static {
        C2714z c2714zF = AbstractC2686a0.f("io.ktor.http.CookieEncoding", CookieEncoding.values());
        p0 p0Var = p0.f26988a;
        $childSerializers = new KSerializer[]{null, null, c2714zF, null, null, null, null, null, null, new F(p0Var, V0.s(p0Var), 1)};
    }

    public Cookie(int i3, String str, String str2, CookieEncoding cookieEncoding, Integer num, GMTDate gMTDate, String str3, String str4, boolean z6, boolean z9, Map map, k0 k0Var) {
        if (3 != (i3 & 3)) {
            AbstractC2686a0.l(i3, 3, Cookie$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.name = str;
        this.value = str2;
        if ((i3 & 4) == 0) {
            this.encoding = CookieEncoding.URI_ENCODING;
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
            this.extensions = x.f23206h;
        } else {
            this.extensions = map;
        }
    }

    public static Cookie copy$default(Cookie cookie, String str, String str2, CookieEncoding cookieEncoding, Integer num, GMTDate gMTDate, String str3, String str4, boolean z6, boolean z9, Map map, int i3, Object obj) {
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
        Map map2 = map;
        String str5 = str4;
        boolean z11 = z6;
        GMTDate gMTDate2 = gMTDate;
        String str6 = str3;
        return cookie.copy(str, str2, cookieEncoding, num, gMTDate2, str6, str5, z11, z10, map2);
    }

    public static final void write$Self$ktor_http(Cookie self, p143q8.b output, SerialDescriptor serialDesc) {
        KSerializer[] kSerializerArr = $childSerializers;
        output.s(serialDesc, 0, self.name);
        output.s(serialDesc, 1, self.value);
        if (output.E(serialDesc) || self.encoding != CookieEncoding.URI_ENCODING) {
            output.h(serialDesc, 2, kSerializerArr[2], self.encoding);
        }
        if (output.E(serialDesc) || self.maxAge != null) {
            output.t(serialDesc, 3, K.f26915a, self.maxAge);
        }
        if (output.E(serialDesc) || self.expires != null) {
            output.t(serialDesc, 4, GMTDate$$serializer.INSTANCE, self.expires);
        }
        if (output.E(serialDesc) || self.domain != null) {
            output.t(serialDesc, 5, p0.f26988a, self.domain);
        }
        if (output.E(serialDesc) || self.path != null) {
            output.t(serialDesc, 6, p0.f26988a, self.path);
        }
        if (output.E(serialDesc) || self.secure) {
            output.q(serialDesc, 7, self.secure);
        }
        if (output.E(serialDesc) || self.httpOnly) {
            output.q(serialDesc, 8, self.httpOnly);
        }
        if (!output.E(serialDesc) && m.a(self.extensions, x.f23206h)) {
            return;
        }
        output.h(serialDesc, 9, kSerializerArr[9], self.extensions);
    }

    private final Object writeReplace() {
        return JvmSerializable_jvmKt.JvmSerializerReplacement(CookieJvmSerializer.INSTANCE, this);
    }

    public final String getName() {
        return this.name;
    }

    public final Map<String, String> component10() {
        return this.extensions;
    }

    public final String getValue() {
        return this.value;
    }

    public final CookieEncoding getEncoding() {
        return this.encoding;
    }

    public final Integer getMaxAge() {
        return this.maxAge;
    }

    public final GMTDate getExpires() {
        return this.expires;
    }

    public final String getDomain() {
        return this.domain;
    }

    public final String getPath() {
        return this.path;
    }

    public final boolean getSecure() {
        return this.secure;
    }

    public final boolean getHttpOnly() {
        return this.httpOnly;
    }

    public final Cookie copy(String name, String value, CookieEncoding encoding, Integer maxAge, GMTDate expires, String domain, String path, boolean secure, boolean httpOnly, Map<String, String> extensions) {
        m.e(name, "name");
        m.e(value, "value");
        m.e(encoding, "encoding");
        m.e(extensions, "extensions");
        return new Cookie(name, value, encoding, maxAge, expires, domain, path, secure, httpOnly, extensions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Cookie)) {
            return false;
        }
        Cookie cookie = (Cookie) other;
        return m.a(this.name, cookie.name) && m.a(this.value, cookie.value) && this.encoding == cookie.encoding && m.a(this.maxAge, cookie.maxAge) && m.a(this.expires, cookie.expires) && m.a(this.domain, cookie.domain) && m.a(this.path, cookie.path) && this.secure == cookie.secure && this.httpOnly == cookie.httpOnly && m.a(this.extensions, cookie.extensions);
    }

    public final String getDomain() {
        return this.domain;
    }

    public final CookieEncoding getEncoding() {
        return this.encoding;
    }

    public final GMTDate getExpires() {
        return this.expires;
    }

    public final Map<String, String> getExtensions() {
        return this.extensions;
    }

    public final boolean getHttpOnly() {
        return this.httpOnly;
    }

    public final Integer getMaxAgeInt() {
        return this.maxAge;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPath() {
        return this.path;
    }

    public final boolean getSecure() {
        return this.secure;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = (this.encoding.hashCode() + B2.a.a(this.name.hashCode() * 31, 31, this.value)) * 31;
        Integer num = this.maxAge;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        GMTDate gMTDate = this.expires;
        int iHashCode3 = (iHashCode2 + (gMTDate == null ? 0 : gMTDate.hashCode())) * 31;
        String str = this.domain;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.path;
        return this.extensions.hashCode() + p.f(p.f((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.secure), 31, this.httpOnly);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Cookie(name=");
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
        return p.r(sb, this.extensions, ')');
    }

    public Cookie(String name, String value, CookieEncoding encoding, Integer num, GMTDate gMTDate, String str, String str2, boolean z6, boolean z9, Map<String, String> extensions) {
        m.e(name, "name");
        m.e(value, "value");
        m.e(encoding, "encoding");
        m.e(extensions, "extensions");
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

    public Cookie(String str, String str2, CookieEncoding cookieEncoding, Integer num, GMTDate gMTDate, String str3, String str4, boolean z6, boolean z9, Map map, int i3, AbstractC2541f abstractC2541f) {
        this(str, str2, (i3 & 4) != 0 ? CookieEncoding.URI_ENCODING : cookieEncoding, (i3 & 8) != 0 ? null : num, (i3 & 16) != 0 ? null : gMTDate, (i3 & 32) != 0 ? null : str3, (i3 & 64) != 0 ? null : str4, (i3 & 128) != 0 ? false : z6, (i3 & 256) != 0 ? false : z9, (i3 & 512) != 0 ? x.f23206h : map);
    }
}
