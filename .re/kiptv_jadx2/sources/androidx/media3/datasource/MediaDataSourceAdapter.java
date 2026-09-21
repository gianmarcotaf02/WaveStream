package androidx.media3.datasource;

import android.media.MediaDataSource;
import android.net.Uri;
import java.io.IOException;

public class MediaDataSourceAdapter extends BaseDataSource {
    private long bytesRemaining;
    private final MediaDataSource mediaDataSource;
    private boolean opened;
    private long position;
    private Uri uri;

    public MediaDataSourceAdapter(MediaDataSource mediaDataSource, boolean z6) {
        super(z6);
        this.mediaDataSource = mediaDataSource;
    }

    @Override
    public void close() {
        this.uri = null;
        if (this.opened) {
            this.opened = false;
            transferEnded();
        }
    }

    @Override
    public Uri getUri() {
        return this.uri;
    }

    @Override
    public long open(DataSpec dataSpec) throws DataSourceException {
        this.uri = dataSpec.uri;
        this.position = dataSpec.position;
        transferInitializing(dataSpec);
        if (this.mediaDataSource.getSize() != -1 && this.position > this.mediaDataSource.getSize()) {
            throw new DataSourceException(2008);
        }
        if (this.mediaDataSource.getSize() == -1) {
            this.bytesRemaining = -1L;
        } else {
            this.bytesRemaining = this.mediaDataSource.getSize() - this.position;
        }
        long jMin = dataSpec.length;
        if (jMin != -1) {
            long j = this.bytesRemaining;
            if (j != -1) {
                jMin = Math.min(j, jMin);
            }
            this.bytesRemaining = jMin;
        }
        this.opened = true;
        transferStarted(dataSpec);
        long j9 = dataSpec.length;
        return j9 != -1 ? j9 : this.bytesRemaining;
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
            int at = this.mediaDataSource.readAt(this.position, bArr, i3, i9);
            if (at == -1) {
                return -1;
            }
            long j9 = at;
            this.position += j9;
            long j10 = this.bytesRemaining;
            if (j10 != -1) {
                this.bytesRemaining = j10 - j9;
            }
            bytesTransferred(at);
            return at;
        } catch (IOException e6) {
            throw new DataSourceException(e6, 2000);
        }
    }
}
