package androidx.media3.exoplayer.source.mediaparser;

/* JADX INFO: loaded from: classes.dex */
public final class InputReaderAdapterV30 implements android.media.MediaParser$SeekableInputReader {
    private long currentPosition;
    private androidx.media3.common.DataReader dataReader;
    private long lastSeekPosition;
    private long resourceLength;

    public long getAndResetSeekPosition() {
        long j = this.lastSeekPosition;
        this.lastSeekPosition = -1L;
        return j;
    }

    public long getLength() {
        return this.resourceLength;
    }

    public long getPosition() {
        return this.currentPosition;
    }

    public int read(byte[] bArr, int i3, int i9) {
        int i10 = ((androidx.media3.common.DataReader) androidx.media3.common.util.Util.castNonNull(this.dataReader)).read(bArr, i3, i9);
        this.currentPosition += (long) i10;
        return i10;
    }

    public void seekToPosition(long j) {
        this.lastSeekPosition = j;
    }

    public void setCurrentPosition(long j) {
        this.currentPosition = j;
    }

    public void setDataReader(androidx.media3.common.DataReader dataReader, long j) {
        this.dataReader = dataReader;
        this.resourceLength = j;
        this.lastSeekPosition = -1L;
    }
}
