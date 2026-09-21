package io.ktor.http;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lio/ktor/http/HeaderValue;", "", "", "value", "", "Lio/ktor/http/HeaderValueParam;", io.sentry.protocol.Message.JsonKeys.PARAMS, "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lio/ktor/http/HeaderValue;", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getValue", "Ljava/util/List;", "getParams", "", "quality", "D", "getQuality", "()D", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final /* data */ class HeaderValue {
    private final java.util.List<io.ktor.http.HeaderValueParam> params;
    private final double quality;
    private final java.lang.String value;

    public HeaderValue(java.lang.String value, java.util.List<io.ktor.http.HeaderValueParam> params) {
        java.lang.Double d4;
        java.lang.Object next;
        java.lang.String value2;
        java.lang.Double dL0;
        kotlin.jvm.internal.m.e(value, "value");
        kotlin.jvm.internal.m.e(params, "params");
        this.value = value;
        this.params = params;
        java.util.Iterator<T> it = params.iterator();
        do {
            d4 = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.m.a(((io.ktor.http.HeaderValueParam) next).getName(), "q"));
        io.ktor.http.HeaderValueParam headerValueParam = (io.ktor.http.HeaderValueParam) next;
        double dDoubleValue = 1.0d;
        if (headerValueParam != null && (value2 = headerValueParam.getValue()) != null && (dL0 = O7.w.l0(value2)) != null) {
            double dDoubleValue2 = dL0.doubleValue();
            if (0.0d <= dDoubleValue2 && dDoubleValue2 <= 1.0d) {
                d4 = dL0;
            }
            if (d4 != null) {
                dDoubleValue = d4.doubleValue();
            }
        }
        this.quality = dDoubleValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ io.ktor.http.HeaderValue copy$default(io.ktor.http.HeaderValue headerValue, java.lang.String str, java.util.List list, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = headerValue.value;
        }
        if ((i3 & 2) != 0) {
            list = headerValue.params;
        }
        return headerValue.copy(str, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getValue() {
        return this.value;
    }

    public final java.util.List<io.ktor.http.HeaderValueParam> component2() {
        return this.params;
    }

    public final io.ktor.http.HeaderValue copy(java.lang.String value, java.util.List<io.ktor.http.HeaderValueParam> params) {
        kotlin.jvm.internal.m.e(value, "value");
        kotlin.jvm.internal.m.e(params, "params");
        return new io.ktor.http.HeaderValue(value, params);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof io.ktor.http.HeaderValue)) {
            return false;
        }
        io.ktor.http.HeaderValue headerValue = (io.ktor.http.HeaderValue) other;
        return kotlin.jvm.internal.m.a(this.value, headerValue.value) && kotlin.jvm.internal.m.a(this.params, headerValue.params);
    }

    public final java.util.List<io.ktor.http.HeaderValueParam> getParams() {
        return this.params;
    }

    public final double getQuality() {
        return this.quality;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.params.hashCode() + (this.value.hashCode() * 31);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("HeaderValue(value=");
        sb.append(this.value);
        sb.append(", params=");
        return com.google.android.gms.internal.play_billing.M0.n(sb, this.params, ')');
    }

    public /* synthetic */ HeaderValue(java.lang.String str, java.util.List list, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(str, (i3 & 2) != 0 ? p078i6.w.f23205h : list);
    }
}
