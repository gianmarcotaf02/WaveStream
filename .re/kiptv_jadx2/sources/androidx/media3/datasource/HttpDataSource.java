package androidx.media3.datasource;

import android.text.TextUtils;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.PlaybackException;
import com.google.android.gms.internal.play_billing.M0;
import com.google.crypto.tink.shaded.protobuf.AbstractC1909d;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p068h4.l;
import p121o0.p;

public interface HttpDataSource extends DataSource {
    public static final l REJECT_PAYWALL_TYPES = new d(2);

    public static abstract class BaseFactory implements Factory {
        private final RequestProperties defaultRequestProperties = new RequestProperties();

        public abstract HttpDataSource createDataSourceInternal(RequestProperties requestProperties);

        @Override
        public final Factory setDefaultRequestProperties(Map<String, String> map) {
            this.defaultRequestProperties.clearAndSet(map);
            return this;
        }

        @Override
        public final HttpDataSource createDataSource() {
            return createDataSourceInternal(this.defaultRequestProperties);
        }
    }

    public static final class CleartextNotPermittedException extends HttpDataSourceException {
        public CleartextNotPermittedException(IOException iOException, DataSpec dataSpec) {
            super("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, dataSpec, PlaybackException.ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED, 1);
        }
    }

    public interface Factory extends DataSource.Factory {
        @Override
        HttpDataSource createDataSource();

        Factory setDefaultRequestProperties(Map<String, String> map);
    }

    public static class HttpDataSourceException extends DataSourceException {
        public static final int TYPE_CLOSE = 3;
        public static final int TYPE_OPEN = 1;
        public static final int TYPE_READ = 2;
        public final DataSpec dataSpec;
        public final int type;

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Type {
        }

        @Deprecated
        public HttpDataSourceException(DataSpec dataSpec, int i3) {
            this(dataSpec, 2000, i3);
        }

        private static int assignErrorCode(int i3, int i9) {
            return (i3 == 2000 && i9 == 1) ? PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED : i3;
        }

        public static HttpDataSourceException createForIOException(IOException iOException, DataSpec dataSpec, int i3) {
            int i9;
            String message = iOException.getMessage();
            if (iOException instanceof SocketTimeoutException) {
                i9 = PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT;
            } else if (iOException instanceof InterruptedIOException) {
                i9 = 1004;
            } else {
                i9 = (message == null || !AbstractC1909d.i0(message).matches("cleartext.*not permitted.*")) ? PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED : 2007;
            }
            return i9 == 2007 ? new CleartextNotPermittedException(iOException, dataSpec) : new HttpDataSourceException(iOException, dataSpec, i9, i3);
        }

        public HttpDataSourceException(DataSpec dataSpec, int i3, int i9) {
            super(assignErrorCode(i3, i9));
            this.dataSpec = dataSpec;
            this.type = i9;
        }

        @Deprecated
        public HttpDataSourceException(String str, DataSpec dataSpec, int i3) {
            this(str, dataSpec, 2000, i3);
        }

        public HttpDataSourceException(String str, DataSpec dataSpec, int i3, int i9) {
            super(str, assignErrorCode(i3, i9));
            this.dataSpec = dataSpec;
            this.type = i9;
        }

        @Deprecated
        public HttpDataSourceException(IOException iOException, DataSpec dataSpec, int i3) {
            this(iOException, dataSpec, 2000, i3);
        }

        public HttpDataSourceException(IOException iOException, DataSpec dataSpec, int i3, int i9) {
            super(iOException, assignErrorCode(i3, i9));
            this.dataSpec = dataSpec;
            this.type = i9;
        }

        @Deprecated
        public HttpDataSourceException(String str, IOException iOException, DataSpec dataSpec, int i3) {
            this(str, iOException, dataSpec, 2000, i3);
        }

        public HttpDataSourceException(String str, IOException iOException, DataSpec dataSpec, int i3, int i9) {
            super(str, iOException, assignErrorCode(i3, i9));
            this.dataSpec = dataSpec;
            this.type = i9;
        }
    }

    public static final class InvalidContentTypeException extends HttpDataSourceException {
        public final String contentType;

        public InvalidContentTypeException(String str, DataSpec dataSpec) {
            super(p.C("Invalid content type: ", str), dataSpec, PlaybackException.ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE, 1);
            this.contentType = str;
        }
    }

    public static final class InvalidResponseCodeException extends HttpDataSourceException {
        public final Map<String, List<String>> headerFields;
        public final byte[] responseBody;
        public final int responseCode;
        public final String responseMessage;

        public InvalidResponseCodeException(int i3, String str, IOException iOException, Map<String, List<String>> map, DataSpec dataSpec, byte[] bArr) {
            super(M0.l(i3, "Response code: "), iOException, dataSpec, PlaybackException.ERROR_CODE_IO_BAD_HTTP_STATUS, 1);
            this.responseCode = i3;
            this.responseMessage = str;
            this.headerFields = map;
            this.responseBody = bArr;
        }
    }

    static boolean lambda$static$0(String str) {
        if (str == null) {
            return false;
        }
        String strI0 = AbstractC1909d.i0(str);
        return (TextUtils.isEmpty(strI0) || (strI0.contains("text") && !strI0.contains(MimeTypes.TEXT_VTT)) || strI0.contains("html") || strI0.contains("xml")) ? false : true;
    }

    void clearAllRequestProperties();

    void clearRequestProperty(String str);

    @Override
    void close();

    int getResponseCode();

    @Override
    Map<String, List<String>> getResponseHeaders();

    @Override
    long open(DataSpec dataSpec);

    @Override
    int read(byte[] bArr, int i3, int i9);

    void setRequestProperty(String str, String str2);

    public static final class RequestProperties {
        private final Map<String, String> requestProperties = new HashMap();
        private Map<String, String> requestPropertiesSnapshot;

        public synchronized void clear() {
            this.requestPropertiesSnapshot = null;
            this.requestProperties.clear();
        }

        public synchronized void clearAndSet(Map<String, String> map) {
            this.requestPropertiesSnapshot = null;
            this.requestProperties.clear();
            this.requestProperties.putAll(map);
        }

        public synchronized Map<String, String> getSnapshot() {
            try {
                if (this.requestPropertiesSnapshot == null) {
                    this.requestPropertiesSnapshot = Collections.unmodifiableMap(new HashMap(this.requestProperties));
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.requestPropertiesSnapshot;
        }

        public synchronized void remove(String str) {
            this.requestPropertiesSnapshot = null;
            this.requestProperties.remove(str);
        }

        public synchronized void set(String str, String str2) {
            this.requestPropertiesSnapshot = null;
            this.requestProperties.put(str, str2);
        }

        public synchronized void set(Map<String, String> map) {
            this.requestPropertiesSnapshot = null;
            this.requestProperties.putAll(map);
        }
    }
}
