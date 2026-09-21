package io.ktor.client.plugins;

/* JADX INFO: loaded from: classes4.dex */
@io.ktor.utils.io.KtorDsl
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB-\b\u0016\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R(\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R(\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R(\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019¨\u0006\u001f"}, d2 = {"Lio/ktor/client/plugins/HttpTimeoutConfig;", "", "", "requestTimeoutMillis", "connectTimeoutMillis", "socketTimeoutMillis", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "value", "checkTimeoutValue", "(Ljava/lang/Long;)Ljava/lang/Long;", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "_requestTimeoutMillis", "Ljava/lang/Long;", "_connectTimeoutMillis", "_socketTimeoutMillis", "getRequestTimeoutMillis", "()Ljava/lang/Long;", "setRequestTimeoutMillis", "(Ljava/lang/Long;)V", "getConnectTimeoutMillis", "setConnectTimeoutMillis", "getSocketTimeoutMillis", "setSocketTimeoutMillis", "Companion", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class HttpTimeoutConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final io.ktor.client.plugins.HttpTimeoutConfig.Companion INSTANCE = new io.ktor.client.plugins.HttpTimeoutConfig.Companion(0 == true ? 1 : 0);
    public static final long INFINITE_TIMEOUT_MS = Long.MAX_VALUE;
    private static final io.ktor.util.AttributeKey<io.ktor.client.plugins.HttpTimeoutConfig> key;
    private java.lang.Long _connectTimeoutMillis;
    private java.lang.Long _requestTimeoutMillis;
    private java.lang.Long _socketTimeoutMillis;

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/ktor/client/plugins/HttpTimeoutConfig$Companion;", "", "<init>", "()V", "", "INFINITE_TIMEOUT_MS", "J", "Lio/ktor/util/AttributeKey;", "Lio/ktor/client/plugins/HttpTimeoutConfig;", com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt.JSON_NAME_KEY, "Lio/ktor/util/AttributeKey;", "getKey", "()Lio/ktor/util/AttributeKey;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final io.ktor.util.AttributeKey<io.ktor.client.plugins.HttpTimeoutConfig> getKey() {
            return io.ktor.client.plugins.HttpTimeoutConfig.key;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        E6.v vVarA = null;
        E6.InterfaceC0331d interfaceC0331dB = kotlin.jvm.internal.B.f24540a.b(io.ktor.client.plugins.HttpTimeoutConfig.class);
        try {
            vVarA = kotlin.jvm.internal.B.a(io.ktor.client.plugins.HttpTimeoutConfig.class);
        } catch (java.lang.Throwable unused) {
        }
        key = new io.ktor.util.AttributeKey<>("TimeoutConfiguration", new io.ktor.util.reflect.TypeInfo(interfaceC0331dB, vVarA));
    }

    public /* synthetic */ HttpTimeoutConfig(java.lang.Long l2, java.lang.Long l9, java.lang.Long l10, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this((i3 & 1) != 0 ? null : l2, (i3 & 2) != 0 ? null : l9, (i3 & 4) != 0 ? null : l10);
    }

    private final java.lang.Long checkTimeoutValue(java.lang.Long value) {
        if (value == null || value.longValue() > 0) {
            return value;
        }
        throw new java.lang.IllegalArgumentException("Only positive timeout values are allowed, for infinite timeout use HttpTimeout.INFINITE_TIMEOUT_MS");
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || io.ktor.client.plugins.HttpTimeoutConfig.class != other.getClass()) {
            return false;
        }
        io.ktor.client.plugins.HttpTimeoutConfig httpTimeoutConfig = (io.ktor.client.plugins.HttpTimeoutConfig) other;
        return kotlin.jvm.internal.m.a(this._requestTimeoutMillis, httpTimeoutConfig._requestTimeoutMillis) && kotlin.jvm.internal.m.a(this._connectTimeoutMillis, httpTimeoutConfig._connectTimeoutMillis) && kotlin.jvm.internal.m.a(this._socketTimeoutMillis, httpTimeoutConfig._socketTimeoutMillis);
    }

    /* JADX INFO: renamed from: getConnectTimeoutMillis, reason: from getter */
    public final java.lang.Long get_connectTimeoutMillis() {
        return this._connectTimeoutMillis;
    }

    /* JADX INFO: renamed from: getRequestTimeoutMillis, reason: from getter */
    public final java.lang.Long get_requestTimeoutMillis() {
        return this._requestTimeoutMillis;
    }

    /* JADX INFO: renamed from: getSocketTimeoutMillis, reason: from getter */
    public final java.lang.Long get_socketTimeoutMillis() {
        return this._socketTimeoutMillis;
    }

    public int hashCode() {
        java.lang.Long l2 = this._requestTimeoutMillis;
        int iHashCode = (l2 != null ? l2.hashCode() : 0) * 31;
        java.lang.Long l9 = this._connectTimeoutMillis;
        int iHashCode2 = (iHashCode + (l9 != null ? l9.hashCode() : 0)) * 31;
        java.lang.Long l10 = this._socketTimeoutMillis;
        return iHashCode2 + (l10 != null ? l10.hashCode() : 0);
    }

    public final void setConnectTimeoutMillis(java.lang.Long l2) {
        this._connectTimeoutMillis = checkTimeoutValue(l2);
    }

    public final void setRequestTimeoutMillis(java.lang.Long l2) {
        this._requestTimeoutMillis = checkTimeoutValue(l2);
    }

    public final void setSocketTimeoutMillis(java.lang.Long l2) {
        this._socketTimeoutMillis = checkTimeoutValue(l2);
    }

    public HttpTimeoutConfig(java.lang.Long l2, java.lang.Long l9, java.lang.Long l10) {
        this._requestTimeoutMillis = 0L;
        this._connectTimeoutMillis = 0L;
        this._socketTimeoutMillis = 0L;
        setRequestTimeoutMillis(l2);
        setConnectTimeoutMillis(l9);
        setSocketTimeoutMillis(l10);
    }
}
