package androidx.media3.datasource;

/* JADX INFO: loaded from: classes.dex */
public interface HttpDataSource extends androidx.media3.datasource.DataSource {
    public static final p068h4.l REJECT_PAYWALL_TYPES = new androidx.media3.datasource.d(2);

    public static abstract class BaseFactory implements androidx.media3.datasource.HttpDataSource.Factory {
        private final androidx.media3.datasource.HttpDataSource.RequestProperties defaultRequestProperties = new androidx.media3.datasource.HttpDataSource.RequestProperties();

        public abstract androidx.media3.datasource.HttpDataSource createDataSourceInternal(androidx.media3.datasource.HttpDataSource.RequestProperties requestProperties);

        @Override // androidx.media3.datasource.HttpDataSource.Factory
        public final androidx.media3.datasource.HttpDataSource.Factory setDefaultRequestProperties(java.util.Map<java.lang.String, java.lang.String> map) {
            this.defaultRequestProperties.clearAndSet(map);
            return this;
        }

        @Override // androidx.media3.datasource.HttpDataSource.Factory, androidx.media3.datasource.DataSource.Factory
        public final androidx.media3.datasource.HttpDataSource createDataSource() {
            return createDataSourceInternal(this.defaultRequestProperties);
        }
    }

    public static final class CleartextNotPermittedException extends androidx.media3.datasource.HttpDataSource.HttpDataSourceException {
        public CleartextNotPermittedException(java.io.IOException iOException, androidx.media3.datasource.DataSpec dataSpec) {
            super("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, dataSpec, androidx.media3.common.PlaybackException.ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED, 1);
        }
    }

    public interface Factory extends androidx.media3.datasource.DataSource.Factory {
        @Override // androidx.media3.datasource.DataSource.Factory
        androidx.media3.datasource.HttpDataSource createDataSource();

        androidx.media3.datasource.HttpDataSource.Factory setDefaultRequestProperties(java.util.Map<java.lang.String, java.lang.String> map);
    }

    public static class HttpDataSourceException extends androidx.media3.datasource.DataSourceException {
        public static final int TYPE_CLOSE = 3;
        public static final int TYPE_OPEN = 1;
        public static final int TYPE_READ = 2;
        public final androidx.media3.datasource.DataSpec dataSpec;
        public final int type;

        @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
        @java.lang.annotation.Documented
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface Type {
        }

        @java.lang.Deprecated
        public HttpDataSourceException(androidx.media3.datasource.DataSpec dataSpec, int i3) {
            this(dataSpec, 2000, i3);
        }

        private static int assignErrorCode(int i3, int i9) {
            return (i3 == 2000 && i9 == 1) ? androidx.media3.common.PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED : i3;
        }

        public static androidx.media3.datasource.HttpDataSource.HttpDataSourceException createForIOException(java.io.IOException iOException, androidx.media3.datasource.DataSpec dataSpec, int i3) {
            int i9;
            java.lang.String message = iOException.getMessage();
            if (iOException instanceof java.net.SocketTimeoutException) {
                i9 = androidx.media3.common.PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT;
            } else if (iOException instanceof java.io.InterruptedIOException) {
                i9 = 1004;
            } else {
                i9 = (message == null || !com.google.crypto.tink.shaded.protobuf.AbstractC1909d.i0(message).matches("cleartext.*not permitted.*")) ? androidx.media3.common.PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED : 2007;
            }
            return i9 == 2007 ? new androidx.media3.datasource.HttpDataSource.CleartextNotPermittedException(iOException, dataSpec) : new androidx.media3.datasource.HttpDataSource.HttpDataSourceException(iOException, dataSpec, i9, i3);
        }

        public HttpDataSourceException(androidx.media3.datasource.DataSpec dataSpec, int i3, int i9) {
            super(assignErrorCode(i3, i9));
            this.dataSpec = dataSpec;
            this.type = i9;
        }

        @java.lang.Deprecated
        public HttpDataSourceException(java.lang.String str, androidx.media3.datasource.DataSpec dataSpec, int i3) {
            this(str, dataSpec, 2000, i3);
        }

        public HttpDataSourceException(java.lang.String str, androidx.media3.datasource.DataSpec dataSpec, int i3, int i9) {
            super(str, assignErrorCode(i3, i9));
            this.dataSpec = dataSpec;
            this.type = i9;
        }

        @java.lang.Deprecated
        public HttpDataSourceException(java.io.IOException iOException, androidx.media3.datasource.DataSpec dataSpec, int i3) {
            this(iOException, dataSpec, 2000, i3);
        }

        public HttpDataSourceException(java.io.IOException iOException, androidx.media3.datasource.DataSpec dataSpec, int i3, int i9) {
            super(iOException, assignErrorCode(i3, i9));
            this.dataSpec = dataSpec;
            this.type = i9;
        }

        @java.lang.Deprecated
        public HttpDataSourceException(java.lang.String str, java.io.IOException iOException, androidx.media3.datasource.DataSpec dataSpec, int i3) {
            this(str, iOException, dataSpec, 2000, i3);
        }

        public HttpDataSourceException(java.lang.String str, java.io.IOException iOException, androidx.media3.datasource.DataSpec dataSpec, int i3, int i9) {
            super(str, iOException, assignErrorCode(i3, i9));
            this.dataSpec = dataSpec;
            this.type = i9;
        }
    }

    public static final class InvalidContentTypeException extends androidx.media3.datasource.HttpDataSource.HttpDataSourceException {
        public final java.lang.String contentType;

        public InvalidContentTypeException(java.lang.String str, androidx.media3.datasource.DataSpec dataSpec) {
            super(p121o0.p.C("Invalid content type: ", str), dataSpec, androidx.media3.common.PlaybackException.ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE, 1);
            this.contentType = str;
        }
    }

    public static final class InvalidResponseCodeException extends androidx.media3.datasource.HttpDataSource.HttpDataSourceException {
        public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> headerFields;
        public final byte[] responseBody;
        public final int responseCode;
        public final java.lang.String responseMessage;

        public InvalidResponseCodeException(int i3, java.lang.String str, java.io.IOException iOException, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map, androidx.media3.datasource.DataSpec dataSpec, byte[] bArr) {
            super(com.google.android.gms.internal.play_billing.M0.l(i3, "Response code: "), iOException, dataSpec, androidx.media3.common.PlaybackException.ERROR_CODE_IO_BAD_HTTP_STATUS, 1);
            this.responseCode = i3;
            this.responseMessage = str;
            this.headerFields = map;
            this.responseBody = bArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ boolean lambda$static$0(java.lang.String str) {
        if (str == null) {
            return false;
        }
        java.lang.String strI0 = com.google.crypto.tink.shaded.protobuf.AbstractC1909d.i0(str);
        return (android.text.TextUtils.isEmpty(strI0) || (strI0.contains("text") && !strI0.contains(androidx.media3.common.MimeTypes.TEXT_VTT)) || strI0.contains("html") || strI0.contains("xml")) ? false : true;
    }

    void clearAllRequestProperties();

    void clearRequestProperty(java.lang.String str);

    @Override // androidx.media3.datasource.DataSource
    void close();

    int getResponseCode();

    @Override // androidx.media3.datasource.DataSource
    java.util.Map<java.lang.String, java.util.List<java.lang.String>> getResponseHeaders();

    @Override // androidx.media3.datasource.DataSource
    long open(androidx.media3.datasource.DataSpec dataSpec);

    @Override // androidx.media3.common.DataReader
    int read(byte[] bArr, int i3, int i9);

    void setRequestProperty(java.lang.String str, java.lang.String str2);

    public static final class RequestProperties {
        private final java.util.Map<java.lang.String, java.lang.String> requestProperties = new java.util.HashMap();
        private java.util.Map<java.lang.String, java.lang.String> requestPropertiesSnapshot;

        public synchronized void clear() {
            this.requestPropertiesSnapshot = null;
            this.requestProperties.clear();
        }

        public synchronized void clearAndSet(java.util.Map<java.lang.String, java.lang.String> map) {
            this.requestPropertiesSnapshot = null;
            this.requestProperties.clear();
            this.requestProperties.putAll(map);
        }

        public synchronized java.util.Map<java.lang.String, java.lang.String> getSnapshot() {
            try {
                if (this.requestPropertiesSnapshot == null) {
                    this.requestPropertiesSnapshot = java.util.Collections.unmodifiableMap(new java.util.HashMap(this.requestProperties));
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
            return this.requestPropertiesSnapshot;
        }

        public synchronized void remove(java.lang.String str) {
            this.requestPropertiesSnapshot = null;
            this.requestProperties.remove(str);
        }

        public synchronized void set(java.lang.String str, java.lang.String str2) {
            this.requestPropertiesSnapshot = null;
            this.requestProperties.put(str, str2);
        }

        public synchronized void set(java.util.Map<java.lang.String, java.lang.String> map) {
            this.requestPropertiesSnapshot = null;
            this.requestProperties.putAll(map);
        }
    }
}
