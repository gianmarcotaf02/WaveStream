package io.ktor.http;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J.\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u0014¨\u0006\u001d"}, d2 = {"Lio/ktor/http/HeaderValueParam;", "", "", "name", "value", "", "escapeValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "(Ljava/lang/String;Ljava/lang/String;)V", io.sentry.protocol.Request.JsonKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Z)Lio/ktor/http/HeaderValueParam;", "toString", "Ljava/lang/String;", "getName", "getValue", "Z", "getEscapeValue", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final /* data */ class HeaderValueParam {
    private final boolean escapeValue;
    private final java.lang.String name;
    private final java.lang.String value;

    public HeaderValueParam(java.lang.String name, java.lang.String value, boolean z6) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(value, "value");
        this.name = name;
        this.value = value;
        this.escapeValue = z6;
    }

    public static /* synthetic */ io.ktor.http.HeaderValueParam copy$default(io.ktor.http.HeaderValueParam headerValueParam, java.lang.String str, java.lang.String str2, boolean z6, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = headerValueParam.name;
        }
        if ((i3 & 2) != 0) {
            str2 = headerValueParam.value;
        }
        if ((i3 & 4) != 0) {
            z6 = headerValueParam.escapeValue;
        }
        return headerValueParam.copy(str, str2, z6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getEscapeValue() {
        return this.escapeValue;
    }

    public final io.ktor.http.HeaderValueParam copy(java.lang.String name, java.lang.String value, boolean escapeValue) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(value, "value");
        return new io.ktor.http.HeaderValueParam(name, value, escapeValue);
    }

    public boolean equals(java.lang.Object other) {
        if (!(other instanceof io.ktor.http.HeaderValueParam)) {
            return false;
        }
        io.ktor.http.HeaderValueParam headerValueParam = (io.ktor.http.HeaderValueParam) other;
        return O7.x.r0(headerValueParam.name, this.name, true) && O7.x.r0(headerValueParam.value, this.value, true);
    }

    public final boolean getEscapeValue() {
        return this.escapeValue;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    public int hashCode() {
        java.lang.String str = this.name;
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String lowerCase = str.toLowerCase(locale);
        kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
        int iHashCode = lowerCase.hashCode();
        java.lang.String lowerCase2 = this.value.toLowerCase(locale);
        kotlin.jvm.internal.m.d(lowerCase2, "toLowerCase(...)");
        return lowerCase2.hashCode() + (iHashCode * 31) + iHashCode;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("HeaderValueParam(name=");
        sb.append(this.name);
        sb.append(", value=");
        sb.append(this.value);
        sb.append(", escapeValue=");
        return v5.L.a(sb, this.escapeValue, ')');
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HeaderValueParam(java.lang.String name, java.lang.String value) {
        this(name, value, false);
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(value, "value");
    }
}
