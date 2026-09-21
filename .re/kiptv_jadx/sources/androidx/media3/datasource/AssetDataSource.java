package androidx.media3.datasource;

/* JADX INFO: loaded from: classes.dex */
public final class AssetDataSource extends androidx.media3.datasource.BaseDataSource {
    private final android.content.res.AssetManager assetManager;
    private long bytesRemaining;
    private java.io.InputStream inputStream;
    private boolean opened;
    private android.net.Uri uri;

    public static final class AssetDataSourceException extends androidx.media3.datasource.DataSourceException {
        @java.lang.Deprecated
        public AssetDataSourceException(java.io.IOException iOException) {
            super(iOException, 2000);
        }

        public AssetDataSourceException(java.lang.Throwable th, int i3) {
            super(th, i3);
        }
    }

    public AssetDataSource(android.content.Context context) {
        super(false);
        this.assetManager = context.getAssets();
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() {
        this.uri = null;
        try {
            try {
                java.io.InputStream inputStream = this.inputStream;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.inputStream = null;
                if (this.opened) {
                    this.opened = false;
                    transferEnded();
                }
            } catch (java.io.IOException e6) {
                throw new androidx.media3.datasource.AssetDataSource.AssetDataSourceException(e6, 2000);
            }
        } catch (java.lang.Throwable th) {
            this.inputStream = null;
            if (this.opened) {
                this.opened = false;
                transferEnded();
            }
            throw th;
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public android.net.Uri getUri() {
        return this.uri;
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(androidx.media3.datasource.DataSpec dataSpec) throws androidx.media3.datasource.AssetDataSource.AssetDataSourceException {
        try {
            android.net.Uri uri = dataSpec.uri;
            this.uri = uri;
            java.lang.String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            transferInitializing(dataSpec);
            java.io.InputStream inputStreamOpen = this.assetManager.open(path, 1);
            this.inputStream = inputStreamOpen;
            if (inputStreamOpen.skip(dataSpec.position) < dataSpec.position) {
                throw new androidx.media3.datasource.AssetDataSource.AssetDataSourceException(null, 2008);
            }
            long j = dataSpec.length;
            if (j != -1) {
                this.bytesRemaining = j;
            } else {
                long jAvailable = this.inputStream.available();
                this.bytesRemaining = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.bytesRemaining = -1L;
                }
            }
            this.opened = true;
            transferStarted(dataSpec);
            return this.bytesRemaining;
        } catch (androidx.media3.datasource.AssetDataSource.AssetDataSourceException e6) {
            throw e6;
        } catch (java.io.IOException e9) {
            throw new androidx.media3.datasource.AssetDataSource.AssetDataSourceException(e9, e9 instanceof java.io.FileNotFoundException ? androidx.media3.common.PlaybackException.ERROR_CODE_IO_FILE_NOT_FOUND : 2000);
        }
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i3, int i9) throws androidx.media3.datasource.AssetDataSource.AssetDataSourceException {
        if (i9 == 0) {
            return 0;
        }
        long j = this.bytesRemaining;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i9 = (int) java.lang.Math.min(j, i9);
            } catch (java.io.IOException e6) {
                throw new androidx.media3.datasource.AssetDataSource.AssetDataSourceException(e6, 2000);
            }
        }
        int i10 = ((java.io.InputStream) androidx.media3.common.util.Util.castNonNull(this.inputStream)).read(bArr, i3, i9);
        if (i10 == -1) {
            return -1;
        }
        long j9 = this.bytesRemaining;
        if (j9 != -1) {
            this.bytesRemaining = j9 - ((long) i10);
        }
        bytesTransferred(i10);
        return i10;
    }
}
