package androidx.media3.datasource;

/* JADX INFO: loaded from: classes.dex */
public final class ContentDataSource extends androidx.media3.datasource.BaseDataSource {
    private android.content.res.AssetFileDescriptor assetFileDescriptor;
    private long bytesRemaining;
    private java.io.FileInputStream inputStream;
    private boolean opened;
    private final android.content.ContentResolver resolver;
    private android.net.Uri uri;

    public static class ContentDataSourceException extends androidx.media3.datasource.DataSourceException {
        @java.lang.Deprecated
        public ContentDataSourceException(java.io.IOException iOException) {
            this(iOException, 2000);
        }

        public ContentDataSourceException(java.io.IOException iOException, int i3) {
            super(iOException, i3);
        }
    }

    public ContentDataSource(android.content.Context context) {
        super(false);
        this.resolver = context.getContentResolver();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x000e */
    /* JADX WARN: Bottom block not found for handler: all -> 0x004e */
    @Override // androidx.media3.datasource.DataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void close() {
        this.uri = null;
        try {
            java.io.FileInputStream fileInputStream = this.inputStream;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.inputStream = null;
            try {
                try {
                    android.content.res.AssetFileDescriptor assetFileDescriptor = this.assetFileDescriptor;
                    if (assetFileDescriptor != null) {
                        assetFileDescriptor.close();
                    }
                    this.assetFileDescriptor = null;
                    if (this.opened) {
                        this.opened = false;
                        transferEnded();
                    }
                } catch (java.io.IOException e6) {
                    throw new androidx.media3.datasource.ContentDataSource.ContentDataSourceException(e6, 2000);
                }
            } catch (java.lang.Throwable th) {
                this.assetFileDescriptor = null;
                if (this.opened) {
                    this.opened = false;
                    transferEnded();
                }
                throw th;
            }
        } catch (java.io.IOException e9) {
            throw new androidx.media3.datasource.ContentDataSource.ContentDataSourceException(e9, 2000);
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public android.net.Uri getUri() {
        return this.uri;
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(androidx.media3.datasource.DataSpec dataSpec) throws androidx.media3.datasource.ContentDataSource.ContentDataSourceException {
        int i3;
        android.content.res.AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            try {
                android.net.Uri uriNormalizeScheme = dataSpec.uri.normalizeScheme();
                this.uri = uriNormalizeScheme;
                transferInitializing(dataSpec);
                if (java.util.Objects.equals(uriNormalizeScheme.getScheme(), "content")) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = this.resolver.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = this.resolver.openAssetFileDescriptor(uriNormalizeScheme, "r");
                }
                this.assetFileDescriptor = assetFileDescriptorOpenAssetFileDescriptor;
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    i3 = 2000;
                    try {
                        throw new androidx.media3.datasource.ContentDataSource.ContentDataSourceException(new java.io.IOException("Could not open file descriptor for: " + uriNormalizeScheme), 2000);
                    } catch (java.io.IOException e6) {
                        e = e6;
                        throw new androidx.media3.datasource.ContentDataSource.ContentDataSourceException(e, e instanceof java.io.FileNotFoundException ? androidx.media3.common.PlaybackException.ERROR_CODE_IO_FILE_NOT_FOUND : i3);
                    }
                }
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                java.io.FileInputStream fileInputStream = new java.io.FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                this.inputStream = fileInputStream;
                if (length != -1 && dataSpec.position > length) {
                    throw new androidx.media3.datasource.ContentDataSource.ContentDataSourceException(null, 2008);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long jSkip = fileInputStream.skip(dataSpec.position + startOffset) - startOffset;
                if (jSkip != dataSpec.position) {
                    throw new androidx.media3.datasource.ContentDataSource.ContentDataSourceException(null, 2008);
                }
                if (length == -1) {
                    java.nio.channels.FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.bytesRemaining = -1L;
                    } else {
                        long jPosition = size - channel.position();
                        this.bytesRemaining = jPosition;
                        if (jPosition < 0) {
                            throw new androidx.media3.datasource.ContentDataSource.ContentDataSourceException(null, 2008);
                        }
                    }
                } else {
                    long j = length - jSkip;
                    this.bytesRemaining = j;
                    if (j < 0) {
                        throw new androidx.media3.datasource.ContentDataSource.ContentDataSourceException(null, 2008);
                    }
                }
                long jMin = dataSpec.length;
                if (jMin != -1) {
                    long j9 = this.bytesRemaining;
                    if (j9 != -1) {
                        jMin = java.lang.Math.min(j9, jMin);
                    }
                    this.bytesRemaining = jMin;
                }
                this.opened = true;
                transferStarted(dataSpec);
                long j10 = dataSpec.length;
                return j10 != -1 ? j10 : this.bytesRemaining;
            } catch (androidx.media3.datasource.ContentDataSource.ContentDataSourceException e9) {
                throw e9;
            }
        } catch (java.io.IOException e10) {
            e = e10;
            i3 = 2000;
        }
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i3, int i9) throws androidx.media3.datasource.ContentDataSource.ContentDataSourceException {
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
                throw new androidx.media3.datasource.ContentDataSource.ContentDataSourceException(e6, 2000);
            }
        }
        int i10 = ((java.io.FileInputStream) androidx.media3.common.util.Util.castNonNull(this.inputStream)).read(bArr, i3, i9);
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
