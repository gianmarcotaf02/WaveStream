package androidx.media3.extractor;

import androidx.media3.common.DataReader;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.util.Util;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

public final class DefaultExtractorInput implements ExtractorInput {
    private static final int PEEK_MAX_FREE_SPACE = 524288;
    private static final int PEEK_MIN_FREE_SPACE_AFTER_RESIZE = 65536;
    private static final int SCRATCH_SPACE_SIZE = 4096;
    private final DataReader dataReader;
    private int peekBufferLength;
    private int peekBufferPosition;
    private long position;
    private final long streamLength;
    private byte[] peekBuffer = new byte[65536];
    private final byte[] scratchSpace = new byte[4096];

    static {
        MediaLibraryInfo.registerModule("media3.extractor");
    }

    public DefaultExtractorInput(DataReader dataReader, long j, long j9) {
        this.dataReader = dataReader;
        this.position = j;
        this.streamLength = j9;
    }

    private void commitBytesRead(int i3) {
        if (i3 != -1) {
            this.position += (long) i3;
        }
    }

    private void ensureSpaceForPeek(int i3) {
        int i9 = this.peekBufferPosition + i3;
        byte[] bArr = this.peekBuffer;
        if (i9 > bArr.length) {
            this.peekBuffer = Arrays.copyOf(this.peekBuffer, Util.constrainValue(bArr.length * 2, 65536 + i9, i9 + PEEK_MAX_FREE_SPACE));
        }
    }

    private int readFromPeekBuffer(byte[] bArr, int i3, int i9) {
        int i10 = this.peekBufferLength;
        if (i10 == 0) {
            return 0;
        }
        int iMin = Math.min(i10, i9);
        System.arraycopy(this.peekBuffer, 0, bArr, i3, iMin);
        updatePeekBuffer(iMin);
        return iMin;
    }

    private int readFromUpstream(byte[] bArr, int i3, int i9, int i10, boolean z6) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i11 = this.dataReader.read(bArr, i3 + i10, i9 - i10);
        if (i11 != -1) {
            return i10 + i11;
        }
        if (i10 == 0 && z6) {
            return -1;
        }
        throw new EOFException();
    }

    private int skipFromPeekBuffer(int i3) {
        int iMin = Math.min(this.peekBufferLength, i3);
        updatePeekBuffer(iMin);
        return iMin;
    }

    private void updatePeekBuffer(int i3) {
        int i9 = this.peekBufferLength - i3;
        this.peekBufferLength = i9;
        this.peekBufferPosition = 0;
        byte[] bArr = this.peekBuffer;
        byte[] bArr2 = i9 < bArr.length - PEEK_MAX_FREE_SPACE ? new byte[65536 + i9] : bArr;
        System.arraycopy(bArr, i3, bArr2, 0, i9);
        this.peekBuffer = bArr2;
    }

    @Override
    public boolean advancePeekPosition(int i3, boolean z6) throws EOFException, InterruptedIOException {
        ensureSpaceForPeek(i3);
        int fromUpstream = this.peekBufferLength - this.peekBufferPosition;
        while (fromUpstream < i3) {
            int i9 = i3;
            boolean z9 = z6;
            fromUpstream = readFromUpstream(this.peekBuffer, this.peekBufferPosition, i9, fromUpstream, z9);
            if (fromUpstream == -1) {
                return false;
            }
            this.peekBufferLength = this.peekBufferPosition + fromUpstream;
            i3 = i9;
            z6 = z9;
        }
        this.peekBufferPosition += i3;
        return true;
    }

    public DataReader getDataReader() {
        return this.dataReader;
    }

    @Override
    public long getLength() {
        return this.streamLength;
    }

    @Override
    public long getPeekPosition() {
        return this.position + ((long) this.peekBufferPosition);
    }

    @Override
    public long getPosition() {
        return this.position;
    }

    @Override
    public int peek(byte[] bArr, int i3, int i9) throws EOFException, InterruptedIOException {
        DefaultExtractorInput defaultExtractorInput;
        int iMin;
        ensureSpaceForPeek(i9);
        int i10 = this.peekBufferLength;
        int i11 = this.peekBufferPosition;
        int i12 = i10 - i11;
        if (i12 == 0) {
            defaultExtractorInput = this;
            iMin = defaultExtractorInput.readFromUpstream(this.peekBuffer, i11, i9, 0, true);
            if (iMin == -1) {
                return -1;
            }
            defaultExtractorInput.peekBufferLength += iMin;
        } else {
            defaultExtractorInput = this;
            iMin = Math.min(i9, i12);
        }
        System.arraycopy(defaultExtractorInput.peekBuffer, defaultExtractorInput.peekBufferPosition, bArr, i3, iMin);
        defaultExtractorInput.peekBufferPosition += iMin;
        return iMin;
    }

    @Override
    public boolean peekFully(byte[] bArr, int i3, int i9, boolean z6) {
        if (!advancePeekPosition(i9, z6)) {
            return false;
        }
        System.arraycopy(this.peekBuffer, this.peekBufferPosition - i9, bArr, i3, i9);
        return true;
    }

    @Override
    public int read(byte[] bArr, int i3, int i9) throws EOFException, InterruptedIOException {
        int fromPeekBuffer = readFromPeekBuffer(bArr, i3, i9);
        if (fromPeekBuffer == 0) {
            fromPeekBuffer = readFromUpstream(bArr, i3, i9, 0, true);
        }
        commitBytesRead(fromPeekBuffer);
        return fromPeekBuffer;
    }

    @Override
    public boolean readFully(byte[] bArr, int i3, int i9, boolean z6) throws EOFException, InterruptedIOException {
        int fromPeekBuffer = readFromPeekBuffer(bArr, i3, i9);
        while (fromPeekBuffer < i9 && fromPeekBuffer != -1) {
            fromPeekBuffer = readFromUpstream(bArr, i3, i9, fromPeekBuffer, z6);
        }
        commitBytesRead(fromPeekBuffer);
        return fromPeekBuffer != -1;
    }

    @Override
    public void resetPeekPosition() {
        this.peekBufferPosition = 0;
    }

    @Override
    public <E extends Throwable> void setRetryPosition(long j, E e6) throws E {
        AbstractC1864o0.L(j >= 0);
        this.position = j;
        throw e6;
    }

    @Override
    public int skip(int i3) throws EOFException, InterruptedIOException {
        int iSkipFromPeekBuffer = skipFromPeekBuffer(i3);
        if (iSkipFromPeekBuffer == 0) {
            byte[] bArr = this.scratchSpace;
            iSkipFromPeekBuffer = readFromUpstream(bArr, 0, Math.min(i3, bArr.length), 0, true);
        }
        commitBytesRead(iSkipFromPeekBuffer);
        return iSkipFromPeekBuffer;
    }

    @Override
    public boolean skipFully(int i3, boolean z6) throws EOFException, InterruptedIOException {
        int iSkipFromPeekBuffer = skipFromPeekBuffer(i3);
        while (iSkipFromPeekBuffer < i3 && iSkipFromPeekBuffer != -1) {
            iSkipFromPeekBuffer = readFromUpstream(this.scratchSpace, -iSkipFromPeekBuffer, Math.min(i3, this.scratchSpace.length + iSkipFromPeekBuffer), iSkipFromPeekBuffer, z6);
        }
        commitBytesRead(iSkipFromPeekBuffer);
        return iSkipFromPeekBuffer != -1;
    }

    @Override
    public void peekFully(byte[] bArr, int i3, int i9) {
        peekFully(bArr, i3, i9, false);
    }

    @Override
    public void readFully(byte[] bArr, int i3, int i9) throws EOFException, InterruptedIOException {
        readFully(bArr, i3, i9, false);
    }

    @Override
    public void skipFully(int i3) throws EOFException, InterruptedIOException {
        skipFully(i3, false);
    }

    @Override
    public void advancePeekPosition(int i3) throws EOFException, InterruptedIOException {
        advancePeekPosition(i3, false);
    }
}
