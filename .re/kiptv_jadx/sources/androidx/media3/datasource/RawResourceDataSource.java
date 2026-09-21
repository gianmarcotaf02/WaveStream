package androidx.media3.datasource;

/* JADX INFO: loaded from: classes.dex */
public final class RawResourceDataSource extends androidx.media3.datasource.BaseDataSource {

    @java.lang.Deprecated
    public static final java.lang.String RAW_RESOURCE_SCHEME = "rawresource";
    private final android.content.Context applicationContext;
    private android.content.res.AssetFileDescriptor assetFileDescriptor;
    private long bytesRemaining;
    private androidx.media3.datasource.DataSpec dataSpec;
    private java.io.InputStream inputStream;
    private boolean opened;

    public static class RawResourceDataSourceException extends androidx.media3.datasource.DataSourceException {
        @java.lang.Deprecated
        public RawResourceDataSourceException(java.lang.String str) {
            super(str, null, 2000);
        }

        @java.lang.Deprecated
        public RawResourceDataSourceException(java.lang.Throwable th) {
            super(th, 2000);
        }

        public RawResourceDataSourceException(java.lang.String str, java.lang.Throwable th, int i3) {
            super(str, th, i3);
        }
    }

    public RawResourceDataSource(android.content.Context context) {
        super(false);
        this.applicationContext = context.getApplicationContext();
    }

    @java.lang.Deprecated
    public static android.net.Uri buildRawResourceUri(int i3) {
        return android.net.Uri.parse("rawresource:///" + i3);
    }

    private static android.content.res.AssetFileDescriptor openAssetFileDescriptor(android.content.Context context, androidx.media3.datasource.DataSpec dataSpec) throws androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException {
        android.content.res.Resources resourcesForApplication;
        int identifier;
        android.net.Uri uriNormalizeScheme = dataSpec.uri.normalizeScheme();
        if (android.text.TextUtils.equals(RAW_RESOURCE_SCHEME, uriNormalizeScheme.getScheme())) {
            resourcesForApplication = context.getResources();
            java.util.List<java.lang.String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException("rawresource:// URI must have exactly one path element, found " + pathSegments.size());
            }
            identifier = parseResourceId(pathSegments.get(0));
        } else {
            if (!android.text.TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
            }
            java.lang.String path = uriNormalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            java.lang.String packageName = android.text.TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (android.content.pm.PackageManager.NameNotFoundException e6) {
                    throw new androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e6, androidx.media3.common.PlaybackException.ERROR_CODE_IO_FILE_NOT_FOUND);
                }
            }
            if (path.matches("\\d+")) {
                identifier = parseResourceId(path);
            } else {
                identifier = resourcesForApplication.getIdentifier(p121o0.p.p(packageName, ":", path), "raw", null);
                if (identifier == 0) {
                    throw new androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException("Resource not found.", null, androidx.media3.common.PlaybackException.ERROR_CODE_IO_FILE_NOT_FOUND);
                }
            }
        }
        try {
            android.content.res.AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resourcesForApplication.openRawResourceFd(identifier);
            if (assetFileDescriptorOpenRawResourceFd != null) {
                return assetFileDescriptorOpenRawResourceFd;
            }
            throw new androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException("Resource is compressed: " + uriNormalizeScheme, null, 2000);
        } catch (android.content.res.Resources.NotFoundException e9) {
            throw new androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException(null, e9, androidx.media3.common.PlaybackException.ERROR_CODE_IO_FILE_NOT_FOUND);
        }
    }

    private static int parseResourceId(java.lang.String str) throws androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException {
        try {
            return java.lang.Integer.parseInt(str);
        } catch (java.lang.NumberFormatException unused) {
            throw new androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException("Resource identifier must be an integer.", null, 1004);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x000e */
    /* JADX WARN: Bottom block not found for handler: all -> 0x004e */
    @Override // androidx.media3.datasource.DataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void close() {
        this.dataSpec = null;
        try {
            java.io.InputStream inputStream = this.inputStream;
            if (inputStream != null) {
                inputStream.close();
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
                    throw new androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException(null, e6, 2000);
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
            throw new androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException(null, e9, 2000);
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public android.net.Uri getUri() {
        androidx.media3.datasource.DataSpec dataSpec = this.dataSpec;
        if (dataSpec != null) {
            return dataSpec.uri;
        }
        return null;
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(androidx.media3.datasource.DataSpec dataSpec) throws androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException {
        this.dataSpec = dataSpec;
        transferInitializing(dataSpec);
        android.content.res.AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = openAssetFileDescriptor(this.applicationContext, dataSpec);
        this.assetFileDescriptor = assetFileDescriptorOpenAssetFileDescriptor;
        long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(this.assetFileDescriptor.getFileDescriptor());
        this.inputStream = fileInputStream;
        if (length != -1) {
            try {
                if (dataSpec.position > length) {
                    throw new androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException(null, null, 2008);
                }
            } catch (androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException e6) {
                throw e6;
            } catch (java.io.IOException e9) {
                throw new androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException(null, e9, 2000);
            }
        }
        long startOffset = this.assetFileDescriptor.getStartOffset();
        long jSkip = fileInputStream.skip(dataSpec.position + startOffset) - startOffset;
        if (jSkip != dataSpec.position) {
            throw new androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException(null, null, 2008);
        }
        if (length == -1) {
            java.nio.channels.FileChannel channel = fileInputStream.getChannel();
            if (channel.size() == 0) {
                this.bytesRemaining = -1L;
            } else {
                long size = channel.size() - channel.position();
                this.bytesRemaining = size;
                if (size < 0) {
                    throw new androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException(null, null, 2008);
                }
            }
        } else {
            long j = length - jSkip;
            this.bytesRemaining = j;
            if (j < 0) {
                throw new androidx.media3.datasource.DataSourceException(2008);
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
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i3, int i9) throws androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException {
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
                throw new androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException(null, e6, 2000);
            }
        }
        int i10 = ((java.io.InputStream) androidx.media3.common.util.Util.castNonNull(this.inputStream)).read(bArr, i3, i9);
        if (i10 == -1) {
            if (this.bytesRemaining == -1) {
                return -1;
            }
            throw new androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException("End of stream reached having not read sufficient data.", new java.io.EOFException(), 2000);
        }
        long j9 = this.bytesRemaining;
        if (j9 != -1) {
            this.bytesRemaining = j9 - ((long) i10);
        }
        bytesTransferred(i10);
        return i10;
    }
}
