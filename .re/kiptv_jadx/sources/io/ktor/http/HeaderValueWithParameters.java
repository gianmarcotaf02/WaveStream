package io.ktor.http;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\b&\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lio/ktor/http/HeaderValueWithParameters;", "", "", "content", "", "Lio/ktor/http/HeaderValueParam;", "parameters", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "name", "parameter", "(Ljava/lang/String;)Ljava/lang/String;", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getContent", "Ljava/util/List;", "getParameters", "()Ljava/util/List;", "Companion", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public abstract class HeaderValueWithParameters {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final io.ktor.http.HeaderValueWithParameters.Companion INSTANCE = new io.ktor.http.HeaderValueWithParameters.Companion(null);
    private final java.lang.String content;
    private final java.util.List<io.ktor.http.HeaderValueParam> parameters;

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u001e\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\r"}, d2 = {"Lio/ktor/http/HeaderValueWithParameters$Companion;", "", "<init>", "()V", "R", "", "value", "Lkotlin/Function2;", "", "Lio/ktor/http/HeaderValueParam;", io.sentry.Session.JsonKeys.INIT, "parse", "(Ljava/lang/String;Lx6/m;)Ljava/lang/Object;", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final <R> R parse(java.lang.String value, p194x6.m init) {
            kotlin.jvm.internal.m.e(value, "value");
            kotlin.jvm.internal.m.e(init, "init");
            io.ktor.http.HeaderValue headerValue = (io.ktor.http.HeaderValue) p078i6.o.q1(io.ktor.http.HttpHeaderValueParserKt.parseHeaderValue(value));
            return (R) init.invoke(headerValue.getValue(), headerValue.getParams());
        }

        private Companion() {
        }
    }

    public HeaderValueWithParameters(java.lang.String content, java.util.List<io.ktor.http.HeaderValueParam> parameters) {
        kotlin.jvm.internal.m.e(content, "content");
        kotlin.jvm.internal.m.e(parameters, "parameters");
        this.content = content;
        this.parameters = parameters;
    }

    public final java.lang.String getContent() {
        return this.content;
    }

    public final java.util.List<io.ktor.http.HeaderValueParam> getParameters() {
        return this.parameters;
    }

    public final java.lang.String parameter(java.lang.String name) {
        kotlin.jvm.internal.m.e(name, "name");
        int iA0 = p078i6.p.A0(this.parameters);
        if (iA0 < 0) {
            return null;
        }
        int i3 = 0;
        while (true) {
            io.ktor.http.HeaderValueParam headerValueParam = this.parameters.get(i3);
            if (O7.x.r0(headerValueParam.getName(), name, true)) {
                return headerValueParam.getValue();
            }
            if (i3 == iA0) {
                return null;
            }
            i3++;
        }
    }

    public java.lang.String toString() {
        if (this.parameters.isEmpty()) {
            return this.content;
        }
        int length = this.content.length();
        int i3 = 0;
        int length2 = 0;
        for (io.ktor.http.HeaderValueParam headerValueParam : this.parameters) {
            length2 += headerValueParam.getValue().length() + headerValueParam.getName().length() + 3;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + length2);
        sb.append(this.content);
        int iA0 = p078i6.p.A0(this.parameters);
        if (iA0 >= 0) {
            while (true) {
                io.ktor.http.HeaderValueParam headerValueParam2 = this.parameters.get(i3);
                sb.append("; ");
                sb.append(headerValueParam2.getName());
                sb.append("=");
                java.lang.String value = headerValueParam2.getValue();
                if (io.ktor.http.HeaderValueWithParametersKt.needQuotes(value)) {
                    sb.append(io.ktor.http.HeaderValueWithParametersKt.quote(value));
                } else {
                    sb.append(value);
                }
                if (i3 == iA0) {
                    break;
                }
                i3++;
            }
        }
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.m.b(string);
        return string;
    }

    public /* synthetic */ HeaderValueWithParameters(java.lang.String str, java.util.List list, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(str, (i3 & 2) != 0 ? p078i6.w.f23205h : list);
    }
}
