package androidx.media3.datasource;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultDataSource implements androidx.media3.datasource.DataSource {
    private static final java.lang.String SCHEME_ANDROID_RESOURCE = "android.resource";
    private static final java.lang.String SCHEME_ASSET = "asset";
    private static final java.lang.String SCHEME_CONTENT = "content";
    private static final java.lang.String SCHEME_DATA = "data";
    private static final java.lang.String SCHEME_RAW = "rawresource";
    private static final java.lang.String SCHEME_RTMP = "rtmp";
    private static final java.lang.String SCHEME_UDP = "udp";
    private static final java.lang.String TAG = "DefaultDataSource";
    private androidx.media3.datasource.DataSource assetDataSource;
    private final androidx.media3.datasource.DataSource baseDataSource;
    private androidx.media3.datasource.DataSource contentDataSource;
    private final android.content.Context context;
    private androidx.media3.datasource.DataSource dataSchemeDataSource;
    private androidx.media3.datasource.DataSource dataSource;
    private androidx.media3.datasource.DataSource fileDataSource;
    private androidx.media3.datasource.DataSource rawResourceDataSource;
    private androidx.media3.datasource.DataSource rtmpDataSource;
    private final java.util.List<androidx.media3.datasource.TransferListener> transferListeners;
    private androidx.media3.datasource.DataSource udpDataSource;

    public static final class Factory implements androidx.media3.datasource.DataSource.Factory {
        private final androidx.media3.datasource.DataSource.Factory baseDataSourceFactory;
        private final android.content.Context context;
        private androidx.media3.datasource.TransferListener transferListener;

        public Factory(android.content.Context context) {
            this(context, new androidx.media3.datasource.DefaultHttpDataSource.Factory());
        }

        public androidx.media3.datasource.DefaultDataSource.Factory setTransferListener(androidx.media3.datasource.TransferListener transferListener) {
            this.transferListener = transferListener;
            return this;
        }

        public Factory(android.content.Context context, androidx.media3.datasource.DataSource.Factory factory) {
            this.context = context.getApplicationContext();
            factory.getClass();
            this.baseDataSourceFactory = factory;
        }

        @Override // androidx.media3.datasource.DataSource.Factory
        public androidx.media3.datasource.DefaultDataSource createDataSource() {
            androidx.media3.datasource.DefaultDataSource defaultDataSource = new androidx.media3.datasource.DefaultDataSource(this.context, this.baseDataSourceFactory.createDataSource());
            androidx.media3.datasource.TransferListener transferListener = this.transferListener;
            if (transferListener != null) {
                defaultDataSource.addTransferListener(transferListener);
            }
            return defaultDataSource;
        }
    }

    public DefaultDataSource(android.content.Context context, boolean z6) {
        this(context, null, 8000, 8000, z6);
    }

    private void addListenersToDataSource(androidx.media3.datasource.DataSource dataSource) {
        for (int i3 = 0; i3 < this.transferListeners.size(); i3++) {
            dataSource.addTransferListener(this.transferListeners.get(i3));
        }
    }

    private androidx.media3.datasource.DataSource getAssetDataSource() {
        if (this.assetDataSource == null) {
            androidx.media3.datasource.AssetDataSource assetDataSource = new androidx.media3.datasource.AssetDataSource(this.context);
            this.assetDataSource = assetDataSource;
            addListenersToDataSource(assetDataSource);
        }
        return this.assetDataSource;
    }

    private androidx.media3.datasource.DataSource getContentDataSource() {
        if (this.contentDataSource == null) {
            androidx.media3.datasource.ContentDataSource contentDataSource = new androidx.media3.datasource.ContentDataSource(this.context);
            this.contentDataSource = contentDataSource;
            addListenersToDataSource(contentDataSource);
        }
        return this.contentDataSource;
    }

    private androidx.media3.datasource.DataSource getDataSchemeDataSource() {
        if (this.dataSchemeDataSource == null) {
            androidx.media3.datasource.DataSchemeDataSource dataSchemeDataSource = new androidx.media3.datasource.DataSchemeDataSource();
            this.dataSchemeDataSource = dataSchemeDataSource;
            addListenersToDataSource(dataSchemeDataSource);
        }
        return this.dataSchemeDataSource;
    }

    private androidx.media3.datasource.DataSource getFileDataSource() {
        if (this.fileDataSource == null) {
            androidx.media3.datasource.FileDataSource fileDataSource = new androidx.media3.datasource.FileDataSource();
            this.fileDataSource = fileDataSource;
            addListenersToDataSource(fileDataSource);
        }
        return this.fileDataSource;
    }

    private androidx.media3.datasource.DataSource getRawResourceDataSource() {
        if (this.rawResourceDataSource == null) {
            androidx.media3.datasource.RawResourceDataSource rawResourceDataSource = new androidx.media3.datasource.RawResourceDataSource(this.context);
            this.rawResourceDataSource = rawResourceDataSource;
            addListenersToDataSource(rawResourceDataSource);
        }
        return this.rawResourceDataSource;
    }

    private androidx.media3.datasource.DataSource getRtmpDataSource() {
        if (this.rtmpDataSource == null) {
            try {
                androidx.media3.datasource.DataSource dataSource = (androidx.media3.datasource.DataSource) java.lang.Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                this.rtmpDataSource = dataSource;
                addListenersToDataSource(dataSource);
            } catch (java.lang.ClassNotFoundException unused) {
                androidx.media3.common.util.Log.w(TAG, "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (java.lang.Exception e6) {
                throw new java.lang.RuntimeException("Error instantiating RTMP extension", e6);
            }
            if (this.rtmpDataSource == null) {
                this.rtmpDataSource = this.baseDataSource;
            }
        }
        return this.rtmpDataSource;
    }

    private androidx.media3.datasource.DataSource getUdpDataSource() {
        if (this.udpDataSource == null) {
            androidx.media3.datasource.UdpDataSource udpDataSource = new androidx.media3.datasource.UdpDataSource();
            this.udpDataSource = udpDataSource;
            addListenersToDataSource(udpDataSource);
        }
        return this.udpDataSource;
    }

    private void maybeAddListenerToDataSource(androidx.media3.datasource.DataSource dataSource, androidx.media3.datasource.TransferListener transferListener) {
        if (dataSource != null) {
            dataSource.addTransferListener(transferListener);
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public void addTransferListener(androidx.media3.datasource.TransferListener transferListener) {
        transferListener.getClass();
        this.baseDataSource.addTransferListener(transferListener);
        this.transferListeners.add(transferListener);
        maybeAddListenerToDataSource(this.fileDataSource, transferListener);
        maybeAddListenerToDataSource(this.assetDataSource, transferListener);
        maybeAddListenerToDataSource(this.contentDataSource, transferListener);
        maybeAddListenerToDataSource(this.rtmpDataSource, transferListener);
        maybeAddListenerToDataSource(this.udpDataSource, transferListener);
        maybeAddListenerToDataSource(this.dataSchemeDataSource, transferListener);
        maybeAddListenerToDataSource(this.rawResourceDataSource, transferListener);
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() {
        androidx.media3.datasource.DataSource dataSource = this.dataSource;
        if (dataSource != null) {
            try {
                dataSource.close();
            } finally {
                this.dataSource = null;
            }
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getResponseHeaders() {
        androidx.media3.datasource.DataSource dataSource = this.dataSource;
        return dataSource == null ? java.util.Collections.EMPTY_MAP : dataSource.getResponseHeaders();
    }

    @Override // androidx.media3.datasource.DataSource
    public android.net.Uri getUri() {
        androidx.media3.datasource.DataSource dataSource = this.dataSource;
        if (dataSource == null) {
            return null;
        }
        return dataSource.getUri();
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(androidx.media3.datasource.DataSpec dataSpec) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(this.dataSource == null);
        java.lang.String scheme = dataSpec.uri.getScheme();
        if (androidx.media3.common.util.Util.isLocalFileUri(dataSpec.uri)) {
            java.lang.String path = dataSpec.uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                this.dataSource = getFileDataSource();
            } else {
                this.dataSource = getAssetDataSource();
            }
        } else if (SCHEME_ASSET.equals(scheme)) {
            this.dataSource = getAssetDataSource();
        } else if (SCHEME_CONTENT.equals(scheme)) {
            this.dataSource = getContentDataSource();
        } else if (SCHEME_RTMP.equals(scheme)) {
            this.dataSource = getRtmpDataSource();
        } else if (SCHEME_UDP.equals(scheme)) {
            this.dataSource = getUdpDataSource();
        } else if ("data".equals(scheme)) {
            this.dataSource = getDataSchemeDataSource();
        } else if ("rawresource".equals(scheme) || SCHEME_ANDROID_RESOURCE.equals(scheme)) {
            this.dataSource = getRawResourceDataSource();
        } else {
            this.dataSource = this.baseDataSource;
        }
        return this.dataSource.open(dataSpec);
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i3, int i9) {
        androidx.media3.datasource.DataSource dataSource = this.dataSource;
        dataSource.getClass();
        return dataSource.read(bArr, i3, i9);
    }

    public DefaultDataSource(android.content.Context context, java.lang.String str, boolean z6) {
        this(context, str, 8000, 8000, z6);
    }

    public DefaultDataSource(android.content.Context context, java.lang.String str, int i3, int i9, boolean z6) {
        this(context, new androidx.media3.datasource.DefaultHttpDataSource.Factory().setUserAgent(str).setConnectTimeoutMs(i3).setReadTimeoutMs(i9).setAllowCrossProtocolRedirects(z6).createDataSource());
    }

    public DefaultDataSource(android.content.Context context, androidx.media3.datasource.DataSource dataSource) {
        this.context = context.getApplicationContext();
        dataSource.getClass();
        this.baseDataSource = dataSource;
        this.transferListeners = new java.util.ArrayList();
    }
}
