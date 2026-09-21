package io.ktor.http;

import O7.q;
import androidx.media3.container.NalUnitUtil;
import com.google.android.gms.internal.play_billing.M0;
import com.google.common.util.concurrent.D;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import io.ktor.utils.io.JvmSerializable_jvmKt;
import io.sentry.SentryBaseEvent;
import io.sentry.protocol.Request;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import p070h6.h;
import p078i6.o;
import p078i6.p;
import p078i6.w;
import p119n8.i;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b:\b\u0007\u0018\u0000 P2\u00060\u0001j\u0002`\u0002:\u0001PBe\b\u0000\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u001cR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b&\u0010\u0016R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b'\u0010\u0016R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b(\u0010\u0016R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010\u0012\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001fR&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010,\u0012\u0004\b/\u00100\u001a\u0004\b-\u0010.R\u001d\u00101\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b2\u0010.R!\u00106\u001a\b\u0012\u0004\u0012\u00020\u00050\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010.R\u0019\u00107\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u00108\u001a\u0004\b;\u0010:R\u001b\u0010>\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b<\u00104\u001a\u0004\b=\u0010\u0016R\u001b\u0010A\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b?\u00104\u001a\u0004\b@\u0010\u0016R\u001b\u0010D\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bB\u00104\u001a\u0004\bC\u0010\u0016R\u001d\u0010G\u001a\u0004\u0018\u00010\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bE\u00104\u001a\u0004\bF\u0010\u0016R\u001d\u0010J\u001a\u0004\u0018\u00010\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bH\u00104\u001a\u0004\bI\u0010\u0016R\u001b\u0010M\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bK\u00104\u001a\u0004\bL\u0010\u0016R\u0011\u0010O\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bN\u0010\u001c¨\u0006Q"}, d2 = {"Lio/ktor/http/Url;", "Ljava/io/Serializable;", "Lio/ktor/utils/io/JvmSerializable;", "Lio/ktor/http/URLProtocol;", "protocol", "", DiagnosticsTracker.HOST_KEY, "", "specifiedPort", "", "pathSegments", "Lio/ktor/http/Parameters;", "parameters", Request.JsonKeys.FRAGMENT, SentryBaseEvent.JsonKeys.USER, "password", "", "trailingQuery", "urlString", "<init>", "(Lio/ktor/http/URLProtocol;Ljava/lang/String;ILjava/util/List;Lio/ktor/http/Parameters;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", Request.JsonKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "writeReplace", "()Ljava/lang/Object;", "Ljava/lang/String;", "getHost", "I", "getSpecifiedPort", "Lio/ktor/http/Parameters;", "getParameters", "()Lio/ktor/http/Parameters;", "getFragment", "getUser", "getPassword", "Z", "getTrailingQuery", "()Z", "Ljava/util/List;", "getPathSegments", "()Ljava/util/List;", "getPathSegments$annotations", "()V", "rawSegments", "getRawSegments", "segments$delegate", "Lh6/h;", "getSegments", "segments", "protocolOrNull", "Lio/ktor/http/URLProtocol;", "getProtocolOrNull", "()Lio/ktor/http/URLProtocol;", "getProtocol", "encodedPath$delegate", "getEncodedPath", "encodedPath", "encodedQuery$delegate", "getEncodedQuery", "encodedQuery", "encodedPathAndQuery$delegate", "getEncodedPathAndQuery", "encodedPathAndQuery", "encodedUser$delegate", "getEncodedUser", "encodedUser", "encodedPassword$delegate", "getEncodedPassword", "encodedPassword", "encodedFragment$delegate", "getEncodedFragment", "encodedFragment", "getPort", "port", "Companion", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@i(with = UrlSerializer.class)
public final class Url implements Serializable {

    public static final Companion INSTANCE = new Companion(null);

    private final h encodedFragment;

    private final h encodedPassword;

    private final h encodedPath;

    private final h encodedPathAndQuery;

    private final h encodedQuery;

    private final h encodedUser;
    private final String fragment;
    private final String host;
    private final Parameters parameters;
    private final String password;
    private final List<String> pathSegments;
    private final URLProtocol protocol;
    private final URLProtocol protocolOrNull;
    private final List<String> rawSegments;

    private final h segments;
    private final int specifiedPort;
    private final boolean trailingQuery;
    private final String urlString;
    private final String user;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/ktor/http/Url$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lio/ktor/http/Url;", "serializer", "()Lkotlinx/serialization/KSerializer;", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public Companion(AbstractC2541f abstractC2541f) {
            this();
        }

        public final KSerializer serializer() {
            return UrlSerializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Url(URLProtocol uRLProtocol, String host, int i3, List<String> pathSegments, Parameters parameters, String fragment, String str, String str2, boolean z6, String urlString) {
        m.e(host, "host");
        m.e(pathSegments, "pathSegments");
        m.e(parameters, "parameters");
        m.e(fragment, "fragment");
        m.e(urlString, "urlString");
        this.host = host;
        this.specifiedPort = i3;
        this.parameters = parameters;
        this.fragment = fragment;
        this.user = str;
        this.password = str2;
        this.trailingQuery = z6;
        this.urlString = urlString;
        if (i3 < 0 || i3 >= 65536) {
            throw new IllegalArgumentException(M0.l(i3, "Port must be between 0 and 65535, or 0 if not set. Provided: ").toString());
        }
        this.pathSegments = pathSegments;
        this.rawSegments = pathSegments;
        this.segments = D.B(new c(0, pathSegments));
        this.protocolOrNull = uRLProtocol;
        this.protocol = uRLProtocol == null ? URLProtocol.INSTANCE.getHTTP() : uRLProtocol;
        final int i9 = 0;
        this.encodedPath = D.B(new d(pathSegments, this, i9));
        this.encodedQuery = D.B(new Function0(this) {

            public final Url f23398i;

            {
                this.f23398i = this;
            }

            @Override
            public final Object invoke() {
                switch (i9) {
                    case 0:
                        return Url.encodedQuery_delegate$lambda$4(this.f23398i);
                    case 1:
                        return Url.encodedPathAndQuery_delegate$lambda$5(this.f23398i);
                    case 2:
                        return Url.encodedUser_delegate$lambda$6(this.f23398i);
                    case 3:
                        return Url.encodedPassword_delegate$lambda$7(this.f23398i);
                    default:
                        return Url.encodedFragment_delegate$lambda$8(this.f23398i);
                }
            }
        });
        final int i10 = 1;
        this.encodedPathAndQuery = D.B(new Function0(this) {

            public final Url f23398i;

            {
                this.f23398i = this;
            }

            @Override
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return Url.encodedQuery_delegate$lambda$4(this.f23398i);
                    case 1:
                        return Url.encodedPathAndQuery_delegate$lambda$5(this.f23398i);
                    case 2:
                        return Url.encodedUser_delegate$lambda$6(this.f23398i);
                    case 3:
                        return Url.encodedPassword_delegate$lambda$7(this.f23398i);
                    default:
                        return Url.encodedFragment_delegate$lambda$8(this.f23398i);
                }
            }
        });
        final int i11 = 2;
        this.encodedUser = D.B(new Function0(this) {

            public final Url f23398i;

            {
                this.f23398i = this;
            }

            @Override
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return Url.encodedQuery_delegate$lambda$4(this.f23398i);
                    case 1:
                        return Url.encodedPathAndQuery_delegate$lambda$5(this.f23398i);
                    case 2:
                        return Url.encodedUser_delegate$lambda$6(this.f23398i);
                    case 3:
                        return Url.encodedPassword_delegate$lambda$7(this.f23398i);
                    default:
                        return Url.encodedFragment_delegate$lambda$8(this.f23398i);
                }
            }
        });
        final int i12 = 3;
        this.encodedPassword = D.B(new Function0(this) {

            public final Url f23398i;

            {
                this.f23398i = this;
            }

            @Override
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return Url.encodedQuery_delegate$lambda$4(this.f23398i);
                    case 1:
                        return Url.encodedPathAndQuery_delegate$lambda$5(this.f23398i);
                    case 2:
                        return Url.encodedUser_delegate$lambda$6(this.f23398i);
                    case 3:
                        return Url.encodedPassword_delegate$lambda$7(this.f23398i);
                    default:
                        return Url.encodedFragment_delegate$lambda$8(this.f23398i);
                }
            }
        });
        final int i13 = 4;
        this.encodedFragment = D.B(new Function0(this) {

            public final Url f23398i;

            {
                this.f23398i = this;
            }

            @Override
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return Url.encodedQuery_delegate$lambda$4(this.f23398i);
                    case 1:
                        return Url.encodedPathAndQuery_delegate$lambda$5(this.f23398i);
                    case 2:
                        return Url.encodedUser_delegate$lambda$6(this.f23398i);
                    case 3:
                        return Url.encodedPassword_delegate$lambda$7(this.f23398i);
                    default:
                        return Url.encodedFragment_delegate$lambda$8(this.f23398i);
                }
            }
        });
    }

    public static final String encodedFragment_delegate$lambda$8(Url url) {
        int iK0 = q.K0(url.urlString, '#', 0, 6) + 1;
        if (iK0 == 0) {
            return "";
        }
        String strSubstring = url.urlString.substring(iK0);
        m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final String encodedPassword_delegate$lambda$7(Url url) {
        String str = url.password;
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return "";
        }
        String strSubstring = url.urlString.substring(q.K0(url.urlString, ':', url.protocol.getName().length() + 3, 4) + 1, q.K0(url.urlString, '@', 0, 6));
        m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final String encodedPathAndQuery_delegate$lambda$5(Url url) {
        int iK0 = q.K0(url.urlString, '/', url.protocol.getName().length() + 3, 4);
        if (iK0 == -1) {
            return "";
        }
        int iK1 = q.K0(url.urlString, '#', iK0, 4);
        if (iK1 == -1) {
            String strSubstring = url.urlString.substring(iK0);
            m.d(strSubstring, "substring(...)");
            return strSubstring;
        }
        String strSubstring2 = url.urlString.substring(iK0, iK1);
        m.d(strSubstring2, "substring(...)");
        return strSubstring2;
    }

    public static final String encodedPath_delegate$lambda$3(List list, Url url) {
        int iK0;
        if (list.isEmpty() || (iK0 = q.K0(url.urlString, '/', url.protocol.getName().length() + 3, 4)) == -1) {
            return "";
        }
        int iM0 = q.M0(url.urlString, new char[]{'?', '#'}, iK0, false);
        if (iM0 == -1) {
            String strSubstring = url.urlString.substring(iK0);
            m.d(strSubstring, "substring(...)");
            return strSubstring;
        }
        String strSubstring2 = url.urlString.substring(iK0, iM0);
        m.d(strSubstring2, "substring(...)");
        return strSubstring2;
    }

    public static final String encodedQuery_delegate$lambda$4(Url url) {
        int iK0 = q.K0(url.urlString, '?', 0, 6) + 1;
        if (iK0 == 0) {
            return "";
        }
        int iK1 = q.K0(url.urlString, '#', iK0, 4);
        if (iK1 == -1) {
            String strSubstring = url.urlString.substring(iK0);
            m.d(strSubstring, "substring(...)");
            return strSubstring;
        }
        String strSubstring2 = url.urlString.substring(iK0, iK1);
        m.d(strSubstring2, "substring(...)");
        return strSubstring2;
    }

    public static final String encodedUser_delegate$lambda$6(Url url) {
        String str = url.user;
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return "";
        }
        int length = url.protocol.getName().length() + 3;
        String strSubstring = url.urlString.substring(length, q.M0(url.urlString, new char[]{':', '@'}, length, false));
        m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    @p070h6.c
    public static void getPathSegments$annotations() {
    }

    public static final List segments_delegate$lambda$1(List list) {
        if (list.isEmpty()) {
            return w.f23205h;
        }
        return list.subList((((CharSequence) o.h1(list)).length() != 0 || list.size() <= 1) ? 0 : 1, ((CharSequence) o.q1(list)).length() == 0 ? p.A0(list) : 1 + p.A0(list));
    }

    private final Object writeReplace() {
        return JvmSerializable_jvmKt.JvmSerializerReplacement(UrlJvmSerializer.INSTANCE, this);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || Url.class != other.getClass()) {
            return false;
        }
        return m.a(this.urlString, ((Url) other).urlString);
    }

    public final String getEncodedFragment() {
        return (String) this.encodedFragment.getValue();
    }

    public final String getEncodedPassword() {
        return (String) this.encodedPassword.getValue();
    }

    public final String getEncodedPath() {
        return (String) this.encodedPath.getValue();
    }

    public final String getEncodedPathAndQuery() {
        return (String) this.encodedPathAndQuery.getValue();
    }

    public final String getEncodedQuery() {
        return (String) this.encodedQuery.getValue();
    }

    public final String getEncodedUser() {
        return (String) this.encodedUser.getValue();
    }

    public final String getFragment() {
        return this.fragment;
    }

    public final String getHost() {
        return this.host;
    }

    public final Parameters getParameters() {
        return this.parameters;
    }

    public final String getPassword() {
        return this.password;
    }

    public final List<String> getPathSegments() {
        return this.pathSegments;
    }

    public final int getPort() {
        Integer numValueOf = Integer.valueOf(this.specifiedPort);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : this.protocol.getDefaultPort();
    }

    public final URLProtocol getProtocol() {
        return this.protocol;
    }

    public final URLProtocol getProtocolOrNull() {
        return this.protocolOrNull;
    }

    public final List<String> getRawSegments() {
        return this.rawSegments;
    }

    public final List<String> getSegments() {
        return (List) this.segments.getValue();
    }

    public final int getSpecifiedPort() {
        return this.specifiedPort;
    }

    public final boolean getTrailingQuery() {
        return this.trailingQuery;
    }

    public final String getUser() {
        return this.user;
    }

    public int hashCode() {
        return this.urlString.hashCode();
    }

    public String getUrlString() {
        return this.urlString;
    }
}
