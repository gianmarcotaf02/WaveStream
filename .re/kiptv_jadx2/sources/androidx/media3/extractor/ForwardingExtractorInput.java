package androidx.media3.extractor;

public class ForwardingExtractorInput implements ExtractorInput {
    private final ExtractorInput input;

    public ForwardingExtractorInput(ExtractorInput extractorInput) {
        this.input = extractorInput;
    }

    @Override
    public boolean advancePeekPosition(int i3, boolean z6) {
        return this.input.advancePeekPosition(i3, z6);
    }

    @Override
    public long getLength() {
        return this.input.getLength();
    }

    @Override
    public long getPeekPosition() {
        return this.input.getPeekPosition();
    }

    @Override
    public long getPosition() {
        return this.input.getPosition();
    }

    @Override
    public int peek(byte[] bArr, int i3, int i9) {
        return this.input.peek(bArr, i3, i9);
    }

    @Override
    public boolean peekFully(byte[] bArr, int i3, int i9, boolean z6) {
        return this.input.peekFully(bArr, i3, i9, z6);
    }

    @Override
    public int read(byte[] bArr, int i3, int i9) {
        return this.input.read(bArr, i3, i9);
    }

    @Override
    public boolean readFully(byte[] bArr, int i3, int i9, boolean z6) {
        return this.input.readFully(bArr, i3, i9, z6);
    }

    @Override
    public void resetPeekPosition() {
        this.input.resetPeekPosition();
    }

    @Override
    public <E extends Throwable> void setRetryPosition(long j, E e6) {
        this.input.setRetryPosition(j, e6);
    }

    @Override
    public int skip(int i3) {
        return this.input.skip(i3);
    }

    @Override
    public boolean skipFully(int i3, boolean z6) {
        return this.input.skipFully(i3, z6);
    }

    @Override
    public void advancePeekPosition(int i3) {
        this.input.advancePeekPosition(i3);
    }

    @Override
    public void peekFully(byte[] bArr, int i3, int i9) {
        this.input.peekFully(bArr, i3, i9);
    }

    @Override
    public void readFully(byte[] bArr, int i3, int i9) {
        this.input.readFully(bArr, i3, i9);
    }

    @Override
    public void skipFully(int i3) {
        this.input.skipFully(i3);
    }
}
