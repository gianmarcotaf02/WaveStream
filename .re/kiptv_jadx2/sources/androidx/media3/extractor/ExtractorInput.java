package androidx.media3.extractor;

import androidx.media3.common.DataReader;

public interface ExtractorInput extends DataReader {
    void advancePeekPosition(int i3);

    boolean advancePeekPosition(int i3, boolean z6);

    long getLength();

    long getPeekPosition();

    long getPosition();

    int peek(byte[] bArr, int i3, int i9);

    void peekFully(byte[] bArr, int i3, int i9);

    boolean peekFully(byte[] bArr, int i3, int i9, boolean z6);

    @Override
    int read(byte[] bArr, int i3, int i9);

    void readFully(byte[] bArr, int i3, int i9);

    boolean readFully(byte[] bArr, int i3, int i9, boolean z6);

    void resetPeekPosition();

    <E extends Throwable> void setRetryPosition(long j, E e6);

    int skip(int i3);

    void skipFully(int i3);

    boolean skipFully(int i3, boolean z6);
}
