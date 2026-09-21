package androidx.media3.datasource;

/* JADX INFO: loaded from: classes.dex */
public final class FileDataSource extends androidx.media3.datasource.BaseDataSource {
    private long bytesRemaining;
    private java.io.RandomAccessFile file;
    private boolean opened;
    private android.net.Uri uri;

    public static final class Factory implements androidx.media3.datasource.DataSource.Factory {
        private androidx.media3.datasource.TransferListener listener;

        public androidx.media3.datasource.FileDataSource.Factory setListener(androidx.media3.datasource.TransferListener transferListener) {
            this.listener = transferListener;
            return this;
        }

        @Override // androidx.media3.datasource.DataSource.Factory
        public androidx.media3.datasource.FileDataSource createDataSource() {
            androidx.media3.datasource.FileDataSource fileDataSource = new androidx.media3.datasource.FileDataSource();
            androidx.media3.datasource.TransferListener transferListener = this.listener;
            if (transferListener != null) {
                fileDataSource.addTransferListener(transferListener);
            }
            return fileDataSource;
        }
    }

    public static class FileDataSourceException extends androidx.media3.datasource.DataSourceException {
        @java.lang.Deprecated
        public FileDataSourceException(java.lang.Exception exc) {
            super(exc, 2000);
        }

        @java.lang.Deprecated
        public FileDataSourceException(java.lang.String str, java.io.IOException iOException) {
            super(str, iOException, 2000);
        }

        public FileDataSourceException(java.lang.Throwable th, int i3) {
            super(th, i3);
        }

        public FileDataSourceException(java.lang.String str, java.lang.Throwable th, int i3) {
            super(str, th, i3);
        }
    }

    public FileDataSource() {
        super(false);
    }

    private static java.io.RandomAccessFile openLocalFile(android.net.Uri uri) throws androidx.media3.datasource.FileDataSource.FileDataSourceException {
        int i3 = androidx.media3.common.PlaybackException.ERROR_CODE_IO_NO_PERMISSION;
        try {
            java.lang.String path = uri.getPath();
            path.getClass();
            return new java.io.RandomAccessFile(path, "r");
        } catch (java.io.FileNotFoundException e6) {
            if (android.text.TextUtils.isEmpty(uri.getQuery()) && android.text.TextUtils.isEmpty(uri.getFragment())) {
                if (!(e6.getCause() instanceof android.system.ErrnoException) || ((android.system.ErrnoException) e6.getCause()).errno != android.system.OsConstants.EACCES) {
                    i3 = androidx.media3.common.PlaybackException.ERROR_CODE_IO_FILE_NOT_FOUND;
                }
                throw new androidx.media3.datasource.FileDataSource.FileDataSourceException(e6, i3);
            }
            java.lang.String path2 = uri.getPath();
            java.lang.String query = uri.getQuery();
            java.lang.String fragment = uri.getFragment();
            java.lang.StringBuilder sbO = Y6.f.o("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            sbO.append(fragment);
            throw new androidx.media3.datasource.FileDataSource.FileDataSourceException(sbO.toString(), e6, 1004);
        } catch (java.lang.SecurityException e9) {
            throw new androidx.media3.datasource.FileDataSource.FileDataSourceException(e9, androidx.media3.common.PlaybackException.ERROR_CODE_IO_NO_PERMISSION);
        } catch (java.lang.RuntimeException e10) {
            throw new androidx.media3.datasource.FileDataSource.FileDataSourceException(e10, 2000);
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() {
        this.uri = null;
        try {
            try {
                java.io.RandomAccessFile randomAccessFile = this.file;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.file = null;
                if (this.opened) {
                    this.opened = false;
                    transferEnded();
                }
            } catch (java.io.IOException e6) {
                throw new androidx.media3.datasource.FileDataSource.FileDataSourceException(e6, 2000);
            }
        } catch (java.lang.Throwable th) {
            this.file = null;
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
    public long open(androidx.media3.datasource.DataSpec dataSpec) throws androidx.media3.datasource.FileDataSource.FileDataSourceException {
        android.net.Uri uri = dataSpec.uri;
        this.uri = uri;
        transferInitializing(dataSpec);
        java.io.RandomAccessFile randomAccessFileOpenLocalFile = openLocalFile(uri);
        this.file = randomAccessFileOpenLocalFile;
        try {
            randomAccessFileOpenLocalFile.seek(dataSpec.position);
            long length = dataSpec.length;
            if (length == -1) {
                length = this.file.length() - dataSpec.position;
            }
            this.bytesRemaining = length;
            if (length < 0) {
                throw new androidx.media3.datasource.FileDataSource.FileDataSourceException(null, null, 2008);
            }
            this.opened = true;
            transferStarted(dataSpec);
            return this.bytesRemaining;
        } catch (java.io.IOException e6) {
            throw new androidx.media3.datasource.FileDataSource.FileDataSourceException(e6, 2000);
        }
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i3, int i9) throws androidx.media3.datasource.FileDataSource.FileDataSourceException {
        if (i9 == 0) {
            return 0;
        }
        if (this.bytesRemaining == 0) {
            return -1;
        }
        try {
            int i10 = ((java.io.RandomAccessFile) androidx.media3.common.util.Util.castNonNull(this.file)).read(bArr, i3, (int) java.lang.Math.min(this.bytesRemaining, i9));
            if (i10 > 0) {
                this.bytesRemaining -= (long) i10;
                bytesTransferred(i10);
            }
            return i10;
        } catch (java.io.IOException e6) {
            throw new androidx.media3.datasource.FileDataSource.FileDataSourceException(e6, 2000);
        }
    }
}
