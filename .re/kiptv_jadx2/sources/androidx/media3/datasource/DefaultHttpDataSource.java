package androidx.media3.datasource;

import android.net.TrafficStats;
import android.net.Uri;
import android.os.Build;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import com.google.android.gms.internal.play_billing.M0;
import com.revenuecat.purchases.common.HTTPClient;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import p068h4.l;
import p076i4.AbstractC2230y;
import p076i4.O;
import p076i4.X0;
import p084j4.g;
import p121o0.p;

public class DefaultHttpDataSource extends BaseDataSource implements HttpDataSource {
    public static final int DEFAULT_CONNECT_TIMEOUT_MILLIS = 8000;
    public static final int DEFAULT_READ_TIMEOUT_MILLIS = 8000;
    private static final int HTTP_STATUS_PERMANENT_REDIRECT = 308;
    private static final int HTTP_STATUS_TEMPORARY_REDIRECT = 307;
    private static final int MAX_REDIRECTS = 20;
    private static final String TAG = "DefaultHttpDataSource";
    private final boolean allowCrossProtocolRedirects;
    private long bytesRead;
    private long bytesToRead;
    private final int connectTimeoutMillis;
    private HttpURLConnection connection;
    private final l contentTypePredicate;
    private final boolean crossProtocolRedirectsForceOriginal;
    private DataSpec dataSpec;
    private final HttpDataSource.RequestProperties defaultRequestProperties;
    private InputStream inputStream;
    private final boolean keepPostFor302Redirects;
    private final int readTimeoutMillis;
    private final HttpDataSource.RequestProperties requestProperties;
    private int responseCode;
    private boolean transferStarted;
    private final String userAgent;

    public static final class Factory implements HttpDataSource.Factory {
        private boolean allowCrossProtocolRedirects;
        private l contentTypePredicate;
        private boolean crossProtocolRedirectsForceOriginal;
        private boolean keepPostFor302Redirects;
        private TransferListener transferListener;
        private String userAgent;
        private final HttpDataSource.RequestProperties defaultRequestProperties = new HttpDataSource.RequestProperties();
        private int connectTimeoutMs = 8000;
        private int readTimeoutMs = 8000;

        public Factory setAllowCrossProtocolRedirects(boolean z6) {
            this.allowCrossProtocolRedirects = z6;
            return this;
        }

        public Factory setConnectTimeoutMs(int i3) {
            this.connectTimeoutMs = i3;
            return this;
        }

        public Factory setContentTypePredicate(l lVar) {
            this.contentTypePredicate = lVar;
            return this;
        }

        public Factory setCrossProtocolRedirectsForceOriginal(boolean z6) {
            this.crossProtocolRedirectsForceOriginal = z6;
            return this;
        }

        @Override
        public HttpDataSource.Factory setDefaultRequestProperties(Map map) {
            return setDefaultRequestProperties((Map<String, String>) map);
        }

        public Factory setKeepPostFor302Redirects(boolean z6) {
            this.keepPostFor302Redirects = z6;
            return this;
        }

        public Factory setReadTimeoutMs(int i3) {
            this.readTimeoutMs = i3;
            return this;
        }

        public Factory setTransferListener(TransferListener transferListener) {
            this.transferListener = transferListener;
            return this;
        }

        public Factory setUserAgent(String str) {
            this.userAgent = str;
            return this;
        }

        @Override
        public Factory setDefaultRequestProperties(Map<String, String> map) {
            this.defaultRequestProperties.clearAndSet(map);
            return this;
        }

        @Override
        public DefaultHttpDataSource createDataSource() {
            DefaultHttpDataSource defaultHttpDataSource = new DefaultHttpDataSource(this.userAgent, this.connectTimeoutMs, this.readTimeoutMs, this.allowCrossProtocolRedirects, this.crossProtocolRedirectsForceOriginal, this.defaultRequestProperties, this.contentTypePredicate, this.keepPostFor302Redirects);
            TransferListener transferListener = this.transferListener;
            if (transferListener != null) {
                defaultHttpDataSource.addTransferListener(transferListener);
            }
            return defaultHttpDataSource;
        }
    }

    public static class NullFilteringHeadersMap extends O {
        private final Map<String, List<String>> headers;

        public NullFilteringHeadersMap(Map<String, List<String>> map) {
            this.headers = map;
        }

        public static boolean lambda$entrySet$1(Map.Entry entry) {
            return entry.getKey() != null;
        }

        public static boolean lambda$keySet$0(String str) {
            return str != null;
        }

        @Override
        public boolean containsKey(Object obj) {
            return obj != null && super.containsKey(obj);
        }

        @Override
        public boolean containsValue(Object obj) {
            return super.standardContainsValue(obj);
        }

        @Override
        public Set<Map.Entry<String, List<String>>> entrySet() {
            return AbstractC2230y.j(super.entrySet(), new d(0));
        }

        @Override
        public boolean equals(Object obj) {
            return obj != null && super.standardEquals(obj);
        }

        @Override
        public int hashCode() {
            return super.standardHashCode();
        }

        @Override
        public boolean isEmpty() {
            return super.isEmpty() || (super.size() == 1 && super.containsKey(null));
        }

        @Override
        public Set<String> keySet() {
            return AbstractC2230y.j(super.keySet(), new d(1));
        }

        @Override
        public int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }

        @Override
        public Map<String, List<String>> delegate() {
            return this.headers;
        }

        @Override
        public List<String> get(Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }
    }

    private void closeConnectionQuietly() {
        HttpURLConnection httpURLConnection = this.connection;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e6) {
                Log.e(TAG, "Unexpected error while disconnecting", e6);
            }
        }
    }

    private static long getCurrentThreadId() {
        Thread threadCurrentThread = Thread.currentThread();
        return Build.VERSION.SDK_INT < 36 ? threadCurrentThread.getId() : threadCurrentThread.threadId();
    }

    private URL handleRedirect(URL url, String str, DataSpec dataSpec) throws HttpDataSource.HttpDataSourceException {
        if (str == null) {
            throw new HttpDataSource.HttpDataSourceException("Null location redirect", dataSpec, PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new HttpDataSource.HttpDataSourceException(p.C("Unsupported protocol redirect: ", protocol), dataSpec, PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED, 1);
            }
            if (this.allowCrossProtocolRedirects || protocol.equals(url.getProtocol())) {
                return url2;
            }
            if (this.crossProtocolRedirectsForceOriginal) {
                try {
                    return new URL(url2.toString().replaceFirst(protocol, url.getProtocol()));
                } catch (MalformedURLException e6) {
                    throw new HttpDataSource.HttpDataSourceException(e6, dataSpec, PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED, 1);
                }
            }
            throw new HttpDataSource.HttpDataSourceException("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", dataSpec, PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED, 1);
        } catch (MalformedURLException e9) {
            throw new HttpDataSource.HttpDataSourceException(e9, dataSpec, PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED, 1);
        }
    }

    private static boolean isCompressed(HttpURLConnection httpURLConnection) {
        return HTTPClient.RC_FORMAT_ACCEPT_ENCODING.equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    private HttpURLConnection makeConnection(DataSpec dataSpec) throws IOException {
        URL url = new URL(dataSpec.uri.toString());
        int i3 = dataSpec.httpMethod;
        byte[] bArr = dataSpec.httpBody;
        long j = dataSpec.position;
        long j9 = dataSpec.length;
        int i9 = 1;
        boolean zIsFlagSet = dataSpec.isFlagSet(1);
        if (!this.allowCrossProtocolRedirects && !this.crossProtocolRedirectsForceOriginal && !this.keepPostFor302Redirects) {
            return makeConnection(url, i3, bArr, j, j9, zIsFlagSet, true, dataSpec.httpRequestHeaders);
        }
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (i10 > 20) {
                throw new HttpDataSource.HttpDataSourceException(new NoRouteToHostException(M0.l(i11, "Too many redirects: ")), dataSpec, PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED, 1);
            }
            HttpURLConnection httpURLConnectionMakeConnection = makeConnection(url, i3, bArr, j, j9, zIsFlagSet, false, dataSpec.httpRequestHeaders);
            int responseCode = httpURLConnectionMakeConnection.getResponseCode();
            String headerField = httpURLConnectionMakeConnection.getHeaderField("Location");
            if ((i3 == i9 || i3 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == HTTP_STATUS_TEMPORARY_REDIRECT || responseCode == HTTP_STATUS_PERMANENT_REDIRECT)) {
                httpURLConnectionMakeConnection.disconnect();
                url = handleRedirect(url, headerField, dataSpec);
            } else {
                if (i3 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return httpURLConnectionMakeConnection;
                }
                httpURLConnectionMakeConnection.disconnect();
                if (!this.keepPostFor302Redirects || responseCode != 302) {
                    bArr = null;
                    i3 = 1;
                }
                url = handleRedirect(url, headerField, dataSpec);
            }
            i10 = i11;
            i9 = 1;
        }
    }

    private int readInternal(byte[] bArr, int i3, int i9) throws IOException {
        if (i9 == 0) {
            return 0;
        }
        long j = this.bytesToRead;
        if (j != -1) {
            long j9 = j - this.bytesRead;
            if (j9 == 0) {
                return -1;
            }
            i9 = (int) Math.min(i9, j9);
        }
        int i10 = ((InputStream) Util.castNonNull(this.inputStream)).read(bArr, i3, i9);
        if (i10 == -1) {
            return -1;
        }
        this.bytesRead += (long) i10;
        bytesTransferred(i10);
        return i10;
    }

    private void skipFully(long j, DataSpec dataSpec) throws IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int i3 = ((InputStream) Util.castNonNull(this.inputStream)).read(bArr, 0, (int) Math.min(j, 4096));
            if (Thread.currentThread().isInterrupted()) {
                throw new HttpDataSource.HttpDataSourceException(new InterruptedIOException(), dataSpec, 2000, 1);
            }
            if (i3 == -1) {
                throw new HttpDataSource.HttpDataSourceException(dataSpec, 2008, 1);
            }
            j -= (long) i3;
            bytesTransferred(i3);
        }
    }

    @Override
    public void clearAllRequestProperties() {
        this.requestProperties.clear();
    }

    @Override
    public void clearRequestProperty(String str) {
        str.getClass();
        this.requestProperties.remove(str);
    }

    @Override
    public void close() {
        try {
            InputStream inputStream = this.inputStream;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e6) {
                    throw new HttpDataSource.HttpDataSourceException(e6, (DataSpec) Util.castNonNull(this.dataSpec), 2000, 3);
                }
            }
            this.inputStream = null;
            closeConnectionQuietly();
            if (this.transferStarted) {
                this.transferStarted = false;
                transferEnded();
            }
            this.connection = null;
            this.dataSpec = null;
            TrafficStats.clearThreadStatsTag();
        } catch (Throwable th) {
            this.inputStream = null;
            closeConnectionQuietly();
            if (this.transferStarted) {
                this.transferStarted = false;
                transferEnded();
            }
            this.connection = null;
            this.dataSpec = null;
            TrafficStats.clearThreadStatsTag();
            throw th;
        }
    }

    @Override
    public int getResponseCode() {
        int i3;
        if (this.connection == null || (i3 = this.responseCode) <= 0) {
            return -1;
        }
        return i3;
    }

    @Override
    public Map<String, List<String>> getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.connection;
        return httpURLConnection == null ? X0.f22848n : new NullFilteringHeadersMap(httpURLConnection.getHeaderFields());
    }

    @Override
    public Uri getUri() {
        HttpURLConnection httpURLConnection = this.connection;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        DataSpec dataSpec = this.dataSpec;
        if (dataSpec != null) {
            return dataSpec.uri;
        }
        return null;
    }

    @Override
    public long open(DataSpec dataSpec) throws HttpDataSource.HttpDataSourceException {
        byte[] bArrB;
        this.dataSpec = dataSpec;
        long j = 0;
        this.bytesRead = 0L;
        this.bytesToRead = 0L;
        transferInitializing(dataSpec);
        try {
            TrafficStats.setThreadStatsTag((int) getCurrentThreadId());
            HttpURLConnection httpURLConnectionMakeConnection = makeConnection(dataSpec);
            this.connection = httpURLConnectionMakeConnection;
            this.responseCode = httpURLConnectionMakeConnection.getResponseCode();
            String responseMessage = httpURLConnectionMakeConnection.getResponseMessage();
            int i3 = this.responseCode;
            if (i3 < 200 || i3 > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionMakeConnection.getHeaderFields();
                if (this.responseCode == 416) {
                    if (dataSpec.position == HttpUtil.getDocumentSize(httpURLConnectionMakeConnection.getHeaderField("Content-Range"))) {
                        this.transferStarted = true;
                        transferStarted(dataSpec);
                        long j9 = dataSpec.length;
                        if (j9 != -1) {
                            return j9;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = httpURLConnectionMakeConnection.getErrorStream();
                try {
                    bArrB = errorStream != null ? g.b(errorStream) : Util.EMPTY_BYTE_ARRAY;
                } catch (IOException unused) {
                    bArrB = Util.EMPTY_BYTE_ARRAY;
                }
                byte[] bArr = bArrB;
                closeConnectionQuietly();
                throw new HttpDataSource.InvalidResponseCodeException(this.responseCode, responseMessage, this.responseCode == 416 ? new DataSourceException(2008) : null, headerFields, dataSpec, bArr);
            }
            String contentType = httpURLConnectionMakeConnection.getContentType();
            l lVar = this.contentTypePredicate;
            if (lVar != null && !lVar.apply(contentType)) {
                closeConnectionQuietly();
                throw new HttpDataSource.InvalidContentTypeException(contentType, dataSpec);
            }
            if (this.responseCode == 200) {
                long j10 = dataSpec.position;
                if (j10 != 0) {
                    j = j10;
                }
            }
            boolean zIsCompressed = isCompressed(httpURLConnectionMakeConnection);
            if (zIsCompressed) {
                this.bytesToRead = dataSpec.length;
            } else {
                long j11 = dataSpec.length;
                if (j11 != -1) {
                    this.bytesToRead = j11;
                } else {
                    long contentLength = HttpUtil.getContentLength(httpURLConnectionMakeConnection.getHeaderField("Content-Length"), httpURLConnectionMakeConnection.getHeaderField("Content-Range"));
                    this.bytesToRead = contentLength != -1 ? contentLength - j : -1L;
                }
            }
            try {
                this.inputStream = httpURLConnectionMakeConnection.getInputStream();
                if (zIsCompressed) {
                    this.inputStream = new GZIPInputStream(this.inputStream);
                }
                this.transferStarted = true;
                transferStarted(dataSpec);
                try {
                    skipFully(j, dataSpec);
                    return this.bytesToRead;
                } catch (IOException e6) {
                    closeConnectionQuietly();
                    if (e6 instanceof HttpDataSource.HttpDataSourceException) {
                        throw ((HttpDataSource.HttpDataSourceException) e6);
                    }
                    throw new HttpDataSource.HttpDataSourceException(e6, dataSpec, 2000, 1);
                }
            } catch (IOException e9) {
                closeConnectionQuietly();
                throw new HttpDataSource.HttpDataSourceException(e9, dataSpec, 2000, 1);
            }
        } catch (IOException e10) {
            closeConnectionQuietly();
            throw HttpDataSource.HttpDataSourceException.createForIOException(e10, dataSpec, 1);
        }
    }

    public HttpURLConnection openConnection(URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    @Override
    public int read(byte[] bArr, int i3, int i9) throws HttpDataSource.HttpDataSourceException {
        try {
            return readInternal(bArr, i3, i9);
        } catch (IOException e6) {
            throw HttpDataSource.HttpDataSourceException.createForIOException(e6, (DataSpec) Util.castNonNull(this.dataSpec), 2);
        }
    }

    @Override
    public void setRequestProperty(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.requestProperties.set(str, str2);
    }

    private DefaultHttpDataSource(String str, int i3, int i9, boolean z6, boolean z9, HttpDataSource.RequestProperties requestProperties, l lVar, boolean z10) {
        super(true);
        this.userAgent = str;
        this.connectTimeoutMillis = i3;
        this.readTimeoutMillis = i9;
        this.allowCrossProtocolRedirects = z6;
        this.crossProtocolRedirectsForceOriginal = z9;
        if (z6 && z9) {
            throw new IllegalArgumentException("crossProtocolRedirectsForceOriginal should not be set if allowCrossProtocolRedirects is true");
        }
        this.defaultRequestProperties = requestProperties;
        this.contentTypePredicate = lVar;
        this.requestProperties = new HttpDataSource.RequestProperties();
        this.keepPostFor302Redirects = z10;
    }

    private HttpURLConnection makeConnection(URL url, int i3, byte[] bArr, long j, long j9, boolean z6, boolean z9, Map<String, String> map) throws IOException {
        HttpURLConnection httpURLConnectionOpenConnection = openConnection(url);
        httpURLConnectionOpenConnection.setConnectTimeout(this.connectTimeoutMillis);
        httpURLConnectionOpenConnection.setReadTimeout(this.readTimeoutMillis);
        HashMap map2 = new HashMap();
        HttpDataSource.RequestProperties requestProperties = this.defaultRequestProperties;
        if (requestProperties != null) {
            map2.putAll(requestProperties.getSnapshot());
        }
        map2.putAll(this.requestProperties.getSnapshot());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnectionOpenConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String strBuildRangeRequestHeader = HttpUtil.buildRangeRequestHeader(j, j9);
        if (strBuildRangeRequestHeader != null) {
            httpURLConnectionOpenConnection.setRequestProperty("Range", strBuildRangeRequestHeader);
        }
        String str = this.userAgent;
        if (str != null) {
            httpURLConnectionOpenConnection.setRequestProperty("User-Agent", str);
        }
        httpURLConnectionOpenConnection.setRequestProperty("Accept-Encoding", z6 ? HTTPClient.RC_FORMAT_ACCEPT_ENCODING : "identity");
        httpURLConnectionOpenConnection.setInstanceFollowRedirects(z9);
        httpURLConnectionOpenConnection.setDoOutput(bArr != null);
        httpURLConnectionOpenConnection.setRequestMethod(DataSpec.getStringForHttpMethod(i3));
        if (bArr != null) {
            httpURLConnectionOpenConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnectionOpenConnection.connect();
            OutputStream outputStream = httpURLConnectionOpenConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
            return httpURLConnectionOpenConnection;
        }
        httpURLConnectionOpenConnection.connect();
        return httpURLConnectionOpenConnection;
    }
}
