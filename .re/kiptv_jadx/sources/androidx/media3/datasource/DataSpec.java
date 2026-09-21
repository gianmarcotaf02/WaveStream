package androidx.media3.datasource;

/* JADX INFO: loaded from: classes.dex */
public final class DataSpec {
    public static final int FLAG_ALLOW_CACHE_FRAGMENTATION = 4;
    public static final int FLAG_ALLOW_GZIP = 1;
    public static final int FLAG_DONT_CACHE_IF_LENGTH_UNKNOWN = 2;
    public static final int FLAG_MIGHT_NOT_USE_FULL_NETWORK_SPEED = 8;
    public static final int HTTP_METHOD_GET = 1;
    public static final int HTTP_METHOD_HEAD = 3;
    public static final int HTTP_METHOD_POST = 2;

    @java.lang.Deprecated
    public final long absoluteStreamPosition;
    public final java.lang.Object customData;
    public final int flags;
    public final byte[] httpBody;
    public final int httpMethod;
    public final java.util.Map<java.lang.String, java.lang.String> httpRequestHeaders;
    public final java.lang.String key;
    public final long length;
    public final long position;
    public final android.net.Uri uri;
    public final long uriPositionOffset;

    public static final class Builder {
        private java.lang.Object customData;
        private int flags;
        private byte[] httpBody;
        private int httpMethod;
        private java.util.Map<java.lang.String, java.lang.String> httpRequestHeaders;
        private java.lang.String key;
        private long length;
        private long position;
        private android.net.Uri uri;
        private long uriPositionOffset;

        public androidx.media3.datasource.DataSpec build() {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.U(this.uri, "The uri must be set.");
            return new androidx.media3.datasource.DataSpec(this.uri, this.uriPositionOffset, this.httpMethod, this.httpBody, this.httpRequestHeaders, this.position, this.length, this.key, this.flags, this.customData);
        }

        public androidx.media3.datasource.DataSpec.Builder setCustomData(java.lang.Object obj) {
            this.customData = obj;
            return this;
        }

        public androidx.media3.datasource.DataSpec.Builder setFlags(int i3) {
            this.flags = i3;
            return this;
        }

        public androidx.media3.datasource.DataSpec.Builder setHttpBody(byte[] bArr) {
            this.httpBody = bArr;
            return this;
        }

        public androidx.media3.datasource.DataSpec.Builder setHttpMethod(int i3) {
            this.httpMethod = i3;
            return this;
        }

        public androidx.media3.datasource.DataSpec.Builder setHttpRequestHeaders(java.util.Map<java.lang.String, java.lang.String> map) {
            this.httpRequestHeaders = map;
            return this;
        }

        public androidx.media3.datasource.DataSpec.Builder setKey(java.lang.String str) {
            this.key = str;
            return this;
        }

        public androidx.media3.datasource.DataSpec.Builder setLength(long j) {
            this.length = j;
            return this;
        }

        public androidx.media3.datasource.DataSpec.Builder setPosition(long j) {
            this.position = j;
            return this;
        }

        public androidx.media3.datasource.DataSpec.Builder setUri(java.lang.String str) {
            this.uri = android.net.Uri.parse(str);
            return this;
        }

        public androidx.media3.datasource.DataSpec.Builder setUriPositionOffset(long j) {
            this.uriPositionOffset = j;
            return this;
        }

        public Builder() {
            this.httpMethod = 1;
            this.httpRequestHeaders = java.util.Collections.EMPTY_MAP;
            this.length = -1L;
        }

        public androidx.media3.datasource.DataSpec.Builder setUri(android.net.Uri uri) {
            this.uri = uri;
            return this;
        }

        private Builder(androidx.media3.datasource.DataSpec dataSpec) {
            this.uri = dataSpec.uri;
            this.uriPositionOffset = dataSpec.uriPositionOffset;
            this.httpMethod = dataSpec.httpMethod;
            this.httpBody = dataSpec.httpBody;
            this.httpRequestHeaders = dataSpec.httpRequestHeaders;
            this.position = dataSpec.position;
            this.length = dataSpec.length;
            this.key = dataSpec.key;
            this.flags = dataSpec.flags;
            this.customData = dataSpec.customData;
        }
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface HttpMethod {
    }

    static {
        androidx.media3.common.MediaLibraryInfo.registerModule("media3.datasource");
    }

    public static java.lang.String getStringForHttpMethod(int i3) {
        if (i3 == 1) {
            return "GET";
        }
        if (i3 == 2) {
            return androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial.CUE_TRIGGER_POST;
        }
        if (i3 == 3) {
            return "HEAD";
        }
        throw new java.lang.IllegalStateException();
    }

    public androidx.media3.datasource.DataSpec.Builder buildUpon() {
        return new androidx.media3.datasource.DataSpec.Builder();
    }

    public final java.lang.String getHttpMethodString() {
        return getStringForHttpMethod(this.httpMethod);
    }

    public boolean isFlagSet(int i3) {
        return (this.flags & i3) == i3;
    }

    public androidx.media3.datasource.DataSpec subrange(long j) {
        long j9 = this.length;
        return subrange(j, j9 != -1 ? j9 - j : -1L);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DataSpec[");
        sb.append(getHttpMethodString());
        sb.append(io.ktor.sse.ServerSentEventKt.SPACE);
        sb.append(this.uri);
        sb.append(", ");
        sb.append(this.position);
        sb.append(", ");
        sb.append(this.length);
        sb.append(", ");
        sb.append(this.key);
        sb.append(", ");
        return Y6.f.k(sb, this.flags, "]");
    }

    public androidx.media3.datasource.DataSpec withAdditionalHeaders(java.util.Map<java.lang.String, java.lang.String> map) {
        java.util.HashMap map2 = new java.util.HashMap(this.httpRequestHeaders);
        map2.putAll(map);
        return new androidx.media3.datasource.DataSpec(this.uri, this.uriPositionOffset, this.httpMethod, this.httpBody, map2, this.position, this.length, this.key, this.flags, this.customData);
    }

    public androidx.media3.datasource.DataSpec withRequestHeaders(java.util.Map<java.lang.String, java.lang.String> map) {
        return new androidx.media3.datasource.DataSpec(this.uri, this.uriPositionOffset, this.httpMethod, this.httpBody, map, this.position, this.length, this.key, this.flags, this.customData);
    }

    public androidx.media3.datasource.DataSpec withUri(android.net.Uri uri) {
        return new androidx.media3.datasource.DataSpec(uri, this.uriPositionOffset, this.httpMethod, this.httpBody, this.httpRequestHeaders, this.position, this.length, this.key, this.flags, this.customData);
    }

    public DataSpec(android.net.Uri uri) {
        this(uri, 0L, -1L);
    }

    public androidx.media3.datasource.DataSpec subrange(long j, long j9) {
        return (j == 0 && this.length == j9) ? this : new androidx.media3.datasource.DataSpec(this.uri, this.uriPositionOffset, this.httpMethod, this.httpBody, this.httpRequestHeaders, this.position + j, j9, this.key, this.flags, this.customData);
    }

    public DataSpec(android.net.Uri uri, long j, long j9) {
        this(uri, j, j9, null);
    }

    @java.lang.Deprecated
    public DataSpec(android.net.Uri uri, long j, long j9, java.lang.String str) {
        this(uri, 0L, 1, null, java.util.Collections.EMPTY_MAP, j, j9, str, 0, null);
    }

    private DataSpec(android.net.Uri uri, long j, int i3, byte[] bArr, java.util.Map<java.lang.String, java.lang.String> map, long j9, long j10, java.lang.String str, int i9, java.lang.Object obj) {
        byte[] bArr2 = bArr;
        long j11 = j + j9;
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(j11 >= 0);
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(j9 >= 0);
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(j10 > 0 || j10 == -1);
        uri.getClass();
        this.uri = uri;
        this.uriPositionOffset = j;
        this.httpMethod = i3;
        this.httpBody = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.httpRequestHeaders = java.util.Collections.unmodifiableMap(new java.util.HashMap(map));
        this.position = j9;
        this.absoluteStreamPosition = j11;
        this.length = j10;
        this.key = str;
        this.flags = i9;
        this.customData = obj;
    }
}
