package androidx.media3.datasource;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.util.Util;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class FileDataSource extends BaseDataSource {
    private long bytesRemaining;
    private RandomAccessFile file;
    private boolean opened;
    private Uri uri;

    public static final class Factory implements DataSource.Factory {
        private TransferListener listener;

        public Factory setListener(TransferListener transferListener) {
            this.listener = transferListener;
            return this;
        }

        @Override
        public FileDataSource createDataSource() {
            FileDataSource fileDataSource = new FileDataSource();
            TransferListener transferListener = this.listener;
            if (transferListener != null) {
                fileDataSource.addTransferListener(transferListener);
            }
            return fileDataSource;
        }
    }

    public static class FileDataSourceException extends DataSourceException {
        @Deprecated
        public FileDataSourceException(Exception exc) {
            super(exc, 2000);
        }

        @Deprecated
        public FileDataSourceException(String str, IOException iOException) {
            super(str, iOException, 2000);
        }

        public FileDataSourceException(Throwable th, int i3) {
            super(th, i3);
        }

        public FileDataSourceException(String str, Throwable th, int i3) {
            super(str, th, i3);
        }
    }

    public FileDataSource() {
        super(false);
    }

    private static RandomAccessFile openLocalFile(Uri uri) throws FileDataSourceException {
        int i3 = PlaybackException.ERROR_CODE_IO_NO_PERMISSION;
        try {
            String path = uri.getPath();
            path.getClass();
            return new RandomAccessFile(path, "r");
        } catch (FileNotFoundException e6) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                if (!(e6.getCause() instanceof ErrnoException) || ((ErrnoException) e6.getCause()).errno != OsConstants.EACCES) {
                    i3 = PlaybackException.ERROR_CODE_IO_FILE_NOT_FOUND;
                }
                throw new FileDataSourceException(e6, i3);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder sbO = Y6.f.o("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            sbO.append(fragment);
            throw new FileDataSourceException(sbO.toString(), e6, 1004);
        } catch (SecurityException e9) {
            throw new FileDataSourceException(e9, PlaybackException.ERROR_CODE_IO_NO_PERMISSION);
        } catch (RuntimeException e10) {
            throw new FileDataSourceException(e10, 2000);
        }
    }

    @Override
    public void close() {
        this.uri = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.file;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.file = null;
                if (this.opened) {
                    this.opened = false;
                    transferEnded();
                }
            } catch (IOException e6) {
                throw new FileDataSourceException(e6, 2000);
            }
        } catch (Throwable th) {
            this.file = null;
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
    public long open(DataSpec dataSpec) throws FileDataSourceException {
        Uri uri = dataSpec.uri;
        this.uri = uri;
        transferInitializing(dataSpec);
        RandomAccessFile randomAccessFileOpenLocalFile = openLocalFile(uri);
        this.file = randomAccessFileOpenLocalFile;
        try {
            randomAccessFileOpenLocalFile.seek(dataSpec.position);
            long length = dataSpec.length;
            if (length == -1) {
                length = this.file.length() - dataSpec.position;
            }
            this.bytesRemaining = length;
            if (length < 0) {
                throw new FileDataSourceException(null, null, 2008);
            }
            this.opened = true;
            transferStarted(dataSpec);
            return this.bytesRemaining;
        } catch (IOException e6) {
            throw new FileDataSourceException(e6, 2000);
        }
    }

    @Override
    public int read(byte[] bArr, int i3, int i9) throws FileDataSourceException {
        if (i9 == 0) {
            return 0;
        }
        if (this.bytesRemaining == 0) {
            return -1;
        }
        try {
            int i10 = ((RandomAccessFile) Util.castNonNull(this.file)).read(bArr, i3, (int) Math.min(this.bytesRemaining, i9));
            if (i10 > 0) {
                this.bytesRemaining -= (long) i10;
                bytesTransferred(i10);
            }
            return i10;
        } catch (IOException e6) {
            throw new FileDataSourceException(e6, 2000);
        }
    }
}
