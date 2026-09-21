package io.ktor.websocket;

import O7.q;
import O7.r;
import androidx.media3.container.NalUnitUtil;
import io.ktor.http.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p070h6.k;
import p078i6.o;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\tR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lio/ktor/websocket/WebSocketExtensionHeader;", "", "", "name", "", "parameters", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "parametersToString", "()Ljava/lang/String;", "LN7/m;", "Lh6/k;", "parseParameters", "()LN7/m;", "toString", "Ljava/lang/String;", "getName", "Ljava/util/List;", "getParameters", "()Ljava/util/List;", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class WebSocketExtensionHeader {
    private final String name;
    private final List<String> parameters;

    public WebSocketExtensionHeader(String name, List<String> parameters) {
        m.e(name, "name");
        m.e(parameters, "parameters");
        this.name = name;
        this.parameters = parameters;
    }

    private final String parametersToString() {
        if (this.parameters.isEmpty()) {
            return "";
        }
        return ", " + o.o1(this.parameters, ",", null, null, null, 62);
    }

    public static final k parseParameters$lambda$0(String it) {
        m.e(it, "it");
        int iK0 = q.K0(it, '=', 0, 6);
        String strSubstring = "";
        if (iK0 < 0) {
            return new k(it, "");
        }
        String strH1 = q.h1(it, r.W(0, iK0));
        int i3 = iK0 + 1;
        if (i3 < it.length()) {
            strSubstring = it.substring(i3);
            m.d(strSubstring, "substring(...)");
        }
        return new k(strH1, strSubstring);
    }

    public final String getName() {
        return this.name;
    }

    public final List<String> getParameters() {
        return this.parameters;
    }

    public final N7.m parseParameters() {
        return N7.o.p0(o.Y0(this.parameters), new b(27));
    }

    public String toString() {
        return this.name + ' ' + parametersToString();
    }
}
