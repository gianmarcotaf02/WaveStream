package androidx.media3.datasource;

/* JADX INFO: loaded from: classes.dex */
public final class DataSourceBitmapLoader implements androidx.media3.common.util.BitmapLoader {
    public static final p068h4.v DEFAULT_EXECUTOR_SERVICE = com.google.android.gms.internal.play_billing.V0.x(new androidx.media3.datasource.a());
    private final androidx.media3.datasource.DataSource.Factory dataSourceFactory;
    private final com.google.common.util.concurrent.K listeningExecutorService;
    private final boolean makeShared;
    private final int maximumOutputDimension;
    private final android.graphics.BitmapFactory.Options options;

    public static final class Builder {
        private final android.content.Context context;
        private androidx.media3.datasource.DataSource.Factory dataSourceFactory;
        private com.google.common.util.concurrent.K listeningExecutorService;
        private boolean makeShared;
        private int maximumOutputDimension = -1;
        private android.graphics.BitmapFactory.Options options;

        public Builder(android.content.Context context) {
            this.context = context;
        }

        public androidx.media3.datasource.DataSourceBitmapLoader build() {
            return new androidx.media3.datasource.DataSourceBitmapLoader(this);
        }

        public androidx.media3.datasource.DataSourceBitmapLoader.Builder setBitmapFactoryOptions(android.graphics.BitmapFactory.Options options) {
            this.options = options;
            return this;
        }

        public androidx.media3.datasource.DataSourceBitmapLoader.Builder setDataSourceFactory(androidx.media3.datasource.DataSource.Factory factory) {
            this.dataSourceFactory = factory;
            return this;
        }

        public androidx.media3.datasource.DataSourceBitmapLoader.Builder setExecutorService(com.google.common.util.concurrent.K k9) {
            this.listeningExecutorService = k9;
            return this;
        }

        public androidx.media3.datasource.DataSourceBitmapLoader.Builder setMakeShared(boolean z6) {
            this.makeShared = z6;
            return this;
        }

        public androidx.media3.datasource.DataSourceBitmapLoader.Builder setMaximumOutputDimension(int i3) {
            this.maximumOutputDimension = i3;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ android.graphics.Bitmap lambda$decodeBitmap$1(byte[] bArr) {
        return maybeAsShared(this.makeShared, androidx.media3.datasource.BitmapUtil.decode(bArr, bArr.length, this.options, this.maximumOutputDimension));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ android.graphics.Bitmap lambda$loadBitmap$2(android.net.Uri uri) {
        return load(this.dataSourceFactory.createDataSource(), uri, this.options, this.maximumOutputDimension, this.makeShared);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.google.common.util.concurrent.K lambda$static$0() {
        return com.google.common.util.concurrent.P.j0(java.util.concurrent.Executors.newSingleThreadExecutor());
    }

    private static android.graphics.Bitmap load(androidx.media3.datasource.DataSource dataSource, android.net.Uri uri, android.graphics.BitmapFactory.Options options, int i3, boolean z6) {
        try {
            dataSource.open(new androidx.media3.datasource.DataSpec(uri));
            byte[] toEnd = androidx.media3.datasource.DataSourceUtil.readToEnd(dataSource);
            return maybeAsShared(z6, androidx.media3.datasource.BitmapUtil.decode(toEnd, toEnd.length, options, i3));
        } finally {
            dataSource.close();
        }
    }

    private static android.graphics.Bitmap maybeAsShared(boolean z6, android.graphics.Bitmap bitmap) {
        return z6 ? androidx.media3.datasource.BitmapUtil.makeShared(bitmap) : bitmap;
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public com.google.common.util.concurrent.J decodeBitmap(byte[] bArr) {
        return ((com.google.common.util.concurrent.L) this.listeningExecutorService).b(new androidx.media3.datasource.b(this, bArr, 0));
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public com.google.common.util.concurrent.J loadBitmap(android.net.Uri uri) {
        return ((com.google.common.util.concurrent.L) this.listeningExecutorService).b(new androidx.media3.datasource.b(this, uri, 1));
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public boolean supportsMimeType(java.lang.String str) {
        return androidx.media3.common.util.Util.isBitmapFactorySupportedMimeType(str);
    }

    @java.lang.Deprecated
    public DataSourceBitmapLoader(android.content.Context context) {
        this(new androidx.media3.datasource.DataSourceBitmapLoader.Builder(context));
    }

    @java.lang.Deprecated
    public DataSourceBitmapLoader(android.content.Context context, int i3) {
        this(new androidx.media3.datasource.DataSourceBitmapLoader.Builder(context).setMaximumOutputDimension(i3));
    }

    @java.lang.Deprecated
    public DataSourceBitmapLoader(com.google.common.util.concurrent.K k9, androidx.media3.datasource.DataSource.Factory factory) {
        this(k9, factory, null);
    }

    @java.lang.Deprecated
    public DataSourceBitmapLoader(com.google.common.util.concurrent.K k9, androidx.media3.datasource.DataSource.Factory factory, android.graphics.BitmapFactory.Options options) {
        this(k9, factory, options, -1);
    }

    @java.lang.Deprecated
    public DataSourceBitmapLoader(com.google.common.util.concurrent.K k9, androidx.media3.datasource.DataSource.Factory factory, android.graphics.BitmapFactory.Options options, int i3) {
        this.listeningExecutorService = k9;
        this.dataSourceFactory = factory;
        this.options = options;
        this.maximumOutputDimension = i3;
        this.makeShared = false;
    }

    private DataSourceBitmapLoader(androidx.media3.datasource.DataSourceBitmapLoader.Builder builder) {
        androidx.media3.datasource.DataSource.Factory factory;
        com.google.common.util.concurrent.K k9;
        if (builder.dataSourceFactory != null) {
            factory = builder.dataSourceFactory;
        } else {
            factory = new androidx.media3.datasource.DefaultDataSource.Factory(builder.context);
        }
        this.dataSourceFactory = factory;
        if (builder.listeningExecutorService != null) {
            k9 = builder.listeningExecutorService;
        } else {
            k9 = (com.google.common.util.concurrent.K) DEFAULT_EXECUTOR_SERVICE.get();
            k9.getClass();
        }
        this.listeningExecutorService = k9;
        this.options = builder.options;
        this.maximumOutputDimension = builder.maximumOutputDimension;
        this.makeShared = builder.makeShared;
    }
}
