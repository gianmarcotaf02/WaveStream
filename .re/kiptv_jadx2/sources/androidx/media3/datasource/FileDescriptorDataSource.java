package androidx.media3.datasource;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.util.Util;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class FileDescriptorDataSource extends BaseDataSource {
    private static final Set<FileDescriptor> inUseFileDescriptors = Collections.newSetFromMap(new ConcurrentHashMap());
    private long bytesRemaining;
    private final FileDescriptor fileDescriptor;
    private FileInputStream inputStream;
    private final long length;
    private final long offset;
    private boolean opened;
    private Uri uri;

    public FileDescriptorDataSource(FileDescriptor fileDescriptor, long j, long j9) {
        super(false);
        fileDescriptor.getClass();
        this.fileDescriptor = fileDescriptor;
        this.offset = j;
        this.length = j9;
    }

    private static void seekFileDescriptor(FileDescriptor fileDescriptor, long j) throws DataSourceException {
        try {
            Os.lseek(fileDescriptor, j, OsConstants.SEEK_SET);
        } catch (ErrnoException e6) {
            throw new DataSourceException(e6, 2000);
        }
    }

    @Override
    public void close() {
        this.uri = null;
        inUseFileDescriptors.remove(this.fileDescriptor);
        try {
            try {
                FileInputStream fileInputStream = this.inputStream;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.inputStream = null;
                if (this.opened) {
                    this.opened = false;
                    transferEnded();
                }
            } catch (IOException e6) {
                throw new DataSourceException(e6, 2000);
            }
        } catch (Throwable th) {
            this.inputStream = null;
            if (this.opened) {
                this.opened = false;
                transferEnded();
            }
            throw th;
        }
    }

    @Override
    public Uri getUri() {
        return this.uri;
    }

    @Override
    public long open(DataSpec dataSpec) throws DataSourceException {
        try {
            this.uri = dataSpec.uri;
            transferInitializing(dataSpec);
            if (!inUseFileDescriptors.add(this.fileDescriptor)) {
                throw new DataSourceException(new IllegalStateException("Attempted to re-use an already in-use file descriptor"), -2);
            }
            long j = this.length;
            if (j != -1 && dataSpec.position > j) {
                throw new DataSourceException(2008);
            }
            seekFileDescriptor(this.fileDescriptor, this.offset + dataSpec.position);
            FileInputStream fileInputStream = new FileInputStream(this.fileDescriptor);
            this.inputStream = fileInputStream;
            long j9 = this.length;
            if (j9 == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.bytesRemaining = -1L;
                } else {
                    long jPosition = size - channel.position();
                    this.bytesRemaining = jPosition;
                    if (jPosition < 0) {
                        throw new DataSourceException(2008);
                    }
                }
            } else {
                long j10 = j9 - dataSpec.position;
                this.bytesRemaining = j10;
                if (j10 < 0) {
                    throw new DataSourceException(2008);
                }
            }
            long jMin = dataSpec.length;
            if (jMin != -1) {
                long j11 = this.bytesRemaining;
                if (j11 != -1) {
                    jMin = Math.min(j11, jMin);
                }
                this.bytesRemaining = jMin;
            }
            this.opened = true;
            transferStarted(dataSpec);
            long j12 = dataSpec.length;
            return j12 != -1 ? j12 : this.bytesRemaining;
        } catch (DataSourceException e6) {
            throw e6;
        } catch (IOException e9) {
            throw new DataSourceException(e9, e9 instanceof FileNotFoundException ? PlaybackException.ERROR_CODE_IO_FILE_NOT_FOUND : 2000);
        }
    }

    @Override
    public int read(byte[] bArr, int i3, int i9) throws DataSourceException {
        if (i9 == 0) {
            return 0;
        }
        long j = this.bytesRemaining;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            i9 = (int) Math.min(j, i9);
        }
        try {
            int i10 = ((FileInputStream) Util.castNonNull(this.inputStream)).read(bArr, i3, i9);
            if (i10 == -1) {
                return -1;
            }
            long j9 = this.bytesRemaining;
            if (j9 != -1) {
                this.bytesRemaining = j9 - ((long) i10);
            }
            bytesTransferred(i10);
            return i10;
        } catch (IOException e6) {
            throw new DataSourceException(e6, 2000);
        }
    }
}
