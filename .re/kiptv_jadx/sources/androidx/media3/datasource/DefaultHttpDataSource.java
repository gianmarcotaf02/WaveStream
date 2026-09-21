package androidx.media3.datasource;

/* JADX INFO: loaded from: classes.dex */
public class DefaultHttpDataSource extends androidx.media3.datasource.BaseDataSource implements androidx.media3.datasource.HttpDataSource {
    public static final int DEFAULT_CONNECT_TIMEOUT_MILLIS = 8000;
    public static final int DEFAULT_READ_TIMEOUT_MILLIS = 8000;
    private static final int HTTP_STATUS_PERMANENT_REDIRECT = 308;
    private static final int HTTP_STATUS_TEMPORARY_REDIRECT = 307;
    private static final int MAX_REDIRECTS = 20;
    private static final java.lang.String TAG = "DefaultHttpDataSource";
    private final boolean allowCrossProtocolRedirects;
    private long bytesRead;
    private long bytesToRead;
    private final int connectTimeoutMillis;
    private java.net.HttpURLConnection connection;
    private final p068h4.l contentTypePredicate;
    private final boolean crossProtocolRedirectsForceOriginal;
    private androidx.media3.datasource.DataSpec dataSpec;
    private final androidx.media3.datasource.HttpDataSource.RequestProperties defaultRequestProperties;
    private java.io.InputStream inputStream;
    private final boolean keepPostFor302Redirects;
    private final int readTimeoutMillis;
    private final androidx.media3.datasource.HttpDataSource.RequestProperties requestProperties;
    private int responseCode;
    private boolean transferStarted;
    private final java.lang.String userAgent;

    public static final class Factory implements androidx.media3.datasource.HttpDataSource.Factory {
        private boolean allowCrossProtocolRedirects;
        private p068h4.l contentTypePredicate;
        private boolean crossProtocolRedirectsForceOriginal;
        private boolean keepPostFor302Redirects;
        private androidx.media3.datasource.TransferListener transferListener;
        private java.lang.String userAgent;
        private final androidx.media3.datasource.HttpDataSource.RequestProperties defaultRequestProperties = new androidx.media3.datasource.HttpDataSource.RequestProperties();
        private int connectTimeoutMs = 8000;
        private int readTimeoutMs = 8000;

        public androidx.media3.datasource.DefaultHttpDataSource.Factory setAllowCrossProtocolRedirects(boolean z6) {
            this.allowCrossProtocolRedirects = z6;
            return this;
        }

        public androidx.media3.datasource.DefaultHttpDataSource.Factory setConnectTimeoutMs(int i3) {
            this.connectTimeoutMs = i3;
            return this;
        }

        public androidx.media3.datasource.DefaultHttpDataSource.Factory setContentTypePredicate(p068h4.l lVar) {
            this.contentTypePredicate = lVar;
            return this;
        }

        public androidx.media3.datasource.DefaultHttpDataSource.Factory setCrossProtocolRedirectsForceOriginal(boolean z6) {
            this.crossProtocolRedirectsForceOriginal = z6;
            return this;
        }

        @Override // androidx.media3.datasource.HttpDataSource.Factory
        public /* bridge */ /* synthetic */ androidx.media3.datasource.HttpDataSource.Factory setDefaultRequestProperties(java.util.Map map) {
            return setDefaultRequestProperties((java.util.Map<java.lang.String, java.lang.String>) map);
        }

        public androidx.media3.datasource.DefaultHttpDataSource.Factory setKeepPostFor302Redirects(boolean z6) {
            this.keepPostFor302Redirects = z6;
            return this;
        }

        public androidx.media3.datasource.DefaultHttpDataSource.Factory setReadTimeoutMs(int i3) {
            this.readTimeoutMs = i3;
            return this;
        }

        public androidx.media3.datasource.DefaultHttpDataSource.Factory setTransferListener(androidx.media3.datasource.TransferListener transferListener) {
            this.transferListener = transferListener;
            return this;
        }

        public androidx.media3.datasource.DefaultHttpDataSource.Factory setUserAgent(java.lang.String str) {
            this.userAgent = str;
            return this;
        }

        @Override // androidx.media3.datasource.HttpDataSource.Factory
        public androidx.media3.datasource.DefaultHttpDataSource.Factory setDefaultRequestProperties(java.util.Map<java.lang.String, java.lang.String> map) {
            this.defaultRequestProperties.clearAndSet(map);
            return this;
        }

        @Override // androidx.media3.datasource.HttpDataSource.Factory, androidx.media3.datasource.DataSource.Factory
        public androidx.media3.datasource.DefaultHttpDataSource createDataSource() {
            androidx.media3.datasource.DefaultHttpDataSource defaultHttpDataSource = new androidx.media3.datasource.DefaultHttpDataSource(this.userAgent, this.connectTimeoutMs, this.readTimeoutMs, this.allowCrossProtocolRedirects, this.crossProtocolRedirectsForceOriginal, this.defaultRequestProperties, this.contentTypePredicate, this.keepPostFor302Redirects);
            androidx.media3.datasource.TransferListener transferListener = this.transferListener;
            if (transferListener != null) {
                defaultHttpDataSource.addTransferListener(transferListener);
            }
            return defaultHttpDataSource;
        }
    }

    public static class NullFilteringHeadersMap extends p076i4.O {
        private final java.util.Map<java.lang.String, java.util.List<java.lang.String>> headers;

        public NullFilteringHeadersMap(java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
            this.headers = map;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$entrySet$1(java.util.Map.Entry entry) {
            return entry.getKey() != null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$keySet$0(java.lang.String str) {
            return str != null;
        }

        @Override // p076i4.O, java.util.Map
        public boolean containsKey(java.lang.Object obj) {
            return obj != null && super.containsKey(obj);
        }

        @Override // java.util.Map
        public boolean containsValue(java.lang.Object obj) {
            return super.standardContainsValue(obj);
        }

        @Override // p076i4.O, java.util.Map
        public java.util.Set<java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>>> entrySet() {
            return p076i4.AbstractC2230y.j(super.entrySet(), new androidx.media3.datasource.d(0));
        }

        @Override // java.util.Map
        public boolean equals(java.lang.Object obj) {
            return obj != null && super.standardEquals(obj);
        }

        @Override // java.util.Map
        public int hashCode() {
            return super.standardHashCode();
        }

        @Override // p076i4.O, java.util.Map
        public boolean isEmpty() {
            return super.isEmpty() || (super.size() == 1 && super.containsKey(null));
        }

        @Override // p076i4.O, java.util.Map
        public java.util.Set<java.lang.String> keySet() {
            return p076i4.AbstractC2230y.j(super.keySet(), new androidx.media3.datasource.d(1));
        }

        @Override // p076i4.O, java.util.Map
        public int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }

        @Override // p076i4.P
        public java.util.Map<java.lang.String, java.util.List<java.lang.String>> delegate() {
            return this.headers;
        }

        @Override // p076i4.O, java.util.Map
        public java.util.List<java.lang.String> get(java.lang.Object obj) {
            if (obj == null) {
                return null;
            }
            return (java.util.List) super.get(obj);
        }
    }

    private void closeConnectionQuietly() {
        java.net.HttpURLConnection httpURLConnection = this.connection;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (java.lang.Exception e6) {
                androidx.media3.common.util.Log.e(TAG, "Unexpected error while disconnecting", e6);
            }
        }
    }

    private static long getCurrentThreadId() {
        java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
        return android.os.Build.VERSION.SDK_INT < 36 ? threadCurrentThread.getId() : threadCurrentThread.threadId();
    }

    private java.net.URL handleRedirect(java.net.URL url, java.lang.String str, androidx.media3.datasource.DataSpec dataSpec) throws androidx.media3.datasource.HttpDataSource.HttpDataSourceException {
        if (str == null) {
            throw new androidx.media3.datasource.HttpDataSource.HttpDataSourceException("Null location redirect", dataSpec, androidx.media3.common.PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED, 1);
        }
        try {
            java.net.URL url2 = new java.net.URL(url, str);
            java.lang.String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new androidx.media3.datasource.HttpDataSource.HttpDataSourceException(p121o0.p.C("Unsupported protocol redirect: ", protocol), dataSpec, androidx.media3.common.PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED, 1);
            }
            if (this.allowCrossProtocolRedirects || protocol.equals(url.getProtocol())) {
                return url2;
            }
            if (this.crossProtocolRedirectsForceOriginal) {
                try {
                    return new java.net.URL(url2.toString().replaceFirst(protocol, url.getProtocol()));
                } catch (java.net.MalformedURLException e6) {
                    throw new androidx.media3.datasource.HttpDataSource.HttpDataSourceException(e6, dataSpec, androidx.media3.common.PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED, 1);
                }
            }
            throw new androidx.media3.datasource.HttpDataSource.HttpDataSourceException("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", dataSpec, androidx.media3.common.PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED, 1);
        } catch (java.net.MalformedURLException e9) {
            throw new androidx.media3.datasource.HttpDataSource.HttpDataSourceException(e9, dataSpec, androidx.media3.common.PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED, 1);
        }
    }

    private static boolean isCompressed(java.net.HttpURLConnection httpURLConnection) {
        return com.revenuecat.purchases.common.HTTPClient.RC_FORMAT_ACCEPT_ENCODING.equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    private java.net.HttpURLConnection makeConnection(androidx.media3.datasource.DataSpec dataSpec) throws java.io.IOException {
        java.net.URL url = new java.net.URL(dataSpec.uri.toString());
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
                throw new androidx.media3.datasource.HttpDataSource.HttpDataSourceException(new java.net.NoRouteToHostException(com.google.android.gms.internal.play_billing.M0.l(i11, "Too many redirects: ")), dataSpec, androidx.media3.common.PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED, 1);
            }
            java.net.HttpURLConnection httpURLConnectionMakeConnection = makeConnection(url, i3, bArr, j, j9, zIsFlagSet, false, dataSpec.httpRequestHeaders);
            int responseCode = httpURLConnectionMakeConnection.getResponseCode();
            java.lang.String headerField = httpURLConnectionMakeConnection.getHeaderField("Location");
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

    private int readInternal(byte[] bArr, int i3, int i9) throws java.io.IOException {
        if (i9 == 0) {
            return 0;
        }
        long j = this.bytesToRead;
        if (j != -1) {
            long j9 = j - this.bytesRead;
            if (j9 == 0) {
                return -1;
            }
            i9 = (int) java.lang.Math.min(i9, j9);
        }
        int i10 = ((java.io.InputStream) androidx.media3.common.util.Util.castNonNull(this.inputStream)).read(bArr, i3, i9);
        if (i10 == -1) {
            return -1;
        }
        this.bytesRead += (long) i10;
        bytesTransferred(i10);
        return i10;
    }

    private void skipFully(long j, androidx.media3.datasource.DataSpec dataSpec) throws java.io.IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int i3 = ((java.io.InputStream) androidx.media3.common.util.Util.castNonNull(this.inputStream)).read(bArr, 0, (int) java.lang.Math.min(j, 4096));
            if (java.lang.Thread.currentThread().isInterrupted()) {
                throw new androidx.media3.datasource.HttpDataSource.HttpDataSourceException(new java.io.InterruptedIOException(), dataSpec, 2000, 1);
            }
            if (i3 == -1) {
                throw new androidx.media3.datasource.HttpDataSource.HttpDataSourceException(dataSpec, 2008, 1);
            }
            j -= (long) i3;
            bytesTransferred(i3);
        }
    }

    @Override // androidx.media3.datasource.HttpDataSource
    public void clearAllRequestProperties() {
        this.requestProperties.clear();
    }

    @Override // androidx.media3.datasource.HttpDataSource
    public void clearRequestProperty(java.lang.String str) {
        str.getClass();
        this.requestProperties.remove(str);
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() {
        try {
            java.io.InputStream inputStream = this.inputStream;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.io.IOException e6) {
                    throw new androidx.media3.datasource.HttpDataSource.HttpDataSourceException(e6, (androidx.media3.datasource.DataSpec) androidx.media3.common.util.Util.castNonNull(this.dataSpec), 2000, 3);
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
            android.net.TrafficStats.clearThreadStatsTag();
        } catch (java.lang.Throwable th) {
            this.inputStream = null;
            closeConnectionQuietly();
            if (this.transferStarted) {
                this.transferStarted = false;
                transferEnded();
            }
            this.connection = null;
            this.dataSpec = null;
            android.net.TrafficStats.clearThreadStatsTag();
            throw th;
        }
    }

    @Override // androidx.media3.datasource.HttpDataSource
    public int getResponseCode() {
        int i3;
        if (this.connection == null || (i3 = this.responseCode) <= 0) {
            return -1;
        }
        return i3;
    }

    @Override // androidx.media3.datasource.DataSource
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getResponseHeaders() {
        java.net.HttpURLConnection httpURLConnection = this.connection;
        return httpURLConnection == null ? p076i4.X0.f22848n : new androidx.media3.datasource.DefaultHttpDataSource.NullFilteringHeadersMap(httpURLConnection.getHeaderFields());
    }

    @Override // androidx.media3.datasource.DataSource
    public android.net.Uri getUri() {
        java.net.HttpURLConnection httpURLConnection = this.connection;
        if (httpURLConnection != null) {
            return android.net.Uri.parse(httpURLConnection.getURL().toString());
        }
        androidx.media3.datasource.DataSpec dataSpec = this.dataSpec;
        if (dataSpec != null) {
            return dataSpec.uri;
        }
        return null;
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(androidx.media3.datasource.DataSpec dataSpec) throws androidx.media3.datasource.HttpDataSource.HttpDataSourceException {
        byte[] bArrB;
        this.dataSpec = dataSpec;
        long j = 0;
        this.bytesRead = 0L;
        this.bytesToRead = 0L;
        transferInitializing(dataSpec);
        try {
            android.net.TrafficStats.setThreadStatsTag((int) getCurrentThreadId());
            java.net.HttpURLConnection httpURLConnectionMakeConnection = makeConnection(dataSpec);
            this.connection = httpURLConnectionMakeConnection;
            this.responseCode = httpURLConnectionMakeConnection.getResponseCode();
            java.lang.String responseMessage = httpURLConnectionMakeConnection.getResponseMessage();
            int i3 = this.responseCode;
            if (i3 < 200 || i3 > 299) {
                java.util.Map<java.lang.String, java.util.List<java.lang.String>> headerFields = httpURLConnectionMakeConnection.getHeaderFields();
                if (this.responseCode == 416) {
                    if (dataSpec.position == androidx.media3.datasource.HttpUtil.getDocumentSize(httpURLConnectionMakeConnection.getHeaderField("Content-Range"))) {
                        this.transferStarted = true;
                        transferStarted(dataSpec);
                        long j9 = dataSpec.length;
                        if (j9 != -1) {
                            return j9;
                        }
                        return 0L;
                    }
                }
                java.io.InputStream errorStream = httpURLConnectionMakeConnection.getErrorStream();
                try {
                    bArrB = errorStream != null ? p084j4.g.b(errorStream) : androidx.media3.common.util.Util.EMPTY_BYTE_ARRAY;
                } catch (java.io.IOException unused) {
                    bArrB = androidx.media3.common.util.Util.EMPTY_BYTE_ARRAY;
                }
                byte[] bArr = bArrB;
                closeConnectionQuietly();
                throw new androidx.media3.datasource.HttpDataSource.InvalidResponseCodeException(this.responseCode, responseMessage, this.responseCode == 416 ? new androidx.media3.datasource.DataSourceException(2008) : null, headerFields, dataSpec, bArr);
            }
            java.lang.String contentType = httpURLConnectionMakeConnection.getContentType();
            p068h4.l lVar = this.contentTypePredicate;
            if (lVar != null && !lVar.apply(contentType)) {
                closeConnectionQuietly();
                throw new androidx.media3.datasource.HttpDataSource.InvalidContentTypeException(contentType, dataSpec);
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
                    long contentLength = androidx.media3.datasource.HttpUtil.getContentLength(httpURLConnectionMakeConnection.getHeaderField("Content-Length"), httpURLConnectionMakeConnection.getHeaderField("Content-Range"));
                    this.bytesToRead = contentLength != -1 ? contentLength - j : -1L;
                }
            }
            try {
                this.inputStream = httpURLConnectionMakeConnection.getInputStream();
                if (zIsCompressed) {
                    this.inputStream = new java.util.zip.GZIPInputStream(this.inputStream);
                }
                this.transferStarted = true;
                transferStarted(dataSpec);
                try {
                    skipFully(j, dataSpec);
                    return this.bytesToRead;
                } catch (java.io.IOException e6) {
                    closeConnectionQuietly();
                    if (e6 instanceof androidx.media3.datasource.HttpDataSource.HttpDataSourceException) {
                        throw ((androidx.media3.datasource.HttpDataSource.HttpDataSourceException) e6);
                    }
                    throw new androidx.media3.datasource.HttpDataSource.HttpDataSourceException(e6, dataSpec, 2000, 1);
                }
            } catch (java.io.IOException e9) {
                closeConnectionQuietly();
                throw new androidx.media3.datasource.HttpDataSource.HttpDataSourceException(e9, dataSpec, 2000, 1);
            }
        } catch (java.io.IOException e10) {
            closeConnectionQuietly();
            throw androidx.media3.datasource.HttpDataSource.HttpDataSourceException.createForIOException(e10, dataSpec, 1);
        }
    }

    public java.net.HttpURLConnection openConnection(java.net.URL url) {
        return (java.net.HttpURLConnection) url.openConnection();
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i3, int i9) throws androidx.media3.datasource.HttpDataSource.HttpDataSourceException {
        try {
            return readInternal(bArr, i3, i9);
        } catch (java.io.IOException e6) {
            throw androidx.media3.datasource.HttpDataSource.HttpDataSourceException.createForIOException(e6, (androidx.media3.datasource.DataSpec) androidx.media3.common.util.Util.castNonNull(this.dataSpec), 2);
        }
    }

    @Override // androidx.media3.datasource.HttpDataSource
    public void setRequestProperty(java.lang.String str, java.lang.String str2) {
        str.getClass();
        str2.getClass();
        this.requestProperties.set(str, str2);
    }

    private DefaultHttpDataSource(java.lang.String str, int i3, int i9, boolean z6, boolean z9, androidx.media3.datasource.HttpDataSource.RequestProperties requestProperties, p068h4.l lVar, boolean z10) {
        super(true);
        this.userAgent = str;
        this.connectTimeoutMillis = i3;
        this.readTimeoutMillis = i9;
        this.allowCrossProtocolRedirects = z6;
        this.crossProtocolRedirectsForceOriginal = z9;
        if (z6 && z9) {
            throw new java.lang.IllegalArgumentException("crossProtocolRedirectsForceOriginal should not be set if allowCrossProtocolRedirects is true");
        }
        this.defaultRequestProperties = requestProperties;
        this.contentTypePredicate = lVar;
        this.requestProperties = new androidx.media3.datasource.HttpDataSource.RequestProperties();
        this.keepPostFor302Redirects = z10;
    }

    private java.net.HttpURLConnection makeConnection(java.net.URL url, int i3, byte[] bArr, long j, long j9, boolean z6, boolean z9, java.util.Map<java.lang.String, java.lang.String> map) throws java.io.IOException {
        java.net.HttpURLConnection httpURLConnectionOpenConnection = openConnection(url);
        httpURLConnectionOpenConnection.setConnectTimeout(this.connectTimeoutMillis);
        httpURLConnectionOpenConnection.setReadTimeout(this.readTimeoutMillis);
        java.util.HashMap map2 = new java.util.HashMap();
        androidx.media3.datasource.HttpDataSource.RequestProperties requestProperties = this.defaultRequestProperties;
        if (requestProperties != null) {
            map2.putAll(requestProperties.getSnapshot());
        }
        map2.putAll(this.requestProperties.getSnapshot());
        map2.putAll(map);
        for (java.util.Map.Entry entry : map2.entrySet()) {
            httpURLConnectionOpenConnection.setRequestProperty((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
        }
        java.lang.String strBuildRangeRequestHeader = androidx.media3.datasource.HttpUtil.buildRangeRequestHeader(j, j9);
        if (strBuildRangeRequestHeader != null) {
            httpURLConnectionOpenConnection.setRequestProperty("Range", strBuildRangeRequestHeader);
        }
        java.lang.String str = this.userAgent;
        if (str != null) {
            httpURLConnectionOpenConnection.setRequestProperty("User-Agent", str);
        }
        httpURLConnectionOpenConnection.setRequestProperty("Accept-Encoding", z6 ? com.revenuecat.purchases.common.HTTPClient.RC_FORMAT_ACCEPT_ENCODING : "identity");
        httpURLConnectionOpenConnection.setInstanceFollowRedirects(z9);
        httpURLConnectionOpenConnection.setDoOutput(bArr != null);
        httpURLConnectionOpenConnection.setRequestMethod(androidx.media3.datasource.DataSpec.getStringForHttpMethod(i3));
        if (bArr != null) {
            httpURLConnectionOpenConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnectionOpenConnection.connect();
            java.io.OutputStream outputStream = httpURLConnectionOpenConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
            return httpURLConnectionOpenConnection;
        }
        httpURLConnectionOpenConnection.connect();
        return httpURLConnectionOpenConnection;
    }
}
