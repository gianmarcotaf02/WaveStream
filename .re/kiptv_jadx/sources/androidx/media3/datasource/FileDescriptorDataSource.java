package androidx.media3.datasource;

/* JADX INFO: loaded from: classes.dex */
public class FileDescriptorDataSource extends androidx.media3.datasource.BaseDataSource {
    private static final java.util.Set<java.io.FileDescriptor> inUseFileDescriptors = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());
    private long bytesRemaining;
    private final java.io.FileDescriptor fileDescriptor;
    private java.io.FileInputStream inputStream;
    private final long length;
    private final long offset;
    private boolean opened;
    private android.net.Uri uri;

    public FileDescriptorDataSource(java.io.FileDescriptor fileDescriptor, long j, long j9) {
        super(false);
        fileDescriptor.getClass();
        this.fileDescriptor = fileDescriptor;
        this.offset = j;
        this.length = j9;
    }

    private static void seekFileDescriptor(java.io.FileDescriptor fileDescriptor, long j) throws androidx.media3.datasource.DataSourceException {
        try {
            android.system.Os.lseek(fileDescriptor, j, android.system.OsConstants.SEEK_SET);
        } catch (android.system.ErrnoException e6) {
            throw new androidx.media3.datasource.DataSourceException(e6, 2000);
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() {
        this.uri = null;
        inUseFileDescriptors.remove(this.fileDescriptor);
        try {
            try {
                java.io.FileInputStream fileInputStream = this.inputStream;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.inputStream = null;
                if (this.opened) {
                    this.opened = false;
                    transferEnded();
                }
            } catch (java.io.IOException e6) {
                throw new androidx.media3.datasource.DataSourceException(e6, 2000);
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
    public long open(androidx.media3.datasource.DataSpec dataSpec) throws androidx.media3.datasource.DataSourceException {
        try {
            this.uri = dataSpec.uri;
            transferInitializing(dataSpec);
            if (!inUseFileDescriptors.add(this.fileDescriptor)) {
                throw new androidx.media3.datasource.DataSourceException(new java.lang.IllegalStateException("Attempted to re-use an already in-use file descriptor"), -2);
            }
            long j = this.length;
            if (j != -1 && dataSpec.position > j) {
                throw new androidx.media3.datasource.DataSourceException(2008);
            }
            seekFileDescriptor(this.fileDescriptor, this.offset + dataSpec.position);
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(this.fileDescriptor);
            this.inputStream = fileInputStream;
            long j9 = this.length;
            if (j9 == -1) {
                java.nio.channels.FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.bytesRemaining = -1L;
                } else {
                    long jPosition = size - channel.position();
                    this.bytesRemaining = jPosition;
                    if (jPosition < 0) {
                        throw new androidx.media3.datasource.DataSourceException(2008);
                    }
                }
            } else {
                long j10 = j9 - dataSpec.position;
                this.bytesRemaining = j10;
                if (j10 < 0) {
                    throw new androidx.media3.datasource.DataSourceException(2008);
                }
            }
            long jMin = dataSpec.length;
            if (jMin != -1) {
                long j11 = this.bytesRemaining;
                if (j11 != -1) {
                    jMin = java.lang.Math.min(j11, jMin);
                }
                this.bytesRemaining = jMin;
            }
            this.opened = true;
            transferStarted(dataSpec);
            long j12 = dataSpec.length;
            return j12 != -1 ? j12 : this.bytesRemaining;
        } catch (androidx.media3.datasource.DataSourceException e6) {
            throw e6;
        } catch (java.io.IOException e9) {
            throw new androidx.media3.datasource.DataSourceException(e9, e9 instanceof java.io.FileNotFoundException ? androidx.media3.common.PlaybackException.ERROR_CODE_IO_FILE_NOT_FOUND : 2000);
        }
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i3, int i9) throws androidx.media3.datasource.DataSourceException {
        if (i9 == 0) {
            return 0;
        }
        long j = this.bytesRemaining;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            i9 = (int) java.lang.Math.min(j, i9);
        }
        try {
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
        } catch (java.io.IOException e6) {
            throw new androidx.media3.datasource.DataSourceException(e6, 2000);
        }
    }
}
